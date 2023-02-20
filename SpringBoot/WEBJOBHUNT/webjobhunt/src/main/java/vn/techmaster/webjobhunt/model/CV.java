package vn.techmaster.webjobhunt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class CV {
    @Id
    private String id;
    private String photoPath;
    private String CV_Path;
    @ManyToOne
    @JoinColumn(name = "applicant_id")
    private Applicant applicant;
}
