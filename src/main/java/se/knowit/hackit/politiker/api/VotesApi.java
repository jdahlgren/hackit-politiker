package se.knowit.hackit.politiker.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import se.knowit.hackit.politiker.model.riksdagen.votering.Root;

@Component
@AllArgsConstructor
public class VotesApi {

  private WebClient webClient;

  public Mono<Root> getVotes() {
    return webClient.get()
        .uri("/voteringlista/?sz=10&utformat=json")
        .retrieve()
        .bodyToMono(Root.class);
  }
}
