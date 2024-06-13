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

        private void button2_Click(object sender, EventArgs e)
        {
            button1.Click -= button1_Click;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            button1.Click += button1_Click;
        }

        //public void DoSomething(object sender, EventArgs e)
        //{
        //    MessageBox.Show("Hi!");
        //}
    }
}
