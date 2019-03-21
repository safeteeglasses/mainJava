# Event Handlers Exercise

In this exercise you are going to build on the shopping list exercise that you have been working on. The starting code for this exercise along with the automated tests are located in `shopping-list`.

## Exercise

If you open up `js/shopping-list.js` there are 3 variables declared for you. 

* **allItemsIncomplete:** This will come in handy later.
* **pageTitle:** The title of the page.
* **groceries:** An array of groceries that will be displayed in your shopping list.

This application is is similar to a previous exercise you worked on. Right now the following methods are being called at the end of `shopping-list.js`. There is an event you can listen for where these would be better suited to run from. Create an event listener for this special event and place the 2 methods inside of there. This is also where the rest of your code should go.

### Mark item complete

When a user clicks on an item in the shopping list it should be marked complete. To do so you will need to add the `.completed` class to the list item and the icon. You should check the item to make sure it already doesn't haven't the completed class. There is no sense in performing your logic on an item that is already complete.

### Mark item incomplete

When a user double clicks on an item in the shopping list it should be marked incomplete. To do so you will need to remove the `.completed` class to the list item and the icon. You should check the item to make sure it has the completed class. There is no sense in performing your logic on an item that isn't completed.

### Toggle All

When your application loads all of the items are incomplete and the button on the page says `Mark All Complete`. When you click on this button all of the items in the list should be marked completed. The buttons text should also switch to say `Mark All Incomplete`. If you were to click on the button again it would mark all of the items in the list incomplete.

> HINT: You can use the variable `allItemsIncomplete` to track the current state of the button. Whenever you mark all items complete or incomplete make sure to update this variable to keep track of where you are.


## Tests

The tests for this exercise are going to run a little different then the tests you have run before. These tests are end to end tests and therefor need the application to be running in order to run. You will need to start the application up and to do so we have included a small command line http-server. You can start your application by running the following command:

```
npm run start
```

And then you can run the automated tests by running the following command (in a separate process)

```
npm run test
```

The tests are located in `cypress/integration/shopping-list.spec.js`

* parent container shopping-list should exist
* should have a title of My Shopping List
* should have 10 items on the shopping list
* each item in the list should not have the class completed until it has been clicked on
* each item in the list that is completed can be double clicked on and marked incomplete
* clicking on the mark all completed button should set all items to completed
* clicking on the mark all incomplete button should set all items to incomplete
