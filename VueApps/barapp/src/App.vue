<template>
  <div id="app">
    <drink-list/>
    <search-box
      search-url="https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita"
      v-on:search-results="handleResults"> <!-- when search-results event happens call handleResults method -->
    </search-box>
    <results-display v-bind:results="searchResults"></results-display>
  </div>
    
  
</template>

<script>
import DrinkList from '@/components/DrinkList.vue'

export default {
  name: 'app',
  components: {
    DrinkList
  },
  data() {
    return {
      searchResults: { "Results": [] } // searchResults is an array
    }
  },
  methods: {
    handleResults(newResults) {
      this.searchResults = newResults;
    }
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
