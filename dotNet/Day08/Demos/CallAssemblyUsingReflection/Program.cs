#region Reflection Code - V3

//using System.Reflection;

//namespace CallAssemblyUsingReflection
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            string assemblyPath = @"C:\Users\Admin\OneDrive\Desktop\DAC\DotNetDemos\Day06\Demos\MathsLib\bin\Debug\net6.0\MathsLib.dll";

//            Assembly assembly = Assembly.LoadFrom(assemblyPath);

//            Type[] allTypes = assembly.GetTypes();

//            foreach (Type type in allTypes)
//            {
//                IEnumerable<Attribute> allAttributesOnType =
//                         type.GetCustomAttributes();

//                bool isSerlaizable = false;

//                foreach (Attribute attrib in allAttributesOnType)
//                {
                
//               if(attrib.GetType().ToString() == "System.SerializableAttribute")
//                    {
//                        isSerlaizable = true;
//                        Console.WriteLine(type.Name + " is marked as Serializable");
//                        break;
//                    }
//                }

//                if (!isSerlaizable)
//                {
//                    Console.WriteLine(type.Name + " is not marked as Serializable!");
//                    //    throw new Exception(type.Name + " is not marked as Serializable!");
//                }
//            }
//        }
//    }
//}


#endregion

#region Reflection Code - V2

//using System.Reflection;

//namespace CallAssemblyUsingReflection
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            string assemblyPath = @"C:\Users\Admin\OneDrive\Desktop\DAC\DotNetDemos\Day06\Demos\MathsLib\bin\Debug\net6.0\MathsLib.dll";

//            Assembly assembly = Assembly.LoadFrom(assemblyPath);

//            Type[] allTypes = assembly.GetTypes();

//            object someDynamicObject = null;

//            foreach (Type type in allTypes)
//            {
//                Console.WriteLine(type.FullName);

//                someDynamicObject =
//                    assembly.CreateInstance(type.FullName);

//                MethodInfo[] allMethods = type.GetMethods();

//                foreach (MethodInfo method in allMethods)
//                {
//                    Console.WriteLine(" calling -- " + method.Name + " ");

//                    ParameterInfo[] allParameters =
//                        method.GetParameters();

//                    object[] parameters = 
//                            new object[allParameters.Length] ;

//                    for (int i = 0; i < allParameters.Length; i++)
//                    {
//                        ParameterInfo para = allParameters[i] ;

//                        Console.WriteLine("Enter Value of " + 
//                            para.ParameterType.ToString() + 
//                            " type for variable " + para.Name);

//                        string data = Console.ReadLine();


//                        parameters[i] = 
//                            Convert.ChangeType(data, 
//                                        para.ParameterType);
//                    }

//                    object output = type.InvokeMember(method.Name, BindingFlags.Public | BindingFlags.Instance | BindingFlags.InvokeMethod, null, someDynamicObject, parameters);

//                    Console.WriteLine(output);
//                    Console.WriteLine(  );

//                }
//            }
//        }
//    }
//}



#endregion

#region Reflection Code - V1
//using System.Reflection;

//namespace CallAssemblyUsingReflection
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            string assemblyPath = @"C:\Users\Admin\OneDrive\Desktop\DAC\DotNetDemos\Day06\Demos\MathsLib\bin\Debug\net6.0\MathsLib.dll";

//            Assembly assembly = Assembly.LoadFrom(assemblyPath);

//            Type[] allTypes = assembly.GetTypes();

//            object someDynamicObject = null;

//            foreach (Type type in allTypes)
//            {
//                Console.WriteLine(type.FullName);

//                someDynamicObject = 
//                    assembly.CreateInstance(type.FullName);

//                MethodInfo[] allMethods = type.GetMethods();

//                foreach (MethodInfo method in allMethods)
//                {
//                    Console.Write(" calling -- " + method.Name);

//                    object[] parameters = new object[] { 10, 20 };

//                    object output = type.InvokeMember(method.Name, BindingFlags.Public | BindingFlags.Instance | BindingFlags.InvokeMethod, null, someDynamicObject, parameters);

//                    Console.WriteLine(output);

//                }
//            }
//        }
//    }
//}


#endregion