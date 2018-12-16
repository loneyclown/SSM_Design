package entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Expertise implements Serializable {
    private Integer id;
    private String expertiseName;
}
