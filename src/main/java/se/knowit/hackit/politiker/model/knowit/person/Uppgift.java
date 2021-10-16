package se.knowit.hackit.politiker.model.knowit.person;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Uppgift {

  private String kod;
  private List<String> uppgift;
  private String typ;
}
