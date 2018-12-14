/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jovani.mercaria.sessao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author aluno
 */
@Entity
public class cliente {
    
    @Id
    @GeneratedValue
    @Column(name="cd_cliente")
    private int cd_cliente;
    private String nm_nome;
    private String dt_nascimento;
    private String nr_telefone;
    private String nr_cpf;
    private String nr_rg;
    private String ds_senha;
    private String ds_email;
    private String endereco;

    /**
     * @return the cd_cliente
     */
    public int getCd_cliente() {
        return cd_cliente;
    }

    /**
     * @param cd_cliente the cd_cliente to set
     */
    public void setCd_cliente(int cd_cliente) {
        this.cd_cliente = cd_cliente;
    }

    /**
     * @return the nm_nome
     */
    public String getNm_nome() {
        return nm_nome;
    }

    /**
     * @param nm_nome the nm_nome to set
     */
    public void setNm_nome(String nm_nome) {
        this.nm_nome = nm_nome;
    }

    /**
     * @return the dt_nascimento
     */
    public String getDt_nascimento() {
        return dt_nascimento;
    }

    /**
     * @param dt_nascimento the dt_nascimento to set
     */
    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    /**
     * @return the nr_telefone
     */
    public String getNr_telefone() {
        return nr_telefone;
    }

    /**
     * @param nr_telefone the nr_telefone to set
     */
    public void setNr_telefone(String nr_telefone) {
        this.nr_telefone = nr_telefone;
    }

    /**
     * @return the nr_cpf
     */
    public String getNr_cpf() {
        return nr_cpf;
    }

    /**
     * @param nr_cpf the nr_cpf to set
     */
    public void setNr_cpf(String nr_cpf) {
        this.nr_cpf = nr_cpf;
    }

    /**
     * @return the nr_rg
     */
    public String getNr_rg() {
        return nr_rg;
    }

    /**
     * @param nr_rg the nr_rg to set
     */
    public void setNr_rg(String nr_rg) {
        this.nr_rg = nr_rg;
    }

    /**
     * @return the ds_senha
     */
    public String getDs_senha() {
        return ds_senha;
    }

    /**
     * @param ds_senha the ds_senha to set
     */
    public void setDs_senha(String ds_senha) {
        this.ds_senha = ds_senha;
    }

    /**
     * @return the ds_email
     */
    public String getDs_email() {
        return ds_email;
    }

    /**
     * @param ds_email the ds_email to set
     */
    public void setDs_email(String ds_email) {
        this.ds_email = ds_email;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    
    
    
    
}
