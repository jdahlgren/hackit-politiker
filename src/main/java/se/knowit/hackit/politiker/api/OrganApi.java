package se.knowit.hackit.politiker.api;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import se.knowit.hackit.politiker.model.riksdagen.organ.Organ;
import se.knowit.hackit.politiker.model.riksdagen.organ.OrganItem;
import se.knowit.hackit.politiker.model.riksdagen.organ.OrganRoot;

@Component
@AllArgsConstructor
public class OrganApi {

  private WebClient webClient;

  public Mono<List<OrganItem>> getOrgan() {
    return webClient.get()
        .uri("/sv/koder/?typ=organ&utformat=json")
        .retrieve()
        .bodyToMono(OrganRoot.class)
        .map(OrganRoot::organ)
        .map(Organ::organ);
  }
}
