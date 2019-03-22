<template>
  <div id="app">
    <ShoppingList></ShoppingList> 
  </div>
</template>

<script>
import ShoppingList from './components/ShoppingList.vue'

export default {
  name: 'app',
  components: {
    ShoppingList
  }
}

</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
<style>
body {
  background: rgb(61,201,164);
  background: radial-gradient(circle, rgba(61,201,164,1) 50%,
rgba(92,133,120,1) 100%);
}
</style>