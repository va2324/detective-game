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
public class Witness extends Sprite{
    Picture stacey;
    Picture manager;
    Picture bf;
    public Witness(SpriteComponent sc){
        super(sc);
        stacey = new Picture("stacey.png");
        stacey = stacey.resize(0.35);
        manager = new Picture("manager.png");
        manager = manager.resize(0.45);
        bf = new Picture("bf.png");
        bf = bf.resize(0.3);
    }
}
