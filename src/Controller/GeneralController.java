package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeneralController {
	
	@RequestMapping(value="/helloword")
	public ModelAndView init_jsp(Model model,HttpSession session){
		model.addAttribute("str0121", "Hellow world"); 
		session.setAttribute("xxx", "test request ");
		return new ModelAndView("index");
        
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(){
		System.out.println("login...");
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/testrequest")
	public void dd(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("xxx", "test request ");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		//return new ModelAndView("index");
	}
}
