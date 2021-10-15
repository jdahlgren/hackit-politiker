package se.knowit.hackit.politiker.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import se.knowit.hackit.politiker.api.VotesApi;
import se.knowit.hackit.politiker.model.riksdagen.votering.Root;

@Component
@AllArgsConstructor
@Slf4j
public class VotesService {

 private VotesApi votesApi;

 public Mono<Root> getVotes() {
  return votesApi.getVotes();

 }
}
