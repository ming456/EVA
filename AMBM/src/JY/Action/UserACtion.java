package JY.Action;

import com.opensymphony.xwork2.ActionSupport;

import JY.Domain.User;
import JY.Service.UserService;

public class UserACtion extends ActionSupport{
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String test() {

		System.out.println("asd");
		return NONE;
		
	}
	
}
