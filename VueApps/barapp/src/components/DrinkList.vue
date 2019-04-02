<template>
    <div id="Tom's Bar">
        <h1>Tom's Bar</h1>
            <ul id="example-1">
                <li v-for="item in items">
                {{ item.name }}
                </li>
            </ul>
    </div>
</template>

<script>
export default {
name: 'drink-list',

data() {
    return {
      items: [
      { name: 'old fashioned'},
      { name: 'sazerac' },
      
    ]
    }
  }
}
</script>
 
<style>

</style>
