
using System.Reflection;

namespace MetadataFinder
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //string assemblyPath = @"C:\Users\Admin\OneDrive\Desktop\DAC\DotNetDemos\Day06\Demos\MathsLib\bin\Debug\net6.0\MathsLib.dll";

            Console.WriteLine(  "Enter Path of the Assembly");
            string assemblyPath = Console.ReadLine();

            Assembly assembly = Assembly.LoadFrom(assemblyPath);

            Type[] allTypes = assembly.GetTypes();

            foreach (Type type in allTypes)
            {
                Console.WriteLine(type.FullName);
                MethodInfo[] allMethods = type.GetMethods();

                foreach (MethodInfo method in allMethods)
                {
                    Console.Write(" -- " +  method.Name + " ( ");

                    ParameterInfo[] allParameters =
                            method.GetParameters();
                    foreach (ParameterInfo param in allParameters)
                    {
                        Console.Write(param.ParameterType.ToString() + " " + param.Name + "  ");
                    }

                    Console.Write(" ) ");
                    Console.WriteLine();
                }
            }
        }
    }
}
