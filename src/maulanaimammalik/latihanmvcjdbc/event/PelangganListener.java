/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maulanaimammalik.latihanmvcjdbc.event;

import maulanaimammalik.latihanmvcjdbc.entity.Pelanggan;
import maulanaimammalik.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author MaulanaImamMalik
 * Nama     : Maulana Imam Malik
 * NIM      : 10119010
 * Kelas    : IF-1
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
