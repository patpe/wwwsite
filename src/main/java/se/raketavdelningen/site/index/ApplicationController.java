package se.raketavdelningen.site.index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/application")
	public ModelAndView handleCall() {
		LOG.debug("handleCall()");
		
		ModelAndView result = new ModelAndView();
		result.setViewName("application");
		return result;
	}
}
