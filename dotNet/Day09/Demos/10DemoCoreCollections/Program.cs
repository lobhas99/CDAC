using System.Collections;

namespace _10DemoCoreCollections
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Stack Type, Heap Type, Object - Boxing / Unboxing

            //int i = 100;        //Stack

            //string s = "abcd";  //Heap
            ////String s = new String(new Char()['a', 'b','c','d']);

            //Emp e1 = new Emp(); //Heap
            //e1.Name = "Mahesh";

            ////object o1 = e1;

            //object o1 = i;

            //if(o1.GetType().ToString() == "_10DemoCoreCollections.Emp")
            //{
            //    Emp e =  (Emp) o1;
            //    //Emp e = o1 as Emp;

            //    Console.WriteLine(e.Name);

            //}
            //else if(o1.GetType().ToString()  == "System.Int32")
            //{
            //    int j = Convert.ToInt32(o1);

            //    Console.WriteLine(j);

            //}
            //else
            //{
            //    Console.WriteLine("Invalid type of data");
            //}
            #endregion

            #region Simple Int Array
            //int[] arr = new int[5];
            //arr[0] = 100;
            //arr[1] = 200;
            //arr[2] = 300;
            //arr[3] = 400;
            //arr[4] = 500;

            //int[] arr = new int[] {100,200,300,400,500 };

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);
            //}
            #endregion

            #region Sample Emp Data
            Emp e1 = new Emp();
            e1.No = 1;
            e1.Name = "sachin";
            e1.Address = "mumbai";

            Emp e2 = new Emp();
            e2.No = 2;
            e2.Name = "rahul";
            e2.Address = "banglore";

            Emp e3 = new Emp();
            e3.No = 3;
            e3.Name = "saurav";
            e3.Address = "kolkata";

            #endregion

            #region Simple Emp Array

            //Emp[] arr = new Emp[3];
            //arr[0] = e1;
            //arr[1] = e2;
            //arr[2] = e3;

            //Emp[] arr = new Emp[] { e1, e2, e3};

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Emp emp = arr[i];
            //    emp.PrintDetails();
            //}
            #endregion

            #region Object Array
            //object[] arr = new object[5];
            //arr[0] = 100;
            //arr[1] = "abcd";
            //arr[2] = e1;
            //arr[3] = e2;
            //arr[4] = "xyz";


            //for (int i = 0; i < arr.Length; i++)
            //{
            //    object someObject = arr[i];
            //    if (someObject.GetType().ToString()==
            //            "_10DemoCoreCollections.Emp")
            //    {
            //        Emp emp = (Emp)someObject;
            //        emp.PrintDetails();
            //    }
            //    else if (someObject.GetType().ToString() ==
            //            "System.Int32")
            //    {
            //        int data = Convert.ToInt32(someObject);
            //        Console.WriteLine(data);
            //    }
            //    else if (someObject.GetType().ToString() ==
            //            "System.String")
            //    {
            //        Console.WriteLine(  someObject.ToString());
            //    }
            //    else
            //    {
            //        Console.WriteLine("Unknown type of data");
            //    }
            //}
            #endregion

            #region ArrayList
            //ArrayList arr = new ArrayList();
            //arr.Add(100);
            //arr.Add("abcd");
            //arr.Add(e1);
            //arr.Add(e2);
            //arr.Add("xyz");
            //arr.Add(e3);


            //foreach (object someObject in arr)
            //{
            //    if (someObject.GetType().ToString() ==
            //            "_10DemoCoreCollections.Emp")
            //    {
            //        Emp emp = (Emp)someObject;
            //        emp.PrintDetails();
            //    }
            //    else if (someObject.GetType().ToString() ==
            //            "System.Int32")
            //    {
            //        int data = Convert.ToInt32(someObject);
            //        Console.WriteLine(data);
            //    }
            //    else if (someObject.GetType().ToString() ==
            //            "System.String")
            //    {
            //        Console.WriteLine(someObject.ToString());
            //    }
            //    else
            //    {
            //        Console.WriteLine("Unknown type of data");
            //    }
            //}
            #endregion

            #region Generic Collection List<T>
            //List<Emp> arr = new List<Emp>();
            //arr.Add(e1);
            //arr.Add(e2);
            //arr.Add(e3);

            //////arr.Add(100);//ERROR HERE

            //foreach (Emp emp in arr)
            //{
            //   emp.PrintDetails();
            //} 
            #endregion

            #region Generic Collection Stack<T>

            //Stack<Emp> arr = new Stack<Emp>();
            //arr.Push(e1);
            //arr.Push(e2);
            //arr.Push(e3);

            //foreach (Emp emp in arr)
            //{
            //    emp.PrintDetails();
            //}

            ///// - Queue, ObservableCollection
            ///// - PageQueued, HashSet, DBSet .etc etc
            #endregion

            #region Generic 2D Collection 

            //Dictionary<int, Emp> arr = 
            //    new Dictionary<int, Emp>();

            //arr.Add(e1.No, e1);
            //arr.Add(e2.No, e2);
            //arr.Add(e3.No, e3);

            ////Console.WriteLine("Enter EMp No to search");
            ////int No = Convert.ToInt32(Console.ReadLine()) ;
            ////Emp emp = arr[No];
            ////emp.PrintDetails();


            //foreach (int key in arr.Keys)
            //{
            //    Emp emp = arr[key];
            //    emp.PrintDetails();
            //}


            #endregion
        }
    }

    public class Emp
    {
        private string _Name;
        private string _Address;
        private int _No;

        public int No
        {
            get { return _No; }
            set { _No = value; }
        }

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


        public void PrintDetails()
        {
            Console.WriteLine(No.ToString() + Name + Address);
        }
    }

}
