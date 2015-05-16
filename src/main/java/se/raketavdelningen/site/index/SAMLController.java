package se.raketavdelningen.site.index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SAMLController {

	private static final Logger LOG = LoggerFactory.getLogger(SAMLController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/saml")
	public ModelAndView handleSAML(@RequestParam("relayState") String relayState) {
		LOG.debug("handleSAML({})", relayState);
		
		ModelAndView result = new ModelAndView();
		result.setViewName("redirect:" + relayState);
		return result;
	}
}
