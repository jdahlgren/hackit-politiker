package se.knowit.hackit.politiker.model.riksdagen.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonItem {

  private String hangar_guid;
  private String sourceid;
  private String intressent_id;
  private String hangar_id;
  private String fodd_ar;
  private String kon;
  private String efternamn;
  private String tilltalsnamn;
  private String sorteringsnamn;
  private String iort;
  private String parti;
  private String valkrets;
  private String status;
  private String person_url_xml;
  private String bild_url_80;
  private String bild_url_192;
  private String bild_url_max;
  private Personuppdrag personuppdrag;
  private Personuppgift personuppgift;
}