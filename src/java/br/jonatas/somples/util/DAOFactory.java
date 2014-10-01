/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jonatas.somples.util;

import JDBCPGDAS.JDBCPGDASDAO;
import br.jonatas.Simples.dao.PGDASDAO;

/**
 *
 * @author issqn
 */
public class DAOFactory {
    public static PGDASDAO createPGDASDAO(){
        return new JDBCPGDASDAO();
    }
}
