namespace _12DemoGenerics
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Normal Swap Call by Reference - Demo 0
            //Maths obj = new Maths();

            //int p = 100;
            //int q = 200;

            //Console.WriteLine("Before Swap p = " + p.ToString() +
            //                    " q = " + q.ToString());

            //obj.Swap(ref p, ref q);

            //Console.WriteLine("After Swap p = " + p.ToString() +
            //                    " q = " + q.ToString());

            //Console.ReadLine(); 
            #endregion

            #region Using Generic Swap - Demo1

            //Maths<int> obj = new Maths<int>();

            //int p = 100;
            //int q = 200;

            //Console.WriteLine("Before Swap p = " + p.ToString() +
            //                    " q = " + q.ToString());

            //obj.Swap(ref p, ref q);

            //Console.WriteLine("After Swap p = " + p.ToString() +
            //                    " q = " + q.ToString());


            //Maths<string> obj1 = new Maths<string>();

            //string s1 = "ABCD";
            //string s2 = "PQRS";

            //Console.WriteLine("Before Swap s1 = " + s1 +
            //                    " s2 = " + s2);

            //obj1.Swap(ref s1, ref s2);

            //Console.WriteLine("After Swap s1 = " + s1 +
            //                   " s2 = " + s2);

            //Console.ReadLine();

            #endregion

            #region Using Non Generic Method from Generic Class Demo 2

            //Maths<string> obj = new Maths<string>();
            //int result = obj.Add(10, 20);
            //Console.WriteLine(  result);
            #endregion

            #region Using Non/ Generic Method from NonGeneric Class Demo 3

            //Maths obj = new Maths();
            //int result = obj.Add(10, 20);
            //Console.WriteLine(result);

            //string s1 = "ABCD";
            //string s2 = "PQRS";

            //Console.WriteLine("Before Swap s1 = " + s1 +
            //                    " s2 = " + s2);

            //obj.Swap<string>(ref s1, ref s2);

            //Console.WriteLine("After Swap s1 = " + s1 +
            //                   " s2 = " + s2);


            #endregion

            #region Using Generic Inheritance Demo 4

            //SpecialMaths<string, int, bool, short> obj =
            //    new SpecialMaths<string, int, bool, short>();

            //short result =
            //        obj.NonsenseMethod("abcd", 100, true, 10);
            //Console.WriteLine(  result);


            //string s1 = "ABCD";
            //string s2 = "PQRS";

            //Console.WriteLine("Before Swap s1 = " + s1 +
            //                    " s2 = " + s2);

            //obj.Swap(ref s1, ref s2);

            //Console.WriteLine("After Swap s1 = " + s1 +
            //                   " s2 = " + s2);

            #endregion
        }
    }

    #region Generic Class Inheritance - Demo 4
    //public class Maths<T>
    //{
    //    public void Swap(ref T x, ref T y)
    //    {
    //        T z;
    //        z = x;
    //        x = y;
    //        y = z;
    //    }
    //}

    ////public class SpecialMaths : Maths<int>
    //public class SpecialMaths<P,Q,R,S> : Maths<P>
    //{
    //    public S NonsenseMethod(P p, Q q, R r, S s)
    //    {
    //        return s;
    //    }
    //}
    #endregion

    #region Simple Class with Generic & NonGeneric Method - Demo 3
    //public class Maths
    //{
    //    public int Add(int x, int y)
    //    {
    //        return x + y;
    //    }
    //    public void Swap<T>(ref T x, ref T y)
    //    {
    //        T z;
    //        z = x;
    //        x = y;
    //        y = z;
    //    }


    //}
    #endregion

    #region Simple Generic Class with NonGeneric Method - Demo 2
    //public class Maths<T>
    //{
    //    public int Add(int x, int y)
    //    {
    //        return x + y;
    //    }
    //    public void Swap(ref T x, ref T y)
    //    {
    //        T z;
    //        z = x;
    //        x = y;
    //        y = z;
    //    }


    //}
    #endregion

    #region Simple Generic Class Maths - Demo1
    //public class Maths<T>
    //{
    //    public void Swap(ref T x, ref T y)
    //    {
    //        T z;
    //        z = x;
    //        x = y;
    //        y = z;
    //    }
    //}
    #endregion

    #region Understanding need for generics / Template concept Demo - 0
    //public class Maths
    //{
    //    public void Swap(ref int x, ref int y)
    //    {
    //        int z;
    //        z = x;
    //        x= y;
    //        y= z;

    //    }

    //    public void Swap(ref string x, ref string y)
    //    {
    //        string z;
    //        z = x;
    //        x = y;
    //        y = z;

    //    }
    //} 
    #endregion
}
