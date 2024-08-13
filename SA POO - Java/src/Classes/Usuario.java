/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Aluno_Manha
 */
public class Usuario {
    private String nome;
    private int cnh;
    private String categoria;
    private int idade;
    private String email;
    private String senha;

    public Usuario() {
    }
    
    public Usuario(String nome, int cnh, String categoria, int idade, String email, String senha) {
        this.nome = nome;
        this.cnh = cnh;
        this.categoria = categoria;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnh() {
        return cnh;
    }
    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
