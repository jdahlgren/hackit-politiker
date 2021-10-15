package se.knowit.hackit.politiker.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import se.knowit.hackit.politiker.model.riksdagen.organ.Organ;
import se.knowit.hackit.politiker.model.riksdagen.organ.OrganItem;
import se.knowit.hackit.politiker.model.riksdagen.organ.OrganRoot;

@Component
@AllArgsConstructor
public class OrganApi {

  private WebClient webClient;

  public Flux<OrganItem> getOrgan() {
    return webClient.get()
        .uri("/sv/koder/?typ=organ&utformat=json")
        .retrieve()
        .bodyToFlux(OrganRoot.class)
        .map(OrganRoot::getOrgan)
        .map(Organ::getOrgan)
        .flatMap(Flux::fromIterable);
  }
}
