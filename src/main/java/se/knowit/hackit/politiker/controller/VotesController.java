package se.knowit.hackit.politiker.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.knowit.hackit.politiker.service.VotesService;

@RestController
@AllArgsConstructor
public class VotesController {

  private VotesService votesService;

  @GetMapping
  public void getVotes() {

  }
}
