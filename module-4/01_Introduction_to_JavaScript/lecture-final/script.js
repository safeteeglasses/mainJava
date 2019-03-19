/***********************************************************************************
 *  LECTURE FINAL
 ************************************************************************************/

/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**var
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
  // Declares a variable where the value cannot be changed
  const daysPerWeek = 7;
  console.log(`There are ${daysPerWeek} days in the week.`);

  // Declares a variable whose value can be changed
  let daysPerMonth = 30;
  console.log(`There are ${daysPerMonth} days in the month.`);

  // Declares a variable that will always be an array
  const weekdays = [
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"
  ];
  console.table(weekdays);   // Display array as a table
}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {
  console.log(`The value of param1 is ${param1}`);
  console.log(`The value of param2 is ${param2}`);
}

/**
 * Compares two values x and y.
 * == is loose equality
 * === is strict equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
  console.log(`x is ${typeof x}`);
  console.log(`y is ${typeof y}`);

  console.log(`x == y : ${x == y}`); // true
  console.log(`x === y : ${x === y}`); // false
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
  if (x) {
    console.log(`${x} is truthy`);
  } else {
    console.log(`${x} is falsy`);
  }
}

/**
 *  Objects are simple key-value pairs
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {
  const person = {
    firstName: "Bill",
    lastName: "Lumbergh",
    age: 42,
    employees: [
      "Peter Gibbons",
      "Milton Waddams",
      "Samir Nagheenanajar",
      "Michael Bolton"
    ],
    // define a toString function for the object
    toString: function() {
      return `${this.lastName}, ${this.firstName} (${this.age})`;
    }
  };

  console.table(person);  // Display the person object

  console.log(`${person.firstName} ${person.lastName}`);  // Display the person's firstName and lastName

  for (let i = 0; i < person.employees.length; i++) {            // Loop through the empoyees array in the person object
    console.log(`Employee ${i + 1} is ${person.employees[i]}`);  // Display an element from the employees array in the person object
  }

  console.log(person.toString());  // Display person object using the toString function defined for it
}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

function Add(num1, num2) {
  return num1 + num2;
}
// This Add function replaces any previously defined Add functions
function Add(num1, num2, num3) {
  return num1 + num2 + num3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
  console.log(`.length -  ${value.length}`);
  console.log(`.endsWith('World') - ${value.endsWith("World")}`);
  console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`);
  console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);
  console.log(`.substr(value, 2,3) - ${value.substr(2,3)}`)       // start-index, length
  console.log(`.substring(value, 2,3) - ${value.substring(2,3)}`) // start-index, end-index (not included, like Java)



  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}
/*
###########################
Array Manipulation Examples
###########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/
function arrayFunction() {
  let stooges = [  // define an array
    "Moe",
    "Larry",
    "Curly"
  ];
  console.table(stooges); // Display array as a table

  stooges.push("Shemp");  // Add an element to end of array
  console.table(stooges); // Display array as a table

  stooges.unshift("Curly Joe");  // Add an element to start of array
  console.table(stooges);        // Display array as a table

  stooges.splice(3,0,"Groucho", "Chico", "Harpo");  // Add elements starting at index 3 of array
  console.table(stooges);                           // Display array as a table                     

  stooges.splice(3,1);     // Remove one element starting at index 3
  console.table(stooges);  // Display array as a table

  stooges.splice(3,2);    // Remove two elements starting at index 3
  console.table(stooges); // Display array as a table

  stooges.shift();        // Remove one element at start of array
  console.table(stooges); // Display array as a table

  stooges.pop();           // Remove one element at end
  console.table(stooges);  // Display array as a table

  stooges.splice(stooges.indexOf("Larry"), 1);  // Remove "Larry"
  console.table(stooges);                       // Display array as a table
  

let marxBros = [   // define an array
  "Groucho",
  "Chico",
  "Harpo"
];

let oldFunnyGuys = stooges.concat(marxBros);  // concatenate two arrays in a new one
console.table(oldFunnyGuys);                  // Display array as a table
}  
  
  
