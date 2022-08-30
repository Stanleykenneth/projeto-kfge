/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.kfge.dal;
import java.sql.*;

/**
 *
 * @author kstan
 */
public class ModuloConexao {
    //Método responsáveç por estabelecer a conexão com banco de dados
    public static Connection conector(){
        Connection conexao = null;
        //chamando o drive de conexao
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informações referente ao banco.
        String url = "jdbc:mysql://localhost:3308/kfge";
        String user = "root";
        String password = "1234";
        //estabelecendo a conexão com banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {            
            //System.out.println(e);
            return null;
        }
    }
}
