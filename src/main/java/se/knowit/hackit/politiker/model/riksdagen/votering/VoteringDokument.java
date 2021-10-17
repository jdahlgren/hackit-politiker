package se.knowit.hackit.politiker.model.riksdagen.votering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoteringDokument {
    private Dokument dokument;
    private DokVotering dokvotering;
}
