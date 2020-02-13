/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author henrico
 */
public class Emprestimo {
    
    private int cod_emp;
    private int cod_cliente;
    private int cod_livro;
    private int cod_multa;
    private int estatus;
    private int qtd_livros_emp;
    private Date data_reserva;
    private Calendar data_retirada;
    private Date data_devolucao;
    private Date data_prevista;

    /**
     * @return the cod_cliente
     */
    public int getCod_cliente() {
        return cod_cliente;
    }

    /**
     * @param cod_cliente the cod_cliente to set
     */
    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    /**
     * @return the cod_livro
     */
    public int getCod_livro() {
        return cod_livro;
    }

    /**
     * @param cod_livro the cod_livro to set
     */
    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }

    /**
     * @return the cod_multa
     */
    public int getCod_multa() {
        return cod_multa;
    }

    /**
     * @param cod_multa the cod_multa to set
     */
    public void setCod_multa(int cod_multa) {
        this.cod_multa = cod_multa;
    }

    /**
     * @return the estatus
     */
    public int getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    /**
     * @return the qtd_livros_emp
     */
    public int getQtd_livros_emp() {
        return qtd_livros_emp;
    }

    /**
     * @param qtd_livros_emp the qtd_livros_emp to set
     */
    public void setQtd_livros_emp(int qtd_livros_emp) {
        this.qtd_livros_emp = qtd_livros_emp;
    }

    /**
     * @return the data_reserva
     */
    public Date getData_reserva() {
        return data_reserva;
    }

    /**
     * @param dt
     * @throws java.text.ParseException
     */
    public void setData_reserva(String dt) throws ParseException {
        java.util.Date data;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data = formato.parse(dt);
        this.data_reserva = converteData(data);
    }
    public Date converteData (java.util.Date data){
        java.sql.Date dataSql;
        dataSql = new java.sql.Date(data.getTime());
        return dataSql;
    }
    /**
     * @return the data_retirada
     */
    public Calendar getData_retirada() {
        return data_retirada;
    }

    /**
     * @param data_retirada the data_retirada to set
     */
    public void setData_retirada(Calendar data_retirada) {
        this.data_retirada = data_retirada;
    }

    /**
     * @return the data_devolucao
     */
    public Date getData_devolucao() {
        return data_devolucao;
    }

    /**
     * @param dt
     * @throws java.text.ParseException
     */
    public void setData_devolucao(String dt) throws ParseException {
        java.util.Date data;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data = formato.parse(dt);
        this.data_devolucao = converteData(data);
    }

    /**
     * @return the data_prevista
     */
    public Date getData_prevista() {
        return data_prevista;
    }

    /**
     * @param dt
     * @throws java.text.ParseException
     */
    public void setData_prevista(String dt) throws ParseException {
        java.util.Date data;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data = formato.parse(dt);
        this.data_prevista = converteData(data);
    }

    /**
     * @return the cod_emp
     */
    public int getCod_emp() {
        return cod_emp;
    }

    /**
     * @param cod_emp the cod_emp to set
     */
    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    
    
}
