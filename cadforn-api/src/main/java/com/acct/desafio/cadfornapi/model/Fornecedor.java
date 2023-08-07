package com.acct.desafio.cadfornapi.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoPessoa", discriminatorType = DiscriminatorType.INTEGER)
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String email;
    @NotNull
    private String cep;
    @ManyToOne
    private Empresa empresa;
}
