package cn.sep.samp2.samp.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sep.samp2.samp.dao.ifraces.UserDao;

@Controller
@RequestMapping(value="test")
public class TestController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="tdb")
	public String TestCreateDB() {
		try {
			System.out.println(userDao.createDB());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
