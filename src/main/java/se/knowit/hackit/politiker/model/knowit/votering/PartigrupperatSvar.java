package se.knowit.hackit.politiker.model.knowit.votering;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartigrupperatSvar {
    private int antalJa;
    private int antalNej;
    private int antalAvsta;
    private int antalFranvarande;
}
