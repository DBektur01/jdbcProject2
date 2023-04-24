package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Job {
    @Id
    private Long id;
    @Column
    private String position;
    @Column
    private String profession;
    @Column
    private String description;
    @Column
    private int experiences;

    public Job(String position,String profession,String description,int experiences){
        this.position=position;
        this.profession=profession;
        this.description=description;
        this.experiences=experiences;
    }
}
