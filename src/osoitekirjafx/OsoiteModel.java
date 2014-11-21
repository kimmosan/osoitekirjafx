/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoitekirjafx;

import java.util.ArrayList;

/**
 *
 * @author Ohjelmistokehitys
 */
public class OsoiteModel {
    private ArrayList<OsoiteData> osoiteLista = new ArrayList();
    
    public void addToArray(OsoiteData d) {
        osoiteLista.add(d);
        System.out.println(osoiteLista.size());
    }
    
    public OsoiteData getItem(int index) {
        return osoiteLista.get(index);
    }
    
    public int numberOfItems() {
        return osoiteLista.size();
    }
}
