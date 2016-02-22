package bac.repository;

import bac.model.Page;
import bac.model.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PageRepository extends JpaRepository<Page, Long> {

    @Query("SELECT p FROM Page p INNER JOIN p.questionnaire q WHERE q = ?1 ")
    List<Page> findByQuestionnaire(Questionnaire finder);
}
