/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import conectBD.biblioteca.ClienteConfig;
import conectBD.biblioteca.EmprestimoConfig;
import conectBD.biblioteca.MultaConfig;
import conectBD.biblioteca.conect;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;




/**
 *
 * @author henrico
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws SQLException, ParseException {
        // TODO code application logic here
        /*setarValores aux = new setarValores();
        ClienteConfig c = new ClienteConfig();
        cliente cliente = new cliente();
        List<cliente> lista = new ArrayList<cliente>();
       
        /*Esses metodos sets vao inserir nas respectivas tabelas os valores concebidos*/
        
        //aux.setarLivro();
        //aux.setClientes();
        //aux.setarMulta("15/03/2017", 105.00);
        //aux.setarEmpresa();//adicionar valores a ser inseridos na tabela
        //aux.setCod_multa(5, 7);//(cod_multa,cod_emp)faz a relacao multa com emprestimo sempre que necessario
        
        
        ClienteConfig c = new ClienteConfig();
        cliente cliente = new cliente();
        /*cliente.setData_nsc("05/01/1997");
        Date dt = cliente.getData_nsc();
        System.out.println(dt);
        cliente.setData_nsc("03/01/1997");
        Date dt2 = cliente.getData_nsc();
        System.out.println(dt2);
        System.out.println(dt.compareTo(dt2));*/
        //c.setDouble(1, 15.00);
        
        /*System.out.println(dt);
        System.out.println(dt.getYear());
        System.out.println(dt.getMonth());
        System.out.println(dt.getDay());*/
        
       /*multa m = new multa();
        MultaConfig mc = new MultaConfig();
        List<multa> list = new ArrayList<multa>();
        list = mc.getDados();
        
        for(multa mt:list){
            System.out.println(mt.getCod_multa());
        }*/
       
       EmprestimoConfig ec = new EmprestimoConfig();
       //ec.addDate(1);
       //c.setDouble(1, 0.00);
       //ec.Lancar_multa(1,1);
     java.sql.Date d =  new java.sql.Date(Calendar.getInstance().getTimeInMillis());
        System.out.println(d);
     List<Emprestimo> lista = new ArrayList<>();
     lista = ec.id_removeReserva();
        for(Emprestimo e: lista){
            System.out.println(e.getCod_emp());
        }
       
    }
    
}
