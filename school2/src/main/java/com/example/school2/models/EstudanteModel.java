package com.example.school2.models;

import jakarta.persistence.*;

@Entity(name ="Estudantes")
@Table(name = "TBL_ESTUDANTES")
public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nome_esstudante")
    private String nome;
    @Column (name = "emai_estudante")
    private String email;
    @Column (name = "idade_estudante")
    private Integer idade;


    public EstudanteModel(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
