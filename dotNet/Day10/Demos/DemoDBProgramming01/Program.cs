using Microsoft.Data.SqlClient;

namespace DemoDBProgramming01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Select Query
            //string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            //  SqlConnection con = new SqlConnection(connectionDetails);
            //  con.Open();

            //  SqlCommand cmd = new SqlCommand("select * from Emp", con);

            //  SqlDataReader reader = cmd.ExecuteReader();

            //  List<Emp> allRecords = new List<Emp>();

            //  while (reader.Read())
            //  {
            //      Emp emp = new Emp();
            //      emp.No = Convert.ToInt32(reader["No"]);
            //      emp.Name = reader["Name"].ToString();
            //      emp.Address = reader["Address"].ToString();

            //      allRecords.Add(emp);
            //      //string rowData = reader["No"].ToString() +
            //      //                  reader["Name"].ToString() +
            //      //                  reader["Address"].ToString();

            //      //Console.WriteLine(rowData);
            //  }

            //  con.Close();

            //  foreach (Emp emp in allRecords)
            //  {
            //      Console.WriteLine(  emp.Name );
            //  }
            #endregion

            #region Insert Query
            //string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            //SqlConnection con = new SqlConnection(connectionDetails);
            //con.Open();

            //Console.WriteLine(  "Enter Name");
            //string name = Console.ReadLine();


            //Console.WriteLine(  "Enter Address");
            //string address = Console.ReadLine();

            ////string query =
            ////    "insert into Emp(Name, Address) values('"+ 
            ////        name + "', '" + address + "')";

            //string queryFormat = 
            //    "insert into Emp(Name, Address) values('{0}', '{1}')";

            //string query = string.Format(queryFormat,name, address);

            //SqlCommand cmd = new SqlCommand(query, con);

            //int NoOfRowsAffected =  cmd.ExecuteNonQuery();

            //Console.WriteLine( NoOfRowsAffected + " rows affected!");

            #endregion

            #region Update Query
            //string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            //SqlConnection con = new SqlConnection(connectionDetails);
            //con.Open();

            //Console.WriteLine("Enter No");
            //int no = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter Name");
            //string name = Console.ReadLine();


            //Console.WriteLine("Enter Address");
            //string address = Console.ReadLine();

            //string queryFormat =
            //"update Emp set Name = '{0}', Address='{1}' where No = {2}";

            //string query = string.Format(queryFormat, name, address, no);

            //SqlCommand cmd = new SqlCommand(query, con);

            //int NoOfRowsAffected = cmd.ExecuteNonQuery();

            //Console.WriteLine(NoOfRowsAffected + " rows affected!");

            #endregion

            #region Update Query
            //string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            //SqlConnection con = new SqlConnection(connectionDetails);
            //con.Open();

            //Console.WriteLine("Enter No");
            //int no = Convert.ToInt32(Console.ReadLine());

            //string queryFormat =
            //"delete from Emp where No = {0}";

            //string query = string.Format(queryFormat, no);

            //SqlCommand cmd = new SqlCommand(query, con);

            //int NoOfRowsAffected = cmd.ExecuteNonQuery();

            //Console.WriteLine(NoOfRowsAffected + " rows affected!");

            #endregion

            Console.ReadLine();
        }
    }

    [Serializable]
    public class Emp
    {
       
        private int _No;
        private string _Name;
        private string _Address;

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
