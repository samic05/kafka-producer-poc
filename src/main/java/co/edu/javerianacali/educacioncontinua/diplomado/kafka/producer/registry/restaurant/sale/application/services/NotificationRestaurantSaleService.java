package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.application.services;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.models.Sale;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.internal.NotificationService;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.internal.NotifySaleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationRestaurantSaleService implements NotificationService<Sale> {

  public final NotifySaleUseCase notifyRestaurantSale;

  @Override
  public Sale notify(Sale message) {
    return notifyRestaurantSale.notify(message);
  }
}
