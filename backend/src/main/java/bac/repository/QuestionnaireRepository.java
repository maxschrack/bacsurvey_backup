package bac.repository;

import bac.model.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Long> {
}
