package se.knowit.hackit.politiker.model.riksdagen.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonListaSingle {

  private String systemdatum;
  private String hits;
  private PersonItem person;
}