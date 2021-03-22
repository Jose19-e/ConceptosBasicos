 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.java;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author jose_
 */
public class ConceptosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho= new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("sedán");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        Automovil miNSX = new Automovil();
        miNSX.setMarca("Acura");
        miNSX.setSubMarca("Coupe");
        miNSX.setModelo(2013);
        miNSX.setColor(Color.DARK_GRAY);
        System.out.println(miNSX);
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Coupe");
        miMustang.setModelo(2004);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
        
      
        // Programar los objetos mi acura y mustang 
    }
    
}
