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
public class BlueDress extends Sprite{
    Picture dress;
    public BlueDress(SpriteComponent sc){
        super(sc);
        dress = new Picture("dress.png");
        dress = dress.resize(0.5);
        setPicture(dress);
    }
}
