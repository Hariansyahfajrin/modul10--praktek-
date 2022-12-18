/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10;

/**
 *
 * @author ASUS
 */
public class StudentRecordExample 
{ 
public static void main( String[] args ){ 
//membuat 3 object StudentRecord 
StudentRecord annaRecord = new StudentRecord(); 
StudentRecord AliRecord = new StudentRecord("ali","Padang"); 

//Memberi nama siswa 
annaRecord.setName("Anna"); 
annaRecord.setAddress("Padang"); 
annaRecord.setAge(25); 
annaRecord.setMathGrade(70); 
annaRecord.setEnglishGrade(80);
annaRecord.setScienceGrade(80);
//Menampilkan nama siswa “Anna” 
System.out.println(" Nama :"+annaRecord.getName() ); 
System.out.println(" Umur :"+annaRecord.getAge () ); 
System.out.println(" Matematika :"+annaRecord.getMathGrade() ); 
System.out.println(" B.inggris :"+annaRecord.getEnglishGrade() ); 
System.out.println(" Ipa :"+annaRecord.getScienceGrade() ); 

//Ali
AliRecord.print("");
AliRecord.print(90,80,70);
//Menampilkan jumlah siswa 
System.out.println("Count="+StudentRecord.getStudentCount()
); 
} 
}