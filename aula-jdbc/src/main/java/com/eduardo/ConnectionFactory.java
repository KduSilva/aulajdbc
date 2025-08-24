// Fabrica de conexões
package com.eduardo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    public Connection getConnection() {
        System.out.println("Conectando ao banco de dados...");
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/contato_db", "MySQLKdu", "123456");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
