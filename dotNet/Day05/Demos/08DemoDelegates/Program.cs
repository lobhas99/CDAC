namespace _08DemoDelegates
{
    public delegate bool MyDelegate(int x);
    internal class Program
    {
        static void Main(string[] args)
        {
            MyDelegate pointer = new MyDelegate(Check);

            //bool result = Check(20);
            bool result = pointer(20);

            Console.WriteLine(result);
            Console.ReadLine();
        }

        public static bool Check(int x)
        {
            return (x > 10);
        }
    }
}
