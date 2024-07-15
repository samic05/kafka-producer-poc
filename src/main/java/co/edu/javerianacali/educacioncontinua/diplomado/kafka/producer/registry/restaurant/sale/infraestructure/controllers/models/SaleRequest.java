package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.infraestructure.controllers.models;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.models.Sale;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class SaleRequest {
  private List<SaleRequestProducts> products;
  private String shopperName;
  private String shopperEmail;
  private double discount;

  public Sale toDomainModel() {
    return new Sale(
        UUID.randomUUID(),
        products.stream().map(SaleRequestProducts::toDomainModel).toList(),
        shopperName,
        shopperEmail,
        discount);
  }
}
