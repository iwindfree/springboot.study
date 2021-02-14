package io.tuna.boot.db.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class MySQLRunner implements ApplicationRunner {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Connection connection = dataSource.getConnection();
        System.out.println(dataSource.getClass().toString());
        System.out.println(connection.getMetaData().getURL());
        System.out.println(connection.getMetaData().getUserName());
        String sql = "create table user(id integer not null, name varchar(255), primary key(id))";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        connection.close();

        jdbcTemplate.execute("insert into user(id,name) values(1,'aaa')");
    }
}
