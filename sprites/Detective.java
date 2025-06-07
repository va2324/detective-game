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
public class Detective extends Sprite {
    Picture dforward;
    Picture dbackward;
    public Detective(SpriteComponent sc){
        super(sc);
        dforward = new Picture("detectiveright.png");
        dforward = dforward.resize(0.25);
        setPicture(dforward);
        dbackward = new Picture("detectiveleft.png");
        dbackward = dbackward.resize(0.25);
        setPicture(dbackward);
        freezeOrientation = true;
        setX(500);
        setY(150);
    }
}
