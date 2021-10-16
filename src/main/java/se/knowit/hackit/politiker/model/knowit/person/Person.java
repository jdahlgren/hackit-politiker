package se.knowit.hackit.politiker.model.knowit.person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

  private String personId;
  private String foddAr;
  private String kon;
  private String efternamn;
  private String tilltalsnamn;
  private String partiKod;
  private String valkrets;
  private String status;
  private String bildUrl;
  private Uppdrag uppdrag;
  private Uppgift uppgift;

}
