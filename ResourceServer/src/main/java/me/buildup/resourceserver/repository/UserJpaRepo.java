package me.buildup.resourceserver.repository;

import me.buildup.resourceserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepo extends JpaRepository<User, Long> {
}
