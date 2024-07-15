package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.domain.ports.internal;

public interface NotificationService<T> {
  T notify(T message);
}
