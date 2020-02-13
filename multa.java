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
public class multa extends cliente{
    private double valor_multa;
    private Date data_multa;
    private int cod_multa;

    /**
     * @return the valor_multa
     */
    public double getValor_multa() {
        return valor_multa;
    }

    /**
     * @param valor_multa the valor_multa to set
     */
    public void setValor_multa(double valor_multa) {
        this.valor_multa = valor_multa;
    }

    /**
     * @return the data_multa
     */
    public Date getData_multa() {
        return data_multa;
    }

    /**
     * @param dt
     * @throws java.text.ParseException
     */
    public void setData_multa(String dt) throws ParseException {
        java.util.Date data;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data = formato.parse(dt);
        this.data_multa = super.converteData(data);
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
}
