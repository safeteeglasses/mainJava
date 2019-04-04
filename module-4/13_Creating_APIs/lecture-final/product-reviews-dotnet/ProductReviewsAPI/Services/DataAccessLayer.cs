using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

using ProductReviewsAPI.Models;

namespace ProductReviewsAPI.Services 
{

    public class DataAccessLayer : IDataAccessLayer<ProductReview> 
    {

        public List<ProductReview> reviews {get; set;}
        public string DEFAULT_REVIEW = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        public string DEFAULT_AVATAR = "https://s3.amazonaws.com/uifaces/faces/twitter/osmanince/128.jpg";

        public DataAccessLayer()
        {
            this.reviews = new List<ProductReview> {
                new ProductReview { Id=1, Name="Bernie Denesik Sr.", Title="Tasty Treat", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/operatino/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=2, Name="Dessie Paucek", Title="Incredible Yeti", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/joelhelin/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=3, Name="Abigayle Howell", Title="Practical", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/vm_f/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=4, Name="Miss Electa Kunde", Title="Fantastic", Avatar="hhttps://s3.amazonaws.com/uifaces/faces/twitter/Stievius/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=5, Name="Genesis Heller", Title="Tasty", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/rohixx/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=6, Name="Torrance Kautzer", Title="Fantastic", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/duivvv/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=7, Name="Amara Bartell", Title="Ergonomic", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/xalionmalik/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=8, Name="Miss Gretchen White", Title="Small", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/ariil/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=9, Name="Miss Velva O'Hara", Title="Licensed", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/osmanince/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now },
                new ProductReview { Id=10, Name="Dr. Maximilian Bruen", Title="Incredible", Avatar="https://s3.amazonaws.com/uifaces/faces/twitter/mirfanqureshi/128.jpg", Review=this.DEFAULT_REVIEW, CreatedAt=DateTime.Now }
            };
        }

        public List<ProductReview> GetAll() 
        {
            return this.reviews;
        }

        public ProductReview Get(int id)
        {
            return reviews.Find(review => review.Id == id);
        }

        public void Add(ProductReview productReview)
        {
            productReview.Id = reviews[reviews.Count-1].Id + 1;
            productReview.Avatar = DEFAULT_AVATAR;
            productReview.CreatedAt = DateTime.Now;
            reviews.Add(productReview);
        }

        public void Update(ProductReview productReview)
        {
            reviews[reviews.FindIndex(r => r.Id == productReview.Id)] = productReview;
        }

        public void Delete(int id)
        {
            reviews.Remove(reviews.Find(r => r.Id == id));
        }

    }

}