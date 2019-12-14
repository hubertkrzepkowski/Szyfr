
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HK
 */
public class element  {
     private char znak;
     private List<Character> tab;
    private List<Character> tabs;
    
    
    public element(char z){
        
    
        znak=z;
        tab = new ArrayList<>();
        tabs=new ArrayList<Character>();
        for(int i=0;i<25;i++){
            
        tab.add('Z');
        }
    
    
    }
    
   public char[] gettab(){
char[] tablica = new char[tab.size()];
//System.out.print(tab.size());
for(int i = 0; i < tab.size(); i++) tablica[i] = tab.get(i);
   return tablica;
   } 
   public List<Character> gettabs(){
    return tabs;
   }
   
   public char getznak(){
   return znak;
   }
   
   public void settabs(int i,char a){
     //  System.out.print("size"+tabs.size());
       tabs.add(i,a);
       
   }
   
    public void setall(List<Character> l){
     //  System.out.print("size"+tabs.size());
      this.tabs =l;
       
   }
    public void addtabs(char a){
     //  System.out.print("size"+tabs.size());
       tabs.add(a);
       
   }
   public void settab(int i,char a){
   
       tab.set(i,a);
  }
  public void setznak(char z){
  znak=z;
  
  }

   
}
