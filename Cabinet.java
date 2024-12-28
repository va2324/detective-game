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
public class Cabinet extends Sprite {
    Picture closed;
    Picture open;
    public Cabinet(SpriteComponent sc){
        super(sc);
        closed = new Picture("closedcabinet.png");
        closed = closed.resize(0.75);
        setPicture(closed);
        open = new Picture("opencabinet.png");
        open = open.resize(0.75);
        setPicture(open);
        setX(900);
        setY(75);
    }
}
    
    
