package vn.techmaster.webjobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.techmaster.webjobhunt.model.Employer;
import vn.techmaster.webjobhunt.repository.EmployerRepo;

import java.util.List;

@Controller
public class EmployerController {
    @Autowired private EmployerRepo employerRepo;
    @GetMapping("test")
    public String listAllEmployers(Model model) {
        model.addAttribute("employers", employerRepo.findAll());
        return "test";
    }
}
