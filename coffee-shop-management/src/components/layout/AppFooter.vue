<template>
    <div class="container-fluid pt-5 row">
  <div class="container">
    <div class="section-title">
      <h4 class="text-primary text-uppercase" style="letter-spacing: 5px;">DỊCH VỤ CỦA CHÚNG TÔI</h4>
      <h1 class="display-4">Tươi ngon & hữu cơ</h1>
    </div>
    <div class="row">
      <div class="col-lg-6 mb-5">
        <div class="row align-items-center">
          <div class="col-sm-5">
            <img class="img-fluid mb-3 mb-sm-0" src="../../assets/img/service-1.jpg" alt="">
          </div>
          <div class="col-sm-7">
            <h4><i class="fa fa-truck service-icon"></i>
              Giao hàng tận nơi nhanh nhất</h4>
            <p class="m-0">Dịch vụ giao hàng tận nơi của Nhất Tín Logistics là loại hình giao hàng tận tay khách hàng theo địa chỉ đơn hàng đã khai báo trước đó. Đây là hình thức giao hàng được đông đảo người dùng lựa chọn vì sự tiện lợi mang nó mang lại.</p>
          </div>
        </div>
      </div>
      <div class="col-lg-6 mb-5">
        <div class="row align-items-center ">
          <a class="col-sm-5" href="cart/detail">
            <img class="img-fluid mb-3 mb-sm-0" src="../../assets/img/service-2.jpg" alt="">
          </a>
          <div class="col-sm-7">
            <h4><i  class="fa fa-coffee service-icon"></i>
              Hạt cà phê tươi</h4>
            <p class="m-0">Cafe tươi – hay cách gọi khác là cafe rang xay – là loại cafe được tạo nên bởi hạt cafe nguyên chất, không kèm theo bất kỳ chất phụ gia nào khác. Trước đây, cafe tươi chỉ xuất hiện ở những vùng chuyên trồng cafe hoặc được mua theo sở thích của một vài người yêu vị cafe tự nhiên.</p>
          </div>
        </div>
      </div>

      <div class="col-lg-6 mb-5">
        <div class="row align-items-center">
          <div class="col-sm-5">
            <img class="img-fluid mb-3 mb-sm-0" src="../../assets/img/service-3.jpg" alt="">
          </div>
          <div class="col-sm-7">
            <h4><i class="fa fa-award service-icon"></i>Cà Phê Chất Lượng Tốt Nhất</h4>
            <p class="m-0">Ở mức độ chuyên nghiệp, các chuyên gia của Hiệp Hội Cà Phê Đặc Sản Quốc Tế (SCA) hoặc Viện Cà Phê Chất Lượng (CQI) sẽ sử dụng một bảng hồ sơ (cupping form) để phân tích từng yếu tố của cà phê khi muốn đánh giá hạt thông qua quy trình thử nếm cà phê (Cupping). Đây là phương pháp đánh giá chất lượng hạt cà phê, hồ sơ rang một chính xác, hiệu quả nhất. Bài viết này dựa vào các tiêu chí đó để tìm hiểu cách đánh giá cà phê.</p>
          </div>
        </div>
      </div>
      <div class="col-lg-6 mb-5">
        <div class="row align-items-center">
          <div class="col-sm-5">
            <img class="img-fluid mb-3 mb-sm-0" src="../../assets/img/service-4.jpg" alt="">
          </div>
          <div class="col-sm-7">
            <h4><i class="fa fa-table service-icon"></i>Đặt bàn trực tuyến</h4>
            <p class="m-0">Trong thời kì công nghệ thông tin bùng nổ như hiện nay, khái niệm đặt bàn trực tuyến Booking Online đã không còn quá xa lạ đối với nhiều người, tuy nhiên vào những ngày nghỉ lễ, cuối tuần, lượng khách đến ăn uống tại các nhà hàng, đặc biệt ở các thành phố lớn luôn tăng cao đột biến, thậm chí tình trạng không còn bàn trống diễn ra thường xuyên.</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</template>

<script>
export default {
    name: "app-footer",
    data(){
        return {
            
        }
    }
}
</script>


<style>
.display-4 {
  font-size: 3.5rem;
  font-weight: 300;
  line-height: 1.2;
}
h1, h2, .font-weight-bold {
  font-weight: 700 !important;
}
.section-title {
  position: relative;
  padding: 115px 0 35px 0;
  text-align: center;
}

.section-title::after {
  position: absolute;
  content: "";
  width: 2px;
  height: 100px;
  top: 0;
  left: 50%;
  margin-left: 1px;
  background: #DA9F5B;
}
.carousel-caption {
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background: rgba(51,33,29,0.7);
  z-index: 1;
}
.display-1 {
  font-size: 8rem;
  font-weight: 300;
  line-height: 1.2;
}
.text-primary {
  color: #DA9F5B !important;
}

.text-white {
  color: #fff !important
}
h1, h2, .font-weight-bold {
  font-weight: 700 !important
}

h3, h4, .font-weight-medium {
  font-weight: 500 !important
}

h5, h6, .font-weight-normal {
  font-weight: 400 !important
}
a {
  color: #DA9F5B;
  text-decoration: none;
  background-color: transparent;
}
.btn-primary{
  color: #fff;
  background-color: #fd0d75;
  border-color: #0d6efd;
}



.hero_area {
  height: 98vh;
  position: relative;
  background-size: cover;
  background-position: bottom;
}

.sub_page .hero_area {
  height: auto;
  background: none;
  background-color: #041858;
}

.sub_page .footer_bg {
  background: none;
  background-color: #041858;
  padding-top: 45px;
}

.header_section .container-fluid {
  padding-right: 25px;
  padding-left: 25px;
  background-color: #0e111b;
}

.header_section .nav_container {
  margin: 0 auto;
}

.custom_nav-container .navbar-nav .nav-item .nav-link {
  padding: 3px 15px;
  margin: 10px 15px;
  color: white;
  text-align: center;
  border-radius: 20px;
}

.custom_nav-container .navbar-nav .nav-item.active .nav-link, .custom_nav-container .navbar-nav .nav-item:hover .nav-link {
  background-color: #b8bb0d;
}

a,
a:hover,
a:focus {
  text-decoration: none;
}

a:hover,
a:focus {
  color: initial;
}

.btn,
.btn:focus {
  outline: none !important;
  -webkit-box-shadow: none;
  box-shadow: none;
}
.btn-group-lg>.btn, .btn-lg {
  padding: 0.5rem 1rem;
  font-size: 1.25rem;
  border-radius: 0.3rem;
}
.custom_nav-container .nav_search-btn {
  background-size: 22px;
  background-repeat: no-repeat;
  background-position-y: 7px;
  width: 35px;
  height: 35px;
  padding: 0;
  border: none;
}
.wrapper {
}
.navbar-brand {
  margin-left: 25px;
}

.navbar-brand span {
  font-size: 24px;
  font-weight: 700;
  color: #ffffff;
}

.custom_nav-container {
  z-index: 99999;
}

.navbar-expand-lg .navbar-collapse {
  -webkit-box-align: end;
  -ms-flex-align: end;
  align-items: flex-end;
}

.custom_nav-container .navbar-toggler {
  outline: none;
}

.custom_nav-container .navbar-toggler {
  padding: 0;
  width: 37px;
  height: 42px;
}

.custom_nav-container .navbar-toggler span {
  display: block;
  width: 35px;
  height: 4px;
  background-color: #ffffff;
  margin: 7px 0;
  -webkit-transition: all .3s;
  transition: all .3s;
}

.custom_nav-container .navbar-toggler[aria-expanded="true"] .s-1 {
  -webkit-transform: rotate(45deg);
  transform: rotate(45deg);
  margin: 0;
  margin-bottom: -4px;
}

.custom_nav-container .navbar-toggler[aria-expanded="true"] .s-2 {
  display: none;
}

.custom_nav-container .navbar-toggler[aria-expanded="true"] .s-3 {
  -webkit-transform: rotate(-45deg);
  transform: rotate(-45deg);
  margin: 0;
  margin-top: -4px;
}

.custom_nav-container .navbar-toggler[aria-expanded="false"] .s-1,
.custom_nav-container .navbar-toggler[aria-expanded="false"] .s-2,
.custom_nav-container .navbar-toggler[aria-expanded="false"] .s-3 {
  -webkit-transform: none;
  transform: none;
}

.quote_btn-container {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
}

.quote_btn-container a {
  color: #ffffff;
  margin-right: 25px;
}

.quote_btn-container a img {
  width: 15px;
  margin: 0 25px;
}

ul.products {
  display: flex;
  flex-wrap: wrap;
  list-style: none;
  justify-content: center;
  width: 100%;
  margin-bottom: 0;

}

ul.products li {
  flex-basis: 17%;
  padding: 0;
  box-sizing: border-box;
  margin: 10px 7.5px;

}

ul.products li .product-top {
  position: relative;
  overflow: hidden;
}

ul.products li .product-top .product-thumb {
  display: block;
  height: 0;
  padding-bottom: 100%;
  position: relative;
  overflow: hidden;
  border-radius: 20px;

}

/* Medium screens */
@media (max-width: 768px) {
  ul.products li {
    flex-basis: 25%;
    margin: 10px;
  }
  ul.products li .product-top .product-thumb img {
    height: 150px;
  }
}

/* Small screens */
@media (max-width: 480px) {
  ul.products {
    margin-left: 0;
  }
  ul.products li {
    flex-basis: 50%;
    margin: 10px;
  }
  ul.products li .product-top .product-thumb img {
    height: 120px;
    border-radius: 0;
  }
  ul.products li .product-top a.buy-now {
    bottom: -60px;
  }
  ul.products li:hover .product-top a.buy-now {
    bottom: -10px;
  }
  ul.products li .product-info a.product-cat {
    font-size: 10px;
  }
  ul.products li .product-info a.product-name {
    font-size: 14px;
  }
}

ul.products li:hover .product-top .product-thumb img {
  transform: scale(1.1);
  transition: 0.5s ease-in-out;
}

ul.products li .product-top .product-thumb img {
  display: block;
  width: 100%;
  height: 200px;
  position: absolute;
  top: auto;
  border-radius: 10px;
}

ul.products li .product-top a.buy-now {
  text-transform: uppercase;
  text-decoration: none;
  text-align: center;
  display: block;
  background-color: red;
  color: white;
  padding: 10px 0;
  position: absolute;
  width: 100%;
  bottom: -80px;
  transition: 0.5s ease-in-out;
  opacity: 0.75;
}

ul.products li:hover .product-top a.buy-now {
  bottom: 0;
}

ul.products li .product-info {
  padding: 10px 0;
}

ul.products li .product-info a {
  display: block;
  text-decoration: none;
}

ul.products li .product-info a.product-cat {
  font-size: 12px;
  text-transform: uppercase;
  padding: 3px 0;
}

ul.products li .product-info a.product-name {
  padding: 2px 0;
  font-weight: 600;
}
.product img {
  border-radius: 0!important;
}
.product {
  background-color: lightgray;
  margin-left: 0;

}.navbar-brand.wrapper {
   display: flex;
   flex-wrap: wrap;
   justify-content: center;
   margin-left: 25px;
 }

.navbar-brand.wrapper button {
  margin: 10px;
  background: none;

}

.navbar-brand.wrapper img {
  height: 106px;
  width: 172px;
}

@media only screen and (max-width: 768px) {
  .navbar-brand.wrapper img {
    height: 80px;
    width: 130px;
  }
}

@media only screen and (max-width: 576px) {
  .navbar-brand.wrapper img {
    height: 60px;
    width: 100px;
  }
}
</style>
