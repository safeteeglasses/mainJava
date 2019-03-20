/*********************************************************************
 * JavaScript - DOM - app.js - Tutorial Final
 *********************************************************************/
const todoList = document.getElementById('todos');

let todos = [];
let pageTitle = '';

function init() {
  pageTitle = 'My Daily Routine';
  todos = [{
      id: 1,
      task: 'Wake up',
      completed: false
    },
    {
      id: 2,
      task: 'Brush Teeth',
      completed: false
    },
    {
      id: 3,
      task: 'Shower',
      completed: false
    },
    {
      id: 4,
      task: 'Get Dressed',
      completed: false
    },
    {
      id: 5,
      task: 'Drive to work',
      completed: false
    },
    {
      id: 6,
      task: 'Work',
      completed: false
    },
    {
      id: 7,
      task: 'Drive home from work',
      completed: false
    },
    {
      id: 8,
      task: 'Dinner',
      completed: false
    },
    {
      id: 9,
      task: 'Brush Teeth',
      completed: false
    },
    {
      id: 10,
      task: 'Go to bed',
      completed: false
    }
  ];
}

function addPageTitle() {
  const heading = document.createElement('h1');
  heading.innerText = pageTitle;
  todoList.appendChild(heading);
}

function addTodos() {
  const ul = document.createElement('ul');
  todos.forEach((todo) => {                  // loop thru the todos array - call the current element todo
    const li = document.createElement('li'); // create li tag
    li.innerText = todo.task;                // assign the current array element to li tag
    ul.appendChild(li);                      // add li to ul tag we created
  });
  todoList.appendChild(ul);
}

// setup our page title and tasks
init();
// // add page title to the DOM
addPageTitle(); // add the <h1> to the DOM
// // add the task to the DOM
addTodos();     // add the ul and all it's li's to DOM