package io.tuna.boot.jpa.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public  class AccountRepositoryTest {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di() throws SQLException {
        try (Connection conn = dataSource.getConnection()) {
            Account account = new Account();
            account.setUsername("knamkim");
            account.setPassword("abcd");
            Account newAccount = accountRepository.save(account);
            assertThat(newAccount).isNotNull();
            Account account2 = accountRepository.findByUsername("knamkim");
            assertThat(account2).isNotNull();
        }
    }
}




