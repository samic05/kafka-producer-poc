package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.infraestructure.controllers.models;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.models.SaleProduct;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaleRequestProducts {
  private UUID productId;
  private String productName;
  private int quantity;
  private double unitaryPrice;

  public static SaleRequestProducts fromDomainModel(SaleProduct saleProduct) {
    return new SaleRequestProducts(
        saleProduct.getProductId(),
        saleProduct.getProductName(),
        saleProduct.getQuantity(),
        saleProduct.getUnitaryPrice());
  }

  public SaleProduct toDomainModel() {
    return new SaleProduct(productId, productName, quantity, unitaryPrice);
  }
}
