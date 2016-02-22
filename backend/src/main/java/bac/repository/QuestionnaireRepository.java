package bac.repository;

import bac.model.Questionnaire;
import bac.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Long> {

    @Query("SELECT q FROM Questionnaire q INNER JOIN q.user u WHERE u = ?1 ")
    List<Questionnaire> findByUser(User finder);
}
