package se.knowit.hackit.politiker.model.riksdagen.votering;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Builder;

@Builder
public record Voteringlista(@JsonProperty("@grupp8") String grupp8,
                            @JsonProperty("@grupp7") String grupp7,
                            @JsonProperty("@grupp6") String grupp6,
                            @JsonProperty("@grupp5") String grupp5,
                            @JsonProperty("@grupp4") String grupp4,
                            @JsonProperty("@grupp3") String grupp3,
                            @JsonProperty("@grupp1") String grupp1,
                            @JsonProperty("@grupp2") String grupp2,
                            @JsonProperty("@gruppering") String gruppering,
                            @JsonProperty("@villkor") String villkor,
                            @JsonProperty("@antal") String antal,
                            List<Votering> votering) {

}
