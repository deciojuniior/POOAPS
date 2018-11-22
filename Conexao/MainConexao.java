package POOAPS.Conexao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainConexao {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException,
            SQLException {
        POOAPS.Conexao.Conexao conexao = new Conexao();
        Statement stm = conexao.getConnection().createStatement();
        ResultSet rs = stm.executeQuery("SELECT * from endereço;");
        while (rs.next()){
            System.out.println("Rua: "+rs.getString("rua")+
                    " - Num: "+rs.getInt("numero")+
                    " - Bairro: "+ rs.getString("bairro"));
        }
    }
}