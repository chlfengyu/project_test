package project_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chl.web.system.user.bean.User;
import com.chl.web.system.user.dao.UserDao;
import com.chl.web.system.user.service.UserService;

@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {
	@Autowired(required = true)
	private UserDao userDao;

	@Autowired
	private UserService userService;

	@Test
	public void getUser() {
		User user = this.userDao.getUser("admin");
		System.out.println(user.getName());

		User user2 = this.userService.getUser("admin");
		System.out.println(user2.getLoginId());
	}
}
