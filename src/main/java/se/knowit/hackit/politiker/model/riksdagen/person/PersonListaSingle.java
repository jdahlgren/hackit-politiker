package se.knowit.hackit.politiker.model.riksdagen.person;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonListaSingle implements Serializable {

  private String systemdatum;
  private String hits;
  private PersonItem person;
}