package se.knowit.hackit.politiker.model.knowit.person;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.knowit.hackit.politiker.model.riksdagen.person.UppdragItem;
import se.knowit.hackit.politiker.model.riksdagen.person.UppgiftWrapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Uppdrag {

  private String organKod;
  private String rollKod;
  private String status;
  private String typ;
  private String from;
  private String tom;
  private String uppgift;

  public static Uppdrag from(UppdragItem uppdragItem) {
    return Uppdrag.builder()
        .organKod(uppdragItem.getOrganKod())
        .rollKod(uppdragItem.getRollKod())
        .status(uppdragItem.getStatus())
        .typ(uppdragItem.getTyp())
        .from(uppdragItem.getFrom())
        .tom(uppdragItem.getTom())
        .uppgift(getUppgift(uppdragItem))
        .build();
  }

  private static String getUppgift(UppdragItem uppdragItem) {
    return uppdragItem.getUppgift().stream()
        .map(UppgiftWrapper::getText)
        .filter(Objects::nonNull)
        .findFirst().orElse("");
  }
}
