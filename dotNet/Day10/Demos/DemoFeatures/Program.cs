using System.Collections;
using System.Diagnostics;
using System.Diagnostics.SymbolStore;
using System.Linq.Expressions;
using System.Security.Cryptography.X509Certificates;
using System.Xml.Linq;

namespace DemoFeatures
{
    //public delegate bool MyDelegate(int i);

    public delegate P MyDelegate<P,Q>(Q i);
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Partial Class
            //Maths obj = new Maths();
            #endregion

            #region Nullable Type

            //object obj = null;

            ////Nullable<int> salary = null;

            //int? salary = null;

            //if (salary.HasValue)
            //{
            //    Console.WriteLine(  "U get salary???");
            //}
            //else
            //{
            //    Console.WriteLine(  "You dont have salary assigned yet!");
            //}
            #endregion

            #region Anonymous Method, Lambada Expression, Expression Tree, Generic Delegate. FUNC<P,Q>

            //Stopwatch stopwatch = new Stopwatch();
            ////stopwatch.Start();

            ////MyDelegate pointer = new MyDelegate(Check);

            ////MyDelegate pointer = delegate (int i)
            ////                        {
            ////                            return (i > 10);
            ////                        };

            ////MyDelegate pointer = (i) =>
            ////                        {
            ////                            return (i > 10);
            ////                        };


            ////MyDelegate<bool, int> pointer = (i) =>
            ////                                {
            ////                                    return (i > 10);
            ////                                };



            ////Func<int, bool> pointer = (i) =>
            ////{
            ////    return (i > 10);
            ////};


            ////Create a tree
            //Expression<Func<int, bool>> tree = (i) => (i > 10);

            ////Compile a Tree
            //Func<int, bool> pointer = tree.Compile();

            ////bool result = Check(20);

            //stopwatch.Start();

            //bool result = pointer(20); //Execute compiled Tree

            //stopwatch.Stop();

            //Console.WriteLine(result);
            //Console.WriteLine("Time taken = {0}", stopwatch.ElapsedTicks);
            #endregion
            #region Implicit Type 
            //var v = 100;
            //v = "abcd";

            //var v1 = new Emp();
            //v1 = 100;
            #endregion

            #region Object Initializer
            ////Emp emp = new Emp();
            ////emp.No = 100;
            ////emp.Name = "Sachin";
            ////emp.Address = "Pune";


            //Emp emp = new Emp() { No = 1, Name="Sachin", Address="Pune" };


            //Console.WriteLine("No = {0}, Name = {1}, Address = {2}", emp.No, emp.Name, emp.Address);

            #endregion

            #region Collection Initializer
            //List<Emp> emps = new List<Emp>() 
            //{
            //  new Emp{ No = 1, Name = "Mahesh", Address = "Pune" },
            //  new Emp{ No = 2, Name = "Nilesh", Address = "Pune" },
            //  new Emp{ No = 3, Name = "Sachin", Address = "Pune" },
            //  new Emp{ No = 4, Name = "Kartik", Address = "Pune" }
            //};

            //foreach (var emp in emps)
            //{
            //    Console.WriteLine("No = {0}, Name = {1}, Address = {2}", emp.No, emp.Name, emp.Address);
            //}

            #endregion

            #region Anonymous Type
            //var emp = new { No = 1, Name = "Sachin", Address = "Pune" };

            //var emp1 = new { No = 1, Address = "Pune", Name = "Sachin" };

            //Console.WriteLine(emp.GetType().ToString()) ;
            //Console.WriteLine(emp1.GetType().ToString());

            //Console.WriteLine("No = {0}, Name = {1}, Address = {2}", emp.No, emp.Name, emp.Address);
            #endregion

            #region Anonymous Type Collection

            //var emps = new []
            // {
            //     new { No = 1, Name = "Sachin", Address = "Pune" },
            //     new { No = 2, Name = "Mahesh", Address = "Pune" },
            //     new { No = 3, Name = "Nilesh", Address = "Pune" }
            // };

            // foreach (var emp in emps) 
            // {
            //     Console.WriteLine("No = {0}, Name = {1}, Address = {2}", emp.No, emp.Name, emp.Address);
            // }
            #endregion

            #region Extension Method
            //string str = "abc";

            ////MyCode myCode = new MyCode();
            ////bool result =  myCode.CheckForValidEMailAddress(str, 100);
            ////Console.WriteLine(  result);


            ////bool result = MyCode.CheckForValidEMailAddress(str, 100);

            //bool result = str.CheckForValidEMailAddress(100);

            ////int[] arr = new int[] { 10, 20, 30, 40, 50 };



            //Console.WriteLine(result);
            #endregion

            #region Partial Method
            //Test t = new Test();
            //t.CallPrint();
            #endregion

            #region Routine Filter
            //List<Emp> emps = new List<Emp>()
            //{
            //    new Emp(){ No = 1, Name = "Mayur", Address = "Pune" },
            //    new Emp(){ No = 2, Name = "Rushikesh", Address = "Panji" },
            //    new Emp(){ No = 3, Name = "Harshal", Address = "Pune" },
            //    new Emp(){ No = 4, Name = "Mrunali", Address = "Mumbai" },
            //    new Emp(){ No = 5, Name = "Vishal", Address = "Puri" },
            //    new Emp(){ No = 6, Name = "Sandesh", Address = "Chennai" },
            //    new Emp(){ No = 7, Name = "Parimal", Address = "Pune" }
            //};

            //List<Emp> result = new List<Emp>();

            //foreach (var emp in emps)
            //{
            //    if (emp.Address.StartsWith("P"))
            //    {
            //        result.Add(emp);
            //    }
            //}

            //foreach (var emp in result)
            //{
            //    Console.WriteLine("No = {0}, Name = {1}, Address = {2}", emp.No, emp.Name , emp.Address);
            //} 
            #endregion

            #region Sample Collection
            List<Emp> emps = new List<Emp>()
            {
                new Emp(){ No = 1, Name = "Mayur", Address = "Pune" },
                new Emp(){ No = 2, Name = "Rushikesh", Address = "Panji" },
                new Emp(){ No = 3, Name = "Harshal", Address = "Pune" },
                new Emp(){ No = 4, Name = "Mrunali", Address = "Mumbai" },
                new Emp(){ No = 5, Name = "Vishal", Address = "Puri" },
                new Emp(){ No = 5, Name = "Sandesh", Address = "Chennai" },
                new Emp(){ No = 4, Name = "Parimal", Address = "Pune" }
            };

            List<Dept> depts = new List<Dept>()
            {
                new Dept(){ DNo = 3, DName = "IT" },
                new Dept(){ DNo = 4, DName = "Accounts" },
                new Dept(){ DNo = 5, DName = "HR" }
            };
            #endregion

            #region LINQ
            #region Differed Execution of LINQ
            ////var result = (from emp in emps
            ////              where emp.Address.StartsWith("P")
            ////              select emp);

            //var result = (from emp in emps
            //              where emp.Address.StartsWith("P")
            //              select emp).ToList();

            //emps.Add(new Emp() { No = 8, Name = "Harshad", Address = "Pune" });

            //foreach (var emp in result)
            //{
            //    Console.WriteLine("No = {0}, Name = {1}, Address = {2}", emp.No, emp.Name, emp.Address);
            //}
            #endregion

            #region Select Only Name
            //var result = (from emp in emps
            //              where emp.Address.StartsWith("P")
            //              select emp.Name);

            //foreach (var name in result)
            //{
            //    Console.WriteLine(  name);
            //}
            #endregion

            #region Select No, Name in QueryHolder
            //var result = (from emp in emps
            //              where emp.Address.StartsWith("P")
            //              select new QueryResultHolder() 
            //              { 
            //                 ENo = emp.No,
            //                 EName = emp.Name
            //              });

            //foreach (var obj in result)
            //{
            //    Console.WriteLine(obj.ENo + obj.EName);
            //}
            #endregion

            #region Select No, Name in Anonymous Type
            //  var result = (from emp in emps
            //                where emp.Address.StartsWith("P")
            //                select new {
            //                                ENo = emp.No,
            //                                EName = emp.Name
            //                            });

            //Console.WriteLine(result);

            //  foreach (var obj in result)
            //  {
            //      Console.WriteLine(obj.ENo + obj.EName);
            //  }
            #endregion

            #region Join

            //var result = from e in emps
            //             from d in depts
            //             where e.No == d.DNo
            //             select new
            //             {
            //                 ENo = e.No,
            //                 EName = e.Name,
            //                 DName = d.DName
            //             };

            //foreach (var item in result)
            //{
            //    Console.WriteLine(  item.EName +  " is from " + item.DName);
            //}
            #endregion
            #endregion

            #region Understand Dynamic Type
            //Factory factory = new Factory();
            //Console.WriteLine(  "Enter some number!");

            //int choice = Convert.ToInt32(Console.ReadLine());

            #region Routine Object Code
            //object obj = factory.GetMeSomething(choice);

            //if(obj.GetType().ToString() == "DemoFeatures.Student")
            //{
            //    Student student = (Student)obj;
            //    Console.WriteLine(student.GetStudentDetails()) ;
            //}
            //else if (obj.GetType().ToString() == "DemoFeatures.Book")
            //{
            //    Book book = (Book)obj;
            //    Console.WriteLine(book.GetBookDetails());
            //}
            #endregion

            #region Using Dynamic Type in .NET

            //dynamic d = factory.GetMeSomething(choice);

            //Console.WriteLine(d.GetStudentDetails());

            #endregion


            #endregion

            #region Optional & Named Parameters

            //Student  student = new Student();
            //string result = student.GetDetails(1, "mahesh", "pune");

            //string result = student.GetDetails(1, "mahesh");

            //string result = student.GetDetails(1);

            //string result = student.GetDetails(7, address: "Chennai", name : "MSD");

            //Console.WriteLine(result);


            #endregion

            #region Iterator
            //Week week   = new Week();

            //foreach (string day in week)
            //{
            //    Console.WriteLine(day);
            //}
            #endregion

            Console.ReadLine();
        }

        public static bool Check(int i)
        {
            return (i > 10);
        }

    }

    public class Week : IEnumerable
    {
        private string[] days = 
            new string[] { "Mon", "Tue", "Wed", "Thur", "Fri" };

        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < days.Length; i++)
            {
               yield return days[i];
            }
        }
    }

    #region Extension Method in Extension Class
    public static class MyCode
    {
        public static bool CheckForValidEMailAddress(this string str, int nonsense)
        {
            return str.Contains("@");
        }
    }
    #endregion

    public class Emp
    {
        #region Auto Property
        public int No { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }


        #endregion

        #region Normal Getter - Setter
        //private int _No;
        //private string _Name;
        //private string _Address;

        //public string Address
        //{
        //    get { return _Address; }
        //    set { _Address = value; }
        //}

        //public string Name
        //{
        //    get { return _Name; }
        //    set { _Name = value; }
        //}

        //public int No
        //{
        //    get { return _No; }
        //    set { _No = value; }
        //}
        #endregion
    }

    public class Dept
    {
        public int DNo { get; set; }
        public string DName { get; set; }
    }

    public class QueryResultHolder
    {
        public int ENo { get; set; }
        public string EName { get; set; }
    }


    public class Book
    {
        public string GetBookDetails()
        {
            return "Some book details";
        }
    }



    public class Student
    {
        public string GetStudentDetails()
        {
            return "Some Student details";
        }

        public string GetDetails(int no, string name = "sachin", string address = "mumbai")
        {
            return string.Format("No = {0}, Name = {1}, Address = {2}", no, name, address);
        }
    }

    public class Factory
    {
        public object GetMeSomething(int choice)
        {
            if (choice ==1)
            {
                return new Book();
            }
            else
            {
                return new Student();
            }
        }
    }
}
