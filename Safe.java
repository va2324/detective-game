/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

import basicgraphics.Sprite;
import basicgraphics.SpriteComponent;
import basicgraphics.images.Picture;

/**
 *
 * @author VasuK
 */
public class Safe extends Sprite {
    Picture safe;
    public Safe (SpriteComponent sc){
        super(sc);
        safe = new Picture("safe.png");
        safe = safe.resize(0.25);
        setPicture(safe);
        setX(800);
        setY(250);
    }
}
    
