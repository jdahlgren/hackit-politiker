package se.knowit.hackit.politiker.model.riksdagen.organ;

import java.util.List;

public record Organ(String systemdatum,
                    List<OrganItem> organ) {

}