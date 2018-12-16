package entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Class implements Serializable {
    private Integer id;
    private String className;
    private Integer collegeId;
}
