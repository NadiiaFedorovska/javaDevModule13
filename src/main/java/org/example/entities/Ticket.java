package org.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {
  @Id
  @Column(name = "ticket_id")
  private long ticketId;
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  @Column(name = "client_id")
  private long clientId;
  @Column(name = "from_planet_id")
  private String fromPlanetId;
  @Column(name = "to_planet_id")
  private String toPlanetId;

}
