package salvatoreassennato.gestioneEventi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salvatoreassennato.gestioneEventi.entities.Evento;

import java.util.UUID;
@Repository
public interface EventiDAO extends JpaRepository<Evento, UUID> {
}
