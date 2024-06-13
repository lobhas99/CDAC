using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

namespace _13DemoCoreFileIO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"C:\Users\Admin\OneDrive\Desktop\DAC\DotNetDemos\Test.txt";

            #region Normal String Write in File
            //FileStream fs = null;
            //StreamWriter writer = null;

            //try
            //{
            //    if(File.Exists(filePath))
            //    {
            //      fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //    }
            //    else
            //    { 
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //    }
            //    writer = new StreamWriter(fs);

            //    Console.WriteLine("Write something:");
            //    writer.WriteLine(Console.ReadLine());


            //    writer.Close();
            //    fs.Close();
            //}
            //catch (Exception ex)
            //{
            //    Console.WriteLine(ex.Message);
            //}
            //finally
            //{
            //    writer = null;
            //    fs = null;
            //}
            #endregion

            #region Normal String Read From File
            //FileStream fs = null;
            //StreamReader reader = null;

            //try
            //{
            //    if (File.Exists(filePath))
            //    {
            //        fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Read);

            //        reader = new StreamReader(fs);

            //        string datafromFile = reader.ReadToEnd();
            //        Console.WriteLine(datafromFile);

            //        reader.Close();
            //        fs.Close();
            //    }
            //    else
            //    {
            //        Console.WriteLine("File does not exist!");
            //    }
            //}
            //catch (Exception ex)
            //{
            //    Console.WriteLine(ex.Message);
            //}
            //finally
            //{
            //    reader = null;
            //    fs = null;
            //}
            #endregion

            #region Object Write / Serialize in File
            //FileStream fs = null;
            //BinaryFormatter specialwriter = null;

            //try
            //{
            //    if (File.Exists(filePath))
            //    {
            //        fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //    }
            //    else
            //    {
            //        fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //    }
            //    specialwriter = new  BinaryFormatter();

            //    Emp emp = new Emp();

            //    Console.WriteLine("Enter No:");
            //    emp.No = Convert.ToInt32(Console.ReadLine());

            //    Console.WriteLine( "Enter Name: ");
            //    emp.Name = Console.ReadLine();

            //    Console.WriteLine("Enter Address: ");
            //    emp.Address = Console.ReadLine();


            //    specialwriter.Serialize(fs, emp);

            //    fs.Close();
            //}
            //catch (Exception ex)
            //{
            //    Console.WriteLine(ex.Message);
            //}
            //finally
            //{
            //    specialwriter = null;
            //    fs = null;
            //}
            #endregion

            #region Object Read / Deserialize From File
            //FileStream fs = null;
            //BinaryFormatter specialreader = null;

            //try
            //{
            //    if (File.Exists(filePath))
            //    {
            //        fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Read);

            //        specialreader = new  BinaryFormatter();

            //        object obj = specialreader.Deserialize(fs);


            //        if(obj.GetType().ToString() == "_13DemoCoreFileIO.Emp")
            //        {
            //            Emp emp = (Emp)obj;
            //            Console.WriteLine(emp.No + emp.Name + emp.Address);
            //        }

            //        fs.Close();
            //    }
            //    else
            //    {
            //        Console.WriteLine("File does not exist!");
            //    }
            //}
            //catch (Exception ex)
            //{
            //    Console.WriteLine(ex.Message);
            //}
            //finally
            //{
            //    specialreader = null;
            //    fs = null;
            //}
            #endregion


        }
    }

    [Serializable]
    public  class Emp
    {
        private int _No;
        private string _Name;
        private string _Address;

        [NonSerialized]
        private string _Password = "mahesh@123";

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

    }
}
