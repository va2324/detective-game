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
public class Mirror extends Sprite{
    Picture mirror;
    public Mirror(SpriteComponent sc){
        super(sc);
        mirror = new Picture("mirror.png");
        mirror = mirror.resize(0.45);
        setPicture(mirror);
    }
}
