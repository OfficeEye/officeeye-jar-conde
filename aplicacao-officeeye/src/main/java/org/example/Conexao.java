package org.example;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    private JdbcTemplate conexaoDoBanco;

    public Conexao(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/officeeye");
        dataSource.setUsername("root");
        dataSource.setPassword("Rosapink1808#");

        conexaoDoBanco = new JdbcTemplate(dataSource);
    }
    
    public JdbcTemplate getConexaoDoBanco(){
        return this.conexaoDoBanco;
    }
}
