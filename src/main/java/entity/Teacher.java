package entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private Integer id;
    private String teacherName;
    private Integer expertiseId;
    private Integer collegeId;
    private String passWord;
}
