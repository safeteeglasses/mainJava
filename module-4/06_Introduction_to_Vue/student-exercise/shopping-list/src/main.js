import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
const li = document.querySelectorAll('li');
li.forEach((task) => {
  task.addEventListener('click', () => {
    if(task.classList.contains('completed')){
      task.classList.remove('completed')
    }else{
      task.classList.add('completed')
    }
  });
   
});
