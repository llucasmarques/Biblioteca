/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.Date;

/**
 *
 * @author henrico
 */
public class viewDatas {
    private Date data_prev;
    private Date data_dev;
    private int cod_emp;
    /**
     * @return the data_prev
     */
    public Date getData_prev() {
        return data_prev;
    }

    /**
     * @param data_prev the data_prev to set
     */
    public void setData_prev(Date data_prev) {
        this.data_prev = data_prev;
    }

    /**
     * @return the data_dev
     */
    public Date getData_dev() {
        return data_dev;
    }

    /**
     * @param data_dev the data_dev to set
     */
    public void setData_dev(Date data_dev) {
        this.data_dev = data_dev;
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
