package org.revo.archetypes.service;

import org.revo.archetypes.domain.user;

import java.util.List;

/**
 * Created by ashraf on 6/7/15.
 */
public interface userService {
    public user findByEmail(String email);

    public List<user> findAll();

    public user save(user user);
}