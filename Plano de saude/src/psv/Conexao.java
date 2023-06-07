/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.*;

public class Conexao {
    public static Connection abrirConexao(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                String url = "";
                url += "jdbc:mysql://localhost/planodesaude";
                url += "user=root&password=";
                
                con = (Connection) DriverManager.getConnection(url);
                System.out.println("Conexão aberta");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    public static void fecharConexao(Connection con){
        try{
            con.close();
            System.out.println("Conexão fechada");
        } catch (IOException e){
            System.out.println(e.getMessage());
    } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
