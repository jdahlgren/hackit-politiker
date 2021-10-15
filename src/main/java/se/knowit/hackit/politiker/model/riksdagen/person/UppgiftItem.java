package se.knowit.hackit.politiker.model.riksdagen.person;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UppgiftItem {

  private String kod;
  private List<Uppgift> uppgift;
  private String typ;
  private String intressentId;
  private String hangarId;
}