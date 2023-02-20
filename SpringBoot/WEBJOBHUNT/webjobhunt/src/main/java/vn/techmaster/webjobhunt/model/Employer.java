package vn.techmaster.webjobhunt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Builder
public class Employer {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String photoPath;
    private String state;
    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL)
    private List<Job> listJob = new ArrayList<>();

}
