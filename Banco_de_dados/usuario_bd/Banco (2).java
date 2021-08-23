/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acessobd;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author SESI_SENAI
 */
public class Banco {
    private static Connection connection;
   
    public static Connection getConnection(){
        if(connection == null){
            try{
                //Class.forName("com.mysql.jdbc.Driver"); //para mysql
                Class.forName("org.postgresql.Driver");//para postgresql
                String host = "localhost";
                String port = "5432";
                String database = "postgres";
                String user = "postgres";
                String pass = "senai";//digitar a senha do seu banco
                //String url = "jdbc:mysql://"+host+":"+port+"/"+database; //para mysql
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;//para postgresql
                connection = DriverManager.getConnection(url, user, pass);                
               
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexão aberta!");
        }
        else{
            try{
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
 
    public static void salvar (Livro livro){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO livro (Qtdestoque, Editora, Assunto, Autor, isbn) values(?, ?, ?, ?, ?)");
            ps.setInt(1, livro.getQtdestoque());
            ps.setString(2, livro.getEditora());
            ps.setString(3, livro.getAssunto());
            ps.setString(4, livro.getAutor());
            ps.setString(5, livro.getIsbn());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void salvar (Cliente cliente){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO cliente (id, endereco,telefone,cpf) values(?, ?, ? ,?)");
            ps.setInt(1, cliente.getId());
            ps.setString(2, cliente.getEndereço());
            ps.setInt(3, cliente.getTelefone());
            ps.setString(4, cliente.getCpf());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deleta(int id){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM usuario WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();


            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void atualizaBanco(Livro livro){
        deleta(livro.getQtdestoque());
        salvar(livro);
    }
    
     public static void visualiza_tabela(String tabela, String... atributo){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM "+ tabela);
            ResultSet rs = ps.executeQuery();
            
            String s = "";
            while(rs.next()){
                for(String i : atributo){
                    s = s + " | " +rs.getString(i);
                }
                s = s + "\n";
            }
            System.out.println(s);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static void cria_tabela (String tabela, String... atributo){
        try{
            Connection con = Banco.getConnection();
            String comando = "CREATE TABLE " + tabela + " (";
            
            for (String i : atributo){
                comando = comando + i + ",";
            }
            comando = comando.substring(0, comando.length()-1);
            comando = comando + ");";
            
            System.out.println(comando);
            
            PreparedStatement ps = con.prepareStatement(comando);
            ps.execute();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
