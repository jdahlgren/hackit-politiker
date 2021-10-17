package se.knowit.hackit.politiker.model.knowit.votering;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.knowit.hackit.politiker.model.knowit.common.Parti;
import se.knowit.hackit.politiker.model.riksdagen.votering.Votering;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VoteringSvar {
    private String fornamn;
    private String efternamn;
    private Parti parti;
    private String rost;
    private String punkt;
    private String avser;

    public static VoteringSvar from(Votering votering) {
        return VoteringSvar.builder()
                .fornamn(votering.getFornamn())
                .efternamn(votering.getEfternamn())
                .parti(Parti.fromString(votering.getParti()))
                .rost(votering.getRost())
                .punkt(votering.getPunkt())
                .avser(votering.getAvser())
                .build();
    }
}
