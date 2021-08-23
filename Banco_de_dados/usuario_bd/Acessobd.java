/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acessobd;

/**
 *
 * @author SESI_SENAI
 */
public class Acessobd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Livro l = new Livro();
    

        /*l.setIsbn("978–85–333 –0227");
        l.setAutor("Machado de Assis");
        l.setEditora("Saraiva");
        l.setAssunto("romance");
        l.setQtdestoque(4);
        Banco.salvar(l);
      
        l.setIsbn("323–22–424–1233");
        l.setAutor("Arthur conan doyle");
        l.setEditora("FTD");
        l.setAssunto("policial");
        l.setQtdestoque(7);
        Banco.salvar(l);*/
      
      
        Banco.visualiza_tabela("Cliente","cpf","id","telefone","endereco");
        Banco.visualiza_tabela("livro","isbn","autor","editora","assunto","qtdestoque");
}}
