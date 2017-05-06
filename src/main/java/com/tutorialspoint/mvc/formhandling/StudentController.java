/**
 * 
 */
package com.tutorialspoint.mvc.formhandling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Drusev
 *
 */
@Controller
public class StudentController {

	private Student student;

	// this method will be called only when there is a request parameter with
	// name person
	@RequestMapping(value = "/Form/student", method = RequestMethod.GET, params = "person")
	public ModelAndView student(@RequestParam("person") String person) {
		student = new Student();
		ModelAndView modelAndView = new ModelAndView("student", "student", student);
		modelAndView.getModelMap().addAttribute("person", person);
		return modelAndView;
	}

	@RequestMapping(value = "/Form/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student, ModelMap model) {
		boolean flag = this.student == student;
		System.out.println("Are they the same object: " + flag);
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "result";
	}
}
