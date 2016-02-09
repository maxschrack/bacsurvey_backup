package bac.repository;

import bac.model.MultipleChoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface MultipleChoiceRepository extends JpaRepository<MultipleChoice, Long> {
}
