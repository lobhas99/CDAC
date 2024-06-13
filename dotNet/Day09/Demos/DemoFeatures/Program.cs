using System.Diagnostics;
using System.Linq.Expressions;

namespace DemoFeatures
{
    //public delegate bool MyDelegate(int i);

    public delegate P MyDelegate<P,Q>(Q i);
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Partial Class
            //Maths obj = new Maths();
            #endregion

            #region Nullable Type

            //object obj = null;

            ////Nullable<int> salary = null;

            //int? salary = null;

            //if (salary.HasValue)
            //{
            //    Console.WriteLine(  "U get salary???");
            //}
            //else
            //{
            //    Console.WriteLine(  "You dont have salary assigned yet!");
            //}
            #endregion


            Stopwatch stopwatch = new Stopwatch();
            //stopwatch.Start();

            //MyDelegate pointer = new MyDelegate(Check);

            //MyDelegate pointer = delegate (int i)
            //                        {
            //                            return (i > 10);
            //                        };

            //MyDelegate pointer = (i) =>
            //                        {
            //                            return (i > 10);
            //                        };


            //MyDelegate<bool, int> pointer = (i) =>
            //                                {
            //                                    return (i > 10);
            //                                };



            //Func<int, bool> pointer = (i) =>
            //{
            //    return (i > 10);
            //};


            //Create a tree
            Expression<Func<int, bool>> tree = (i) => (i > 10);

            //Compile a Tree
            Func<int, bool> pointer = tree.Compile();

            //bool result = Check(20);

            stopwatch.Start();

            bool result = pointer(20); //Execute compiled Tree

            stopwatch.Stop();

            Console.WriteLine(result);
            Console.WriteLine("Time taken = {0}", stopwatch.ElapsedTicks);

            Console.ReadLine();
        }




        public static bool Check(int i)
        {
            return (i > 10);
        }

    }



}
