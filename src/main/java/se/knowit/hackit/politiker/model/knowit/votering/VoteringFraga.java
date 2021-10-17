package se.knowit.hackit.politiker.model.knowit.votering;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.knowit.hackit.politiker.model.riksdagen.votering.Dokument;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VoteringFraga {
    private String dokumentId;
    private String organ;
    private String datum;
    private String titel;

    public static VoteringFraga from(Dokument dokument) {
        return VoteringFraga.builder()
                .dokumentId(dokument.getDok_id())
                .organ(dokument.getOrgan())
                .datum(dokument.getDatum())
                .titel(dokument.getTitel())
                .build();
    }
}
