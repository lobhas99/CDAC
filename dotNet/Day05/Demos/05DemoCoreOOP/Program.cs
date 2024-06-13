namespace _05DemoCoreOOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IX obj = new Maths();
            
        }
    }

    public interface IX
    {
        int Add(int x, int y);
        int Sub(int x, int y);
    }

    public interface IY
    {
        int Mult(int x, int y);
        int Div(int x, int y);
    }
    public class Maths: IX, IY
    {
        public int Add(int x, int y) { return x + y; }
        public int Sub(int x, int y) { return x - y; }
        public int Mult(int x, int y) { return x * y; }
        public int Div(int x, int y) { return x / y; }

    }
}
