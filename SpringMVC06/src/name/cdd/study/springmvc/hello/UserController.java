package name.cdd.study.springmvc.hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//第一种方式
	@RequestMapping(value="/add1.do", method=RequestMethod.POST)
	public String add1(HttpServletRequest req, HttpSession session)
	{
		String userNumber = req.getParameter("userNumber");
		String passWord = req.getParameter("passWord");
		
		System.out.println("add1 - userNumber:" + userNumber + ";   passWord:" + passWord);
		
		return "user_add1";
	}
	
	@RequestMapping(value="/add2.do", method=RequestMethod.POST)
	public String add2(String userNumber, String passWord)
	{
		System.out.println("add2 - userNumber:" + userNumber + ";   passWord:" + passWord);
		
		return "user_add2";
	}
	
	
	@RequestMapping(value="/add2_1.do", method=RequestMethod.POST)
	public String add2_1(@RequestParam("userNumber")String u, @RequestParam(value="passWord", defaultValue="defaultPasswd")String p)
	{
		System.out.println("add2_1 - userNumer:" + u + ";   passWord:" + p);
		
		return "user_add2_1";
	}
	
	
	@RequestMapping(value="/add3.do", method=RequestMethod.POST)
	public String add3(UserInfo user)
	{
		System.out.println(user);
		
		return "user_add3";
	}
	
	@RequestMapping(value="/add4.do", method=RequestMethod.POST)
	public String add4(Integer userId, Date userTime)
	{
		System.out.println("userId=" + userId + "userTime = " + userTime);
		
		return "user_add4";
	}
	@InitBinder
	public void initBinder(ServletRequestDataBinder bin)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		CustomDateEditor cust = new CustomDateEditor(sdf, true);
		
		bin.registerCustomEditor(Date.class, cust);
	}
}
