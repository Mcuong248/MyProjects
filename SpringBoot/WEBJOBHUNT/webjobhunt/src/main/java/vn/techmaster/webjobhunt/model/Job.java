package vn.techmaster.webjobhunt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Job {
    @Id
    private String id;
    private String title;
    private String description;
    private String salary;
    private String city;
    private String updateTime;
    private String createTime;
    @ManyToOne
    @JoinColumn(name = "employer_id")
    @JsonIgnore
    private Employer employer;


    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<Applicant> listApplicant = new ArrayList<>();
}
