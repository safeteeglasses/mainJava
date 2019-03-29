<template>
    <div class="counter">
        <button id="counter" v-on:click="increase">Increment</button>
        <p>Current Count is: {{count}} </p>
    </div>    
</template>

<script>
export default {
name: 'my-counter',
data() {
    return {
        count: 0
    }
},
methods: {
    increase() {
        this.count += 1;
    }
}
};
</script>

<style>

</style>
