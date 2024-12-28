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
public class Trash extends Sprite{
    Picture trash;
    public Trash(SpriteComponent sc){
        super(sc);
        trash = new Picture("trash.png");
        trash = trash.resize(0.8);
        setPicture(trash);
    }
}
