package org.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "planets")
@Data
public class Planet {
    @Id
    @Column(name = "planet_id")
    private String planetId;
    @Column(name = "planet_name")
    private String planetName;
}
