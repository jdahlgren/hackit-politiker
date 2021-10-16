package se.knowit.hackit.politiker.model.knowit.person;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.knowit.hackit.politiker.model.riksdagen.person.UppgiftItem;
import se.knowit.hackit.politiker.model.riksdagen.person.UppgiftWrapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Uppgift {

  private String kod;
  private String uppgift;
  private String typ;

  public static Uppgift from(UppgiftItem uppgiftItem) {
    return Uppgift.builder()
        .kod(uppgiftItem.getKod())
        .typ(uppgiftItem.getTyp())
        .uppgift(getUppgift(uppgiftItem))
        .build();
  }

  private static String getUppgift(UppgiftItem uppgiftItem) {
    return uppgiftItem.getUppgift().stream()
        .map(UppgiftWrapper::getText)
        .filter(Objects::nonNull)
        .findFirst().orElse("");
  }
}
