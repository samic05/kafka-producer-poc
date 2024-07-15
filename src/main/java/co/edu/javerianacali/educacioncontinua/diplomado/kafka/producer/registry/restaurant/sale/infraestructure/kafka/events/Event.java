package co.edu.javerianacali.educacioncontinua.diplomado.kafka.producer.registry.restaurant.sale.infraestructure.kafka.events;

import java.util.UUID;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Event {
  private UUID eventId;
}
