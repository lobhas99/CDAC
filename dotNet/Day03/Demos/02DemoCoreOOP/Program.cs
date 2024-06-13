namespace _02DemoCoreOOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1: PDF, 2: Excel, 3: DOCX");
            int choice = Convert.ToInt32(Console.ReadLine());

            ReportFactory reportFactory = new ReportFactory();

            Report report = reportFactory.GetReport(choice);
            report.GenerateReport();
            
            Console.ReadLine();
        }
    }

    public class ReportFactory
    {
        public Report GetReport(int choice)
        {
            Report report = null;
            if (choice == 1)
            {
                report = new PDF();
            }
            else if (choice == 2)
            {
                 report = new EXCEL();
            }
            else if (choice == 3)
            {
                report = new DOCX();
            }
            return report;
        }
    }

    public abstract class Report
    {
        protected abstract void Create();
        protected abstract void Parse();
        protected abstract void Validate();
        protected abstract void Save();

        public virtual void GenerateReport()
        {
            Create();
            Parse();
            Validate();
            Save();
        }
    }

    public class PDF : Report
    {
        protected override void Create()
        {
            Console.WriteLine("PDF Created");
            
        }
        protected override void Parse()
        {
            Console.WriteLine("PDF Data Parsed");
        }

        protected override void Validate()
        {
            Console.WriteLine("PDF Data Validated");
        }

        protected override void Save()
        {
            Console.WriteLine("PDF Saved.");
        }

      
    }

    public class EXCEL : Report
    {
        protected override void Create()
        {
            Console.WriteLine("EXCEL Created");

        }
        protected override void Parse()
        {
            Console.WriteLine("EXCEL Data Parsed");
        }

        protected override void Validate()
        {
            Console.WriteLine("EXCEL Data Validated");
        }

        protected override void Save()
        {
            Console.WriteLine("EXCEL Saved.");
        }

    }

    public class DOCX : Report
    {
        protected override void Create()
        {
            Console.WriteLine( "DOCX Created");
        }

        protected override void Parse()
        {
            Console.WriteLine("DOCX Parsed");
        }

        protected override void Save()
        {
            Console.WriteLine("DOCX Saved");
        }

        protected override void Validate()
        {
            Console.WriteLine("DOCX Validated");
        }
    }
}


#region Old Code 

//namespace _02DemoCoreOOP
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            Console.WriteLine("1: PDF, 2: Excel");
//            int choice = Convert.ToInt32(Console.ReadLine());

//            if(choice == 1)
//            {
//                Console.WriteLine("PDF Created");
//                Console.WriteLine("PDF Data Parsed");
//                Console.WriteLine("PDF Data Validated");
//                Console.WriteLine("PDF Saved.");
//            }
//            else if(choice == 2)
//            {
//                Console.WriteLine("EXCEL Created");
//                Console.WriteLine("EXCEL Data Parsed");
//                Console.WriteLine("EXCEL Data Validated");
//                Console.WriteLine("EXCEL Saved.");
//            }
//            else
//            {
//                Console.WriteLine("Galat hai");
//            }

//            Console.ReadLine();
//        }
//    }


//}

#endregion