package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ojas.domain.Admin;
import com.ojas.domain.Question;
import com.ojas.domain.Student;
import com.ojas.service.AdminService;
import com.ojas.service.StudentService;

@Controller
public class OnlineExamController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/register")
	public String show(ModelMap model) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "reg_form";
	}
	@PostMapping("/register")
	public String submitForm(@ModelAttribute Admin admin, ModelMap model) {
		adminService.newAdmin(admin);
		model.addAttribute("admin", admin);
		return "reg_sucess";
	}
	
	@GetMapping("/getadmin")
	public String getAdmin(ModelMap model) {
		List<Admin> admin = adminService.findAll();
		model.addAttribute("admin", admin);
		return "get_admin";
	}
	
	@RequestMapping("/question")
	public String showQuestion(ModelMap model) {
		Question question = new Question();
		model.addAttribute("question", question);
		return "ques_form";
	}
	
	@PostMapping("/question")
	public String newQuestion(@ModelAttribute Question question,ModelMap model) {
		adminService.newQuestion(question);
		model.addAttribute("question",question);
		return "ques_sucess";
	}
	
	@GetMapping("/")
	public String homePage1() {
		return "index.html";
	}
	
	@GetMapping("/regpage")
	public String regPage() {
		return "regpage.html";
	}
	
	@GetMapping("/login")
	public String loginpage() {
		return "login";
	}
	@GetMapping("/home")
	public String home() {
		return "index.html";
	}
	@GetMapping("/admin")
	public String adminpage() {
		return "adminpage.html";
	}
	
	@GetMapping("/demo")
	public String test() {
		return "index1.html";
	}
	@GetMapping("/contact")
	public String test1() {
		return "contactus.html";
	}
	@RequestMapping("/logout")
	public String logoutPage() {
		return "index.html";
	}
	
	
	// student controller
	
	@RequestMapping("/regstud")
	public String show1(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "regstud_form";
	}
	@PostMapping("/regstud")
	public String submitForm(@ModelAttribute Student student, ModelMap model) {
		studentService.newStudent(student);
		model.addAttribute("student", student);
		return "regstud_sucess";
	}
	
	@GetMapping("/getstud")
	public String getStudent(ModelMap model) {
		List<Student> student = studentService.getStudent();
		model.addAttribute("student", student);
		return "get_stud";
	}
	

	@GetMapping("/getquestion")
	public String getQuestion(ModelMap model) {
		List<Question> question = studentService.findAll();
		model.addAttribute("question", question);
		return "get_question";
	}
	
	
	
	
}
