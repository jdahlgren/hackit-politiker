package se.knowit.hackit.politiker.model.riksdagen.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonItem {

  private String hangarGuid;
  private String sourceid;
  private String intressentId;
  private String hangarId;
  private String foddAr;
  private String kon;
  private String efternamn;
  private String tilltalsnamn;
  private String sorteringsnamn;
  private String iort;
  private String parti;
  private String valkrets;
  private String status;
  private String personUrlXml;
  private String bildUrl80;
  private String bildUrl192;
  private String bildUrlMax;
  private Personuppdrag personuppdrag;
  private Personuppgift personuppgift;
}