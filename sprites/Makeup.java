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
public class Makeup extends Sprite{
    Picture makeup;
    public Makeup(SpriteComponent sc){
        super(sc);
        makeup = new Picture("makeup.png");
        makeup = makeup.resize(0.6);
        setPicture(makeup);
    }
}
