/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Usuario {
    
    private Long id;
    private String nome;
    private String idade;
    private String cpf;
    private String rg;
    private String sexo;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    
    public Long getId(){
        return id;
    }
            
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
        
    public String getIdade(){
        return idade;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
        
    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getSexo(){
        return email;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }    
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }   
        
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }   
        
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
}
