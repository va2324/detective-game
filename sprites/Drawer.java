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
public class Drawer extends Sprite{
    Picture closed;
    Picture open;
    public Drawer(SpriteComponent sc){
        super(sc);
        closed = new Picture("closeddrawer.png");
        setPicture(closed);
        open = new Picture("opendrawer.png");
        setPicture(open);
        setX(100);
        setY(50);
    }
}
