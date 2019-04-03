<template>
  <div class="todo-list">
    <header>
      <h1>My Daily Routine</h1>
      <a href="#" class="btnAddTodo" v-on:click="showTodo">Add Todo
        <i class="fas fa-plus"></i>
      </a>
    </header>
    <ul>
      <li id="frmNewTodo" style="display:none;">
        <input type="text" id="new-todo" placeholder="Add New Todo" v-on:keyup.enter="addTodo">
      </li>
      <li
        v-for="todo in todos"
        v-bind:key="todo.id"
        v-bind:class="{'todo-completed': todo.completed}"
        v-on:click="changeStatus(todo.id, $event)">
        <input type="checkbox">
        {{todo.task}}
        <i class="far fa-check-circle" v-bind:class="{completed: todo.completed}"></i>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      apiURL: "",
      todos: []
    };
  },
  methods: {
    changeStatus(id, event) {
      const arrIndex = this.todos.findIndex(todo => todo.id == id);
      this.todos[arrIndex].completed = !this.todos[arrIndex].completed;

      // the checkbox might not have been target of the click event
      if (event.target.type != "checkbox") {
        const checkbox = event.target.querySelector('input[type="checkbox"]');
        checkbox.checked = !checkbox.checked;
      }
    },
    showTodo() {
      console.log("Add Todo...");
      // the list-item that contains the input box
      const form = document.getElementById("frmNewTodo");
      // the new todo form field
      const input = document.getElementById("new-todo");
      // the list-item is hidden by default
      form.removeAttribute("style");
      // set the focus to the input box so the user can start typing a new todo
      input.focus();
    },
    addTodo() {
      // ADD NEW TODO HERE
    }
  },
  created() {
    fetch(this.apiURL)
      .then(response => {
        return response.json();
      })
      .then(todos => {
        this.todos = todos;
      })
      .catch(err => console.log(err));
  }
};
</script>

<style>
.todo-list {
  width: 450px;
  background: #fff;
  margin: 50px auto;
  font-family: "Roboto Condensed", sans-serif;
  border-radius: 10px;
}
header {
  background: #f2f2f2;
  color: #4b86a6;
  text-transform: uppercase;
  margin: 0px;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
}
h1 {
  color: #4b86a6;
  padding: 10px;
  font-size: 24px;
  text-transform: uppercase;
  display: inline-block;
  padding: 0 0 0 20px;
}
header a {
  float: right;
  margin: 20px 20px 0 0;
  color: #4b86a6;
  text-decoration: none;
}
ul {
  list-style-type: none;
  margin: 0px;
  padding: 0px;
}
li {
  font-size: 24px;
  border-bottom: 1px solid #f2f2f2;
  padding: 10px 20px;
  cursor: pointer;
}
li:last-child {
  border: 0px;
}
li.todo-completed {
  text-decoration: line-through;
  color: darkgray;
}
i.far.fa-check-circle {
  float: right;
  color: darkgray;
}

i.far.fa-check-circle.completed {
  color: green;
}
input[type="checkbox"] {
  font-size: 40px;
  vertical-align: middle;
  margin-top: 0px;
}
#new-todo {
  width: 90%;
  font-size: 18px;
  padding: 10px;
  margin: 0 10px;
}
</style>
