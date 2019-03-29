<template>
    <div class="search">
        <input type="text" id="search" name="search" placeholder="Search Todo's..." v-model="searchText" v-on:keyup="handleFilter"/>
    </div>
</template>

<script>
export default {
    name: 'shopping-search',
    data() {
        
        return {
            searchText: ''
        };
    },
    methods: {
        handleFilter() {
            this.$emit('filter', this.searchText);
        }
    }
}
</script>

<style>
#search {
    width:100%;
    font-size:24px;
    font-family: 'Roboto Condensed', sans-serif;
    padding:10px;
}
</style>

