/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_modul10;

/**
 *
 * @author ASUS
 */
class data{
private String nim;
private String nama;
private String alamat;
private String notelp;
private String email;
 public data (String temp) //Constructor
    {nim = temp;}
    public String getNama() //Accessor
    {return nama;}
    public void setNama (String temp) //Mutator
    {nama = temp;}
    public String getAlamat()
    {return alamat;}
    public void setAlamat(String temp)
    {alamat = temp;}
    public String getNotelp()
    {return notelp;}
    public void setNotelp (String temp)
    {notelp = temp;}
    public String getEmail()
    {return email;}
    public void setEmail(String temp)
    {email = temp;}
    public void tampilkan()
    {
        System.out.println("Nis : "+nim); //dari constructor
        System.out.println("Nama : "+getNama()); 
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Nomor telp : "+getNotelp());
        System.out.println("Email : "+getEmail());
    }
}
