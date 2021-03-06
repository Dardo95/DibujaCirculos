package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dardo
 */
public class Rombo extends Polygon {

    public Color color = null;
    public boolean relleno = false;

    public Rombo(int _x, int _y, int _width, Color _color, boolean _relleno) {
        
        this.npoints = 4;
        this.xpoints[0] = _x;
        this.ypoints[0] = _y - _width;
        
        this.xpoints[1] = _x - _width/2;
        this.ypoints[1] = _y; 
        
        this.xpoints[2] = _x;
        this.ypoints[2] = _y + _width;
        
        this.xpoints[3] = _x  + _width/2;
        this.ypoints[3] = _y;
                
        this.color = _color;
        this.relleno = _relleno;
    }
    
    public void pintaYColorea (Graphics2D g2){
        g2.setColor(this.color);
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
    }
    
}
