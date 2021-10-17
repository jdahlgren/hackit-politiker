package se.knowit.hackit.politiker.model.knowit.person;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.knowit.hackit.politiker.model.knowit.common.Parti;
import se.knowit.hackit.politiker.model.riksdagen.person.PersonItem;
import se.knowit.hackit.politiker.model.riksdagen.person.Personuppdrag;
import se.knowit.hackit.politiker.model.riksdagen.person.Personuppgift;

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
  private Parti parti;
  private String valkrets;
  private String status;
  private String bildUrl;
  private List<Uppdrag> uppdrag;
  private List<Uppgift> uppgifter;

  public static Person from(PersonItem personItem) {
    return Person.builder()
        .personId(personItem.getIntressent_id())
        .foddAr(personItem.getFodd_ar())
        .kon(personItem.getKon())
        .efternamn(personItem.getEfternamn())
        .tilltalsnamn(personItem.getTilltalsnamn())
        .parti(Parti.fromString(personItem.getParti()))
        .valkrets(personItem.getValkrets())
        .status(personItem.getStatus())
        .bildUrl(personItem.getBild_url_192())
        .uppdrag(getUppdrag(personItem.getPersonuppdrag()))
        .uppgifter(getUppgifter(personItem.getPersonuppgift()))
        .build();
  }

  private static List<Uppdrag> getUppdrag(Personuppdrag personuppdrag) {
    return personuppdrag.getUppdrag().stream()
        .map(Uppdrag::from)
        .collect(Collectors.toList());
  }

  private static List<Uppgift> getUppgifter(Personuppgift personuppgift) {
    return personuppgift.getUppgift().stream()
        .map(Uppgift::from)
        .collect(Collectors.toList());
  }

}
