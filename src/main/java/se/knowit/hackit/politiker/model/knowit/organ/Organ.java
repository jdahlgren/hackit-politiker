package se.knowit.hackit.politiker.model.knowit.organ;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.knowit.hackit.politiker.model.riksdagen.organ.OrganItem;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Organ {

 private String kod;
 private String namn;
 private String typ;
 private String beskrivning;

 public static Organ from(OrganItem organItem) {
  return Organ.builder()
      .kod(organItem.getKod())
      .namn(organItem.getNamn())
      .typ(organItem.getTyp())
      .beskrivning(organItem.getBeskrivning())
      .build();
 }
}
