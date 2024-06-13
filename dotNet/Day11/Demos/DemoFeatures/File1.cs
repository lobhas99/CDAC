using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoFeatures
{
   public  partial class Maths
    {
        public int Add(int x, int y)
        {
            return x + y;
        }
    }

    public partial class Test
    {
        partial void Print(string name);

        public void CallPrint()
        {
            Print("Sunbeam");
        }
    }
}
