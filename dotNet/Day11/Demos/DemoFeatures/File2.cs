using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoFeatures
{
    public partial class Maths
    {
        public int Sub(int x, int y)
        {
            return x - y;
        }
    }

    public partial class Test
    {
        partial void Print(string name)
        {
            Console.WriteLine("Hi " + name);
        }
    }
}
