<!-------------------------------------------------------------->
<!-- REST APIs - ProductPage.vue - Lecture Final              -->
<!-------------------------------------------------------------->
<template>
  <div class="product" >
    <div class="product-image">
      <img src="../assets/img/teyeti.jpg" alt="Tech Elevator Yeti" class="product-image">
    </div>
    <div class="product-info">
      <h1>TECH ELEVATOR YETI</h1>
      <p class="description">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
    </div>
    <!-- if showAddProductForm is true:                                       -->
    <!-- add <save-review> to DOM                                             -->
    <!-- set up event listener for custom showReview event                    -->
    <!-- when custom showReview event is $emit'd...                           -->
    <!--         call showReview method with apiURL and reviewID as arguments -->
    
    <save-review v-if="showAddProductForm" v-on:showReviews="showReviews" :apiURL="API_URL" :reviewID="reviewID"/>
   
    <!-- if showAddProductForm is not true:                                   -->
    <!-- add <product-review> to DOM   
    <!-- v-bind apiURL to API_URL variable/property                           -->
    <!--     : is shorthand for v-bind                                        -->
    <!-- set up event listener for custom addReview event                     -->
    <!-- when custom addReview event is $emit'd...                            -->
    <!--         call addReview method                                        -->
    <!-- set up event listener for custom editReview event                    -->
    <!-- when custom editReview event is $emit'd...                           -->
    <!--         call editReview method with the event object as an argument  -->
   
    <product-reviews 
      v-if="!showAddProductForm" 
      :apiURL="API_URL"    
      v-on:addReview="addReview" 
      v-on:editReview="editReview($event)"/>
  </div>
</template>

<script>
import SaveReview from "@/components/SaveReview"
import ProductReviews from "@/components/ProductReviews";

export default {
  components: {
    SaveReview,
    ProductReviews
  },
  data() {
    return {
      API_URL: "http://5c51c520e315030014ea3414.mockapi.io/api/reviews",  // API URL root - add endpoint as needed
      showAddProductForm: false,                                          // Hide AddProductForm
      reviewID: 0                                                         // Assume new review
    }
  },
  methods: {
    addReview() {                     // Run when addReview is clicked
      this.showAddProductForm = true; // Set showAddProductForm to true
    },
    editReview(id) {                  // Run when editReview is clicked 
      this.reviewID = id;             // Set reviewID to ID selected for editting 
      this.showAddProductForm = true; // Set showAddProductForm to true
    },
    showReviews() {                   // Run when showReviews is clicked
      this.showAddProductForm = false;// Set showAddProductForm to false
      this.reviewID = 0;              // Set reviewID to 0
    }
  }
};
</script>

<style>
.product {
  display: grid;
  grid-template-areas:
    "product-image product-info"
    "product-reviews product-reviews"
    "product-add product-add";
  grid-template-columns: 300px auto;
}
.product-image {
  grid-area: product-image;
}
.product-image img {
  max-width: 280px;
  box-shadow: 2px 2px rgb(0, 0, 0, 60%);
  border: 1px solid rgba(0, 0, 0, 0.6);
}
.product-info {
  grid-area: product-info;
}
.description {
  margin-top: 10px;
  line-height: 1.5;
}
</style>
