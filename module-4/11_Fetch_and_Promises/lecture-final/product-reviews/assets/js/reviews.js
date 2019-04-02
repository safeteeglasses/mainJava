/**************************************************************************
 * Fetch and Promises - review.js - lecture-final
 *************************************************************************/
let reviews = [];

function loadReviews() {
  console.log("Load Reviews...");

  fetch('data.json')              // go get the data from this source
    .then((response) => {         // wait until data is retrieved
      return response.json();     // convert data to json and return it
    })
    .then((data) => {             // wait for the data to be converted to json
      reviews = data;             // assign the data to reviews
      displayReviews();           // run the displayReviews() method to get the date into the html
    })
    .catch((err) => console.error(err));
}

function displayReviews() {
  console.log("Display Reviews...");

  if('content' in document.createElement('template')) {
    const container = document.querySelector(".reviews");
    reviews.forEach((review) => {
      const tmpl = document.getElementById('review-template').content.cloneNode(true);
      tmpl.querySelector('img').setAttribute("src",review.avatar);
      tmpl.querySelector('.username').innerText = review.username;
      tmpl.querySelector('h2').innerText = review.title;
      tmpl.querySelector('.published-date').innerText = review.publishedOn;
      tmpl.querySelector('.user-review').innerText = review.review;
      container.appendChild(tmpl);
    });
  } else {
    console.error('Your browser does not support templates');
  }
}

const button = document.querySelector("button");
  button.addEventListener("click",function() {
  loadReviews();
  button.disabled = true;
});