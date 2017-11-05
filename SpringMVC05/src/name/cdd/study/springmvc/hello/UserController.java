package name.cdd.study.springmvc.hello;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//����ȥ����, method=RequestMethod.POST������Ϊ�ᵼ��return�ز���
	@RequestMapping(value="/add1.do")
	public String add1(HttpServletRequest req, HttpSession session)
	{
		req.setAttribute("user", "add1");
		
		return "user_add1";
	}
	
	@RequestMapping(value="/add2.do")
	public ModelAndView add2()
	{
		ModelAndView mav = new ModelAndView("user_add2");
		mav.addObject("user", "add2");
		
		return mav;
	}
	
	@RequestMapping(value="/add3.do")
	public String add3(Model model)
	{
		model.addAttribute("user", "add3");
		
		return "user_add3";
	}
	
//	@RequestMapping(value="/add4.do")
//	public String add4(Map map)
//	{
//		System.out.println(map.get("userId"));//ע�⣬�����ӡ��null
//		
//		return "user_add4";
//	}
	
	@RequestMapping(value="/add4.do")
	public String add4(String userId, Map map)
	{
		System.out.println("userId:" + userId);
		map.put("user", "add4");
		return "user_add4";
	}
	
}
