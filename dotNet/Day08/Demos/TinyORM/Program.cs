using System.Reflection;
using SunbeamAttributesLib;

namespace TinyORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Path of POCO Library containing Model classes");

            string pocolib = Console.ReadLine();

            Assembly assembly = Assembly.LoadFrom(pocolib);

            Type []allTypes = assembly.GetTypes();

            string queries = "";

            foreach (Type t in allTypes)
            {
                IEnumerable<Attribute> allAttribs =
                            t.GetCustomAttributes();

                foreach (Attribute attrib in allAttribs)
                {
                    if(attrib.GetType().ToString() ==
                            "SunbeamAttributesLib.Table")
                    {
                    Table table = (Table)attrib;
                        queries = queries +
                        " create table " + table.TableName
                            + "( " ;
                    }
                }

                PropertyInfo []allProperties = t.GetProperties();

                foreach (PropertyInfo prop in allProperties)
                {
                    IEnumerable<Attribute> allAttribsOnProperty =
                        prop.GetCustomAttributes();

                    foreach (Attribute attr in 
                                allAttribsOnProperty)
                    {
                        if(attr.GetType().ToString() ==
                            "SunbeamAttributesLib.Column")
                        {
                            Column column = (Column)attr;
                            queries = queries +
                            column.ColumnName + " " +
                            column.ColumnType + ",";
                            
                        }
                    }
                }
               
            }
            queries = queries.TrimEnd(',');
            queries = queries + " ); ";
            Console.WriteLine(queries);
            queries = "";


        }

        
    }
}
