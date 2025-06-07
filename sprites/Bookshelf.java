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
public class Bookshelf extends Sprite{
    Picture shelf;
    public Bookshelf(SpriteComponent sc){
        super(sc);
        shelf = new Picture("shelf.png");
        shelf = shelf.resize(0.5);
        setPicture(shelf);
    }
}
