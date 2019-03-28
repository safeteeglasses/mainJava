<!-------------------------------------------------------------->
<!-- Vue Nested Components - App.vue - Lecture Final          -->
<!-------------------------------------------------------------->
<template>
  <div id="app">
    <search-box
      search-url="https://vpic.nhtsa.dot.gov/api/vehicles/getmakeformanufacturer/"
      v-on:search-results="handleResults">
    </search-box>
    <results-display v-bind:results="searchResults"></results-display>
  </div>
</template>

<script>
import SearchBox from './components/SearchBox.vue';
import ResultsDisplay from './components/ResultsDisplay.vue';

export default {
  name: 'app',
  components: {
    SearchBox,
    ResultsDisplay
  },
  data() {
    return {
      searchResults: { "Results": [] }
    }
  },
  methods: {
    handleResults(newResults) {
      this.searchResults = newResults;
    }
  }
}
</script>
