/**************************************************************************
 * Fetch and Promises - review.js - lecture.final
 *************************************************************************/
let reviews = [];

function loadReviews() {
  console.log("Load Reviews...");

  fetch('data.json')        // go get the data from this source
    .then((response) => {   // wait until the data is retrieved
      return response.json();  // connvert data to json and return it
    })
    .then((data) => {         // wait for the data to be converted to json
      reviews = data;         // assign the data to reviews
      displayReviews();       // run the displayReviews() method to get the date into the html
    })
    .catch((err) => console.error(err));
  // whatever code comes after the fetch is run as the fetch is getting the data
  // when the fetch is done, this is interrupted, the .then(s) are run and we resume where we were interrupted
  
  console.log(`Waiting for data`);
  }
}

function displayReviews() {
  console.log("Display Reviews...");

  if('content' in document.createElement('template')) {     // if there is a <template> in the html
    const container = document.querySelector(".reviews");   // get a reference to the elemane with class "reviews"
    reviews.forEach((review) => {                           // loop through each element
      const tmpl = document.getElementById('review-template').content.cloneNode(true); // get a reference to review-template
      tmpl.querySelector('img').setAttribute("src",review.avatar);   // assigning values
      tmpl.querySelector('.username').innerText = review.username;   //              content
      tmpl.querySelector('h2').innerText = review.title;             //                  and
      tmpl.querySelector('.published-date').innerText = review.publishedOn;   //           whatever else
      tmpl.querySelector('.user-review').innerText = review.review;           //              we want in the html template 
      container.appendChild(tmpl);                           // add the element to DOM
    });
  } else {
    console.error('Your browser does not support templates');
  }
}

const button = document.querySelector("button");
  button.addEventListener("click",function() {    // When the button is clicked...
  loadReviews();                                  // run the loadReviews() method
  button.disabled = true;                         // disable the button
});