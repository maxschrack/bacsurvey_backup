package bac.repository;

import bac.model.OpenQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface OpenQuestionRepository extends JpaRepository<OpenQuestion, Long> {
}
