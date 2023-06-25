package com.mycompany.privatefit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO { 
    public boolean existe (Personal personal) throws Exception{ 
        String sql = "SELECT * FROM tb_personal WHERE email  = ? AND senha = ?"; 
        try (Connection conn = ConexaoBD.obterConexao(); 
        PreparedStatement ps = conn.prepareStatement(sql)){  
            ps.setString(1, personal.getEmail());
            ps.setString(2, personal.getSenha());
        try (ResultSet rs = ps.executeQuery()){ 
            return rs.next(); 
        } 
     } 
   }
    
    public void inserir(Treino treino) throws Exception{
        String sql = "INSERT INTO tb_treino (tipo_treino, exercicio, series, repeticoes) values(?,?,?,?)";
        try(Connection conn = ConexaoBD.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, treino.getTipoTreino());
            ps.setString(2, treino.getExercicio());
            ps.setInt(3, treino.getSeries());
            ps.setInt(4, treino.getRepeticoes());
            ps.execute();
        }   
        }
    
    public void atualizar(Treino treino) throws Exception {
        String sql = "UPDATE tb_treino SET tipo_treino = ?, exercicio = ?, series = ?, repeticoes = ? WHERE id = ?";
        try(Connection conn = ConexaoBD.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, treino.getTipoTreino());
            ps.setString(2, treino.getExercicio());
            ps.setInt(3, treino.getSeries());
            ps.setInt(4, treino.getRepeticoes());
            ps.setInt(5, treino.getId());
            ps.execute();
        }
        
        catch (Exception e) {
         System.out.println("Erro na consulta: "+e.getMessage());
    }
    }
    
    public void excluir(Treino treino) throws Exception {
        String sql = "DELETE FROM tb_treino WHERE id=?";
        try(Connection conn = ConexaoBD.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, treino.getId());
            ps.execute();
        }
    }
    
    public void cadastrar(Personal personal) throws Exception{
        String sql = "INSERT INTO tb_personal(cref, nome, email, senha, telefone) values(?,?,?,?,?)";
        try(Connection conn = ConexaoBD.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, personal.getCref());
            ps.setString(2, personal.getNome());
            ps.setString(3, personal.getEmail());
            ps.setString(4, personal.getSenha());
            ps.setString(5, personal.getTelefone());
            ps.execute();
        }   
        }
    
    public boolean buscarNome(Personal personal) throws Exception {
        String sql = "SELECT nome FROM tb_personal WHERE email  = ? AND senha = ?"; 
        try (Connection conn = ConexaoBD.obterConexao(); 
        PreparedStatement ps = conn.prepareStatement(sql)){  
            ps.setString(1, personal.getEmail());
            ps.setString(2, personal.getSenha());
            ps.setString(3, personal.getNome());
        try (ResultSet rs = ps.executeQuery()){ 
            return rs.next(); 
        } 
    }
    }
    }
  
    

