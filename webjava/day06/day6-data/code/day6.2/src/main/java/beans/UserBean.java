package beans;

import java.sql.SQLException;

import dao.UserDaoImpl;
import pojos.User;

//Java class : represents an attribute created by WC 
//Will contain B.L
public class UserBean {
	private UserDaoImpl userDao;
	//clnt req params
	private String em;
	private String pass;
	private User userDetails;
	public UserBean() throws SQLException{
		//creat user dao instance
		userDao=new UserDaoImpl();
		System.out.println("user bean n dao created...");
	}
	//generate getters n setters
	public UserDaoImpl getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	public String getEm() {
		return em;
	}
	public void setEm(String em) {
		this.em = em;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public User getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}
	//add B.L method for authentication + authorization
	public String validateUser() throws SQLException{
		System.out.println("in validate "+em+" "+pass);//not null
		//bean --> dao's method for auth
		 userDetails=userDao.authenticateUser(em, pass);
		 if(userDetails == null)
		 {
			 return "login";
		 }
		 //=> valid login --> continue to role based auth
		 if(userDetails.getRole().equals("admin"))
			 return "admin_main";
		 //=> voter 
		 if(userDetails.isVotingStatus())
			 return "logout";
		 return "candidate_list";
			 		
	}
	
}
