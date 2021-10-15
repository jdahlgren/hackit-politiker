package se.knowit.hackit.politiker.model.riksdagen.person;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonLista implements Serializable {

  private String systemdatum;
  private String hits;
  private List<PersonItem> person;
}