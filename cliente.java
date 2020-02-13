/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author henrico
 */
public class cliente {
    private int ID_cliente;
    private String nome;
    private String sexo;
    private Date data_nsc;
    private String email;
    private String telefone;
    private int s_livro;
    private int s_debito;
    private String cpf;
    private String endereco;
    private Double debito;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the data_nsc
     */
    public Date getData_nsc() {
        return data_nsc;
    }

    /**
     * @param dt
     * @throws java.text.ParseException
     */
    public void setData_nsc(String dt) throws ParseException {
        java.util.Date data;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data = formato.parse(dt);
        
        this.data_nsc = converteData(data);
    }
    public Date converteData (java.util.Date data){
        java.sql.Date dataSql;
        dataSql = new java.sql.Date(data.getTime());
        return dataSql;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the s_livro
     */
    public int getS_livro() {
        return s_livro;
    }

    /**
     * @param s_livro the s_livro to set
     */
    public void setS_livro(int s_livro) {
        this.s_livro = s_livro;
    }

    /**
     * @return the s_debito
     */
    public int getS_debito() {
        return s_debito;
    }

    /**
     * @param s_debito the s_debito to set
     */
    public void setS_debito(int s_debito) {
        this.s_debito = s_debito;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    /**
     * @return the debito
     */
    public Double getDebito() {
        return debito;
    }

    /**
     * @param debito the debito to set
     */
    public void setDebito(Double debito) {
        this.debito = debito;
    }

    /**
     * @return the ID_cliente
     */
    public int getID_cliente() {
        return ID_cliente;
    }

    /**
     * @param ID_cliente the ID_cliente to set
     */
    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }
    
    public void print(){
        System.out.println(getID_cliente());
        System.out.println(getNome());
        System.out.println(getData_nsc());
        System.out.println(getCpf());
    }
}
