namespace _03DemoCoreOOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(  "1: SQlServer, 2: Oracle");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            DBFactory dbFactory = new DBFactory();

            IDatabase db = dbFactory.GetDatabase(dbChoice);

            Console.WriteLine("1: Insert , 2: Update, 3: Delete");
            int opChoice = Convert.ToInt32(Console.ReadLine());
            if (opChoice == 1)
            {
                db.Insert();
            }
            else if(opChoice == 2) {
                db.Update();
            }
            else if (opChoice == 3) {
                db.Delete();
            }

            Console.ReadLine();
        }
    }

    public class DBFactory
    {
        public IDatabase GetDatabase(int dbChoice)
        {
            if(dbChoice == 1)
            {
                return new SQLServer();
            }
            else
            {
                return new Oracle();
            }
        }
    }

    public interface IDatabase
    {
        void Insert();
        void Update();
        void Delete();

    }

    public class SQLServer: IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("SQL Server Insert Done!");
           
        }
        public void Update()
        {
            Console.WriteLine("SQL Server Update Done!");
            Console.WriteLine("Log: SQL Update");
        }
        public void Delete()
        {
            Console.WriteLine("SQL Server Delete Done!");
            Console.WriteLine("Log: SQL Delete");
        }
    }

    public class Oracle : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Oracle Server Insert Done!");
            Console.WriteLine("Log: Oracle Insert");
        }
        public void Update()
        {
            Console.WriteLine("Oracle Server Update Done!");
            Console.WriteLine("Log: Oracle Update");
        }
        public void Delete()
        {
            Console.WriteLine("Oracle Server Delete Done!");
            Console.WriteLine("Log: Oracle Delete");
        }
    }
}
