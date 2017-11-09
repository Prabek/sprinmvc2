package com.springmvc2.web.service;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.springmvc2.web.model.User;
	import com.springmvc2.web.dao.UsersDAO;

	@Service("usersService")
	public class UsersService {
		
		private UsersDAO usersDao;
		public UsersService() {
			System.out.println("Successfully configured");
		}

		@Autowired	
		public void setUsersDao(UsersDAO usersDao)
		{
		this.usersDao = usersDao;
		}
		
		
		public List<User> getCurrent(){
			return usersDao.getUsers();
		}
		
		
	}


