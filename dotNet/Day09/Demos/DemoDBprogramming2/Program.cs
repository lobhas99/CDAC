using Microsoft.Data.SqlClient;
using System.Data;

namespace DemoDBprogramming2
{
    internal class Program
    {
        static void Main(string[] args)
        {
			try
			{
                #region Simple Data Table
                //DataTable table = new DataTable("Emp");

                //DataColumn column1 = new DataColumn("No", typeof(int));
                //DataColumn column2 = new DataColumn("Name", typeof(string));
                //DataColumn column3 = new DataColumn("Address", typeof(string));

                //table.Columns.Add(column1);
                //table.Columns.Add(column2);
                //table.Columns.Add(column3);

                //table.PrimaryKey = new DataColumn[] { column1 };


                //DataRow row1 = table.NewRow();
                //row1[0] = 1;
                //row1[1] = "Santosh";
                //row1[2] = "Pune";

                //DataRow row2 = table.NewRow();
                //row2[0] = 2;
                //row2[1] = "Sanjay";
                //row2[2] = "Pune";


                //DataRow row3 = table.NewRow();
                //row3[0] = 3;
                //row3[1] = "Sajeev";
                //row3[2] = "Pune";

                ////DataRow row4 = table.NewRow();
                ////// row4[0] = null; // row4[0] = 3; //This throws err
                ////row4[1] = "Duplicate";
                ////row4[2] = "Pune";



                //table.Rows.Add(row1);
                //table.Rows.Add(row2);
                //table.Rows.Add(row3);
                ////table.Rows.Add(row4);
                #endregion

                #region Simple Data Table with Database

                //DataTable table = new DataTable("Emp");

                //DataColumn column1 = new DataColumn("No", typeof(int));
                //DataColumn column2 = new DataColumn("Name", typeof(string));
                //DataColumn column3 = new DataColumn("Address", typeof(string));

                //table.Columns.Add(column1);
                //table.Columns.Add(column2);
                //table.Columns.Add(column3);

                //table.PrimaryKey = new DataColumn[] { column1 };


                //string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

                //SqlConnection connection = 
                //        new SqlConnection(connectionDetails);

                //SqlCommand cmd = 
                //    new SqlCommand("select * from Emp", connection);

                //connection.Open();

                //SqlDataReader reader = cmd.ExecuteReader();

                //while (reader.Read())
                //{
                //    DataRow row = table.NewRow();
                //    row[0] = Convert.ToInt32(reader["No"]);
                //    row[1] = reader["Name"].ToString();
                //    row[2] = reader["Address"].ToString();

                //    table.Rows.Add(row);
                //}

                //connection.Close();


                //DataSet dataSet = new DataSet();
                //dataSet.Tables.Add(table);

                //dataSet.Tables["Emp"].WriteXml(@"C:\Users\Admin\OneDrive\Desktop\DAC\DotNetDemos\Day08\Demos\DemoDBprogramming2\data.xml");

                //dataSet.Tables["Emp"].WriteXmlSchema(@"C:\Users\Admin\OneDrive\Desktop\DAC\DotNetDemos\Day08\Demos\DemoDBprogramming2\dataschema.xml");

                #endregion

                #region Dataset, Datatable, Data Adapter

                string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

                SqlConnection connection =
                        new SqlConnection(connectionDetails);

                DataSet ds = new DataSet();

                SqlDataAdapter da =
                    new SqlDataAdapter("select * from Emp", connection);

                SqlCommandBuilder builder =
                     new SqlCommandBuilder(da);

                da.MissingSchemaAction = MissingSchemaAction.AddWithKey;

                da.Fill(ds, "Emp");

                #region Add data into dataset- table ds.Tables[0] or ds.Tables["Emp"]

                //DataRow row = ds.Tables["Emp"].NewRow();
                //row["Name"] = "Sachin";
                //row["Address"] = "Sangli";

                //ds.Tables["Emp"].Rows.Add(row);


                #endregion


                #region Update data into dataset-table ds.Tables[0] or ds.Tables["Emp"]

                //Console.WriteLine(  "Enter No of the Emp to search");
                //int No = Convert.ToInt32(Console.ReadLine());

                //DataRow rowToEdit = ds.Tables["Emp"].Rows.Find(No);

                //if(rowToEdit!=null)
                //{
                //    Console.WriteLine("Enter New Name");
                //    rowToEdit["Name"] = Console.ReadLine();

                //    Console.WriteLine("Enter New Address");
                //    rowToEdit["Address"] = Console.ReadLine();
                //}
                #endregion


                #region Delete data from dataset- table ds.Tables[0] or ds.Tables["Emp"]


                Console.WriteLine("Enter No of the Emp to Delete");
                int No = Convert.ToInt32(Console.ReadLine());

                DataRow rowToDelete = ds.Tables["Emp"].Rows.Find(No);

                if (rowToDelete != null)
                {
                    rowToDelete.Delete();
                }

                #endregion

                da.Update(ds, "Emp");


                #endregion
            }
            catch (Exception ex)
			{
                Console.WriteLine("Something went wrong!");
                Console.WriteLine("To Be Logged : "  + ex.Message);
            }
        }
    }
}
