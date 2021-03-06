/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;

/**
 *
 * @author Ryan
 */
public class Sel {

    private int posisiX;
    private int posisiY;
    private int lebar;
    private int tinggi;  
    private int jarak = 30;
    private char nilai; 
    private Image image;
   

    public Sel(int x, int y) {
        this.posisiX = x;
        this.posisiY = y;
    }

    public int getPosisiX() {
        return posisiX;
    }

    public void setPosisiX(int posisiX) {
        this.posisiX = posisiX;
    }

    public int getPosisiY() {
        return posisiY;
    }

    public void setPosisiY(int posisiY) {
        this.posisiY = posisiY;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int Jarak) {
        this.jarak = jarak;
    }

    public char getNilai() {
        return nilai;
    }

    public void setNilai(char nilai) {
        this.nilai = nilai;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean PosisiKiriObjek(Sel Objek) {
        if (((this.getLebar() - jarak) == Objek.getLebar()) && (this.getTinggi() == Objek.getTinggi())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PosisiKananObjek(Sel Objek) {
        if (((this.getLebar() + jarak) == Objek.getLebar()) && (this.getTinggi() == Objek.getTinggi())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PosisiAtasObjek(Sel Objek) {
        if (((this.getTinggi() - jarak) == Objek.getTinggi()) && (this.getLebar() == Objek.getLebar())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PosisiBawahObjek(Sel Objek) {
        if (((this.getTinggi() + jarak) == Objek.getTinggi()) && (this.getLebar() == Objek.getLebar())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.getNilai());
    }
}
