using Microsoft.AspNetCore.Mvc;
using _001DemoCoreMVC.Models;
using Microsoft.Data.SqlClient;
using Microsoft.AspNetCore.Mvc.ModelBinding;

namespace _001DemoCoreMVC.Controllers
{
    public class HomeController : Controller
    {


        public List<Emp> GetAllEmps()
        {
            string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            SqlConnection con = new SqlConnection(connectionDetails);

            SqlCommand cmd = new SqlCommand("select * from Emp", con);
            con.Open();

            SqlDataReader reader = cmd.ExecuteReader();

            List<Emp> emps = new List<Emp>();

            while (reader.Read())
            {
                Emp emp = new Emp();
                emp.No = Convert.ToInt32(reader["No"]);
                emp.Name = reader["Name"].ToString();
                emp.Address = reader["Address"].ToString();

                emps.Add(emp);
            }

            con.Close();
            return emps;
        }
        public IActionResult Index()
        {
            List<Emp> emps = GetAllEmps();
            return View(emps);
        }

        public IActionResult Create()
        {
            return View();
        }

        public IActionResult AfterCreate(Emp emp)
        {
            string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            SqlConnection con = new SqlConnection(connectionDetails);

            string queryFormat = "insert into Emp(Name, Address) values('{0}','{1}') ";

            string query = string.Format(queryFormat, emp.Name, emp.Address);

            SqlCommand cmd = new SqlCommand(query, con);
            con.Open();

            int rowsAffected = cmd.ExecuteNonQuery();

            if(rowsAffected> 0 )
            {
                return Redirect("/Home/Index");
            }
            else
            {
                return View("Create");
            }
        }

        public IActionResult Delete(int id)
        {

            string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            SqlConnection con = new SqlConnection(connectionDetails);

            string queryFormat = "delete from Emp where No={0}";

            string query = string.Format(queryFormat, id);

            SqlCommand cmd = new SqlCommand(query, con);
            con.Open();

            int rowsAffected = cmd.ExecuteNonQuery();

            if (rowsAffected > 0)
            {
                return Redirect("/Home/Index");
            }
            else
            {
                return new ContentResult() {  ContentType = "text/plain", Content="Something went wrong! try again."};
            }
        }

        public IActionResult Edit(int id)
        {
            List<Emp> emps = GetAllEmps();

            Emp empToEdit = (from emp in emps
                             where emp.No == id
                             select emp).First();

            return View(empToEdit);
        
        }

        public IActionResult AfterEdit(Emp emp)
        {
            string connectionDetails = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=DemoDB;Integrated Security=True;";

            SqlConnection con = new SqlConnection(connectionDetails);

            string queryFormat = "update Emp set Name = '{0}', Address= '{1}'  where  No = {2}";

            string query = string.Format(queryFormat, emp.Name, emp.Address, emp.No);

            SqlCommand cmd = new SqlCommand(query, con);
            con.Open();

            int rowsAffected = cmd.ExecuteNonQuery();

            if (rowsAffected > 0)
            {
                return Redirect("/Home/Index");
            }
            else
            {
                return View("Edit" , emp);
            }


        }

        public IActionResult GetData()
        {
            var emps = GetAllEmps();
            return new JsonResult(emps);
        }

        //public IActionResult Index()
        //{
        //    List<Emp> emps = new List<Emp>() 
        //    {
        //      new Emp(){ No = 1, Name = "Mahesh", Address = "Pune" },
        //      new Emp(){ No = 2, Name = "Nilesh", Address = "Pune" },
        //      new Emp(){ No = 3, Name = "Sachin", Address = "Pune" },
        //      new Emp(){ No = 4, Name = "Manish", Address = "Pune" }
        //    };

        //    return View(emps);
        //}

        #region Using Single Object 
        //public IActionResult Index()
        //{
        //    Emp emp = 
        //            new Emp() { No = 1, Name = "Nilesh", Address = "Pune" };

        //    Student student = new Student() { Name = "ABCD" };

        //    //This means find a view named "Index" & return
        //    //return View();  

        //    //find a view named "myview" & return
        //    //return View("myview"); 

        //    //find a view named Index - pass emp & return

        //    return View(emp);  
        //    //return View(student);

        //    //find a view named myview - pass emp & return
        //    //return View("myview",emp); 


        //}
        #endregion

    }

    //public class MyBinder : IModelBinder
    //{
    //    public Task BindModelAsync(ModelBindingContext bindingContext)
    //    {
    //        //bindingContext.HttpContext.Request.Body
    //        //bindingContext.Model
    //        throw new NotImplementedException();
    //    }
    //}
}
