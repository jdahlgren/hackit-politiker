package se.knowit.hackit.politiker.model.riksdagen.votering;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Voteringlista {
    @JsonProperty("@grupp8")
    private String grupp8;
    @JsonProperty("@grupp7")
    private String grupp7;
    @JsonProperty("@grupp6")
    private String grupp6;
    @JsonProperty("@grupp5")
    private String grupp5;
    @JsonProperty("@grupp4")
    private String grupp4;
    @JsonProperty("@grupp3")
    private String grupp3;
    @JsonProperty("@grupp1")
    private String grupp1;
    @JsonProperty("@grupp2")
    private String grupp2;
    @JsonProperty("@gruppering")
    private String gruppering;
    @JsonProperty("@villkor")
    private String villkor;
    @JsonProperty("@antal")
    private String antal;
    private List<Votering> votering;
}
