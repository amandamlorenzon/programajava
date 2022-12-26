package ATV2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Banco{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection 
            ("jdbc:mysql://cpanel.beway.io/bewayi84_amanda","bewayi84_amanda","r)Co#a3ncXpS");
            con.close();
            } catch (ClassNotFoundException e) {
            System.out.println("A classe do driver de conexão não foi encontrada!");
            } catch (SQLException e) {
            System.out.println("O comando SQL não pode ser executado!");
            }
        
    }
    
}