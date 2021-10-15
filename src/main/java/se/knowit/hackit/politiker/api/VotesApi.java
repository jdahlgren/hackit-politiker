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

  public Mono<Root> getVotes(int size) {
    return webClient.get()
        .uri(builder -> builder
            .path("voteringlista/")
            .queryParam("sz", size)
            .queryParam("utformat", "json")
            .build()
        )
        .retrieve()
        .bodyToMono(Root.class);
  }
}
