using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using ShoppingListAPI.Models;
using ShoppingListAPI.Services;

namespace ShoppingListAPI.Controllers
{
    [Route("api/groceries")]
    [ApiController]
    public class ShoppingLIstController : ControllerBase
    {
        private readonly IDataAccessLayer<Item> dal;

        public ShoppingLIstController(IDataAccessLayer<Item> dataAccessLayer) {
            dal = dataAccessLayer;
        }

        [HttpGet]
        public List<Item> GetAll()
        {
            return dal.GetAll();
        }

        [HttpGet("{id}", Name = "GetItem")]
        public ActionResult<Item> GetItem(int id)
        {
            var item = dal.Get(id);

            if (item != null)
            {
                return item;
            }

            return NotFound();
        }

        [HttpPost]
        public ActionResult Create([FromBody] Item item)
        {
            dal.Add(item);

            // Return a created at route to indicate where the resource can be found
            return CreatedAtRoute("GetItem", new { id = item.Id }, item);
        }

        [HttpPut("{id}")]
        public ActionResult Update(int id, Item updatedItem)
        {
            // Get the existing item
            var existingItem = dal.Get(id);

            // If that item does not exists, return 404
            if (existingItem == null)
            {
                return NotFound();
            }

            // Copy over the fields we want to change
            existingItem.completed = updatedItem.completed;

            // Save back to the database
            dal.Update(existingItem);

            // return a 204
            return NoContent();
        }

        [HttpDelete("{id}")]
        public ActionResult Delete(int id)
        {
            var item = dal.Get(id);

            if (item == null)
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