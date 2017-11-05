package name.cdd.study.springmvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String hello = req.getParameter("hello");
		System.out.println("hello by " + hello);
		
		ModelAndView mav = new ModelAndView("index");//index表示index.jsp，省掉了后缀
		mav.addObject("helloworld", "hello by " + hello);
		return mav;
	}
	
	//以后的简化版
//	public String add(HttpServletRequest req)
//	{
//		return null;
//	}

}
