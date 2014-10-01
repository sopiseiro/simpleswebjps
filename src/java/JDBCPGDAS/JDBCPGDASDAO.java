/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCPGDAS;

import br.jonatas.Simples.Bean.PGDAS;
import br.jonatas.Simples.dao.PGDASDAO;
import br.jonatas.somples.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author issqn
 */
public class JDBCPGDASDAO implements PGDASDAO{

    Connection connection;
    
    public JDBCPGDASDAO() {
        connection = ConnectionFactory.getConnection();
    }

    
    @Override
    public void inserir(PGDAS pgdas) {
        try {
            String SQL = "INSERT INTO pgdas (pa, razao, cnpj, valorpa, valdecsemretencao, "
                    + "valdeccomretencao, valorrecoiss, aliquota, data, operacao) values"
                    + "(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, pgdas.getPa());
            ps.setString(2, pgdas.getRazao());
            ps.setString(3, pgdas.getCnpj());
            ps.setFloat(4, pgdas.getValorpa());
            ps.setFloat(5, pgdas.getValdecsemretencao());
            ps.setFloat(6, pgdas.getValdeccomretencao());
            ps.setFloat(7, pgdas.getValorrecoiss());
            ps.setFloat(8, pgdas.getAliquota());
            ps.setString(9, pgdas.getData());
            ps.setString(10, pgdas.getOperacao());
            
            ps.executeUpdate();
            ps.close();
            //connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPGDASDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PGDAS> listar() {
        List<PGDAS> pg = new ArrayList<PGDAS>();
        try {
            String SQL = "SELECT * FROM pgdas";
            PreparedStatement ps  = connection.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                PGDAS pgd = new PGDAS();
                pgd.setId(rs.getInt("id"));
                pgd.setPa(rs.getString("pa"));
                pgd.setRazao(rs.getString("razao"));
                pgd.setCnpj(rs.getString("cnpj"));
                pgd.setValorpa(rs.getFloat("valorpa"));
                pgd.setValdecsemretencao(rs.getFloat("valdecsemretencao"));
                pgd.setValdeccomretencao(rs.getFloat("valdeccomretencao"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPGDASDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PGDAS buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(PGDAS pgdas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
