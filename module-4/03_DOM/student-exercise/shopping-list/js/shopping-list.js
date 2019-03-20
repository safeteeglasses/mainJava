// add pageTitle
const pageTitle = 'My Shopping List';
// add groceries
const groceries = ['emu eggs', 'rams milk', 'gluten free air', 
                    'korn', 'free range animal crackers', 'lunchables', 
                    'locally sourced vegan chicken', 'toona', 
                    'nut loaf', 'sheese' ];



/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
const header = document.getElementById('title');
  header.innerText = pageTitle;
}
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
const ulId = document.querySelector( 'html body div.shopping-list ul');
groceries.forEach((grocery) => {
const li = document.createElement('li');
li.innerText = grocery;
ulId.appendChild(li);
});
}

/**
 * This function will be called wh4en the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const grocItem = document.querySelectorAll('html body div.shopping-list ul li');
  grocItem.forEach((grocery) => {
  grocery.setAttribute('class', 'completed');
  });
}
  
setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
