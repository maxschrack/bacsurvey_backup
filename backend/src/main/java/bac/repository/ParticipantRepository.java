package bac.repository;

import bac.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
