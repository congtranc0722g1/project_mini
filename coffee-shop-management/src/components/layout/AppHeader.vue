<template>
<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="w-100" src="../../assets/img/carousel-1.jpg" alt="Image">
      <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
        <h2 class="text-primary font-weight-medium m-0">We Have Been Serving</h2>
        <h1 class="display-1 text-white m-0">COFFEE</h1>
        <h2 class="text-white m-0">* SEN VÀNG *</h2>
      </div>
    </div>
    <div class="carousel-item">
      <img class="w-100" src="../../assets/img/carousel-2.jpg" alt="Image">
      <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
        <h2 class="text-primary font-weight-medium m-0">We Have Been Serving</h2>
        <h1 class="display-1 text-white m-0">COFFEE</h1>
        <h2 class="text-white m-0">* SEN VÀNG *</h2>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
</template>

<script>
export default {
    name: "app-header",
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
