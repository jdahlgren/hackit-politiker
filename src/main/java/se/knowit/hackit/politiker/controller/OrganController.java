package se.knowit.hackit.politiker.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import se.knowit.hackit.politiker.model.knowit.organ.Organ;
import se.knowit.hackit.politiker.service.OrganService;

@RestController()
@RequestMapping("organ")
@AllArgsConstructor
public class OrganController {

  private OrganService organService;

  @GetMapping()
  public Flux<Organ> getOrgan() {
    return organService.getOrgan();
  }

  @GetMapping("utskott")
  public Flux<Organ> getUtskott() {
    return organService.getUtskott();
  }
}
