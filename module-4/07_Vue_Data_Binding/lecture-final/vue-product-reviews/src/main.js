/**************************************************************************
 * Vue Data Binding - Lecture Final - main.js
 *************************************************************************/
import Vue from 'vue'
import ProductReview from './components/ProductReview.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(ProductReview)
}).$mount('#app')
