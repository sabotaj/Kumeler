/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumeimp;

import java.util.ArrayList;

/**
 *
 * @author mehmetd
 */
public class Kumeimp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Kume km=new Kume();
km.ekle(10);
km.ekle(11);			
km.ekle(2);
System.out.print("km={");
km.yazdir();
System.out.println("}");
int[]a={1,2,3,4,5,6};
Kume km2=new Kume(a);
System.out.print("km2={");
km2.yazdir();
System.out.println("}");
Kume km3=new Kume(a);
System.out.print("km3 ={");
km3.yazdir();
System.out.println("}");

if (km.denk(km2))
System.out.println("km ve km2 kumeleri denk.");
else
System.out.println("km ve km2 kumeleri denk degil.");

if(km2.esit(km3))
System.out.println("km2 ve km3 kumeleri	esit.");
else
System.out.println("km2	ve km3	kumeleri esit degil.");

Kume sn	=km.birlesim(km2);
System.out.print("km ve km2 birlesimi={");
sn.yazdir();
System.out.println("}");
Kume sn2= km.kesisim(km2);
System.out.print("km ve km2 kesisimi = {");
sn2.yazdir();
System.out.println("}");
Kume sn3= km.fark(km2);
System.out.print("km ve km2 farki = [");
sn3.yazdir();
System.out.println("}");
System.out.println("km\'nin alt kumeleri");
ArrayList<Kume>	sonuc=km.altKumeler();
for(int	i=0;i<sonuc.size();i++){
System.out.print("{");
sonuc.get(i).yazdir();
System.out.println("}");
}           
}  
}
