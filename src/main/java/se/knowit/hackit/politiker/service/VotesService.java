package se.knowit.hackit.politiker.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import se.knowit.hackit.politiker.api.VotesApi;
import se.knowit.hackit.politiker.model.knowit.votering.VoteringResponse;
import se.knowit.hackit.politiker.model.riksdagen.votering.*;

@Component
@AllArgsConstructor
@Slf4j
public class VotesService {

 private VotesApi votesApi;

 public Flux<VoteringResponse> getVotering(int size, String personId) {
  Mono<Root> rootMono = votesApi.getVoteringsLista(size, personId);

  return rootMono
          .map(Root::getVoteringlista)
          .map(Voteringlista::getVotering)
          .flatMapMany(Flux::fromIterable)
          .flatMap(this::getVoteringDoc);

 }

 private Mono<VoteringResponse> getVoteringDoc(Votering votering) {
  return votesApi.getVoteringDokument(votering.getVotering_id())
          .map(VoteringDokumentRoot::getVotering)
          .map(voteringDokument -> VoteringResponse.from(votering, voteringDokument));
 }


}
