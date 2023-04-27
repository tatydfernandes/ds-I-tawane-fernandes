/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    
    Long id;
    String nome;
    String idade;
    String cpf;
    String rg;
    String sexo;
    String email;
    String telefone;
    String endereco;
    String cidade;
    private final Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario(nome,idade,cpf,rg,email.telefone,endereco,cidade) VALUES (?,?,?,?,?,?,?,?)";
    
    try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getIdade());
        stmt.setString(3, usuario.getCpf());
        stmt.setString(4, usuario.getRg());        
        stmt.setString(5, usuario.getSexo());
        stmt.setString(6, usuario.getEmail());
        stmt.setString(7, usuario.getTelefone());
        stmt.setString(8, usuario.getEndereco());
        stmt.setString(9, usuario.getCidade());
        stmt.execute();
        stmt.close();
    }catch(SQLException u){
        throw new RuntimeException(u);
    }
}
}
