<template>
    <div class="container-fluid" style="margin-top: 60px">
        <h1 class="text-center">Danh sách sản phẩm</h1>
        <div class="row">
            <div class="col-lg-4" >
                <router-link to="/product/create">
                    <button class="btn btn-primary">Thêm mới sản phẩm</button>
                </router-link>
            </div>
            <div class="col-lg-8" >
                <div class="d-flex">
                    <input style="width: 250px" type="text" name="quantity"
                           placeholder="Nhập tên sản phẩm" class="form-control form-control-md me-2" :value="inputValues[0]" @input="updateValue(0)"/>
                    <select style="width: 350px" class="form-control form-control-md w-25" name="category" :value="inputValues[1]" @input="updateValue(1)">
                        <option :value="-1">Chọn loại sản phẩm</option>
                        <option :key="index" v-for="(category, index) in categoryList" :value="category.id">{{category.name}}</option>
                    </select>
                    <button class="btn btn-success ms-2" type="button" @click="changePage(page)">Tìm kiếm</button>
                </div>

            </div>
        </div>

        <table class="table mt-2">
            <thead>
            <tr style="background-color: aqua" class="text-center">
                <th scope="col">STT</th>
                <th scope="col">Tên Sản Phẩm</th>
                <th scope="col">Danh Mục</th>
                <th scope="col">Giá</th>
                <th scope="col">Mô tả</th>
                <th scope="col">Chỉnh sửa</th>
                <th scope="col">Xóa</th>
            </tr>
            </thead>
            <tbody>
            <tr :key="index" v-for="(product, index) in products" class="text-center">
                <td>{{index + 1}}</td>
                <td style="width: 150px">{{product.name}}</td>
                <td>{{product.category.name}}</td>
                <td>{{product.price}}</td>
                <td style="width: 200px">{{product.description}}</td>
                <td>
                    <router-link :to="{name: 'product-update', params: {id: product.id}}"><button class="btn btn-primary">Chỉnh sửa</button></router-link>
                </td>
                <td>
                    <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal" @click="getInfoDeleteProduct(product.id, product.name)">Xóa</button>
                </td>
            </tr>
            </tbody>
        </table>
        <h3 style="text-align: center; color: red" v-if="products.length == 0">Không có sản phẩm nào</h3>

        <div class="col-lg-12 col-md-12 col-sm-12 pb-1" >
            <div class="align-content-center">
                <div v-if="productPage" class="d-flex justify-content-center" id="last-row">
                    <nav aria-label="Page navigation example">
                        <ul class="pagination">
                            <li class="page-item" v-bind:class="productPage.first ? 'disabled': ''">
                                <a role="button" class="page-link" @click="changePage(0)">Trang đầu</a>
                            </li>
                            <li class="page-item" v-bind:class="productPage.first ? 'disabled': ''">
                                <a role="button" class="page-link" @click="changePage(productPage.number - 1)">&lt;</a>
                            </li>
                            <li class="page-item" v-if="productPage.number - 3 > 0">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number - 4)">{{productPage.number - 3}}</a>
                            </li>
                            <li class="page-item" v-if="productPage.number - 2 > 0">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number - 3)">{{productPage.number - 2}}</a>
                            </li>
                            <li class="page-item" v-if="productPage.number - 1 > 0">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number - 2)">{{productPage.number - 1}}</a>
                            </li>
                            <li class="page-item" v-if="productPage.number > 0">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number - 1)">{{productPage.number}}</a>
                            </li>
                            <li class="page-item active"><a class="page-link">{{productPage.number + 1}}</a></li>
                            <li class="page-item" v-if="productPage.number + 2 <= productPage.totalPages">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number + 1)">{{productPage.number + 2}}</a>
                            </li>
                            <li class="page-item" v-if="productPage.number + 3 <= productPage.totalPages">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number + 2)">{{productPage.number + 3}}</a>
                            </li>
                            <li class="page-item" v-if="productPage.number + 4 <= productPage.totalPages">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number + 3)">{{productPage.number + 4}}</a>
                            </li>
                            <li class="page-item" v-if="productPage.number + 5 <= productPage.totalPages">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number + 4)">{{productPage.number + 5}}</a>
                            </li>
                            <li class="page-item" v-bind:class="productPage.last ? 'disabled': ''">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.number + 1)">></a>
                            </li>
                            <li class="page-item" v-bind:class="productPage.last ? 'disabled': ''">
                                <a role="button" class="page-link"
                                   @click="changePage(productPage.totalPages - 1)">
                                    Trang cuối
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Xóa sản phẩm</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <p>Bạn có muốn xóa <span style="color: red">{{product.name}}</span> Không?</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal" v-on:click="deleteProduct">Xóa</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import Swal from 'sweetalert2';
    export default {
        name: "product-list",
        data(){
            return {
                inputValues: ['', -1],
                categoryList: [],
                products: [],
                product: {},
                page: 0,
                productPage: ""
            }
        },
        created() {
            // this.getListProduct(this.page);
            this.changePage(this.page)
            this.getCategoryList()
        },
        methods: {
            updateValue(index) {
                this.inputValues[index] = event.target.value;
            },
            getCategoryList(){
                this.$request.get("http://localhost:8080/categories").then(data => {
                    this.categoryList = data.data
                })
            },
            // getListProduct(id){
            //     this.$request.get("http://localhost:8080/products?page=" + id).then(data => {
            //         this.products = data.data.content
            //         this.productPage = data.data
            //         console.log(data)
            //     })
            // },
            getInfoDeleteProduct(id, name){
                this.product.id = id;
                this.product.name = name;
            },
            deleteProduct(){
                this.$request.post("http://localhost:8080/products/delete?id=" + this.product.id).then(()  => {
                    Swal.fire("Thành Công", "Xóa thành Công", "success")
                    this.changePage(this.page)
                })
            },
            changePage(page){
                this.$request.get("http://localhost:8080/products?nameSearch=" +this.inputValues[0] + "&categoryId=" + this.inputValues[1] +"&page=" + page).then(data => {
                    this.products = data.data.content
                    this.productPage = data.data
                    this.page = page
                    if (data.data.numberOfElements < 1){
                        console.log(data.data.numberOfElements < 1)
                        this.page = page -1
                    }
                    console.log(data.data)
                })
            }
        }
    }
</script>

<style>

</style>
