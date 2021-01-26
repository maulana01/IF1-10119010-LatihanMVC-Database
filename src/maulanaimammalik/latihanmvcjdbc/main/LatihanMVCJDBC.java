/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maulanaimammalik.latihanmvcjdbc.main;

import maulanaimammalik.latihanmvcjdbc.database.KingsBarbershopDatabase;
import java.sql.SQLException;
import java.util.List;
import maulanaimammalik.latihanmvcjdbc.entity.Pelanggan;
import maulanaimammalik.latihanmvcjdbc.error.PelangganException;
import maulanaimammalik.latihanmvcjdbc.service.PelangganDao;
import javax.swing.SwingUtilities;
import maulanaimammalik.latihanmvcjdbc.view.MainViewPelanggan;
import java.util.logging.Logger;

/**
 *
 * @author MaulanaImamMalik
 * Nama     : Maulana Imam Malik
 * NIM      : 10119010
 * Kelas    : IF-1
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
//                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
}