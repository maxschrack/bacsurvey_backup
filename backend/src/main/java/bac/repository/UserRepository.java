package bac.repository;

import bac.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by max on 09/02/16.
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
