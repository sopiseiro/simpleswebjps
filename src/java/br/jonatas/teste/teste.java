/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jonatas.teste;

import br.jonatas.Simples.Bean.PGDAS;
import br.jonatas.Simples.dao.PGDASDAO;
import br.jonatas.somples.util.ConnectionFactory;
import br.jonatas.somples.util.DAOFactory;

/**
 *
 * @author issqn
 */
public class teste {
    public static void main(String[] args) {
        ConnectionFactory.getConnection();
        PGDAS pgdas = new PGDAS();
        pgdas.setPa("201510");
        pgdas.setRazao("TESTE 123 web");
        pgdas.setCnpj("00000000000000");
        pgdas.setValorpa(new Float(3.98));
        pgdas.setValdecsemretencao(new Float(3.98));
        pgdas.setValdeccomretencao(new Float(3.98));
        pgdas.setAliquota(new Float(3.98));
        pgdas.setOperacao("Z");
        pgdas.setData("20150000");
        
        PGDASDAO pgds = DAOFactory.createPGDASDAO();
        pgds.inserir(pgdas);
        
    }
}
