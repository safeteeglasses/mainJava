using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lecture.Farming
{
    public class Cow : FarmAnimal
    {
        public Cow()
        {
            Name = "Cow";
        }

        public override string MakeSoundOnce()
        {
            return "Moo";
        }

        public override string MakeSoundTwice()
        {
            return "Moo Moo";
        }


        public void Graze()
        {
            /// The cow grazes
        }

    }
}
