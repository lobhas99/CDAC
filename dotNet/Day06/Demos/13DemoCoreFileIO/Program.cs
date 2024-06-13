using System.IO;

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
        }
    }
}
