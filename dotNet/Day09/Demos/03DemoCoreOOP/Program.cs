namespace _03DemoCoreOOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(  "1: SQlServer, 2: Oracle");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            DBFactory dbFactory = new DBFactory();

            Database db = dbFactory.GetDatabase(dbChoice);
           
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
        public Database GetDatabase(int dbChoice)
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

    public abstract class Database
    {
        private string _DBName;
        public Database()
        {
            _DBName = GetDataBaseName();
        }
        public virtual void Insert()
        {
            DoInsert();
            Logger.CurrentLogger.Log(_DBName + " Insert");
        }

        public virtual void Update()
        {
            DoUpdate();
            Logger.CurrentLogger.Log(_DBName + " Update");
        }

        public virtual void Delete()
        {
            DoDelete();
            Logger.CurrentLogger.Log(_DBName + " Delete");
        }

        protected abstract void DoInsert();
        protected abstract void DoUpdate();
        protected abstract void DoDelete();

        protected abstract string GetDataBaseName();


    }

    public class SQLServer : Database
    {
        protected override string GetDataBaseName()
        {
            return "SQL Server";
        }
        protected override void DoDelete()
        {
            Console.WriteLine("SQL Delete Done");
        }
        protected override void DoInsert()
        {
            Console.WriteLine("SQL Insert Done");
        }
        protected override void DoUpdate()
        {
            Console.WriteLine("SQL Update Done");
        }
    }

    public class Oracle : Database
    {
        protected override string GetDataBaseName()
        {
            return "Oracle Server";
        }
        protected override void DoDelete()
        {
            Console.WriteLine("Oracle Delete Done");
        }

        protected override void DoInsert()
        {
            Console.WriteLine("Oracle Insert Done");
        }

        protected override void DoUpdate()
        {
            Console.WriteLine("Oracle Update Done");
        }
    }

    public class Logger
    {
        private static Logger _logger = new Logger();
        private Logger()
        {
                //Initialize file / db objects here for logging purpose once
        }

        public static Logger CurrentLogger
        {
            get
            {
                return _logger;
            }
        }
        public void Log(string message)
        {
            Console.WriteLine("Logged " + message  + " @ " + DateTime.Now.ToString());
        }
    }
}
