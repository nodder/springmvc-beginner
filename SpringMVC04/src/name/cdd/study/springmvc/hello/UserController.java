package name.cdd.study.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public String list(Model model)
	{
		System.out.println("��ѯ�û���Ϣ");
		
		return "userinfo/user_list";
	}
	
	@RequestMapping(value="/add.do", method=RequestMethod.POST)
	public String add(Model model)
	{
		System.out.println("����û���Ϣ");
		
		return "userinfo/user_add";
	}
}
