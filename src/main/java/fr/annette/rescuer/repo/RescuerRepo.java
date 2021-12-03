package fr.annette.rescuer.repo;

import fr.annette.rescuer.model.Rescuer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RescuerRepo extends JpaRepository<Rescuer, Long> {
    void deleteRescuerById(Long id);

    Optional<Rescuer> findRescuerById(Long id);
}