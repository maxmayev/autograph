package com.maxmayev.autograph.repository;

import com.maxmayev.autograph.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}

