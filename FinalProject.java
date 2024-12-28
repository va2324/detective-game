/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

import basicgraphics.BasicFrame;
import basicgraphics.BasicLayout;
import basicgraphics.Card;
import basicgraphics.ClockWorker;
import basicgraphics.SpriteComponent;
import basicgraphics.SpriteSpriteCollisionListener;
import basicgraphics.sounds.ReusableClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author VasuK
 */
public class FinalProject {
    public static void main(String[] args){
        BasicFrame bf = new BasicFrame("Detective Game");
        SpriteComponent sc = new SpriteComponent();
        Dimension d = new Dimension(10000, 5000);
        sc.setPreferredSize(d);
        bf.createBasicLayout(sc);
        ReusableClip clue = new ReusableClip("clue.wav");
        ReusableClip pavane = new ReusableClip("Pavane.wav");
        Card bc1 = bf.getCard();
        Card bc2 = bf.getCard();
        String[][] layout = {
            {"Title"},
            {"Start"}, 
        };
        bc1.setStringLayout(layout);
        JLabel title = new JLabel("Detective Game");
        title.setFont(new Font("Times New Roman", Font.PLAIN, 144));
        title.setForeground(Color.BLACK);
        bc1.add("Title", title);
        JButton jstart = new JButton("Start");
        Dimension di = new Dimension(100, 50);
        jstart.setPreferredSize(di);
        jstart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pavane.loop();
                bc2.showCard();
                bc2.requestFocus();
                JOptionPane.showMessageDialog(sc, "Welcome to the game! You are " 
                        + "playing Detective Sam Holmes. He has been called to "
                        + "the scene of a brutal murder. Help him solve the case.");
                ClockWorker.initialize(10);
            }
        });
        bc1.add("Start", jstart);
        bc2.setLayout(new BasicLayout());
        bc2.add("x=0,y=0,w=1,h=1",sc);
        bf.show();
        Detective dec = new Detective(sc);
        sc.setFocus(dec);
        dec.setPicture(dec.dforward);
        Murder murder = new Murder(sc);
        murder.setPicture(murder.murder1);
        Window window = new Window(sc);
        Safe safe = new Safe(sc);
        Table table = new Table(sc);
        Desk desk = new Desk(sc);
        desk.setPicture(desk.desk);
        CoffeeTable coffee = new CoffeeTable(sc);
        Cabinet cabinet = new Cabinet(sc);
        cabinet.setPicture(cabinet.closed);
        Drawer dr1 = new Drawer(sc);
        dr1.setPicture(dr1.closed);
        
        Witness stacey = new Witness(sc);
        stacey.setPicture(stacey.stacey);
        stacey.setX(2000);
        stacey.setY(2000);
        stacey.is_visible = false;
        Witness manager = new Witness(sc);
        manager.setPicture(manager.manager);
        manager.setX(2000);
        manager.setY(2000);
        manager.is_visible = false;
        Witness boyfriend = new Witness(sc);
        boyfriend.setPicture(boyfriend.bf);
        boyfriend.setX(2000);
        boyfriend.setY(2000);
        boyfriend.is_visible = false;
        Mirror mirror = new Mirror(sc);
        mirror.setPicture(mirror.mirror);
        mirror.setX(2000);
        mirror.setY(2000);
        mirror.is_visible = false;
        Makeup makeup = new Makeup(sc);
        makeup.setPicture(makeup.makeup);
        makeup.setX(2000);
        makeup.setY(2000);
        makeup.is_visible = false;
        DressingScreen screen = new DressingScreen(sc);
        screen.setPicture(screen.screen);
        screen.setX(2000);
        screen.setY(2000);
        screen.is_visible = false;
        BlueDress dress = new BlueDress(sc);
        dress.setPicture(dress.dress);
        dress.setX(2000);
        dress.setY(2000);
        dress.is_visible = false;
        
        Whiskey whiskey = new Whiskey(sc);
        whiskey.setPicture(whiskey.whiskey);
        whiskey.setX(2000);
        whiskey.setY(2000);
        whiskey.is_visible = false;
        Desk desk2 = new Desk(sc);
        desk2.setPicture(desk2.desk2);
        desk2.setX(2000);
        desk2.setY(2000);
        desk2.is_visible = false;
        Drawer dr2 = new Drawer(sc);
        dr2.setPicture(dr2.closed);
        dr2.setX(2000);
        dr2.setY(2000);
        dr2.is_visible = false;
        Trash trash = new Trash(sc);
        trash.setPicture(trash.trash);
        trash.setX(2000);
        trash.setY(2000);
        trash.is_visible = false;
        Bookshelf shelf = new Bookshelf(sc);
        shelf.setPicture(shelf.shelf);
        shelf.setX(2000);
        shelf.setY(2000);
        shelf.is_visible = false;
        Computer computer = new Computer(sc);
        computer.setPicture(computer.computer);
        computer.setX(2000);
        computer.setY(2000);
        computer.is_visible = false;
        
        final boolean[] foundCrowbar = new boolean[]{false};
        final boolean[] foundKey = new boolean[]{false};
        final boolean[] foundDiary = new boolean[]{false};
        final boolean[] case2 = new boolean[]{false};
        final boolean[] heardStacey = new boolean[]{false};
        final boolean[] heardBoyfriend = new boolean[]{false};
        final boolean[] heardManager = new boolean[]{false};
        final boolean[] foundDress = new boolean[]{false};
        final boolean[] foundMirror = new boolean[]{false};
        final boolean[] foundMakeup = new boolean[]{false};
        final boolean[] case3 = new boolean[]{false};
        final boolean[] foundDesk = new boolean[]{false};
        final boolean[] foundLetters = new boolean[]{false};
        final boolean[] foundNote = new boolean[]{false};
        final boolean[] foundEmail = new boolean[]{false};
        
        bc2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke){
                if (ke.getKeyCode() == KeyEvent.VK_UP){
                    double x = dec.getVelX();
                    dec.setVel(x, -2);
                }
                else if (ke.getKeyCode() == KeyEvent.VK_DOWN){
                    double x = dec.getVelX();
                    dec.setVel(x, 2);
                }
                else if (ke.getKeyCode() == KeyEvent.VK_RIGHT){
                    dec.setPicture(dec.dforward);
                    double y = dec.getVelY();
                    dec.setVel(2, y);
                }
                else if (ke.getKeyCode() == KeyEvent.VK_LEFT){
                    dec.setPicture(dec.dbackward);
                    double y = dec.getVelY();
                    dec.setVel(-2, y);
                }
            }
            @Override
            public void keyReleased(KeyEvent ke){
                dec.setVel(0, 0);
            }
        });
        ClockWorker.addTask(sc.moveSprites());
        
        sc.addSpriteSpriteCollisionListener(Detective.class, Murder.class,
                new SpriteSpriteCollisionListener<Detective, Murder>() {
            @Override        
            public void collision(Detective d, Murder m){
                dec.setVel(0,0);
                if(foundEmail[0]){
                    dec.setX(500);
                    dec.setY(150);
                    whiskey.is_visible = false;
                    whiskey.setActive(false);
                    desk2.is_visible = false;
                    desk2.setActive(false);
                    dr2.is_visible = false;
                    dr2.setActive(false);
                    trash.is_visible = false;
                    trash.setActive(false);
                    shelf.is_visible = false;
                    shelf.setActive(false);
                    computer.is_visible = false;
                    computer.setActive(false);
                    JOptionPane.showMessageDialog(sc, "I brought James Chaplin "
                            + "& Bethany Cameron down to the station to interrogate "
                            + "them on the murder of Dr. Stockman. After hours of "
                            + "interrogation, James Chaplin finally confessed that "
                            + "both he and Bethany were responsible for his death. \n"
                            + "Some time after the conclusion of the research and "
                            + "the end of Bethany's affair, the two of them met "
                            + "each other and started complaining about Dr. Stockman. \n"
                            + "James complained about how Dr. Stockman stole the credit "
                            + "for his work on the cancer research, and Bethany complained "
                            + "about how Dr. Stockman manipulated her into a passionate affair"
                            + " and then broke the whole thing off as soon as he felt tired of her. \n"
                            + "Both of them wanted revenge on Dr. Stockman for how he treated them, "
                            + "but James did not know how he wanted to avenge himself, "
                            + "whereas Bethany had already been concocting plans to "
                            + "kill him. \nAfter numerous secret discussions, the two "
                            + "of them finally decided to buy a bottle of whiskey and "
                            + "insert a poisonous substance into it and then send the "
                            + "bottle to Dr. Stockman, making him think it was a gift "
                            + "for his scientific discovery. \nThus, the two students "
                            + "plotted and executed the murder of their professor. "
                            + "Both James Chaplin and Bethany Cameron were convicted "
                            + "of first-degree murder and sentenced to life in prison. \n"
                            + "Case Closed.");
                    JOptionPane.showMessageDialog(sc, "Congratulations! You have solved Case #3, "
                            + "the final case in this game. You have proven yourself not only "
                            + "as a detective, but also as a worthy successor to your "
                            + "great-great-great-great grandfather, Sherlock Holmes! "
                            + "Well done, Detective!");
                    JOptionPane.showMessageDialog(sc, "THE END");
                    System.exit(0);
                }
                else if(case3[0]){
                    whiskey.is_visible = true;
                    whiskey.setX(500);
                    whiskey.setY(500);
                    desk2.is_visible = true;
                    desk2.setX(50);
                    desk2.setY(400);
                    dr2.is_visible = true;
                    dr2.setX(850);
                    dr2.setY(100);
                    trash.is_visible = true;
                    trash.setX(800);
                    trash.setY(450);
                    shelf.is_visible = true;
                    shelf.setX(50);
                    shelf.setY(0);
                    computer.is_visible = true;
                    computer.setX(500);
                    computer.setY(0);
                    JOptionPane.showMessageDialog(sc, "The victim is named Dr. "
                            + "Frederick Stockman. He is an esteemed professor "
                            + "of biology at the University of Sciences. He had "
                            + "been working on a research project to find a cure "
                            + "for cancer. \nThis morning, someone sent him a "
                            + "congratulatory bottle of Jack Daniels whiskey that "
                            + "was poisoned. Dr. Stockman drank it in his office "
                            + "and died within a few minutes. He was found by "
                            + "his teaching assistant. \nLet's look around his "
                            + "office for clues. ");
                }
                else if(foundDress[0]){
                    dress.setX(2000);
                    dress.setY(2000);
                    dec.setX(500);
                    dec.setY(150);
                    stacey.is_visible = false;
                    stacey.setActive(false);
                    manager.is_visible = false;
                    manager.setActive(false);
                    boyfriend.is_visible = false;
                    boyfriend.setActive(false);
                    mirror.is_visible = false;
                    mirror.setActive(false);
                    makeup.is_visible = false;
                    makeup.setActive(false);
                    screen.is_visible = false;
                    screen.setActive(false);
                    dress.is_visible = false;
                    dress.setActive(false);
                    JOptionPane.showMessageDialog(sc, "After taking the dress to "
                            + "the station, we ran DNA testing on the blood stain, "
                            + "and the test revealed that the blood belonged to "
                            + "Stacey Anderson. \nWe brought Stacey to the interrogation "
                            + "room, where I presented her with the dress and asked her about "
                            + "the blood stain. \nShe confessed that the dress was hers, "
                            + "and when asked why her blood was on the dress, "
                            + "she said that while she was trying to strangle Carmina, "
                            + "Carmina stabbed her with a pair of scissors that had been "
                            + "left by the costume designer. \nI asked Stacey why "
                            + "she had strangled Carmina, and she confessed that "
                            + "she had always been jealous of Carmina's success. "
                            + "She wanted to be in the spotlight all her life, and "
                            + "she saw Carmina as an obstacle in her path to fame "
                            + "and glory. \nSo she tried to scare her out of the lounge "
                            + "with the note on the mirror, and when that didn't work, "
                            + "she resorted to cold-blooded murder. \nShe didn't have time "
                            + "to get rid of the incriminating dress, so she hid it "
                            + "behind the dressing screen and planned to destroy it later. "
                            + "Then she tried to blame the murder on the manager as an act of revenge "
                            + "for favoring Carmina over her all the time. \nStacey Anderson "
                            + "was sentenced to 10 years in prison for second-degree "
                            + "murder. Both the manager and James Barnard were present "
                            + "at the trial. \nJames was completely crushed that Carmina "
                            + "had been murdered by her own best friend. The manager "
                            + "was dismayed that he had now lost two of his best performers. \n"
                            + "Case Closed.");
                    JOptionPane.showMessageDialog(sc, "Congratulations! You have solved Case #2. \n"
                            + "Now it is time to solve Case #3");
                    murder.setPicture(murder.murder3);
                    case3[0] = true;
                }
                else if(case2[0]){
                    stacey.is_visible = true;
                    stacey.setX(200);
                    stacey.setY(400);
                    manager.is_visible = true;
                    manager.setX(1000);
                    manager.setY(200);
                    boyfriend.is_visible = true;
                    boyfriend.setX(800);
                    boyfriend.setY(450);
                    mirror.is_visible = true;
                    mirror.setX(100);
                    mirror.setY(50);
                    makeup.is_visible = true;
                    makeup.setX(800);
                    makeup.setY(50);
                    screen.is_visible = true;
                    screen.setX(450);
                    screen.setY(50);
                    JOptionPane.showMessageDialog(sc, "The victim is named Carmina Cruz. "
                            + "She was killed a half hour ago and her murder was reported "
                            + "by her friend Stacy, who found her body. \nClaudia was "
                            + "a singer and dancer for the Moonlight Lounge. She was "
                            + "apparently the star of the show. \nThe method of murder was "
                            + "clearly strangling. Her neck is covered with dark blue bruises. "
                            + "Someone must have truly hated her and wanted her dead for some reason. \n"
                            + "Let's look around the dressing room to find more clues. "
                            + "But first, we should talk to the witnesses.");
                }
                else if (foundDiary[0]){
                    dec.setX(500);
                    dec.setY(150);
                    window.is_visible = false;
                    window.setActive(false);
                    safe.is_visible = false;
                    safe.setActive(false);
                    table.is_visible = false;
                    table.setActive(false);
                    desk.is_visible = false;
                    desk.setActive(false);
                    coffee.is_visible = false;
                    coffee.setActive(false);
                    cabinet.is_visible = false;
                    cabinet.setActive(false);
                    dr1.is_visible = false;
                    dr1.setActive(false);
                    JOptionPane.showMessageDialog(sc, "David Garfield and Anne-Marie were caught at the city airport. "
                        + "They were trying to board a flight to Mexico and live a carefree life there. \n"
                        + "Down at the station, Anne-Marie confessed that she had been cheating on John "
                        + "with his brother. She said that the magic had gone out of her and John's romance, "
                        + "and she saw no hopeful future with him. \nShe instead found solace in his brother, "
                        + "who came up with the scheme to scam John Garfield into going into debt and "
                        + "securing them a few thousand dollars to fund an escapade to Mexico. \nThey had "
                        + "never intended to murder John, but when the affair was revealed at that lunch meeting, "
                        + "tempers rose between the two men, and one decided to kill the other with a kitchen knife. \n"
                        + "David Garfield was sentenced to 20 years in prison for the murder of John Garfield. "
                        + "Anne-Marie was sentenced to 10 years in prison for complicity in the murder. \n"
                        + "Case Closed.");
                    JOptionPane.showMessageDialog(sc, "Congratulations! You have solved Case #1! \n"
                        + "Now it is time to solve Case #2.");
                    murder.setPicture(murder.murder2);
                    case2[0] = true;
                }    
                else{
                    JOptionPane.showMessageDialog(sc, "The victim is named John Garfield. "
                        + "He was killed just a few hours ago, between 11:00 am and "
                        + "noon. The landlord came to his apartment asking for rent "
                        + "and found his dead body and immediately alerted the police. \n"
                        + "The method of murder was clearly stabbing. "
                        + "I have wiped down the blade and found no fingerprints of "
                        + "any kind.\nThat means the killer is quite clever and "
                        + "has worn gloves to conceal their identity. Or perhaps "
                        + "they wiped down everything after the killing took place. \n"
                        + "Let's look around the apartment to find more clues.");
                }
            }
        });    
        sc.addSpriteSpriteCollisionListener(Detective.class, Window.class,
                new SpriteSpriteCollisionListener<Detective, Window>() {
            @Override        
            public void collision(Detective d, Window w){
                dec.setVel(0,0);
                JOptionPane.showMessageDialog(sc, "This window is locked and "
                        + "sealed tight. There is no evidence of a break-in "
                        + "through here. The killer must not have used this as "
                        + "a method of entry or exit. That means they must have "
                        + "come in through the door.");
            }
        });    
        sc.addSpriteSpriteCollisionListener(Detective.class, Table.class,
                new SpriteSpriteCollisionListener<Detective, Table>() {
            @Override        
            public void collision(Detective d, Table t){
                dec.setVel(0,0);
                clue.playOverlapping();
                JOptionPane.showMessageDialog(sc, "This table has two meals set up. "
                        + "Neither of them have been eaten yet. From this we can deduce "
                        + "that there must have been two people at the time of the "
                        + "murder. John Garfield must have been one, so the other "
                        + "person must have been the killer. \nThis means that John "
                        + "must have invited the killer over to lunch for some "
                        + "reason, and the killer took the opportunity to kill him. "
                        + "But who was invited over, and why did they kill John? "
                        + "And was the murder premeditated or spontaneous?");
            }
        });
        sc.addSpriteSpriteCollisionListener(Detective.class, CoffeeTable.class,
                new SpriteSpriteCollisionListener<Detective, CoffeeTable>() {
            @Override        
            public void collision(Detective d, CoffeeTable ct){
                dec.setVel(0,0);
                clue.playOverlapping();
                JOptionPane.showMessageDialog(sc, "There is a photo of a beautiful "
                        + "woman on this coffee table. On the back of the photo, "
                        + "there is handwriting that says, 'I love you, Anne-Marie. "
                        + "You're my one and only. Love, John.' This must be his lover. "
                        + "Perhaps she had something to do with this crime.");
                JOptionPane.showMessageDialog(sc, "There is also a piece of paper "
                        + "here that has a 4-digit code written on it. The code "
                        + "is 7528. I wonder how this could be useful to us.");
            }
        });
        sc.addSpriteSpriteCollisionListener(Detective.class, Safe.class,
                new SpriteSpriteCollisionListener<Detective, Safe>() {
            @Override        
            public void collision(Detective d, Safe s){
                dec.setVel(0,0);
                clue.playOverlapping();
                JOptionPane.showMessageDialog(sc, "This safe has been emptied out. "
                        + "Clearly, whoever killed John Garfield was after his money. "
                        + "But what did they want with him and his money?");
            }
        }); 
        sc.addSpriteSpriteCollisionListener(Detective.class, Cabinet.class,
                new SpriteSpriteCollisionListener<Detective, Cabinet>() {
            @Override        
            public void collision(Detective d, Cabinet c){
                dec.setVel(0,0);
                JOptionPane.showMessageDialog(sc, "This cabinet has been locked "
                            + "with a padlock. We need a 4-digit code to unlock it.");
                Scanner input = new Scanner(System.in);
                System.out.println("Enter code: ");
                int code = input.nextInt();
                if(code == 7528){
                    clue.playOverlapping();
                    c.setPicture(c.open);
                    JOptionPane.showMessageDialog(sc, "You used the code to open the filing cabinet.");
                    JOptionPane.showMessageDialog(sc, "This filing cabinet contains numerous "
                            + "financial documents, including bank statements and tax returns. "
                            + "All together, these documents seem to show that John Garfield was "
                            + "struggling financially. \nThere is also a letter from a lending agency "
                            + "called QuickLoans, Inc. It says that John Garfield has recently accepted "
                            + "a loan of $2000 from them. Considering his poor financial situation, "
                            + "it is highly unlikely that he was unable to pay it back. \n"
                            + "Could these debtors possibly be involved with his murder?");
                    JOptionPane.showMessageDialog(sc, "There is also a crowbar here. "
                        + "Perhaps that is how the killer broke into the safe. "
                        + "Maybe this crowbar can be used to open something else up.");
                    foundCrowbar[0] = true;
                }
                else{
                    c.setPicture(c.closed);
                    JOptionPane.showMessageDialog(sc, "That was the wrong code.");
                }
            }
        });
        sc.addSpriteSpriteCollisionListener(Detective.class, Drawer.class,
                new SpriteSpriteCollisionListener<Detective, Drawer>() {
            @Override        
            public void collision(Detective d, Drawer dr){
                dec.setVel(0,0);
                if(dr.equals(dr1)){
                    if(foundCrowbar[0]){
                        clue.playOverlapping();
                        dr.setPicture(dr.open);
                        JOptionPane.showMessageDialog(sc, "You used the crowbar to open the drawer.");
                        JOptionPane.showMessageDialog(sc, "This drawer contains a bunch of letters. "
                            + "A lot of them are from the debt collectors. \n"
                            + "They threaten 'severe consequences if the debt is not repaid in full "
                            + "(including but not limited to: bankruptcy, legal action, seizure of assets, etc.)' \n"
                            + "Would they also consider murder as a possible consequence of default?");
                        JOptionPane.showMessageDialog(sc, "There are also a few letters from someone named David Garfield. "
                            + "That must be John Garfield's brother, who lives in the same apartment building. \n"
                            + "These letters talk about a business venture that David is starting, "
                            + "and he is asking his brother to send him some money to get his business "
                            + "off the ground. \nIs he another suspect in this crime? "
                            + "We now have three suspects: the debt collectors, the lover, and the brother. \n"
                            + "Who killed John Garfield and why did they do it?");
                        JOptionPane.showMessageDialog(sc, "There is also a key here. "
                            + "I wonder that this might open up.");
                        foundKey[0] = true;
                    }
                    else{
                        dr.setPicture(dr.closed);
                        JOptionPane.showMessageDialog(sc, "This drawer seems to be jammed. "
                            + "We need to find something that will be useful in opening it.");
                    }
                }
                else if(dr.equals(dr2)){
                    clue.playOverlapping();
                    JOptionPane.showMessageDialog(sc, "There is a bizzare collection of love letters "
                            + "in this drawer. These letters are from a student named Bethany Cameron. \n"
                            + "From these letters, it appears she was involved in a serious love affair "
                            + "with Dr. Stockman for many years. Even though she was thirty years younger "
                            + "than him. \nThat is . . . very concerning. Perhaps she had something to "
                            + "do with his murder.");
                    foundLetters[0] = true;
                }
            }
        });
        sc.addSpriteSpriteCollisionListener(Detective.class, Desk.class,
                new SpriteSpriteCollisionListener<Detective, Desk>() {
            @Override        
            public void collision(Detective d, Desk de){
                dec.setVel(0,0);
                if(de.equals(desk)){
                    if(foundKey[0]){
                        clue.playOverlapping();
                        for(int i = 0; i <= 15; i++){
                            if(i == 0){
                                JOptionPane.showMessageDialog(sc, "You used the key to open the desk.");
                            }   
                            else if(i == 1){
                                JOptionPane.showMessageDialog(sc, "There is a diary inside this desk. "
                                + "It must be John Garfield's personal diary. Let's see what it says: ");
                            }
                            else if(i == 2){
                                JOptionPane.showMessageDialog(sc, "August "+ i +"\nI'm struggling right now. I can barely afford "
                                + "to pay rent as it is, grocery prices are jumping sky-high, and my crappy "
                                + "job is only paying me a few dollars above minimum wage. \nHow is anyone "
                                + "supposed to survive on that, especially in this tough economy? "
                                + "I sure hope I can get a break soon, because I am at my limit.");
                            }
                            else if(i == 5){
                                JOptionPane.showMessageDialog(sc, "August " + i + "\nI got a visit from David. He was "
                                + "probably struggling about as much as I was, but you wouldn't know it from "
                                + "the shine in his eyes. \nHe told me he had a sudden inspiration and "
                                + "came up with an idea for a profitable business venture. "
                                + "He said it could change our lives forever and make us into millionaires. \n"
                                + "I told him he was nuts. There was no way a business would ever "
                                + "get us out of this mess, let alone make us millionaires. \n"
                                + "He told me he was 100% serious, and that he needed a few thousand " 
                                + "dollars to get it started. I asked him to look around my crappy "
                                + "apartment and see if I had a few thousand dollars to spare. \n"
                                + "All he said was that if I could find some money, any money to invest, "
                                + "he would return it tenfold. I don't know what to make of his lunancy.");
                            }   
                            else if(i == 7){
                                JOptionPane.showMessageDialog(sc, "August " + i + "\nAnne-Marie came over last night. "
                                + "In bed, I mentioned David's stupid idea. I told her there was no way "
                                + "it would lift us out of poverty. In fact, if I invested in it, it would "
                                + "destroy me. \nTo my surprise, she disagreed. She said that we have no other "
                                + "options so we might as well make the investment. \nI told her that this "
                                + "investment could kill me financially and put me out on the streets. But she "
                                + "said that the way things were going, I was probably heading there anyway, "
                                + "and this investment might be the best chance I have at staying afloat. \n"
                                + "Honestly, her words seem to make sense. I don't think I can take another day of "
                                + "living like this. I hate to say it, but I think I am actually considering "
                                + "investing in David's idea.");
                            }
                            else if(i == 10){
                                JOptionPane.showMessageDialog(sc, "August " + i + "\nIt's done. I went to the QuickLoans agency "
                                + "and I managed to secure a loan of $2000 from them. \nThis investment had better "
                                + "pay off, or else there will be hell to pay. I had to sign an agreement which "
                                + "basically says I will be ruined forever if I fail to pay the loan back. \n"
                                + "I sure hope my brother knows what he is doing. I am keeping the money secure in "
                                + "my safe. It is a pretty old safe, not as strong as it once was, but it still "
                                + "gets the job done.");
                            }
                            else if(i == 11){
                                JOptionPane.showMessageDialog(sc, "August " + i + "\n I called David about the money. He sounded "
                                + "thrilled that I was actually making the investment, but he said he couldn't come "
                                + "to pick it up yet. \n He was busy drawing out the final plans for his business. "
                                + "We agreed to meet for lunch in a few days, and then he would pick up the money.");
                            }
                            else if(i == 12){
                                JOptionPane.showMessageDialog(sc, "August " + i + "\nAnne-Marie came by today, and I told her about "
                                + "the investment. She screamed with delight and jumped on me, and I carried her off to "
                                + "bed. \nAn hour later, we were fantasizing about the possibilities that could come from "
                                + "this investment. I still had my doubts about it, but Anne-Marie was ecstatic, and if "
                                + "she was happy, I was happy. \nIt was then that I noticed something about Anne-Marie "
                                + "that had escaped my eye before. She was wearing a daisy in her hair. \nDaisies were her "
                                + "favorite flower. I thought I was the only person who knew that about her. \nI asked "
                                + "her where the daisy came from, and she told me that she ran into my brother in the "
                                + "stairs while climbing up to my apartment, and he gave her the daisy. \nI demanded "
                                + "to know where he had gotten the daisy. She said he plucked it from some flowers "
                                + "in the local park. \nI asked what on earth he was doing at the park. David literally "
                                + "told me he was too busy making plans for his business to even come pick up the debt. \n"
                                + "Anne-Marie fell silent, and then told me not to worry so much about it. She then "
                                + "proceeded to smother me with kisses, but I started to get a serious doubt in my mind. \n"
                                + "Is there something going on between Anne-Marie and David?");
                            }
                            else if(i == 13){
                                JOptionPane.showMessageDialog(sc, "August " + i + "\nI can't even imagine what's happening between them. "
                                + "How could she do this to me? I really thought she would be mine and mine alone. Now she's "
                                + "having an affair with my own brother behind my back! How could she do this to me?");
                            }
                            else if(i == 14){
                                JOptionPane.showMessageDialog(sc, "August " + i + "\nA thought just occurred to me. What if this "
                                + "investment is not for a business at all? \nIf David and Anne-Marie are having an affair, "
                                + "then they might just be looking for some money of their own. What if they want to take "
                                + "the $2000 and run away somewhere? \nThey're going to force me into debt and financial ruin "
                                + "just so they can have their fun! I won't stand for this! David is coming over tomorrow. "
                                + "I have to know the truth. \nWhat is the money really for? Is he having an affair with my "
                                + "girlfriend? Are the two of them going to put me in crippling debt to finance their affair? \n"
                                + "I will know for sure tomorrow.");
                            }
                            else if(i == 15){
                                JOptionPane.showMessageDialog(sc, "That is the last entry in the diary. "
                                + "I think it is pretty clear what happened. The killer must be David Garfield. \n"
                                + "He killed his own brother after the affair was revealed, and he stole "
                                + "the $2000 that John had gone into debt for. \nIt was pretty clever, "
                                + "making John secure the debt so that David could get away with Anne-Marie "
                                + "without any financial consequences. \nNow it is time to catch the criminals.");
                            }
                        }   
                        foundDiary[0] = true;
                        JOptionPane.showMessageDialog(sc, "Go to the body of John Garfield.");
                    }
                    else{
                        JOptionPane.showMessageDialog(sc, "This desk is locked. We need "
                            + "to find a key to open it and see what is inside.");
                    }    
                }
                else if(de.equals(desk2)){
                    clue.playOverlapping();
                    JOptionPane.showMessageDialog(sc, "There are two things of note "
                            + "inside this desk. \nFirst is the research paper Dr. Stockman "
                            + "was planning to publish. It lists the experiments he performed "
                            + "in pursuit of his cure for cancer. This scientific discovery "
                            + "could have earned him the Nobel Prize if he was still alive. \n"
                            + "The second thing is a group of photos. It appears to show Dr. "
                            + "Stockman working on his experiments in the laboratory along "
                            + "with someone else. It appears to be James Chaplin, a graduate "
                            + "student. \nIt seems that the two were very close, and he made "
                            + "significant contributions to the project. But strangely, "
                            + "Chaplin's name never shows up once in the paper. It is all about "
                            + "Dr. Stockman.");
                    foundDesk[0] = true;
                }
            }
        });
        sc.addSpriteSpriteCollisionListener(Detective.class, Witness.class, 
                new SpriteSpriteCollisionListener<Detective, Witness>(){
                    @Override
                    public void collision(Detective d, Witness w){
                        dec.setVel(0,0);
                        if(w.equals(stacey)){
                            JOptionPane.showMessageDialog(sc, "Detective: \n"
                                    + "Tell me who you are and what happened to Carmina.");
                            JOptionPane.showMessageDialog(sc, "Stacey: \n"
                                    + "My name is Stacey Anderson, and I worked with Carmina. "
                                    + "We were very close. I just can't believe she's gone. \n"
                                    + "I loved her so much. She was a dreamer. She had such a bright "
                                    + "future ahead of her, and some killer decided to take it all away! \n"
                                    + "Oh God, WHY?");
                            JOptionPane.showMessageDialog(sc, "Detective: \n"
                                    + "Can you think of anyone who might have had a grudge against "
                                    + "or felt some sort of anger or enmity towards Carmine? \n"
                                    + "Is there anyone you can think of who might have done this to her?");
                            JOptionPane.showMessageDialog(sc, "Stacey: \n"
                                    + "Well, I know that Stacey had big dreams, and "
                                    + "she didn't want to stay stuck in this lounge all her life. She wanted to "
                                    + "see the world and have new experiences and just really live life to the "
                                    + "fullest. \nShe had a boyfriend, James, who seemed like he was going to make "
                                    + "all those dreams come true. Whenever we were alone, Carmina would tell me "
                                    + "about all the plans she and James had dreamed up in bed together. \n"
                                    + "She was just so excited and cheerful talking about their plans that "
                                    + "I really thought they would come true. And now all those dreams are dead.");
                            JOptionPane.showMessageDialog(sc, "Detective: \n"
                                    + "Is there anyone you think might have wanted to prevent "
                                    + "Carmina from achieving these dreams?");
                            JOptionPane.showMessageDialog(sc, "Stacey: \n"
                                    + "What I know for sure is that her manager "
                                    + "hated the idea of her leaving. She was his big breadwinner. \nThe reason "
                                    + "this lounge is so popular is because of Carmina's talent. She was so "
                                    + "talented and beautiful, and she single-handedly made the manager a "
                                    + "rich man. \nBut she wanted more than this. She wanted to escape and enjoy "
                                    + "all that life had to offer. But the manager would not let her leave and "
                                    + "lose all of his profits. \nHe would have done anything to stop her escape. "
                                    + "Maybe even murder her. I hope to God that isn't true. I couldn't stand "
                                    + "working for a monster like that!");
                            heardStacey[0] = true;        
                        }
                        else if(w.equals(manager)){
                            JOptionPane.showMessageDialog(sc, "Detective: \n"
                                    + "Tell me who you are and what happened tonight.");
                            JOptionPane.showMessageDialog(sc, "Manager: \n"
                                    + "My name is Donald Frost, and I am the manager "
                                    + "of this joint. Carmina was my biggest star. \n"
                                    + "She always got this lounge sold out of tickets. "
                                    + "Everybody wanted to see her singing and dancing. \n"
                                    + "Tonight's show was spectacular! Carmina looked absolutely "
                                    + "incredible in her lovely white dress, and she sang and "
                                    + "danced beautifully tonight. And of course, the backup "
                                    + "dancers looked pretty good in their sexy blue outfits. \n"
                                    + "Now someone went and strangled my lovely star to death. "
                                    + "Whoever did this has cost my lounge thousands of dollars "
                                    + "in lost revenue, and I would very much like to strangle "
                                    + "them to death myself!");
                            JOptionPane.showMessageDialog(sc, "Detective: \n"
                                    + "Can you think of anyone who might have had a grudge against "
                                    + "or felt some sort of anger or enmity towards Carmina? \nIs there "
                                    + "anyone you can think of who might have done this to her?");
                            JOptionPane.showMessageDialog(sc, "Manager: \n"
                                    + "I know exactly who did this to her. "
                                    + "It was her no good boyfriend, that's who. \nHe wanted her to run "
                                    + "away with him, but I knew that he was going to ruin her career and "
                                    + "waste her star potential. \nI tried to persuade her to stay with me, "
                                    + "so she could keep on singing and dancing and becoming a true star. \n"
                                    + "But that no-good bastard decided to take her away from me once and for all "
                                    + "by killing her. \nI will make him pay for this, you can bet on that!");
                            heardManager[0] = true;
                        }
                        else if(w.equals(boyfriend)){
                            JOptionPane.showMessageDialog(sc, "Detective: \n"
                                    + "Tell me who you are and what happened tonight.");
                            JOptionPane.showMessageDialog(sc, "James: \n"
                                    + "My name is James Barnard, and I am - was - "
                                    + "Carmina's boyfriend. I loved her with all my heart. "
                                    + "I want to find whoever did this to her and beat them to death "
                                    + "with my bare hands.");
                            JOptionPane.showMessageDialog(sc, "Detective: \n"
                                    + "Can you think of anyone who might have had a grudge against "
                                    + "or felt some sort of anger or enmity towards Carmina? \nIs there "
                                    + "anyone you can think of who might have done this to her?");
                            JOptionPane.showMessageDialog(sc, "James: \n"
                                    + "The only person who comes to mind is her manager. "
                                    + "Carmina and I had been planning to move out of this place "
                                    + "and see the world before settling down someplace where we "
                                    + "could be happy together. \nBut her manager refused to let her "
                                    + "leave. He always wanted to keep her in his lounge so she could "
                                    + "keep making him money. \nWe had been planning to elope and run "
                                    + "away in secret so he could never find us. But he must have "
                                    + "caught on to our plan somehow and punished her for it. \n"
                                    + "If I can I get my hands on him, I will make him pay!");
                            heardBoyfriend[0] = true;
                        }
                    }
                });
        sc.addSpriteSpriteCollisionListener(Detective.class, Mirror.class, 
                new SpriteSpriteCollisionListener<Detective, Mirror>(){
                    @Override
                    public void collision(Detective d, Mirror m){
                        dec.setVel(0,0);
                        if(heardStacey[0] && heardManager[0] && heardBoyfriend[0]){
                            clue.playOverlapping();
                            JOptionPane.showMessageDialog(sc, "There is an anonymous note on this mirror: ");
                            JOptionPane.showMessageDialog(sc, "CARMINA, THIS IS YOUR LAST CHANCE! GET OUT OF "
                                    + "THIS LOUNGE BEFORE ITS TOO LATE! OR ELSE, YOU WILL LIVE TO REGRET IT!");
                            JOptionPane.showMessageDialog(sc, "This note was written by someone who wanted Carmina "
                                    + "to vacate the lounge. We know her manager wanted her to stay in the lounge "
                                    + "and keep the place profitable. \nPerhaps this note was written by her boyfriend. "
                                    + "But if he loved her so much, why would he resort to such measures?");
                            foundMirror[0] = true;
                        }
                        if(!heardStacey[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to Stacey yet. "
                                    + "You must talk to all witness before interacting with clues.");
                        }
                        if(!heardManager[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to the manager yet. "
                                    + "You must talk to all witnesses before interacting with clues.");
                        }
                        if(!heardBoyfriend[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to James yet. "
                                    + "You must talk to all witnesses before interacting with clues.");
                        }
                    }
                });
        sc.addSpriteSpriteCollisionListener(Detective.class, Makeup.class, 
                new SpriteSpriteCollisionListener<Detective, Makeup>(){
                    @Override
                    public void collision(Detective d, Makeup m){
                        dec.setVel(0,0);
                        if(heardStacey[0] && heardManager[0] && heardBoyfriend[0]){
                            if(foundMirror[0]){
                                clue.playOverlapping();
                                JOptionPane.showMessageDialog(sc,"Some of the bottles "
                                    + "on this makeup table seem to have been opened "
                                    + "very recently. However, Carmina's face was very much "
                                    + "devoid of makeup upon her death. \nIs one of the witnesses "
                                    + "wearing a strong amount of makeup? Perhaps they are trying "
                                    + "to hide something.");
                                foundMakeup[0] = true;
                            }
                            else{
                                JOptionPane.showMessageDialog(sc, "You must check "
                                        + "the mirror before interacting with this clue.");
                            }
                        }
                        if(!heardStacey[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to Stacey yet. "
                                    + "You must talk to all witness before interacting with clues.");
                        }
                        if(!heardManager[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to the manager yet. "
                                    + "You must talk to all witnesses before interacting with clues.");
                        }
                        if(!heardBoyfriend[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to James yet. "
                                    + "You must talk to all witnesses before interacting with clues.");
                        }
                    }
                });
        sc.addSpriteSpriteCollisionListener(Detective.class, DressingScreen.class, 
                new SpriteSpriteCollisionListener<Detective, DressingScreen>(){
                    @Override
                    public void collision(Detective d, DressingScreen ds){
                        dec.setVel(0, 0);
                        if(heardStacey[0] && heardManager[0] && heardBoyfriend[0]){
                            if(foundMakeup[0]){
                                clue.playOverlapping();
                                JOptionPane.showMessageDialog(sc,"This dressing screen "
                                    + "seems to have been positioned in a strange way, "
                                    + "almost as if someone was trying to hide something "
                                    + "behind this dressing screen. \nPerhaps one of the "
                                    + "witnesses is responsible for this? Let's remove the "
                                    + "dressing screen and see what is being hidden "
                                    + "behind it.");
                                screen.is_visible = false;
                                screen.setActive(false);
                                dress.is_visible = true;
                                dress.setX(screen.getX());
                                dress.setY(screen.getY());
                            }
                            else{
                                JOptionPane.showMessageDialog(sc, "You must check "
                                        + "the makeup table before interacting with this clue.");
                            }
                        }
                        if(!heardStacey[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to Stacey yet. "
                                    + "You must talk to all witness before interacting with clues.");
                        }
                        if(!heardManager[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to the manager yet. "
                                    + "You must talk to all witnesses before interacting with clues.");
                        }
                        if(!heardBoyfriend[0]){
                            JOptionPane.showMessageDialog(sc, "You have not talked to James yet. "
                                    + "You must talk to all witnesses before interacting with clues.");
                        }
                    }
                });
        sc.addSpriteSpriteCollisionListener(Detective.class, BlueDress.class, 
                new SpriteSpriteCollisionListener<Detective, BlueDress>(){
                    @Override
                    public void collision(Detective d, BlueDress bd){
                        dec.setVel(0,0);
                        clue.playOverlapping();
                        JOptionPane.showMessageDialog(sc, "This is a blue dress "
                                + "with a blood stain on it. The manager said "
                                + "that backup dancers were wearing blue outfits "
                                + "like this one. Since there is blood on it, and "
                                + "the stain seems to be recent, we can assume "
                                + "that the blood was drawn during some sort of struggle. \n"
                                + "Perhaps Carmina fought with her killer for her life, "
                                + "but we know she died of strangulation, and there "
                                + "were no wounds present on her body. That means "
                                + "the blood must be from her killer. \nLet us collect "
                                + "this dress as evidence and take it down to the "
                                + "station to test the blood for DNA. That should "
                                + "determine the identity of Carmina's killer.");
                        JOptionPane.showMessageDialog(sc, "Go to the body of "
                                + "Carmina Cruz.");
                        foundDress[0] = true;
                    }
                });
        sc.addSpriteSpriteCollisionListener(Detective.class, Whiskey.class, 
                new SpriteSpriteCollisionListener<Detective, Whiskey>(){
                    @Override
                    public void collision(Detective d, Whiskey w){
                        dec.setVel(0,0);
                        JOptionPane.showMessageDialog(sc, "This bottle of Jack "
                                + "Daniels whiskey contains a high concentration of "
                                + "poison. There is no tag, no fingerprints, no "
                                + "identifying information of any kind. At this point, "
                                + "there is no clue as to who sent this whiskey.");
                    }
                });
        sc.addSpriteSpriteCollisionListener(Detective.class, Trash.class, 
                new SpriteSpriteCollisionListener<Detective, Trash>(){
                    @Override
                    public void collision(Detective d, Trash t){
                        dec.setVel(0,0);
                        if(foundLetters[0]){
                            clue.playOverlapping();
                            JOptionPane.showMessageDialog(sc, "It looks like Dr. "
                                    + "Stockman recently threw out a note from Bethany:");
                            JOptionPane.showMessageDialog(sc, "'How could you do this to me? "
                                    + "Fred, I loved you so much! You were everything to me, "
                                    + "and now you have tossed me aside like a toy. "
                                    + "Why did you use me like that? \nDo you really think "
                                    + "you can get rid of me, after all these years we "
                                    + "have been together? I will make you pay for this! "
                                    + "I will make you rue the day you asked me out!'");
                            JOptionPane.showMessageDialog(sc, "It appears Dr. Stockman "
                                    + "decided to end the affair, and Bethany took it "
                                    + "rather poorly, if you can believe that. Now it appears "
                                    + "she had a motive to kill Dr. Stockman.");
                            foundNote[0] = true;
                        }
                        else{
                            JOptionPane.showMessageDialog(sc, "You must search "
                                    + "the drawer before interacting with this clue.");
                        }
                    }
                });
        sc.addSpriteSpriteCollisionListener(Detective.class, Bookshelf.class, 
                new SpriteSpriteCollisionListener<Detective, Bookshelf>(){
                    @Override
                    public void collision(Detective d, Bookshelf b){
                        dec.setVel(0,0);
                        if(foundDesk[0] && foundLetters[0] && foundNote[0]){
                            clue.playOverlapping();
                            JOptionPane.showMessageDialog(sc, "One of these books has a "
                                + "bookmark in it. It seems to stand out from the "
                                + "others. \nThere is a password written inside the front "
                                + "cover. The password is 'N0b3l_W1nn3r'. I wonder "
                                + "how this might be useful.");
                        }
                        else{
                            JOptionPane.showMessageDialog(sc, "You must search all other "
                                    + "clues before interacting with this clue.");
                        }
                    }
                });
        sc.addSpriteSpriteCollisionListener(Detective.class, Computer.class, 
                new SpriteSpriteCollisionListener<Detective, Computer>(){
                    @Override
                    public void collision(Detective d, Computer c){
                        dec.setVel(0,0);
                        JOptionPane.showMessageDialog(sc, "This computer has been locked "
                                + "with a password. We need to enter a password to access it.");
                        Scanner input = new Scanner(System.in);
                        System.out.println("Enter password: ");
                        String code = input.nextLine();
                        if(code.equals("N0b3l_W1nn3r")){
                            clue.playOverlapping();
                            JOptionPane.showMessageDialog(sc, "You used the password to access the computer.");
                            JOptionPane.showMessageDialog(sc, "This computer mostly has documents and files "
                                    + "related to the research project on the desktop. But in Dr. Stockman's "
                                    + "email, there are a lot of emails from James Chaplin to Dr. Stockman. \n"
                                    + "In these emails, Chaplin is complaining about the lack of credit he "
                                    + "has gotten in the paper. He accuses Dr. Stockman of stealing his work "
                                    + "in order to keep the Nobel Prize for himself. \nThe last email states, "
                                    + "'YOU WON'T GET AWAY WITH THIS!!! THIS BETRAYAL WILL NOT STAND!!!"
                                    + "I WILL MAKE SURE YOU PAY FOR WHAT YOU DID TO ME!!! \n"
                                    + "It appears we have two strong suspects in the murder of Dr. Stockman: "
                                    + "Bethany Cameron & James Chaplin. I will interview the two of them and "
                                    + "see which one is the killer.");
                            JOptionPane.showMessageDialog(sc, "Go to the body of Dr. Frederick Stockman.");
                            foundEmail[0] = true;
                        }
                        else{
                            JOptionPane.showMessageDialog(sc, "That was the wrong password.");
                        }
                    }
                });
    }
}
