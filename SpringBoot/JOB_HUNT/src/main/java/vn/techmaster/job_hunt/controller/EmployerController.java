package vn.techmaster.job_hunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.job_hunt.model.Employer;
import vn.techmaster.job_hunt.repository.EmployerRepo;
import vn.techmaster.job_hunt.request.EmployerRequest;
import vn.techmaster.job_hunt.service.StorageService;

import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping(value = "/employer")
public class EmployerController {
    @Autowired private EmployerRepo employerRepo;
    @Autowired private StorageService storageService;
    @GetMapping
    public String listAllEmployers(Model model) {
        model.addAttribute("employers", employerRepo.getAll());
        return "employers";
    }

    @GetMapping(value = "/{id}")
    public String showEmployerDetailByID(Model model, @PathVariable String id) {
        model.addAttribute("employer", employerRepo.findById(id));
        return "employer";
    }

    @GetMapping(value = "/add")
    public String addEmployerForm(Model model) {
        model.addAttribute("employer", new Employer("","","",null, ""));
        return "employer_add";
    }

    @PostMapping(value = "/add", consumes = { "multipart/form-data" })
    public String addEmployer(@Valid @ModelAttribute("employer") EmployerRequest employerRequest,
                              BindingResult result,
                              Model model) {
        if (employerRequest.logo_path().getOriginalFilename().isEmpty()) {
            result.addError(new FieldError("employer", "logo_path", "Logo is required"));
        }

        // Nếu có lỗi thì trả về trình duyệt
        if (result.hasErrors()) {
            return "employer_add";
        }

        // Thêm vào cơ sở dữ liệu
        Employer emp = employerRepo.add(Employer.builder()
                .name(employerRequest.name())
                .website(employerRequest.website())
                .email(employerRequest.email())
                .build());

        // Lưu logo vào ổ cứng
        try {
            String logoFileName = storageService.saveFile(employerRequest.logo_path(), emp.getId());
            employerRepo.updateLogo(emp.getId(), logoFileName);
        } catch (IOException e) {
            // Nếu lưu file bị lỗi thì hãy xóa bản ghi Employer
            e.printStackTrace();
        }
        return "redirect:/employer";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteEmployerByID(@PathVariable String id) {
        Employer emp = employerRepo.deleteById(id);
        storageService.deleteFile(emp.getLogo_path());
        return "redirect:/employer";
    }
}


