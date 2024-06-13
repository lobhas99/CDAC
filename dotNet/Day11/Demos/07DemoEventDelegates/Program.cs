namespace _07DemoEventDelegates
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Button button1 = new Button();
            Student student = new Student();

            //button1.Text = "Click Me";
            student.Name = "Vishal";

            //EventHandler pointer =
            //          new EventHandler(DoSomething);
            MyDelegate pointer1 = new MyDelegate(DoThisOnPass);
            MyDelegate pointer2 = new MyDelegate(DoThisOnFail);

            //button1.click += pointer;
            student.Pass += pointer1;
            student.Fail += pointer2;

            student.SetMarks(20);//this is as good as you click

        }

        //public void DoSomething(object sender, EventArgs e) {
        //    //MessageBox.Show("Hi!");
        //}

        public static void DoThisOnPass(string name, int marks)
        {
            Console.WriteLine(name  + " received marks "+ marks.ToString() + " and is awarded with Grade A");
        }

        public static void DoThisOnFail(string name, int marks)
        {
            Console.WriteLine(name + " received marks " + marks.ToString() + " and is awarded with Grade Z");
        }
    }

    //public class MyDelegate: Delegate
    //{

    //}

    //public delegate void EventHandler(object? sender, EventArgs e)
    public delegate void MyDelegate(string name, int marks);

    public class Student        //public class Button
    {
        //public event EventHandler Click;
        public event MyDelegate Pass;
        public event MyDelegate Fail;

        private string _Name;
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

        private int _Marks;

        public void SetMarks(int m)
        {
            _Marks = m;
            if(m > 40)          //this similar to a code inside
                                //button class which decides 
                                //whether user clicked on
                                //button area or not?
            {
                //Click(this, new EventArgs()) 
                Pass(Name, m); //this is where we tell clr 
                               //that something important
                               //happened
                
            }
            else
            {
                Fail(Name, m);
            }
        }

    }
}
