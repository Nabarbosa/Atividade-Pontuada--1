package com.senai.Atividade_Pontuada_API_REST_Spring_Boot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O CPF é obrigatório.")
    @Size(min = 11, max = 11, message = "O CPF deve conter apenas números, e 11 caracteres.")
    private String cpf;

    @NotBlank(message = "A data de nascimento é obrigatória.")
    private String dataNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Enumerated(EnumType.STRING)
    private Setor setor;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    private double salario;

    @NotBlank(message = "E-mail é obrigatório.")
    @Email(message = "O e-mail deve ser um e-mail valido.")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(String cpf, String dataNascimento, String email, Endereco endereco, EstadoCivil estadoCivil, Long id, String nome, double salario, Setor setor, Sexo sexo) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public @NotBlank(message = "O CPF é obrigatório.") @Size(min = 11, message = "Deve conter apenas números") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "O CPF é obrigatório.") @Size(min = 11, message = "Deve conter apenas números") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "A data de nascimento é obrigatória.") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "A data de nascimento é obrigatória.") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotBlank(message = "E-mail é obrigatório.") @Email(message = "O e-mail deve ser um e-mail valido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigatório.") @Email(message = "O e-mail deve ser um e-mail valido.") String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", estadoCivil=" + estadoCivil +
                ", salario=" + salario +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
