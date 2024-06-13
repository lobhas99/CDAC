using MathsLib;
namespace ConsumerOfMathLib
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Maths obj = new Maths();
            int result = obj.Add(10, 20);
            Console.WriteLine(  result);
            Console.ReadLine();
        }
    }
}
