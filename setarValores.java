/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import conectBD.biblioteca.ClienteConfig;
import conectBD.biblioteca.EmprestimoConfig;
import conectBD.biblioteca.LivroConfig;
import conectBD.biblioteca.MultaConfig;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author henrico
 */
public class setarValores {
    private String nome;
    private String Email;
    private String Data1;
    private String Data2_end;
    private String Data3_S;
    private String cpf; 
    private String Tel;
    private String Data_reserva;
    private String Data_devolucao;
    private String Data_prevista;
    private int qtd;
    private int st;
    private int id;
    private int id_livro;
    //atribui os valores a ser inserido na tabela cliente
    public void setClientes() throws ParseException, SQLException{
        cliente C = new cliente();
        ClienteConfig cli = new ClienteConfig();
        C.setCpf(this.getCpf());
        C.setData_nsc(this.getData1());
        C.setEmail(this.getEmail());
        C.setEndereco(this.getData2_end());
        C.setNome(this.getNome());
       // C.setS_debito(0);
       // C.setS_livro(0);
        C.setSexo(this.getData3_S());
        C.setTelefone(this.getTel());
        C.setDebito(0.00);
        this.setData1(null);
        this.setData2_end(null);
        this.setData3_S(null);
        cli.adiciona(C);
        
        
    }
    //atribui os valores a ser inserido na tabela empresa
    public void setarEmpresa() throws ParseException, SQLException{
        Emprestimo E = new Emprestimo();
        EmprestimoConfig Emp = new EmprestimoConfig();
        E.setCod_cliente(this.getId());
        E.setCod_livro(this.getId_livro());
        //E.setData_devolucao(this.getData_devolucao());
        E.setData_prevista(this.getData_prevista());
        //E.setData_reserva(this.getData_reserva());
        E.setData_retirada(null);
        E.setEstatus(this.getSt());
        E.setQtd_livros_emp(this.getQtd());
        
        Emp.adiciona(E);//adiciona na tabela
    }
    //atribuir o codido de multa assim que ela for gerada
    public void setCod_multa(int cod_multa,int id_emp) throws SQLException{
        EmprestimoConfig Emp = new EmprestimoConfig();
        Emp.adicionaCodMulta(cod_multa,id_emp);//adiciona o codigo da multa assim que for gerado
    }
    //atribuir valores a ser inserido na tabela livro
    public void setarLivro() throws SQLException{
        LivroConfig con = new LivroConfig();
        livro L = new livro();
        L.setTitulo(this.getNome());
        L.setQtd(this.getQtd());
        L.setIdioma(this.getData1());
        L.setEditora(this.getData2_end());
        L.setEscritor(this.getData3_S());
        L.setGenero(this.getEmail());
        con.adiciona(L);
    }
    //atribuir valor e a data da multa 
    public void setarMulta(int id, String dt,double valor) throws ParseException, SQLException{
        MultaConfig multa = new MultaConfig();
        multa M = new multa();
        M.setCod_multa(id);
        M.setData_multa(dt);
        M.setValor_multa(valor);
        multa.adiciona(M);
    }
        /*atribui debito ao cliente
    public void setDebito_cliente(Double deb,int ID) throws SQLException{
        cliente C = new cliente();
        ClienteConfig cli = new ClienteConfig();
        C.setDebito(deb);
        C.setID_cliente(ID);
        cli.adicionaDebito(C);//metodo para adicionar o debito quando necessario
    }*/

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
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Data1
     */
    public String getData1() {
        return Data1;
    }

    /**
     * @param Data1 the Data1 to set
     */
    public void setData1(String Data1) {
        this.Data1 = Data1;
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
     * @return the Data2_end
     */
    public String getData2_end() {
        return Data2_end;
    }

    /**
     * @param Data2_end the Data2_end to set
     */
    public void setData2_end(String Data2_end) {
        this.Data2_end = Data2_end;
    }

    /**
     * @return the Data3_S
     */
    public String getData3_S() {
        return Data3_S;
    }

    /**
     * @param Data3_S the Data3_S to set
     */
    public void setData3_S(String Data3_S) {
        this.Data3_S = Data3_S;
    }

    /**
     * @return the Tel
     */
    public String getTel() {
        return Tel;
    }

    /**
     * @param Tel the Tel to set
     */
    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the st
     */
    public int getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(int st) {
        this.st = st;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the id_livro
     */
    public int getId_livro() {
        return id_livro;
    }

    /**
     * @param id_livro the id_livro to set
     */
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    /**
     * @return the Data_reserva
     */
    public String getData_reserva() {
        return Data_reserva;
    }

    /**
     * @param Data_reserva the Data_reserva to set
     */
    public void setData_reserva(String Data_reserva) {
        this.Data_reserva = Data_reserva;
    }

    /**
     * @return the Data_devolucao
     */
    public String getData_devolucao() {
        return Data_devolucao;
    }

    /**
     * @param Data_devolucao the Data_devolucao to set
     */
    public void setData_devolucao(String Data_devolucao) {
        this.Data_devolucao = Data_devolucao;
    }

    /**
     * @return the Data_prevista
     */
    public String getData_prevista() {
        return Data_prevista;
    }

    /**
     * @param Data_prevista the Data_prevista to set
     */
    public void setData_prevista(String Data_prevista) {
        this.Data_prevista = Data_prevista;
    }
    public void upClientes(int ID_up) throws ParseException, SQLException{
        cliente C = new cliente();
        ClienteConfig cli = new ClienteConfig();
        C.setCpf(this.getCpf());
        C.setData_nsc(this.getData1());
        C.setEmail(this.getEmail());
        C.setEndereco(this.getData2_end());
        C.setNome(this.getNome());
        C.setS_debito(0);
        C.setS_livro(0);
        C.setSexo(this.getData3_S());
        C.setTelefone(this.getTel());
        C.setDebito(0.0);
        
        cli.alteraDados(C, ID_up);
        
    }
}
