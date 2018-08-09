package com.codingdojo.counterassignment;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class HomeController {
	//Create a variable called counter and start it at zero to increment when the routes are visited by the user
	Integer counter = 0; 
	@RequestMapping("/")
	//cannot return a string when using a @Controller, only when using @RestController
	public String main(HttpSession session) {
		//increment by 1 each visit
		counter++;
		//set the attribute of counter to the variable counter that is incremented and held in the session data
        session.setAttribute("counter", counter);
        return "index.jsp";	
    }
	@RequestMapping("/counter")
    public String visit(HttpSession session){
        session.setAttribute("counter", counter);

		//we must cast the information from the session object back into a string
		//the information gets turned into the Object data type
		//in the below step we are also getting the attribute
		String count = Integer.toString((int) session.getAttribute("counter"));
        return "visits.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		//sets the counter variable to zero
		counter = 0;
		//sends the variable out to the jsp file that is seen by the user
		session.setAttribute("counter", counter);
		//redirects to the root route
		return "redirect:/your_server/counter";
	}
	@RequestMapping("/increment")
	public String increment(HttpSession session) {
		//increments the counter variable by 2
		counter +=2;
		session.setAttribute("counter", counter);
		//redirects to the counter page
		return "increment.jsp";
	}
}