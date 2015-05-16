package se.raketavdelningen.site.index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FederationController {

	private static final Logger LOG = LoggerFactory.getLogger(FederationController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/federation")
	public ModelAndView handleFederation(@RequestParam("TargetAddress") String targetAddress) {
		LOG.debug("handleFederation({})", targetAddress);		
		ModelAndView result = new ModelAndView();
		result.setViewName("redirect:" + targetAddress);
		return result;
	}
}
