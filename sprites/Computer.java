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
public class Computer extends Sprite{
    Picture computer;
    public Computer(SpriteComponent sc){
        super(sc);
        computer = new Picture("computer.png");
        computer = computer.resize(0.75);
        setPicture(computer);
    }
}
