package com.ranger10sam.taskflow.repository;

import com.ranger10sam.taskflow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // select * from users where email = ?
    Optional<User> findByEmail(String email);

    // to find if the user exists or not
    boolean existsByEmail(String email);

}
