namespace _06DemoEventDelegates
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            //Button button1 = new Button();
            //button1.Text = "Click Me";

            //EventHandler pointer = 
            //    new EventHandler(DoSomething);

            //button1.Click += pointer;

            //this.Controls.Add(button1);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("hi");
        }

        //public void DoSomething(object sender, EventArgs e)
        //{
        //    MessageBox.Show("Hi!");
        //}
    }
}
