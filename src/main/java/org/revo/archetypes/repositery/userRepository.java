package org.revo.archetypes.repositery;

import org.revo.archetypes.domain.user;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ashraf on 6/7/15.
 */
public interface userRepository extends CrudRepository<user, Long> {
    public user findByEmail(String email);

    @Query("select u from user u")
    public List<user> findall();
}
