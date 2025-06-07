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
public class CoffeeTable extends Sprite {
    Picture coffee;
    public CoffeeTable(SpriteComponent sc){
        super(sc);
        coffee = new Picture("coffeetable.png");
        coffee = coffee.resize(0.45);
        setPicture(coffee);
        setX(150);
        setY(450);
    }    
}
