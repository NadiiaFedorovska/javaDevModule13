package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "clients")
@Data
public class Client {

    @Id
    @Column(name = "client_id")
    @SequenceGenerator(name = "client_id",sequenceName = "client_id_seq",
            allocationSize = 1, initialValue = 11)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_id")
    private long clientId;
    @Column(name = "client_name")
    private String clientName;

}
