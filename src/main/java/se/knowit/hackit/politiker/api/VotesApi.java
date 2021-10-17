package se.knowit.hackit.politiker.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import se.knowit.hackit.politiker.model.riksdagen.votering.Root;
import se.knowit.hackit.politiker.model.riksdagen.votering.VoteringDokumentRoot;

import java.util.UUID;

@Component
@AllArgsConstructor
public class VotesApi {

  private WebClient webClient;

  public Mono<Root> getVoteringsLista(int size, String personId) {
    return webClient.get()
        .uri(builder -> builder
            .path("voteringlista/")
            .queryParam("sz", size)
            .queryParam("utformat", "json")
            .queryParam("iid", personId)
            .build()
        )
        .retrieve()
        .bodyToMono(Root.class);
  }

  public Mono<VoteringDokumentRoot> getVoteringDokument(String voteringId) {
      return webClient.get()
              .uri(uriBuilder -> uriBuilder
                      .path("votering/" + voteringId + "&utformat=json")
                      .build()
              )
              .retrieve()
              .bodyToMono(VoteringDokumentRoot.class);
  }
}
