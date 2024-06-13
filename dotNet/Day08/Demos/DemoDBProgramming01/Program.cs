using Microsoft.Data.SqlClient;

namespace DemoDBProgramming01
{
    internal class Program
    {
        static void Main(string[] args)
        {
          string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            SqlConnection con = new SqlConnection(connectionDetails);
            con.Open();

            SqlCommand cmd = new SqlCommand("select * from Emp", con);

            SqlDataReader reader = cmd.ExecuteReader();

            List<Emp> allRecords = new List<Emp>();

            while (reader.Read())
            {
                Emp emp = new Emp();
                emp.No = Convert.ToInt32(reader["No"]);
                emp.Name = reader["Name"].ToString();
                emp.Address = reader["Address"].ToString();

                allRecords.Add(emp);
                //string rowData = reader["No"].ToString() +
                //                  reader["Name"].ToString() +
                //                  reader["Address"].ToString();

                //Console.WriteLine(rowData);
            }

            con.Close();

            foreach (Emp emp in allRecords)
            {
                Console.WriteLine(  emp.Name );
            }
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
