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
public class Window extends Sprite {
    Picture window;
    public Window(SpriteComponent sc){
        super(sc);
        window = new Picture("window.png");
        window = window.resize(0.3);
        setPicture(window);
        setX(475);
    }
}
