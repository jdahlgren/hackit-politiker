package se.knowit.hackit.politiker.model.riksdagen.organ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Organ {
    private String systemdatum;
    private List<OrganItem> organ;
}