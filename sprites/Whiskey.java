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
public class Whiskey extends Sprite{
    Picture whiskey;
    public Whiskey(SpriteComponent sc){
        super(sc);
        whiskey = new Picture("whiskey.png");
        whiskey = whiskey.resize(0.5);
        setPicture(whiskey);
    }
}
