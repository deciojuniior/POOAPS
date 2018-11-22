package POOAPS.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Conexao {
        private Connection connection = null;
        public Conexao () throws ClassNotFoundException, InstantiationException,IllegalAccessException, SQLException {
            String databaseURL = "jdbc:postgresql://localhost/POO";
            String usuario = "postgres";
            String senha = "postgres";
            String driverName = "org.postgresql.Driver";

            Class.forName(driverName).newInstance();

            connection = DriverManager.getConnection(databaseURL, usuario, senha);
        }

        public Connection getConnection() {
            return connection;
        }

        public void setConnection(Connection connection) {
            this.connection = connection;
        }
    }


