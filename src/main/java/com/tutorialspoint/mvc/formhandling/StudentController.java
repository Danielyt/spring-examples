/**
 * 
 */
package com.tutorialspoint.mvc.formhandling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Drusev
 *
 */
@Controller
public class StudentController {

	private Student student;

	@RequestMapping(value = "/Form/student", method = RequestMethod.GET)
	public ModelAndView student() {
		student = new Student();
		return new ModelAndView("student", "student", student);
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
