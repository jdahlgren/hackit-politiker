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
public class Uppdrag {

  private String organKod;
  private String rollKod;
  private String status;
  private String typ;
  private String from;
  private String tom;
  private List<String> uppgift;
}
