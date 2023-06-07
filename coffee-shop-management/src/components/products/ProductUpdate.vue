<template>
    <div class=" ml-5 mr-5 py-1" style="margin-top: 60px">
        <div class="row d-flex justify-content-center align-items-center">
            <div class="col-lg-8 col-xl-6">
                <div class="card rounded-3">
                    <div class="card-body p-4 p-md-4">
                        <h1 class="mb-3 mt-3 text-center">Chỉnh sửa sản phẩm</h1>

                        <form @submit.prevent="update" class="px-md-2">

                            <div class="row align-items-center pt-3 pb-4">
                                <div class="col-md-4 ps-3">

                                    <label style="font-weight: bold" for="name" class="mb-0">Tên sản phẩm<sup
                                            style="color: red; font-size: 15px" class="m-1">*</sup></label>

                                </div>
                                <div style="position: relative" class="col-md-8 pe-4">

                                    <input type="text" id="name" name="name" placeholder="Nhập tên sản phẩm"
                                           class="form-control form-control-md" @blur="validate" v-model="product.name"/>
                                    <p style="color: red; position: absolute">{{errors.name}}</p>


                                </div>
                            </div>

                            <div class="row align-items-center pt-4 pb-4">
                                <div class="col-md-4 ps-3">

                                    <label style="font-weight: bold" for="category" class="mb-0">Loại sản phẩm<sup
                                            style="color: red; font-size: 15px" class="m-1">*</sup></label>

                                </div>
                                <div style="position: relative" class="col-md-8 pe-4">

                                    <select class="form-control form-control-md" id="category" name="category" @change="validate" v-model="product.category">
                                        <option value="">Chọn loại sản phẩm</option>
                                        <option :key="index" v-for="(category, index) in categoryList" :value="category">{{category.name}}</option>
                                    </select>
                                    <p style="color: red; position: absolute">{{errors.category}}</p>

                                </div>
                            </div>

                            <div class="row align-items-center pt-4 pb-4">
                                <div class="col-md-4 ps-3">

                                    <label style="font-weight: bold" for="price" class="mb-0">Giá<sup
                                            style="color: red; font-size: 15px" class="m-1">*</sup></label>

                                </div>
                                <div style="position: relative" class="col-md-8 pe-4">

                                    <input type="text" id="price" name="price" placeholder="Nhập giá"
                                           class="form-control form-control-md" @blur="validate" v-model="product.price"/>
                                    <p style="color: red; position: absolute">{{errors.price}}</p>

                                </div>
                            </div>

                            <div class="row align-items-center pt-4 pb-4">
                                <div class="col-md-4 ps-3">

                                    <label style="font-weight: bold" for="quantity" class="mb-0">Số lượng<sup
                                            style="color: red; font-size: 15px" class="m-1">*</sup></label>

                                </div>
                                <div style="position: relative" class="col-md-8 pe-4">

                                    <input type="text" id="quantity" name="quantity"
                                           placeholder="Nhập số lượng" class="form-control form-control-md" @blur="validate" v-model="product.quantity"/>
                                    <p style="color: red; position: absolute">{{errors.quantity}}</p>

                                </div>
                            </div>

                            <div class="row align-items-center pt-4 pb-4">
                                <div class="col-md-4 ps-3">

                                    <label style="font-weight: bold" for="description" class="mb-0">Mô tả<sup
                                            style="color: red; font-size: 15px" class="m-1">*</sup></label>

                                </div>
                                <div style="position: relative" class="col-md-8 pe-4">

                                    <textarea type="text" id="description" name="description" placeholder="Nhập mô tả"
                                              class="form-control form-control-md" @blur="validate" v-model="product.description"/>
                                    <p style="color: red; position: absolute">{{errors.description}}</p>

                                </div>
                            </div>

                            <div class=" text-center">
                                <button type="submit" class="btn btn-outline-primary m-4 w-25">Cập nhật</button>
                                <router-link to="/"><button type="reset" class="btn btn-outline-secondary m-4 w-25">Hủy</button></router-link>


                            </div>

                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import Swal from "sweetalert2";

    export default {
        name: "product-update",
        data(){
            return {
                categoryList: [],
                errors: {
                    name: "",
                    category: "",
                    price: "",
                    quantity: "",
                    description: "",
                },
                product: {
                    id: "",
                    name: "",
                    category: {
                        id: "",
                        name: ""
                    },
                    price: "",
                    quantity: "",
                    description: "",
                }
            }

        },
        created(){
            let productId = this.$route.params.id
            this.getCategoryList()
            this.getProduct(productId);
        },
        methods: {
            validate(){
                let isValid = true;
                this.errors = {
                    name: "",
                    category: "",
                    price: "",
                    quantity: "",
                    description: ""
                }

                if (!this.product.name){
                    this.errors.name = "Không được để trống"
                    isValid = false;
                }else if (this.product.name.length > 200){
                    this.errors.name = "Tên không được quá 200 ký tự"
                    isValid = false;
                }
                if (!this.product.category.id){
                    this.errors.category = "Không được để trống"
                    isValid = false;
                }
                if (!this.product.price){
                    this.errors.price = "Không được để trống"
                    isValid = false;
                }else if (this.product.price < 1){
                    this.errors.price = "Số tiền phải lớn hơn 0"
                    isValid = false;
                }else if (!this.isNumber(this.product.price)){
                    this.errors.quantity = "Số tiền phải là một số"
                    isValid = false;
                }
                if (!this.product.quantity){
                    this.errors.quantity = "Không được để trống"
                    isValid = false;
                }else if (this.product.quantity < 1){
                    this.errors.quantity = "Số lượng phải lớn hơn 0"
                    isValid = false;
                }else if (!this.isNumber(this.product.quantity)){
                    this.errors.quantity = "Số lượng phải là một số"
                    isValid = false;
                }
                if (!this.product.description){
                    this.errors.description = "Không được để trống"
                    isValid = false;
                }else if (this.product.description.length > 500){
                    this.errors.description = "Mô tả không được quá 500 ký tự"
                    isValid = false;
                }
                return isValid
            },

            isNumber(number){
                return /^\d*$/.test(number)
            },
            getCategoryList(){
                this.$request.get("http://localhost:8080/categories").then(data => {
                    this.categoryList = data.data
                })
            },
            getProduct(id){
                this.$request.get("http://localhost:8080/products/detail/" + id).then(data => {
                    this.product = data.data;
                    console.log(data.data)
                })
            },
            update(){
                if (this.validate()){
                    this.$request.post("http://localhost:8080/products/update", this.product).then(() => {
                        this.$router.push({name: "product-list"})
                        Swal.fire("Thành Công", "Cập nhật thành Công", "success")
                    })
                }
            }
        }

    }
</script>
