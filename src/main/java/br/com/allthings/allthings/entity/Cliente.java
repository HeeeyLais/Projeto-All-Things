package br.com.allthings.allthings.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer idCLiente;

    @Column(nullable = false, length = 40)
    private String nomeCliente;

    @Column(nullable = false, length = 40)
    private String endereçoCliente;

    @Column(nullable = false, length = 40)
    private String cidadeCliente;

    @Column(nullable = false, length = 2)
    private String estadoCLiente;

    @Column(nullable = false, length = 20)
    private String cepCLiente;

    @Column(nullable = false, length = 2)
    private String cpfCLiente;

    @Column(nullable = false, length = 20)
    private String rgCLiente;

}