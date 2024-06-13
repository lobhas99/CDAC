using SunbeamAttributesLib;

namespace AllPOCOs
{
	[Table(TableName = "Employee")]
	[Serializable]
    public class Emp
    {
		private int _No;
		private string _Name;
		private string _Address;

        [Column(ColumnName = "EAddress",
                ColumnType = "varchar(50)")]
        public string Address
		{
			get { return _Address; }
			set { _Address = value; }
		}

        [Column(ColumnName = "EName",
				ColumnType = "varchar(50)")]
        public string Name
		{
			get { return _Name; }
			set { _Name = value; }
		}

		[Column(ColumnName ="ENo", 
				ColumnType = "int")]
		public int No
		{
			get { return _No; }
			set { _No = value; }
		}

	}

	//[Table(TableName ="Department")]
	//public class Dept
	//{
	//	private int _DNo;
		
	//	[Column(ColumnName ="DeptNo" , ColumnType = "int")]
	//	public int DNo
	//	{
	//		get { return _DNo; }
	//		set { _DNo = value; }
	//	}

		
	//	private string _DName;

	//	[Column(ColumnName = "DeptName", ColumnType = "varchar(50)")]
	//	public string DName
	//	{
	//		get { return _DName; }
	//		set { _DName = value; }
	//	}

	//}
}
