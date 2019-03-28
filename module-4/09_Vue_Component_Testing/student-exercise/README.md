# Vue Component Testing Exercise

In this exercise you will create Unit Tests for your Shopping List component. The starter code for this exercise is located in the `shopping-list` folder in this directory. The starter code will give you everything you need to complete this exercise. If you `npm run serve` you should a working example similar to what we have been building this week. 

To complete this exercise you must perform the following: 

* Create `ShoppingList.spec.js` Unit Test File
* Add the necessary boiler plate code to get started. 
* Add the following tests.
    * 'should be a Vue instance'
    * 'renders a single shopping list item to the DOM and the name is what we expect it to be'
    * 'renders 5 items to the DOM and the number of li elements found is 5'
    * 'renders an item where completed is false and it should NOT have the class completed'
    * 'clicking the list item should call our change status method and add the class completed'
* All tests should satisfy what the name of the test suggests.
* All tests should pass.

If you want to run the tests you can run the following command

```bash
npm run test:unit
```