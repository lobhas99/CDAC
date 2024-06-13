namespace _09DemoDelegates
{
    public delegate string MyDelegate();

    internal class Program
    {
        static void Main(string[] args)
        {
            B bObj = new B();
            MyDelegate pointer = new MyDelegate(bObj.M2);
            
            A aobj = new A();
            aobj.M1(pointer);
        }
    }

    public class A
    {
        public void M1(MyDelegate pointer)
        {
            //Call M2 from B here
            //and show output on console.
            string result = pointer();
            Console.WriteLine(result);
        }
    }

    public class B
    {
        public string M2()
        {
            return "M2 from B";
        }
    }

}
