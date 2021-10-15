package se.knowit.hackit.politiker.model.riksdagen.person;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UppdragItem implements Serializable {

  private String organKod;
  private String rollKod;
  private String ordningsnummer;
  private String status;
  private String typ;
  private String from;
  private String tom;
  //private List<String> uppgift;
  private String intressentId;
  private String hangarId;
  private String sortering;
  private String organSortering;
  private String uppdragRollsortering;
  private String uppdragStatussortering;
}