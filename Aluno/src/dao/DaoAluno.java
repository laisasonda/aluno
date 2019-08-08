/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Administrador
 */
public class DaoAluno {
    public static boolean alterar(Aluno objeto) {
        String sql = "UPDATE produto SET codigo = ?, nome = ? WHERE endereco=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getCodigo()); 
            ps.setString(2, objeto.getNome());
            ps.setInt(3, objeto.getEndereco());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     public static boolean excluir(Aluno objeto) {
        String sql = "DELETE FROM aluno WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getNome());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     
    
}
