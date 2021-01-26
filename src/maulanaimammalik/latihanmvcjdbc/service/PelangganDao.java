/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maulanaimammalik.latihanmvcjdbc.service;

import java.util.List;
import maulanaimammalik.latihanmvcjdbc.entity.Pelanggan;
import maulanaimammalik.latihanmvcjdbc.error.PelangganException;

/**
 *
 * @author MaulanaImamMalik
 * Nama     : Maulana Imam Malik
 * NIM      : 10119010
 * Kelas    : IF-1
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
