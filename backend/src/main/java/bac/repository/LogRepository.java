package bac.repository;

import bac.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface LogRepository extends JpaRepository<Log, Long> {
}
