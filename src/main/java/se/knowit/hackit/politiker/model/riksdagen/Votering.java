package se.knowit.hackit.politiker.model.riksdagen;

import lombok.Builder;

@Builder
public record Votering(String hangar_id, String rm, String beteckning,
                       String punkt, String votering_id, String intressent_id,
                       String namn, String fornamn, String efternamn,
                       String valkrets, String iort, String parti,
                       String banknummer, String kon, String fodd, String rost,
                       String avser, String votering, String votering_url_xml,
                       String dok_id, String systemdatum) {

}
