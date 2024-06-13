namespace _10DemoCoreCollections
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i = 100;        //Stack

            string s = "abcd";  //Heap
            //String s = new String(new Char()['a', 'b','c','d']);

            Emp e1 = new Emp(); //Heap
            e1.Name = "Mahesh";

            //object o1 = e1;

            object o1 = i;

            if(o1.GetType().ToString() == "_10DemoCoreCollections.Emp")
            {
                Emp e =  (Emp) o1;
                //Emp e = o1 as Emp;

                Console.WriteLine(e.Name);

            }
            else if(o1.GetType().ToString()  == "System.Int32")
            {
                int j = Convert.ToInt32(o1);

                Console.WriteLine(j);

            }
            else
            {
                Console.WriteLine("Invalid type of data");
            }

        }
    }

    public class Emp
    {
        private string _Name;

        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

    }

}
