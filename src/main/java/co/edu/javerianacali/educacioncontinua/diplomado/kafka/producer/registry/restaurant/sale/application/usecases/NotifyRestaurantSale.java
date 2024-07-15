package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.application.usecases;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.models.Sale;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.external.MessageNotificationPort;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.internal.NotifySaleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotifyRestaurantSale implements NotifySaleUseCase {

  public final MessageNotificationPort<Sale> kafkaTemplate;

  @Override
  public Sale notify(Sale message) {
    kafkaTemplate.notify(message);
    return message;
  }
}
