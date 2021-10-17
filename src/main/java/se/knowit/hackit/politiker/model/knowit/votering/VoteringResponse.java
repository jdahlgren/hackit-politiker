package se.knowit.hackit.politiker.model.knowit.votering;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.codec.multipart.Part;
import se.knowit.hackit.politiker.model.knowit.common.Parti;
import se.knowit.hackit.politiker.model.riksdagen.votering.Votering;
import se.knowit.hackit.politiker.model.riksdagen.votering.VoteringDokument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VoteringResponse {
    private VoteringFraga voteringFraga;
    private VoteringSvar voteringSvar;
    private Map<Parti, PartigrupperatSvar> partigrupperatSvar;

    public static VoteringResponse from(Votering votering, VoteringDokument voteringDokument) {
        return VoteringResponse.builder()
                .voteringFraga(VoteringFraga.from(voteringDokument.getDokument()))
                .voteringSvar(VoteringSvar.from(votering))
                .partigrupperatSvar(partigrupperatSvar(voteringDokument.getDokvotering().getVotering()))
                .build();
    }

    private static Map<Parti, PartigrupperatSvar> partigrupperatSvar(List<Votering> voteringar) {
        Map<Parti, PartigrupperatSvar> partigrupperatSvar = new HashMap<>();
        for (Votering votering : voteringar) {
            addRost(partigrupperatSvar, votering);
        }

        return partigrupperatSvar;
    }

    private static void addRost(Map<Parti, PartigrupperatSvar> partigrupperatSvar, Votering votering) {
        Parti key = Parti.fromString(votering.getParti());
        if (partigrupperatSvar.containsKey(key)) {
            PartigrupperatSvar svar = partigrupperatSvar.get(key);
            increaseRost(votering, svar);
        } else {
            PartigrupperatSvar svar = new PartigrupperatSvar();
            increaseRost(votering, svar);
            partigrupperatSvar.put(key, svar);
        }


    }

    private static void increaseRost(Votering votering, PartigrupperatSvar svar) {
        switch (votering.getRost()) {
            case "Ja":
                svar.setAntalJa(svar.getAntalJa() + 1);
                break;
            case "Nej":
                svar.setAntalNej(svar.getAntalNej() + 1);
                break;
            case "Frånvarande":
                svar.setAntalFranvarande(svar.getAntalFranvarande() + 1);
                break;
            case "Avstår":
                svar.setAntalAvsta(svar.getAntalAvsta() + 1);
                break;
        }
    }


}
