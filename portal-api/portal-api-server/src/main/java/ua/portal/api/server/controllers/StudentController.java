package ua.portal.api.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.portal.api.server.repositories.StudentRepository;

@Controller
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping("/students")
    public  String getStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "/students/index";
    }
}
