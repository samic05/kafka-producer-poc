package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.infraestructure.kafka.producer;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.models.Sale;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.external.MessageNotificationPort;
import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.infraestructure.kafka.events.SaleEvent;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class KafkaEventProducerRestaurantSale implements MessageNotificationPort<Sale> {

  private final KafkaTemplate<String, SaleEvent> kafkaTemplate;

  @Override
  public void notify(Sale message) {
    var result =
        kafkaTemplate.send("event-driven-architecture", SaleEvent.fromDomainModel(message));
  }
}
