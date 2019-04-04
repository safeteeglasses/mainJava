using System;

namespace ProductReviewsAPI.Models {

    public class ProductReview {

        public int Id {get;set;}
        public string Name {get;set;}
        public string Title {get;set;}
        public string Avatar {get;set;}
        public string Review {get;set;}
        public DateTime CreatedAt {get;set;}

    }

}