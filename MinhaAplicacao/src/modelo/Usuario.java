/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Usuario {
    
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    
    public String getCpf(){
        return cpf;
}
    public void getCpf(String cpf){
        this.setCpf(cpf);
    }
    
    public String getEmail(){
        return email;
    }
    
    public void getEmail(String email){
        this.setEmail(email);
 
    }

    public Long getId(){
        return id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

