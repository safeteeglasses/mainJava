using MVCModels.Web.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace MVCModels.Web.DAL
{
    public interface IProductDAL
    {
        /// <summary>
        /// Gets all of the products.
        /// </summary>
        /// <returns></returns>
        IList<Product> GetProducts();

        /// <summary>
        /// Gets a single product
        /// </summary>
        /// <param name="id">The product id</param>
        /// <returns></returns>
        Product GetProduct(string id);
    }
}
