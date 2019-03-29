/**************************************************************************
 * Vue Nested Components - main.js - Lecture-Final
 *************************************************************************/
import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

new Vue({
  render: ginzo => ginzo(App),
}).$mount('#app')
