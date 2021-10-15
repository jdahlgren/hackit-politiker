package se.knowit.hackit.politiker.model.riksdagen.organ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public final class OrganItem {
    private String kod;
    private String namn;
    private String typ;
    private String sortering;
    private String namnEn;
    private String domN;
    private String beskrivning;
}