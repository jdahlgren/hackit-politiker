package se.knowit.hackit.politiker.controller;

import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import se.knowit.hackit.politiker.model.knowit.votering.VoteringResponse;
import se.knowit.hackit.politiker.service.VotesService;

@RestController
@AllArgsConstructor
public class VotesController {

  private VotesService votesService;

  @GetMapping("votering")
  @Cacheable(value = "votering")
  public Flux<VoteringResponse> getVotes(@RequestParam int size, @RequestParam(required = false) String personId) {
    return votesService.getVotering(size, personId);
  }
}
