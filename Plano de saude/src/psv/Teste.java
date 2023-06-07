/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class Teste {
    public static void main(String[] args){
        Connection con = (Connection) Conexao.abrirConexao();
        
        PlanoBean cb = new PlanoBean();
        
        PlanoDAO cd = new PlanoDAO(con);

    }
}
