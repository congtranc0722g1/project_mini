import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'product-list',
    component: () => import('../components/products/ProductList.vue')
  },
  {
    path: '/product/create',
    name: 'product-create',
    component: () => import('../components/products/ProductCreate.vue')
  },
  {
    path: '/product/update/:id',
    name: 'product-update',
    component: () => import('../components/products/ProductUpdate.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
