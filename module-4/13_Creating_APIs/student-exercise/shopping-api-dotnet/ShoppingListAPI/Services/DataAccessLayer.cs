using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

using ShoppingListAPI.Models;

namespace ShoppingListAPI.Services
{
    public class DataAccessLayer : IDataAccessLayer<Item>
    {
        
        public List<Item> groceries { get; set; }

        public DataAccessLayer()
        {
            this.groceries = new List<Item> 
            {
                new Item { Id=1,name="Oatmeal",completed=false},
                new Item { Id=2,name="Milk",completed=false},
                new Item { Id=3,name="Banana",completed=false},
                new Item { Id=4,name="Strawberries",completed=false},
                new Item { Id=5,name="Lunch Meat",completed=false},
                new Item { Id=6,name="Bread",completed=false},
                new Item { Id=7,name="Grapes",completed=false},
                new Item { Id=8,name="Steak",completed=false},
                new Item { Id=9,name="Salad",completed=false},
                new Item { Id=10,name="Cookies",completed=false}
            };
        }

        public List<Item> GetAll()
        {
            return this.groceries;
        }

        public Item Get(int id)
        {
            return groceries.Find(item => item.Id == id);
        }

        public void Add(Item item)
        {
            groceries.Add(item);
        }

        public void Update(Item item)
        {
            groceries[groceries.FindIndex(i => i.Id == item.Id)] = item;
        }

        public void Delete(int id) 
        {
            groceries.Remove(groceries.Find(item => item.Id == id));
        }

    }
}