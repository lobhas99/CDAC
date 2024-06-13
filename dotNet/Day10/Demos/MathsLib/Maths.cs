using System.ComponentModel.DataAnnotations.Schema;
using System.Runtime.InteropServices;

namespace MathsLib
{
    //[Serializable]
    public class Maths
    {
        public int Add(int x, int y)
        {
            return x + y;
        }

        public int Sub(int x, int y)
        {
            return x - y;
        }

    }

    //[Table(name: "Employee")]
    //public class Emp
    //{
    //    [Column(name: "ENo", Type: "int")]
    //    [Key]
    //    public int No;

    //    [Column(name: "EName", Type: "varchar")]
    //    public string Name;
        
    //    [Column(name: "EAddress", Type: "varchar")]
    //    public string Address;
    //}
}
