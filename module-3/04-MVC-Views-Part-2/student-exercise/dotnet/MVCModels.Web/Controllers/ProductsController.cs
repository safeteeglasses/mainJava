using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using MVCModels.Web.DAL;
using MVCModels.Web.Models;

namespace MVCModels.Web.Controllers
{
    public class ProductsController : Controller
    {
        // GET: products/
        // GET: products/index
        public IActionResult Index()
        {
            IProductDAL dal = new MockProductDAL();
            IList<Product> products = dal.GetProducts();

            return View(products);
        }

        // GET: products/tile
        public IActionResult Tile()
        {
            IProductDAL dal = new MockProductDAL();
            IList<Product> products = dal.GetProducts();

            return View(products);
        }

        // GET: products/detail/SKU-1234
        // GET: products/detail?id=SKU-1234
        public IActionResult Detail(string id)
        {
            IProductDAL dal = new MockProductDAL();
            Product product = dal.GetProduct(id);

            return View(product);
        }
    }
}