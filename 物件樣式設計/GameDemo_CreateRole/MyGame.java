import game.framework.*;
import java.util.*;
import java.awt.*; //for Color.white
import java.awt.event.*;
public class MyGame {
    public static void main(String[] args) {
//Step 1. 產生遊戲背景物件: 標題, 寬度, 高度, 背景顏色
    GameContext ctx = new GameContext ("MY Warrior Game", 500, 500, Color.white) ;
//Step 2. 產生遊戲物件 
    Game gameEngine = new Game(ctx ); //Game就是遊戲引擎
//Step 3. 產生各種角色 (目前是空的)
    ArrayList<Role> myroles = new ArrayList<> ();
    ImageSequence[][] is = { {new ImageSequence("A/2-" , "png", 8),
                          new ImageSequence("B/2-" , "png", 8)} };
        
    SampleRole5 player = new SampleRole5(200, 450, 50, 50, 0, -50, 450, is){                     
        public  void keyPressed(KeyEvent e) {
            if (e.getKeyChar()==' ') { 
                jumpAbility = !jumpAbility;
            }
            switch (e.getKeyCode()) {
               case KeyEvent.VK_LEFT://left
                 dx = -10; dim2 = 1; break;     //Remember just to set the state only       
               case KeyEvent.VK_RIGHT://right
                 dx = 10;  dim2 = 0; break;    //Remember just to set the state only  
            }
         }
        public  void keyReleased(KeyEvent e) {
            dx = 0;
        }
    };
    myroles.add(player ); 
    gameEngine.registerKeyEventHandler(player);
//Step 4: 開始執行
    gameEngine.go(myroles );
}
}