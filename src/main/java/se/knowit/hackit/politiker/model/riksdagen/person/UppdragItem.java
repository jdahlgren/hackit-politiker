package se.knowit.hackit.politiker.model.riksdagen.person;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UppdragItem {

  private String organ_kod;
  private String roll_kod;
  private String ordningsnummer;
  private String status;
  private String typ;
  private String from;
  private String tom;
  private List<UppgiftWrapper> uppgift;
  private String intressentId;
  private String hangarId;
  private String sortering;
  private String organ_sortering;
  private String uppdrag_rollsortering;
  private String uppdrag_statussortering;
}