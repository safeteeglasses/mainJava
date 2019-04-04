using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

using ProductReviewsAPI.Models;
using ProductReviewsAPI.Services;

namespace ProductReviewsAPI.Controllers
{

    [Route("api/reviews")]
    [ApiController]
    public class ProductReviewsController : ControllerBase 
    {
        private DataAccessLayer dal;

        public ProductReviewsController(DataAccessLayer dataAccessLayer)
        {
            dal = dataAccessLayer;
        }

        [HttpGet]
        public List<ProductReview> GetAll() 
        {
            return dal.GetAll();
        }

        [HttpGet("{id}", Name="GetProductReview")]
        public ActionResult<ProductReview> GetProductReview(int id)
        {
            var review = dal.Get(id);

            if( review != null )
            {
                return review;
            }

            return NotFound();
        }

        [HttpPost]
        public ActionResult Create([FromBody] ProductReview productReview)
        {
            dal.Add(productReview);

            // Return a created at route to indicate where the resource can be found
            return CreatedAtRoute("GetProductReview", new { id = productReview.Id }, productReview);
        }

        [HttpPut("{id}")]
        public ActionResult Update(int id, ProductReview updatedReview)
        {
            // Get the existing review
            var existingReview = dal.Get(id);

            // If that review does not exists, return 404
            if (existingReview == null)
            {
                return NotFound();
            }

            // Copy over the fields we want to change
            existingReview.Name = updatedReview.Name;
            existingReview.Title = updatedReview.Title;
            existingReview.Review = updatedReview.Review;

            // Save back to the database
            dal.Update(existingReview);

            // return a 204
            return NoContent();
        }

        [HttpDelete("{id}")]
        public ActionResult Delete(int id)
        {
            var review = dal.Get(id);

            if (review == null)
            {
                // return HTTP 404
                return NotFound();
            }

            // delete the resource
            dal.Delete(id);

            // return HTTP 201
            return NoContent();
        }

    }

}