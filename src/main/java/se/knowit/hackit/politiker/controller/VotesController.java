package se.knowit.hackit.politiker.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import se.knowit.hackit.politiker.model.riksdagen.votering.Root;
import se.knowit.hackit.politiker.service.VotesService;

@RestController
@AllArgsConstructor
public class VotesController {

  private VotesService votesService;

  @GetMapping("votering")
  public Mono<Root> getVotes() {
    return votesService.getVotes();
  }
}
