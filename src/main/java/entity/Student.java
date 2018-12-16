package entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer id;
    private String studentName;
    private String studentIdentifier;
    private Integer collegeId;
    private Integer classId;
    private String password;
    private Integer topicId;
}
