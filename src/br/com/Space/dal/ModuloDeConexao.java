
package br.com.Space.dal;

import java.sql.Connection;
import java.sql.DriverManager;


public class ModuloDeConexao {
        //vou criar um metodo resposavel por estabelecer conexao
    //eu crio uma variavel conexao atraves do firework Connection
    //conexao é uma variavel e conector ´um metodo.
    public static Connection conector(){
        java.sql.Connection conexao=null;
        //vou chamar o drive 
        String driver ="com.mysql.jdbc.Driver";
        //criar variaveis para armazenar informaçoes referente ao banco
        String url="jdbc:mysql://localhost:3306/spacepizza";
        String user="root";
        String passeword="";
         //estabelecendo conexao com o banco 
         try {
             //basicamente a ideia aq é tratar excessoes, no caso o try é se der tudo certo
             //vai executar o arquivo do drive
             Class.forName(driver);
             conexao=DriverManager.getConnection(url, user, passeword);
             return conexao;
            //conexao é a variavel que criei la em cima 
             //se der tudo certo obtenha conexao e armazene na variavel conexao.
             
             
        } catch (Exception e) {
            //caso ocorra um erro 
             //System.out.println(e); seve de apoio para mostra o erro 
             
            return null;
        }
        
        
    }
    
}

