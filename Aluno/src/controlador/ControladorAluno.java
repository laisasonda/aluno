/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoAluno;
import javax.swing.JOptionPane;
import Modelo.Aluno;
import tela.manutencao.ManutencaoAluno;
/**
 *
 * @author Administrador
 */
public class ControladorAluno {
    public static void alterar(ManutencaoAluno man){
        Aluno objeto = new Aluno();

        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setCodigo(man.jtfCodigo.getText());
        objeto.setNome(man.jtfNome.getText());
        objeto.setEndereco(man.jtfEndereco.getText());
  
        
        
        boolean resultado = DaoAluno.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(ManutencaoAluno aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void inserir(ManutencaoAluno aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



    
   
    

