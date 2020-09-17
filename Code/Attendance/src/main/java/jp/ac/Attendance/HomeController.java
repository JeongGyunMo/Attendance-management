package jp.ac.Attendance;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "attendance_login";
	}
	@RequestMapping(value = "schedule", method = RequestMethod.GET)
	public String schedule(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "attendance_schedule";
	}
	@RequestMapping(value = "popup_apply", method = RequestMethod.GET)
	public String popup_apply(Locale locale, Model model) {
		return "popup_apply";
	}
	@RequestMapping(value = "popup_vacation", method = RequestMethod.GET)
	public String popup_vacation(Locale locale, Model model) {
		return "popup_vacation";
	}
	@RequestMapping(value = "attendance_join", method = RequestMethod.GET)
	public String attendance_join(Locale locale, Model model) {
		return "attendance_join";
	}
}
