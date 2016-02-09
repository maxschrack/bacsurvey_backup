package bac.repository;

import bac.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
