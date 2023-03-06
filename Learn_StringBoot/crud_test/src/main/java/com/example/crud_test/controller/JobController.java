package com.example.crud_test.controller;

import com.example.crud_test.dto.JobRequest;
import com.example.crud_test.model.Job;
import com.example.crud_test.model.Location;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RestController
@RequestMapping("/job")
public class JobController {
    private ConcurrentHashMap<String, Job> jobs = new ConcurrentHashMap<>();
    public JobController(){
        jobs.put("Java123", new Job("JV01", "FullStack Developer", "Fulltime", Location.HANOI, 2000, 10000, "ngmanhcuong2001@gmail.com"));
        jobs.put("Java3456", new Job("JV02", "Front-end Developer", "Parttime", Location.HAIPHONG, 3000, 20000, "cumin1812@gmail.com"));
        jobs.put("Java567", new Job("JV03", "Back-end Developer", "SV năm 1-2", Location.DANANG, 4000, 30000, "ngtuananh187@gmail.com"));
        jobs.put("Java789", new Job("JV04", "Androi Developer", "SV năm 3-4", Location.HOCHIMINH, 5000, 40000, "mcuong2001@gmail.com"));
    }

    @GetMapping
    public List<Job> getJob(){
        return jobs.values().stream().toList();
    }

    @PostMapping
    public Job createJob(@RequestBody JobRequest jobRequest){
        String uuid = UUID.randomUUID().toString();
        Job newJob = new Job(uuid, jobRequest.title(), jobRequest.description(), jobRequest.location(), jobRequest.max_salary(), jobRequest.max_salary(), jobRequest.email_to());
        jobs.replace(uuid, newJob);
        return newJob;
    }

    @DeleteMapping(value = "/{id}")
    public Job deleteJob(@PathVariable("id") String id){
        Job removeJob = jobs.remove(id);
        return removeJob;
    }
}
