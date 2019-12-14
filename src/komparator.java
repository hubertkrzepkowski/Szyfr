
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HK
 */
public class komparator implements Comparator<element>{
    
    
     @Override
    public int compare(element t, element t1) {
       int znakp=t.getznak()-t1.getznak();
       return znakp;
    }
    
}
