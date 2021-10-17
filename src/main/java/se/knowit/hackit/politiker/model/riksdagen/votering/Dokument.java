package se.knowit.hackit.politiker.model.riksdagen.votering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dokument {
    private String dok_id;
        private String organ;
        private String datum;
        private String titel;

}
