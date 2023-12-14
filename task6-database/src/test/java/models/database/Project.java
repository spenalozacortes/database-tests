package models.database;

import lombok.Data;

@Data
public class Project {
    private Long id;
    private String name;

    public Project(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
