/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumeimp;
import java.util.*;

/**
 *
 * @author mehmetd
 */
public class Kume {
    private ArrayList<Integer> elemanlar;
    
    
public Kume(){//parametresiz constructor
elemanlar=new ArrayList<Integer>();
}

public Kume(int[] a){//a dizisinin elemanlarindan olusan kume
elemanlar = new ArrayList<Integer>();
    for (int i = 0; i < a.length; i++) {
        elemanlar.add(a[i]);       
    }
}
public	Kume(Kume a){//copy constructor
this.elemanlar=new ArrayList<Integer>(a.elemanlar);
}
public	void ekle(int a){//kumeye yeni eleman ekleme
elemanlar.add(a);
}

public void yazdir(){ //kume icerigini yazdirir
    if(elemanlar.size() > 0){
            for (int i = 0; i < elemanlar.size() - 1; i++) 
            System.out.print(elemanlar.get(i) + ",");
            System.out.print(elemanlar.get(elemanlar.size() - 1));
        }
   
}

public boolean denk(Kume a){//cagrici obje ile parametre objenin denk kume olup olmadigini test eder
 return (this.elemanlar.size() == a.elemanlar.size());   
}

public boolean esit(Kume a){ ////cagrici obje ile parametre objenin esit kume olup olmadigini test eder
 if(this.denk(a)){
            Collections.sort(this.elemanlar);
            Collections.sort(a.elemanlar);
            for (int i = 0; i < this.elemanlar.size(); i++) 
            if(this.elemanlar.get(i)!= a.elemanlar.get(i))
                return false;
            return true;
        }
        return false;    
}

public Kume birlesim(Kume a){ //cagrici obje ile parametre objenin bilesiminden olusan kumeyi dondurur
Kume sonuc = new Kume();
        for (int i = 0; i < this.elemanlar.size(); i++)
            sonuc.elemanlar.add(this.elemanlar.get(i));
        
        for (int i = 0; i < a.elemanlar.size(); i++)//varolan elemanları eklemiyoruz
            if(sonuc.elemanlar.indexOf(a.elemanlar.get(i)) == -1)
                    sonuc.ekle(a.elemanlar.get(i));
        return sonuc;    
}
  public Kume kesisim(Kume a){
        Kume sonuc = new Kume();
        for (int i = 0; i < a.elemanlar.size(); i++)//varolan elemanları eklemiyoruz
            if(this.elemanlar.indexOf(a.elemanlar.get(i)) != -1)
                    sonuc.ekle(a.elemanlar.get(i));
        return sonuc;
    }
    
    public Kume fark(Kume a){
        Kume sonuc = new Kume();
        for (int i = 0; i < a.elemanlar.size(); i++)//varolan elemanları eklemiyoruz
            if(this.elemanlar.indexOf(a.elemanlar.get(i)) == -1)
                    sonuc.ekle(a.elemanlar.get(i));
        return sonuc;
    }
        
    public ArrayList<Kume> altKumeler(){
        ArrayList<Kume> sonuc = new ArrayList<Kume>();
        /*int i = 0;
        int toplamElemanSayisi = (int)Math.pow(2, elemanlar.size());
        //System.out.println("ToplamElemanSayisi:" + toplamElemanSayisi);
        while(i < toplamElemanSayisi){
           while(j > i){
               
           }
        }
        for (int i = 0; i < elemanlar.size(); i++) {
                System.out.println(elemanlar.get(i));
        }*/
       
        return sonuc;
    }  
}
