package JY.Service.Impl;

import org.springframework.transaction.annotation.Transactional;

import JY.Dao.UserDao;
import JY.Domain.User;
import JY.Service.UserService;

@Transactional
public class UserServiceImpl implements UserService{
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		userDao.save(t);
	}
	

}
