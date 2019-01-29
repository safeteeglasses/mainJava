
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lecture.Farming
{
    public class Chicken : FarmAnimal
    {        
        public Chicken()
        {
            Name = "Chicken";
        }
        
        public override string MakeSoundOnce()
        {
            return "Cluck";
        }

        public override string MakeSoundTwice()
        {
            return "Cluck Cluck";
        }

    }
}
