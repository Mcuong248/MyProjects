package vn.techmaster.webjobhunt.model;

import lombok.AllArgsConstructor;
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
public class Applicant {
    @Id
    private String id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String CV;
    private String photoPath;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id")
    private Job job;

    @OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
    private List<CV> listCV = new ArrayList<>();
}
