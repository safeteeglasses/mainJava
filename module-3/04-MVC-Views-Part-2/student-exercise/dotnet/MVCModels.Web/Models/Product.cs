using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace MVCModels.Web.Models
{
    public class Product
    {
        /// <summary>
        /// Id of the product
        /// </summary>
        public string ProductId { get; set; }

        /// <summary>
        /// Name of the product
        /// </summary>
        public string Name { get; set; }

        /// <summary>
        /// Manufacturer for the product
        /// </summary>
        public string Manufacturer { get; set; }

        /// <summary>
        /// Image name for the product
        /// </summary>
        public string ImageName { get; set; }

        /// <summary>
        /// Weight of the product
        /// </summary>
        public double WeightInLbs { get; set; }

        /// <summary>
        /// Price of the product
        /// </summary>
        public double Price { get; set; }

        /// <summary>
        /// Average rating for the product
        /// </summary>
        public double AverageRating { get; set; }

        /// <summary>
        /// Remaining qty in stock
        /// </summary>
        public int RemainingStock { get; set; }

        /// <summary>
        /// If the product is a top seller
        /// </summary>
        public bool IsTopSeller { get; set; }

        /// <summary>
        /// Description of the product
        /// </summary>
        public string Description { get; set; }
    }
}
