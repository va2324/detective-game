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
public class Desk extends Sprite{
    Picture desk;
    Picture desk2;
    public Desk(SpriteComponent sc){
        super(sc);
        desk = new Picture("desk.png");
        desk = desk.resize(0.35);
        setPicture(desk);
        desk2 = new Picture("desk.png");
        desk2 = desk2.resize(0.5);
        setPicture(desk2);
        setX(800);
        setY(400);
    }    
}
