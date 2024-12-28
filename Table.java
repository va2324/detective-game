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
public class Table extends Sprite {
    Picture table;
    public Table(SpriteComponent sc){
        super(sc);
        table = new Picture("table.png");
        table = table.resize(0.5);
        setPicture(table);
        setX(0);
        setY(250);
    }    
}
