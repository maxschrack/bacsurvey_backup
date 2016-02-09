package bac.repository;

import bac.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
