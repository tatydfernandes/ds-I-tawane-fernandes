/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class PlanoDAO {
    private Connection con;
    public PlanoDAO(Connection con){
        setCon(con);
    }
    
    public String inserir(PlanoBean plano){
        String sql = "inserir into plano (id,nome,idade,nascimento,rg,cpf,email,contato,endereco,sep,cidade,estado,noem_da_mae) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, plano.getId());
            ps.setString(2, plano.getNome());
            ps.setString(3, plano.getIdade());
            ps.setString(4, plano.getNasciemnto());
            ps.setString(5, plano.getRg());
            ps.setString(6, plano.getCpf());
            ps.setString(7, plano.getEmail());
            ps.setString(8, plano.getContato());
            ps.setString(9, plano.getEndereço());
            ps.setString(10, plano.getCep());
            ps.setString(11, plano.getCidade());
            ps.setString(12, plano.getEstado());
            ps.setString(13, plano.getNome_da_mae());
            
            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(PlanoBean plano){
        String sql = "update plano set nome = ?, idade = ?, nasciemnto = ?, rg = ?, cpf = ?, email = ?, contato = ?, endereço = ?, cep = ?, cidade = ?, estado = ?, nome_da_mae = ?";
        sql += "where id = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, plano.getId());
            ps.setString(2, plano.getNome());
            ps.setString(3, plano.getIdade());
            ps.setString(4, plano.getNasciemnto());
            ps.setString(5, plano.getRg());
            ps.setString(6, plano.getCpf());
            ps.setString(7, plano.getEmail());
            ps.setString(8, plano.getContato());
            ps.setString(9, plano.getEndereço());
            ps.setString(10, plano.getCep());
            ps.setString(11, plano.getCidade());
            ps.setString(12, plano.getEstado());
            ps.setString(13, plano.getNome_da_mae());
            
            if (ps.executeUpdate() > 0){
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e){
            return e.getMessage();
    }
}
    public String excluir (PlanoBean plano){
        String sql = "delete from plano where id = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, plano.getId());
            
            if (ps.executeUpdate() > 0){
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public List<PlanoBean> listarTodos(){
        String sql = "select * from plano";
        List<PlanoBean> listaPlano = new ArrayList<PlanoBean>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null){
                while (rs.next()){
                    PlanoBean cb = new PlanoBean();
                    cb.setId(rs.getString(1)); 
                    cb.setNome(rs.getString(2)); 
                    cb.setIdade(rs.getString(3)); 
                    cb.setNasciemnto(rs.getString(4)); 
                    cb.setRg(rs.getString(5)); 
                    cb.setCpf(rs.getString(6)); 
                    cb.setEmail(rs.getString(7)); 
                    cb.setContato(rs.getString(8)); 
                    cb.setEndereço(rs.getString(9)); 
                    cb.setCep(rs.getString(10)); 
                    cb.setCidade(rs.getString(11)); 
                    cb.setEstado(rs.getString(12)); 
                    cb.setNome_da_mae(rs.getString(13)); 
                    listaPlano.add(cb);
                }
                return listaPlano;
            } else {
                return null;
            }                        
        } catch (SQLException e){
            return null;
        }
    }
    
    public Connection getCon(){
        return con;
    }
    public void setCon(Connection con){
        this.con = con;
    }
}
