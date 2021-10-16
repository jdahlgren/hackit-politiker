package se.knowit.hackit.politiker.model.knowit.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Parti {
  S("Socialdemokraterna"),
  M("Moderata samlingspartiet"),
  SD("Sverigedemokraterna"),
  MP("Miljöpartiet"),
  C("Centerpartiet"),
  V("Vänsterpartiet"),
  L("Liberalerna"),
  KD("Kristdemokraterna"),
  @JsonProperty("-")
  NONE("Utan partibeteckning");

  private final String namn;

  Parti(String namn) {
    this.namn = namn;
  }

  public static Parti fromString(String partiKod) {
    if (partiKod.equals("-")) {
      return NONE;
    }
    return Parti.valueOf(partiKod);
  }
}