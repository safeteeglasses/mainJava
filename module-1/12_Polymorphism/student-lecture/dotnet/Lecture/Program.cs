using Lecture.Farming;
using System;
using System.Collections.Generic;

namespace Lecture
{
    class Program
    {
        static void Main(string[] args)
        {
           //
            // OLD MACDONALD
            //

            List<FarmAnimal> livestock = new List<FarmAnimal>();

            livestock.Add(new Cow());
            livestock.Add(new Duck());
            livestock.Add(new Chicken());

            Console.WriteLine("Old MacDonald had a farm ee ay ee ay oh");

            foreach(FarmAnimal animal in livestock)
            {                
                Console.WriteLine("And on his farm there was a " + animal.Name + " ee ay ee ay oh");
                Console.WriteLine("With a " + animal.MakeSoundTwice() + " here and a " + animal.MakeSoundTwice() + " there");
                Console.WriteLine("Here a " + animal.MakeSoundOnce() + ", there a " + animal.MakeSoundOnce() + " everywhere a " + animal.MakeSoundTwice());
                Console.WriteLine("Old Macdonald had a farm, ee ay ee ay oh");
                Console.WriteLine();
            }

            // ------ NOW
            // What if we wanted to sing about other things on the farm?
            // Can it be done? 

            Console.ReadLine();
        }
    }
}