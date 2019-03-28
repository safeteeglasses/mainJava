<!-------------------------------------------------------------->
<!-- Vue Nested Components - SearchBox.vue Lecture Final      -->
<!-------------------------------------------------------------->
<template>
    <form v-on:submit.prevent="performSearch">
        <input type="text" name="search" id="search" v-model="search">
        <button type="submit">Search</button>
    </form>
</template>

<script>
/**
 * Search Box component that will perform a search and emit an event
 * for other components to listen for that will contain the results.
 */
export default {
    name: 'search-box',
    data() {
        return {
            /**
             * Bound to the search input field
             * @property {string} search the user's search query
             */
            search: ''
        };
    },
    props: {
        /**
         * The URL to call on a search. Text given by user is concatenated
         * to the end.
         * @property {string} searchUrl the URL of the API to search
         */
        searchUrl: String
    },
    methods: {
        /**
         * Performs the search when the form is submitted. Sends the results
         * out of the component with a `search-results` event.
         * @returns {Promise} the promise from fetch for unit testing
         */
        performSearch() {
            return fetch(this.searchUrl + this.search + '?format=json').then((response) => {
                return response.json();
            }).then((results) => {
                /**
                 * Contains search results as an object with `Results` that is
                 * an array of objects.
                 * @event search-results
                 * @type {object}
                 * @property {array} Results The results of the search from the API
                 * @property {string} Results.Make_ID The primary key of the car make
                 * @property {string} Results.Make_Name The name of the car make
                 * @property {string} Results.Mfr_Name The name of the car manufacturer
                 */
                this.$emit('search-results', results);
            });
        }
    }
}
</script>