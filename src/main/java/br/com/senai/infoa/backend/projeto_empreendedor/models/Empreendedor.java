package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name="empreendedor")
public class Empreendedor {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="cpf")
    private String cpf;

    @Column(name="nome")
    private String nome;

    @Column(name="data_nascimento")
    private LocalDate dataNascimento;

    @ManyToMany 
    @JoinTable(
        name="empreendedor_pessoa",
        joinColumns = @JoinColumn(name="empreendedor_id", referencedColumnName="id"),
        inverseJoinColumns=@JoinColumn(name="produto_id", referencedColumnName="id")
    )
    private List<Produto> produto;

    public Empreendedor() {                    
    }

    public Empreendedor(Integer id, String nome, String cpf, Endereco endereco, LocalDate dataNascimento, List<Produto> produto) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.produto = produto;
        this.dataNascimento = dataNascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    
}
 