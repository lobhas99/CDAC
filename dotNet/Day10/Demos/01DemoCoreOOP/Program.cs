namespace _01DemoCoreOOP
{
    public class Program
    {
        static void Main(string[] args)
        {
            #region Java Like Code
            //Person person = new Person();
            //person.SetNo(8);
            //Console.WriteLine(person.GetNo());
            #endregion

            #region .NET property usage
            //Person person = new Person();

            //person.No = 88;
            //person.Name = "abc";
            //person.Address = "pune";

            ////Console.WriteLine(person.No);

            //Console.WriteLine(person.GetDetails());
            #endregion


            Emp emp = new Emp();
            emp.No = 10;
            emp.Name = "Mahesh";
            emp.Address = "Pune";
          
            Console.WriteLine(emp.GetDetails());


            Console.ReadLine();
        }
    }

    public class Person
    {
        #region Private Members
        private int _No;
        private string _Name;
        private string _Address;
        #endregion

        #region Member Properties
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }

        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

        public int No
        {
            get { return _No; }
            set { _No = value; }
        }
        #endregion

        public virtual string GetDetails()
        {
            return this.No.ToString() + this.Name + this.Address;
        }
       
    }

    public class Emp : Person {
        private string _DeptName;

        public Emp()
        {
            this.DeptName = "IT";
        }
        public string DeptName
        {
            get { return _DeptName; }
            set { _DeptName = value; }
        }

        public override string GetDetails()
        {
            return base.GetDetails() + DeptName;
        }

    }

    //public class Person
    //{
    //    private int _No;

    //    public int GetNo()
    //    {
    //        return _No;
    //    }

    //    public void SetNo(int no)
    //    {
    //        _No = no;
    //    }
    //}
}
