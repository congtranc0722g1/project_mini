<template>
    <div>
        <app-header/>
        <router-view/>
        <app-footer/>
    </div>

</template>

<script>
    import AppFooter from "./components/layout/AppFooter.vue"
    import AppHeader from './components/layout/AppHeader.vue'

    export default {
        components: {AppFooter, AppHeader}
    }
</script>

<style>
    #app {
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        /*text-align: center;*/
        color: #2c3e50;
    }

    nav {
        padding: 30px;
    }

    nav a {
        font-weight: bold;
        color: #2c3e50;
    }

    nav a.router-link-exact-active {
        color: #42b983;
    }
</style>
