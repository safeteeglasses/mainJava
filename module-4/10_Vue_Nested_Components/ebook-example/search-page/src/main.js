/**************************************************************************
 * Vue Nested Components - ResultsDisplay.vue - Tutorial-Final
 *************************************************************************/
import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

new Vue({
  render: ginzo => ginzo(App)
}).$mount('#app')
