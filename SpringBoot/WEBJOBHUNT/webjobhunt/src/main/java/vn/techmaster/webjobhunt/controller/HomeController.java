package vn.techmaster.webjobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.techmaster.webjobhunt.repository.EmployerRepo;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired private EmployerRepo employerRepo;
    @GetMapping("")
    public String homePage(Model model) {
        // model.addAttribute("employers", employerRepo.findAll());
        return "index";
    }
}
