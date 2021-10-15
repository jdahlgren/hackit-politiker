package se.knowit.hackit.politiker.model.riksdagen.votering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Votering {
    private String hangar_id;
    private String rm;
    private String beteckning;
    private String punkt;
    private String votering_id;
    private String intressent_id;
    private String namn;
    private String fornamn;
    private String efternamn;
    private String valkrets;
    private String iort;
    private String parti;
    private String banknummer;
    private String kon;
    private String fodd;
    private String rost;
    private String avser;
    private String votering;
    private String votering_url_xml;
    private String dok_id;
    private String systemdatum;
}
