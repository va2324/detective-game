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
public class DressingScreen extends Sprite{
    Picture screen;
    public DressingScreen(SpriteComponent sc){
        super(sc);
        screen = new Picture("screen.png");
        screen = screen.resize(0.45);
        setPicture(screen);
    }
}
