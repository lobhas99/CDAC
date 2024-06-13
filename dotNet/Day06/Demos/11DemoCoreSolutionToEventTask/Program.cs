using System.Net.Http.Headers;

namespace _11DemoCoreSolutionToEventTask
{
    internal class Program
    {
        static void Main(string[] args)
        {
            DBFactory dBFactory = new DBFactory();

            Console.WriteLine(  "1: SQL, 2: Oracle");
            int choice = Convert.ToInt32(Console.ReadLine());

            Database someDatabase = 
                    dBFactory.GetDatabase(choice);

            MyDelegate pointer1 = new MyDelegate(Log);
            someDatabase.OnInsert += pointer1;

            someDatabase.DoInsert();
        }

        public static void Log(string message)
        {
            Console.WriteLine(message);
        }
    }

    public delegate void MyDelegate(string message);
    public abstract class Database
    {
        public event MyDelegate OnInsert;
        public event MyDelegate OnUpdate;
        public event MyDelegate OnDelete;
        protected abstract string GetDatabaseName(); 
        protected abstract void Insert();
        protected abstract void Update();
        protected abstract void Delete();

        private string _DBName;
        public Database()
        {
            _DBName = GetDatabaseName();
        }
        public void DoInsert()
        {
            Insert();
            OnInsert("Log: Insert Done in DB " + _DBName + " @ " + DateTime.Now.ToString());

        }

        public void DoUpdate()
        {
            Update();
            OnUpdate("Log: Update Done in DB " + _DBName + " @ " + DateTime.Now.ToString());

        }

        public void DoDelete()
        {
            Delete();
            OnDelete("Log: Delete Done in DB " + _DBName + " @ " + DateTime.Now.ToString());

        }

    }

    public class SQLServer : Database
    {
        protected override void Delete()
        {
            Console.WriteLine(  "Delete in SQL");
           
        }

        protected override string GetDatabaseName()
        {
            return "SQL Server";
        }

        protected override void Insert()
        {
            Console.WriteLine("Insert in SQL");
        }

        protected override void Update()
        {
            Console.WriteLine("Update in SQL");
        }
    }

    public class Oracle : Database
    {
        protected override void Delete()
        {
            Console.WriteLine("Delete in Oracle");
        }

        protected override string GetDatabaseName()
        {
            return "Oracle Server";
        }

        protected override void Insert()
        {
            Console.WriteLine("Insert in Oracle");
        }

        protected override void Update()
        {
            Console.WriteLine("Update in Oracle");
        }
    }

    public class DBFactory
    {
        public Database GetDatabase(int choice)
        {
            if (choice == 1)
            {
                return new SQLServer();
            }
            else
            {
                return new Oracle();
            }
        }
    }
}
