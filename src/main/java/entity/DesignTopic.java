package entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class DesignTopic implements Serializable {
    private Integer id;
    private String topic;
    private String description;
    private Integer dish_teacherId;
    private Integer guide_teacherId;
    private Integer status;
}
