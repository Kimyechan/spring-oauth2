package me.buildup.demospringoauth2.repo;

import me.buildup.demospringoauth2.domain.User;
import me.buildup.demospringoauth2.repository.UserJpaRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJpaRepoTest {
    @Autowired
    private UserJpaRepo userJpaRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertNewUser() {
        userJpaRepo.save(User.builder()
                .uid("yechan@gmail.com")
                .password(passwordEncoder.encode("1234"))
                .name("yechan")
                .roles(Collections.singletonList("ROLE_USER"))
                .build());
    }
}
