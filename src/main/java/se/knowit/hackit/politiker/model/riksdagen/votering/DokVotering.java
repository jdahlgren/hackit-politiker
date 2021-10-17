package se.knowit.hackit.politiker.model.riksdagen.votering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DokVotering {
    private List<Votering> votering;
}
