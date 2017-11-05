package name.cdd.study.spring.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class User2ByURLController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("User2ByURLController ���ʵ���....");
		
		ModelAndView mav = new ModelAndView("user");
		return mav;
	}

}
