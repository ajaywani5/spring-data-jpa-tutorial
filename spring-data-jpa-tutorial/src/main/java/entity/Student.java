package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //Entity created
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="tbl-student")
public class Student {
    @Id
private Long studentId;
    @Column(name="fName")
private String firstName;
    @Column(name="lName")
private String lastName;
    @Column(name="email")
private String emailId;
    @Column(name="gName")
private String guardianName;
    @Column(name="gEmail")
private String guardianEmail;
    @Column(name="gMobile")
private String guardianMobile;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", guardianName='" + guardianName + '\'' +
                ", guardianEmail='" + guardianEmail + '\'' +
                ", guardianMobile='" + guardianMobile + '\'' +
                '}';
    }
    //add to string method
}
