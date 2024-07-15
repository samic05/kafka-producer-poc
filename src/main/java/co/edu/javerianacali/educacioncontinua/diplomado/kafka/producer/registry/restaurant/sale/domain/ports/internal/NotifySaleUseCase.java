package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.internal;

import co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.models.Sale;

public interface NotifySaleUseCase {
  Sale notify(Sale message);
}
