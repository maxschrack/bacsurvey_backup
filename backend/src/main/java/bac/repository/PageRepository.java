package bac.repository;

import bac.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface PageRepository extends JpaRepository<Page, Long> {
}
