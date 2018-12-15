package entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Demo implements Serializable {
    private Integer id;
    private String name;
}
