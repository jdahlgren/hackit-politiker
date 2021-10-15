package se.knowit.hackit.politiker.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import se.knowit.hackit.politiker.model.riksdagen.organ.OrganItem;
import se.knowit.hackit.politiker.service.OrganService;

@RestController()
@RequestMapping("organ")
@AllArgsConstructor
public class OrganController {

  private OrganService organService;

  @GetMapping()
  public Flux<OrganItem> getOrgan() {
    return organService.getOrgan();
  }

  @GetMapping("utskott")
  public Flux<OrganItem> getUtskott() {
    return organService.getUtskott();
  }
}
