/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ryan
 */

    public class Player extends Sel {

    private int lebar;
    private int tinggi;
    private char nilai;

    public Player(int x, int y, int lebar, int tinggi, char nilai) {
        super(x, y);
        
        
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.setNilai(nilai);
    }

    public void Gerak(int x, int y) {
        int nx = this.getLebar() + x;
        int ny = this.getTinggi() + y;
        this.setLebar(nx);
        this.setTinggi(ny);
    }

   
}

