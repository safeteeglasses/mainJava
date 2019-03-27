 <!--  Sample Code with Inline Function Event Handling 
<template>
  <div id="app">
  <p> Sample Code with Inline Function Event Handling</p>
   <a href="#" id="increase" class="btn" v-on:click="counter += 1">
    Increase
  </a>
  <a href="#" id="decrease" class="btn" v-on:click="counter -= 1">
    Decrease
  </a>
  <p>The button was clicked {{ counter }} times</p>
  </div>
</template>

<script>
export default {
  name: "app",
  data() {
    return {
      counter: 0
    };
  }
};

</script>
-->
<!-- Sample code with Method Event Handlers 
<template>
  <div id="app">
  <p> Sample Code with Method Event Handlers</p>
    <a href="#" id="increase" class="btn" v-on:click="increase">Increase</a>
    <a href="#" id="decrease" class="btn" v-on:click="decrease">Decrease</a>
    <p>The button was clicked {{ counter }} times</p>
  </div>
</template>

<script>
export default {
  name: "app",
  data() {
    return {
      counter: 0
    };
  },
  methods: {
    increase() {
      this.counter += 1;
    },
    decrease() {
      this.counter -= 1;
    }
  }
};
</script>

<!-- Sample code with Method Arguments 

 <template>
 
  <div id="app">
    <p> Sample Code with Method Arguments</p>
    <a href="#" id="increase" class="btn" v-on:click="updateCounter(1)"
      >Increase</a
    >
    <a href="#" id="decrease" class="btn" v-on:click="updateCounter(-1)"
      >Decrease</a
    >
    <p>The button was clicked {{ counter }} times</p>
  </div>
</template>

<script>
export default {
  name: "app",
  data() {
    return {
      counter: 0
    };
  },
  methods: {
    updateCounter(operand) {
      this.counter += operand;
    }
  }
};
</script>

<!-- Sample code with Implicit Event object 
<template>
  <div id="app">
    <p> Sample Code with Implicit Event Object</p>
    <a href="#" id="increase" class="btn" v-on:click="updateCounter"
      >Increase</a
    >
    <a href="#" id="decrease" class="btn" v-on:click="updateCounter"
      >Decrease</a
    >
    <p>The button was clicked {{ counter }} times</p>
  </div>
</template>

<script>
export default {
  name: "app",
  data() {
    return {
      counter: 0
    };
  },
  methods: {
    updateCounter(event) {
      this.counter += event.target.id === "increase" ? 1 : -1;
    }
  }
};
</script>

<!-- Sample Code with Explicit Event Object -->
<template>
  <div id="app">
    <p> Sample Code with Explicit Event Object</p>
    <a href="#" id="increase" class="btn" v-on:click="updateCounter(1,$event)"
      >Increase</a
    >
    <a href="#" id="decrease" class="btn" v-on:click="updateCounter(-1,$event)"
      >Decrease</a
    >
    <p>The button was clicked {{ counter }} times</p>
  </div>
</template>
<script>
export default {
  name: "app",
  data() {
    return {
      counter: 0
    };
  },
  methods: {
    updateCounter(operand, event) {
    
      this.counter += event.target.id === "increase" ? operand : 0;
      this.counter += event.target.id === "decrease" ? operand : 0;
    }
  }
};
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
  body {
    margin: 10px;
  }
  a.btn {
    display: inline-block;
    margin: 10px;
    padding: 12px;
    font-size: 13px;
    font-weight: 700;
    background-color: rgb(63, 63, 219);
    color: white;
    text-decoration: none;
    text-transform: uppercase;
    border-radius: 4px;
  }
</style>
