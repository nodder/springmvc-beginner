package name.cdd.study.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/hello.do")
	public String hello(String userName, Model model)
	{
		System.out.println(userName);
		
		model.addAttribute("helloworld", "hello by:" + userName);
		
		return "index";
	}
}
