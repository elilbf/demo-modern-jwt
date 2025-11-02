package br.com.elibrito.demo_moderjwt.demo_modern_jwt.repository;

import br.com.elibrito.demo_moderjwt.demo_modern_jwt.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);
}
