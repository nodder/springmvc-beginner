package name.cdd.study.spring.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class User3Controller extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("User3Controller ∑√Œ µΩ¡À....");
		
		ModelAndView mav = new ModelAndView("user");
		return mav;
	}

}
