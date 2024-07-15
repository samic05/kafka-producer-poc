package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.infraestructure.controllers;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.models.Sale;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.internal.NotificationService;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.infraestructure.controllers.models.SaleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantSalesController {

  private final NotificationService<Sale> restaurantNotificationService;

  @PostMapping("/sale")
  public @ResponseBody ResponseEntity<String> saleRegister(@RequestBody SaleRequest sale) {
    try {
      var result = restaurantNotificationService.notify(sale.toDomainModel());
      return ResponseEntity.ok("Sale registered, id: " + result.getId());
    } catch (Exception e) {
      return ResponseEntity.badRequest().body("Ouch! something went wrong " + e);
    }
  }
}
