package JY.Dome;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import JY.Dao.Impl.GoodsDaoImpl;
import JY.Domain.User;
import JY.Service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class demo1 {
	
	@Resource(name="userService")
	private UserService userService;
	
	@Test
	public void fun1() {
		User u=new User();
		u.setUser_name("YY");
		userService.save(u);
	}

}
