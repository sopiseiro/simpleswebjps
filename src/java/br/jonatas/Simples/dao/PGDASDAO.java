/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jonatas.Simples.dao;

import br.jonatas.Simples.Bean.PGDAS;
import java.util.List;
/**
 *
 * @author issqn
 */
public interface PGDASDAO {
    public void inserir(PGDAS pgdas);
    public void remover(int id);
    public List<PGDAS> listar();
    public PGDAS buscar(int id);
    public void editar(PGDAS pgdas);
}
