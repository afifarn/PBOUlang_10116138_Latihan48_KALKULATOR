/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan48_kalkulator;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Program Kalkulator 
 */
public class PBOUlang_10116138_Latihan48_KALKULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator klt = new Kalkulator();
        
        System.err.println("value1 = 7.0 ");
        klt.setValue1(7.0);
        System.out.println("value2 = 5.0");
        klt.setValue2(5.0);
        System.out.println("");
        klt.setNamaProject();
        System.out.println("");
        klt.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result add is = " + klt.add(7.0, 5.0));
        System.out.println("Result minus is = " + klt.minus(7.0, 5.0));
        System.out.println("Result multiple is = " + klt.minus(7.0, 5.0));
        System.out.println("Result division id = " + klt.division(7.0,5.0));

    }
    
}
