package se.knowit.hackit.politiker.model.riksdagen.person;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.knowit.hackit.politiker.model.riksdagen.person.deserializer.StringOrNullDeserializer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UppgiftWrapper {

  @JsonDeserialize(using = StringOrNullDeserializer.class)
  private String text;
}
