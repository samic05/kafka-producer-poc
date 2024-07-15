package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.external;

public interface MessageNotificationPort<T> {
  void notify(T message);
}
