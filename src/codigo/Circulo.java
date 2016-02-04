package codigo;


import java.awt.Color;
import java.awt.geom.Ellipse2D;

/*
mi primera clase

la clase circulo permite almacenar en la pantalla, si esta relleno o no,
su color etc
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dardo
 */
public class Circulo extends Ellipse2D.Double {
    
   public Color color = null;
   public boolean relleno = false;
   
   public Circulo (int _x, int _y, int _width, Color _color, boolean _relleno){
       this.x = _x - _width/2;
       this.y = _y - _width/2;
       this.width = _width;
       this.height = _width;
       this.color = _color;       
       this.relleno = _relleno;
       
   }
}
