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
public class Murder extends Sprite {
    Picture murder1;
    Picture murder2;
    Picture murder3;
    public Murder(SpriteComponent sc){
        super(sc);
        murder1 = new Picture("murder.png");
        murder1 = murder1.resize(0.45);
        setPicture(murder1);
        murder2 = new Picture("dancer.png");
        murder2 = murder2.resize(0.5);
        setPicture(murder2);
        murder3 = new Picture("professor.png");
        murder3 = murder3.resize(0.8);
        setPicture(murder3);
        setX(450);
        setY(400);
    }
}
