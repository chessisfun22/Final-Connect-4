import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AshwiniKumarFinalProject extends Drawing {

    public static void main(String[] args) {
        Runner.project = new AshwiniKumarFinalProject();
        Runner.project.drawGrid = drawGrid;
        Runner.project.directions = directions;
        Runner.project.windowTitle = windowTitle;
        Runner.main();
    }
    //Change this to false to turn off the grid
    static boolean drawGrid = false;
    //Change the strings in the the array to display your directions for your project
    static String[] directions = {"","Your goal is to get 4 in a row.","For every tile placed, you must play a minigame.",
                                    "Press r to restart board.","Press t to return to title screen.",""};
    static String windowTitle = "Ashwini -- Final Connect 4";
    //Global Variables go here
    Font title = new Font("Ariel", Font.BOLD, 50);
    Font title2 = new Font("Ariel", Font.BOLD, 60);
    Font title3 = new Font("Ariel", Font.ITALIC, 30);
    Font ins = new Font("Ariel", Font.PLAIN, 20);
    Font insBold = new Font("Ariel", Font.BOLD, 20);
    Color bg = new Color(198,224,245);
    Color board = new Color(0,119,200);

    //This 2D array contains all the circles for the connect 4 board.
    int[][] circ = {   {165, 220, 50, 50},
                       {235, 220, 50, 50},
                       {305, 220, 50, 50},
                       {375, 220, 50, 50},
                       {445, 220, 50, 50},
                       {515, 220, 50, 50},
                       {585, 220, 50, 50},
                       {165, 285, 50, 50},
                       {235, 285, 50, 50},
                       {305, 285, 50, 50},
                       {375, 285, 50, 50},
                       {445, 285, 50, 50},
                       {515, 285, 50, 50},
                       {585, 285, 50, 50},
                       {165, 350, 50, 50},
                       {235, 350, 50, 50},
                       {305, 350, 50, 50},
                       {375, 350, 50, 50},
                       {445, 350, 50, 50},
                       {515, 350, 50, 50},
                       {585, 350, 50, 50},
                       {165, 415, 50, 50},
                       {235, 415, 50, 50},
                       {305, 415, 50, 50},
                       {375, 415, 50, 50},
                       {445, 415, 50, 50},
                       {515, 415, 50, 50},
                       {585, 415, 50, 50},
                       {165, 480, 50, 50},
                       {235, 480, 50, 50},
                       {305, 480, 50, 50},
                       {375, 480, 50, 50},
                       {445, 480, 50, 50},
                       {515, 480, 50, 50},
                       {585, 480, 50, 50},
                       {165, 155, 50, 50},
                       {235, 155, 50, 50},
                       {305, 155, 50, 50},
                       {375, 155, 50, 50},
                       {445, 155, 50, 50},
                       {515, 155, 50, 50},
                       {585, 155, 50, 50}};

    int yFall = -100;
    //This 2d array has the initial positions of the red falling tiles on the title screen.
    int[][] redTitleCircles = { {10, yFall, 50, 50},
                                {110, yFall - 200, 50, 50},
                                {210, yFall + 50, 50, 50},
                                {310, yFall - 300, 50, 50},
                                {410, yFall - 100, 50, 50},
                                {510, yFall - 450, 50, 50},
                                {610, yFall + 20, 50, 50},
                                {740, yFall - 200, 50, 50}};

    //This 2d array has the initial positions of the yellow falling tiles on the title screen.
    int[][] yellowTitleCircles = { {50, yFall, 50, 50},
                                {160, yFall - 100, 50, 50},
                                {260, yFall + 20, 50, 50},
                                {360, yFall - 400, 50, 50},
                                {460, yFall - 50, 50, 50},
                                {560, yFall - 100, 50, 50},
                                {680, yFall - 300, 50, 50}};

    int[] xPosArr = {165, 235, 305, 375, 445, 515, 585};
    int[][] yPosArr = { {155, 220, 285, 350, 415, 480},
                        {155, 220, 285, 350, 415, 480},
                        {155, 220, 285, 350, 415, 480},
                        {155, 220, 285, 350, 415, 480},
                        {155, 220, 285, 350, 415, 480},
                        {155, 220, 285, 350, 415, 480},
                        {155, 220, 285, 350, 415, 480}};

    int[][] map2 =    {    {165, 155, 0, 0},
                           {235, 155, 0, 1},
                           {305, 155, 0, 2},
                           {375, 155, 0, 3},
                           {445, 155, 0, 4},
                           {515, 155, 0, 5},
                           {585, 155, 0, 6},
                           {165, 220, 1, 0},
                           {235, 220, 1, 1},
                           {305, 220, 1, 2},
                           {375, 220, 1, 3},
                           {445, 220, 1, 4},
                           {515, 220, 1, 5},
                           {585, 220, 1, 6},
                           {165, 285, 2, 0},
                           {235, 285, 2, 1},
                           {305, 285, 2, 2},
                           {375, 285, 2, 3},
                           {445, 285, 2, 4},
                           {515, 285, 2, 5},
                           {585, 285, 2, 6},
                           {165, 350, 3, 0},
                           {235, 350, 3, 1},
                           {305, 350, 3, 2},
                           {375, 350, 3, 3},
                           {445, 350, 3, 4},
                           {515, 350, 3, 5},
                           {585, 350, 3, 6},
                           {165, 415, 4, 0},
                           {235, 415, 4, 1},
                           {305, 415, 4, 2},
                           {375, 415, 4, 3},
                           {445, 415, 4, 4},
                           {515, 415, 4, 5},
                           {585, 415, 4, 6},
                           {165, 480, 5, 0},
                           {235, 480, 5, 1},
                           {305, 480, 5, 2},
                           {375, 480, 5, 3},
                           {445, 480, 5, 4},
                           {515, 480, 5, 5},
                           {585, 480, 5, 6}};

    int[][] minigame1 = {  {0, 0, 0},
                           {0, 0, 0},
                           {0, 0, 0}};

    int[][] map = {        {0, 1, 2},
                           {3, 4, 5},
                           {6, 7, 8}};

    int[][] bot =       {  {210, 90},
                           {390, 90},
                           {570, 90},
                           {210, 270},
                           {390, 270},
                           {570, 270},
                           {210, 450},
                           {390, 450},
                           {570, 450}};

    int[][] b = {               {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0}};

    int[][] diff = {   {400, 70},
                       {550, 70},
                       {700, 70},
                       {400, 190},
                       {550, 190},
                       {700, 190},
                       {400, 310},
                       {550, 310},
                       {700, 310}};

    int index = 3;
    int yUp = 650;
    int yTitle = 0;
    int phase = 0;
    int phaseTitle = 0;
    int speed = 0;
    int lock = 0;
    int lock2 = 0;
    int lock3 = 0;
    int lockOne = 0;
    int lockTwo = 0;
    int lockThree = 0;
    int lockFour = 0;
    int lockFive = 0;
    int lockSix = 0;
    int lockSeven = 0;
    int lockEight = 0;
    int lockNine = 0;
    int lockA = 0;
    int lockB = 0;
    int lockC = 0;
    int lockD = 0;
    int lockE = 0;
    int lockF = 0;
    int lockG = 0;
    int lockH = 0;
    int lockI = 0;
    int lockJ = 1;
    int lockK = 0;
    int lockL = 0;
    int lockM = 1;
    int lockN = 0;
    int lockO = 0;
    int lockP = 1;
    int lockQ = 0;
    int lockR = 0;
    int minigameDecider = 0;
    int xPos = 375;
    int yPos = 37;
    int count[] = {5, 5, 5, 5, 5, 5, 5};
    boolean place = true;
    int[][] allPlacedTiles = new int[42][3];
    int tile = 0;
    int myX = 0;
    int myY = 0;
    int xPlaced = 0;
    boolean winMiniGame1 = false;
    int xTar = -200;
    int yTar = -200;
    int countt = 0;
    int timer = 900;
    boolean alert = false;
    //difficulty 2 = 4 for easy target
    int difficulty2 = 4; //mid
    //difficulty 2 = 6 for hard target
    //difficulty 3 = 2 for easy wallVel
    int difficulty3 = 3;
    //difficulty 3 = 4 for hard wallVel
    int difficulty4 = 100;
    int difficulty5 = 2;
    int xPlayer = 700;
    int yPlayer = 290;
    int xPlayerVel = 6;
    int yPlayerVel = 6;
    int yRange = 0;
    int yRange2 = 0;
    int yRange3 = 0;
    int xWalls = -240;
    int xWalls2 = 40;
    int xWalls3 = -520;
    int streak = 1;
    int lastGame = 0;
    
    @Override
    public void drawPerFrame(Graphics2D g2d)
    {
        if(phase == 0)
        {
            drawTitleScreen(g2d);
            if(lockR == 0 && Mouse.button && Mouse.x > 275 && Mouse.x < 525 && Mouse.y > 360 && Mouse.y < 480)
            {
                phase = 1;
            }
            if(Mouse.button && Mouse.x > 275 && Mouse.x < 525 && Mouse.y > 270 && Mouse.y < 330)
            {
                phase = 2;
            }
            if(Mouse.button && Mouse.x > 275 && Mouse.x < 525 && Mouse.y > 180 && Mouse.y < 240)
            {
                phase = 3;
            }
            if(!(Mouse.button))
            {
                lockR = 0;
            }
        }
        if((phase != 6 && phase!= 7 && phase != 8) && (Keys.t || lock == 0 && Keys.left && phase== 3 || lock == 0 && phase == 3 && Mouse.button && Mouse.x > 40 && Mouse.x < 130 && Mouse.y > 490 && Mouse.y < 580))
        {
            phase = 0;
            reset(g2d);
        }
        if(lock == 0 && phase == 4 && Mouse.button && Mouse.x > 670 && Mouse.x < 760 && Mouse.y > 490 && Mouse.y < 580 || lock == 0 && phase == 4 && Keys.right)
        {
            phase = 5;
            lock = 1;
        }
        if(lock == 0 && phase == 5 && Mouse.button && Mouse.x > 40 && Mouse.x < 130 && Mouse.y > 490 && Mouse.y < 580 || phase == 3 && Mouse.button && Mouse.x > 670 && Mouse.x < 760 && Mouse.y > 490 && Mouse.y < 580 || lock == 0 && phase == 5 && Keys.left || lock == 0 && phase == 3 && Keys.right)
        {
            phase = 4;
            lock = 1;
        }
        if(lock == 0 && phase == 4 && Mouse.button && Mouse.x > 40 && Mouse.x < 130 && Mouse.y > 490 && Mouse.y < 580 || lock == 0 && phase == 4 && Keys.left)
        {
            phase = 3;
            lock = 1;
        }
        if(!(Mouse.button) && !(Keys.right) && !(Keys.left))
        {
            lock = 0;
        }
        if(phase == 2 && Mouse.button && Mouse.x> 160 && Mouse.x < 640 && Mouse.y > 400 && Mouse.y < 560)
        {
            lockR = 1;
            phase = 0;
        }
        if((phase != 6) && (phase != 7) && (phase != 8))
        {
            directions[0] = "";
            directions[1] = "Your goal is to get 4 in a row.";
            directions[2] = "For every tile placed, you must play a minigame.";
            directions[3] = "Press r to restart board.";
            directions[4] = "Press t to return to title screen.";
            directions[5] = "";

        }
        if((Keys.r && phase == 1) || (phase == 9) || (phase == 10))
        {
            reset(g2d);
        }
        if(phase == 1)
        {
            actualGame(g2d);
        }
        else if(phase == 2)
        {
            drawDiff(g2d);
        }
        else if(phase == 3)
        {
            drawRules1(g2d);
        }
        else if(phase == 4)
        {
            drawRules2(g2d);
        }
        else if(phase == 5)
        {
            drawRules3(g2d);
        }
        else if(phase == 6)
        {
            minigame1(g2d);
            directions[1] = "";
            directions[2] = "Tic Tac Toe"; //use this
            directions[3] = "Try and get 3 in a row!"; //use this
            directions[4] = "";
        }
        else if(phase == 7)
        {
            minigame2(g2d);
            directions[1] = "";
            directions[2] = "Click the targets"; //use this
            directions[3] = "When you press start, click the targets before the time runs out!"; //use this
            directions[4] = "";
        }
        else if(phase == 8)
        {
            minigame3(g2d);
            directions[1] = "";
            directions[2] = "Reach the end"; //use this
            directions[3] = "USE ARROW KEYS OR WASD TO GET TO THE GREEN!"; //use this
            directions[4] = "";
        }
        else if(phase == 9)
        {
            win(g2d);
        }
        else if(phase == 10)
        {
            lose(g2d);
        }
    }
    //Methods go HERE
    
    

    public void drawBoard(Graphics2D g2d)
    {
        g2d.setColor(board);
        g2d.fillRect(130, 135, 540, 420);
        Polygon darkTrap = new Polygon();
        darkTrap.addPoint(110,600);
        darkTrap.addPoint(130,555);
        darkTrap.addPoint(190,555);
        darkTrap.addPoint(210,600);
        g2d.fillPolygon(darkTrap);
        Polygon darkTrap2 = new Polygon();
        darkTrap2.addPoint(350,600);
        darkTrap2.addPoint(370,555);
        darkTrap2.addPoint(430,555);
        darkTrap2.addPoint(450,600);
        g2d.fillPolygon(darkTrap2);
        Polygon darkTrap3 = new Polygon();
        darkTrap3.addPoint(590,600);
        darkTrap3.addPoint(610,555);
        darkTrap3.addPoint(670,555);
        darkTrap3.addPoint(690,600);
        g2d.fillPolygon(darkTrap3);

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        Polygon border = new Polygon();
        border.addPoint(130, 135);
        border.addPoint(670, 135);
        border.addPoint(670, 555);
        border.addPoint(690, 599);
        border.addPoint(590, 599);
        border.addPoint(610, 555);
        border.addPoint(430, 555);
        border.addPoint(450, 599);
        border.addPoint(350, 599);
        border.addPoint(370, 555);
        border.addPoint(190, 555);
        border.addPoint(210, 599);
        border.addPoint(110, 599);
        border.addPoint(130, 555);
        g2d.drawPolygon(border);

        g2d.setStroke(new BasicStroke(3));
        for(int i = 0; i < circ.length; i++)
        {
            g2d.setColor(bg);
            g2d.fillOval(circ[i][0], circ[i][1], circ[i][2], circ[i][3]);
            g2d.setColor(Color.BLACK);
            g2d.drawOval(circ[i][0], circ[i][1], circ[i][2], circ[i][3]);
        }

        for(int i = 0; i< tile; i++)
        {
            drawPlaced(g2d, allPlacedTiles[i][0], allPlacedTiles[i][1], allPlacedTiles[i][2]);
        }
    }

    public void drawTitleScreen(Graphics2D g2d)
    {
        if(phaseTitle == 0)
        {
            yTitle += 1;
        }
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0,800,600);
        redFallTile(g2d);
        yellowFallTile(g2d);
        g2d.setColor(Color.BLACK);
        g2d.setFont(title2);
        g2d.drawString("Final Connect 4", 160, yTitle);

        if(yTitle > 100)
        {
            yTitle = 100;
            phaseTitle = 1;
        }
        display(g2d);
    }

    public void redFallTile(Graphics2D g2d)
    {
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2));
        for(int i = 0; i< redTitleCircles.length; i++)
        {
            g2d.fillOval(redTitleCircles[i][0], redTitleCircles[i][1], redTitleCircles[i][2], redTitleCircles[i][3]);
            g2d.setColor(Color.BLACK);
            g2d.drawOval(redTitleCircles[i][0], redTitleCircles[i][1], redTitleCircles[i][2], redTitleCircles[i][3]);
            g2d.setColor(Color.RED);
            speed = (int)(Math.random() * 50);
            redTitleCircles[i][1] += speed;
            if(redTitleCircles[i][1] > 600)
            {
                redTitleCircles[i][1] = yFall;
            }
        }
    }

    public void yellowFallTile(Graphics2D g2d)
    {
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(2));
        for(int i = 0; i< yellowTitleCircles.length; i++)
        {
            g2d.fillOval(yellowTitleCircles[i][0], yellowTitleCircles[i][1], yellowTitleCircles[i][2], yellowTitleCircles[i][3]);
            g2d.setColor(Color.BLACK);
            g2d.drawOval(yellowTitleCircles[i][0], yellowTitleCircles[i][1], yellowTitleCircles[i][2], yellowTitleCircles[i][3]);
            g2d.setColor(Color.YELLOW);
            speed = (int)(Math.random() * 50);
            yellowTitleCircles[i][1] += speed;
            if(yellowTitleCircles[i][1] > 600)
            {
                yellowTitleCircles[i][1] = yFall;
            }
        }
    }

    public void display(Graphics2D g2d)
    {
        g2d.setColor(board);
        g2d.fillRect(215, yUp, 370, 400);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(215, yUp, 370, 400);
        g2d.setColor(bg);
        g2d.fillRect(275, yUp + 40, 250, 60);
        g2d.fillRect(275, yUp + 130, 250, 60);
        g2d.fillRect(275, yUp + 220, 250, 120);
        g2d.setColor(Color.black);
        g2d.drawRect(275, yUp + 40, 250, 60);
        g2d.drawRect(275, yUp + 130, 250, 60);
        g2d.drawRect(275, yUp + 220, 250, 120);
        Font second = new Font("Helvetica", Font.PLAIN, 30);
        g2d.setFont(second);
        g2d.drawString("How to Play", 320, yUp + 80);
        g2d.drawString("Difficulty", 345, yUp + 170);
        g2d.setFont(title);
        g2d.drawString("PLAY", 335, yUp + 300);
        yUp -= 5;
        if(yUp < 140)
        {
            yUp = 140;
        }
    }

    public void drawRightArrow(Graphics2D g2d)
    {
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.black);
        g2d.drawRect(670, 490, 90, 90);
        Polygon arrow = new Polygon();
        arrow.addPoint(680, 520);
        arrow.addPoint(680, 550);
        arrow.addPoint(720, 550);
        arrow.addPoint(720, 570);
        arrow.addPoint(755, 535);
        arrow.addPoint(720, 500);
        arrow.addPoint(720, 520);
        g2d.fillPolygon(arrow);
    }

    public void drawLeftArrow(Graphics2D g2d)
    {
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.black);
        g2d.drawRect(40, 490, 90, 90);
        Polygon arrow = new Polygon();
        arrow.addPoint(120, 520);
        arrow.addPoint(120, 550);
        arrow.addPoint(80, 550);
        arrow.addPoint(80, 570);
        arrow.addPoint(45, 535);
        arrow.addPoint(80, 500);
        arrow.addPoint(80, 520);
        g2d.fillPolygon(arrow);
    }

    public void drawDiff(Graphics2D g2d)
    {
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0, 800, 600);
        redFallTile(g2d);
        yellowFallTile(g2d);
        Color bgLight = new Color(198, 224, 245, 150);
        g2d.setColor(bgLight);
        g2d.fillRect(0, 0, 800, 600);
        g2d.setColor(Color.BLACK);
        Font bro = new Font("Ariel", Font.BOLD, 30);
        g2d.setFont(bro);
        Font broo = new Font("TimesRoman", Font.PLAIN, 40);
        g2d.drawString("Tic Tac Toe:", 40, 100);
        g2d.drawString("Click the Targets:", 40, 220);
        g2d.drawString("Reach the end:", 40, 340);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        for(int i = 0; i <diff.length ;i++)
        {
            g2d.drawOval(diff[i][0],diff[i][1], 40, 40);
        }
        g2d.setFont(broo);
        g2d.drawString("Easy", 380, 50);
        g2d.drawString("Mid", 535, 50);
        g2d.drawString("Hard",677, 50);
        selectCirc(g2d);
        Color myGray = new Color(130, 130, 130, 100); 
        g2d.setColor(myGray);
        g2d.fillRect(160,400,480, 160);
        
        g2d.setColor(Color.black);
        g2d.setFont(bro);
        g2d.drawString("Return to title screen", 235, 490);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(160, 400, 480, 160);
        
    }

    public void selectCirc(Graphics2D g2d)
    {
        //tic tac toe
        g2d.setColor(Color.red);
        if((lockI == 0) && Mouse.x > diff[0][0] && Mouse.x < diff[0][0] + 40 && Mouse.button && Mouse.y > diff[0][1] && Mouse.y < diff[0][1] + 40)
        {
            lockI = 1;
            lockJ = 0;
            lockK = 0;
            difficulty5 = 1;
        }
        if(lockI == 1)
        {
            drawDiffCirc(g2d, diff[0][0], diff[0][1]);
        }
        g2d.setColor(Color.red);
        if((lockJ == 0) && Mouse.x > diff[1][0] && Mouse.x < diff[1][0] + 40 && Mouse.button && Mouse.y > diff[1][1] && Mouse.y < diff[1][1] + 40)
        {
            lockI = 0;
            lockJ = 1;
            lockK = 0;
            difficulty5 = 2;
        }
        if(lockJ == 1)
        {
            drawDiffCirc(g2d, diff[1][0], diff[1][1]);
        }
        g2d.setColor(Color.red);
        if((lockK == 0) && Mouse.x > diff[2][0] && Mouse.x < diff[2][0] + 40 && Mouse.button && Mouse.y > diff[2][1] && Mouse.y < diff[2][1] + 40)
        {
            lockI = 0;
            lockJ = 0;
            lockK = 1;
            difficulty5 = 3;
        }
        if(lockK == 1)
        {
            drawDiffCirc(g2d, diff[2][0], diff[2][1]);
        }
        //targets
        g2d.setColor(Color.red);
        if((lockL == 0) && Mouse.x > diff[3][0] && Mouse.x < diff[3][0] + 40 && Mouse.button && Mouse.y > diff[3][1] && Mouse.y < diff[3][1] + 40)
        {
            lockL = 1;
            lockM = 0;
            lockN = 0;
            difficulty2 = 2;
        }
        if(lockL == 1)
        {
            drawDiffCirc(g2d, diff[3][0], diff[3][1]);
        }
        g2d.setColor(Color.red);
        if((lockM == 0) && Mouse.x > diff[4][0] && Mouse.x < diff[4][0] + 40 && Mouse.button && Mouse.y > diff[4][1] && Mouse.y < diff[4][1] + 40)
        {
            lockL = 0;
            lockM = 1;
            lockN = 0;
            difficulty2 = 4;
        }
        if(lockM == 1)
        {
            drawDiffCirc(g2d, diff[4][0], diff[4][1]);
        }
        g2d.setColor(Color.red);
        if((lockN == 0) && Mouse.x > diff[5][0] && Mouse.x < diff[5][0] + 40 && Mouse.button && Mouse.y > diff[5][1] && Mouse.y < diff[5][1] + 40)
        {
            lockL = 0;
            lockM = 0;
            lockN = 1;
            difficulty2 = 5;
        }
        if(lockN == 1)
        {
            drawDiffCirc(g2d, diff[5][0], diff[5][1]);
        }
        //dodge the danger
        g2d.setColor(Color.red);
        if((lockO == 0) && Mouse.x > diff[6][0] && Mouse.x < diff[6][0] + 40 && Mouse.button && Mouse.y > diff[6][1] && Mouse.y < diff[6][1] + 40)
        {
            lockO = 1;
            lockP = 0;
            lockQ = 0;
            difficulty3 = 2;
            difficulty4 = 115;
        }
        if(lockO == 1)
        {
            drawDiffCirc(g2d, diff[6][0], diff[6][1]);
        }
        g2d.setColor(Color.red);
        if((lockP == 0) && Mouse.x > diff[7][0] && Mouse.x < diff[7][0] + 40 && Mouse.button && Mouse.y > diff[7][1] && Mouse.y < diff[7][1] + 40)
        {
            lockO = 0;
            lockP = 1;
            lockQ = 0;
            difficulty3 = 3;
            difficulty4 = 100;
        }
        if(lockP == 1)
        {
            drawDiffCirc(g2d, diff[7][0], diff[7][1]);
        }
        g2d.setColor(Color.red);
        if((lockQ == 0) && Mouse.x > diff[8][0] && Mouse.x < diff[8][0] + 40 && Mouse.button && Mouse.y > diff[8][1] && Mouse.y < diff[8][1] + 40)
        {
            lockO = 0;
            lockP = 0;
            lockQ = 1;
            difficulty3 = 4;
            difficulty4 = 85;
        }
        if(lockQ == 1)
        {
            drawDiffCirc(g2d, diff[8][0], diff[8][1]);
        }
    }

    public void drawDiffCirc(Graphics2D g2d, int x , int y)
    {
        g2d.fillOval(x, y, 40, 40);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(x, y, 40, 40);
    }

    public void drawRules1(Graphics2D g2d)
    {
        int yBoard = 240;
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0, 800, 600);
        drawRightArrow(g2d);
        drawLeftArrow(g2d);
        g2d.setFont(ins);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Use arrow keys to guide where the tile will go.", 180, 60);
        g2d.drawString("Press space or the down arrow to make the tile fall.", 160, 85);
        g2d.drawString("Tic Tac Toe, Click the Targets, or Dodge the Danger.", 150, 470);
        g2d.drawString("For every tile placed you must play 1 out of 3 minigames.", 125, 445);
        //drawing example board
        drawExampleBoard(g2d, yBoard);        
        //line for realism
        g2d.setColor(Color.black);
        g2d.drawLine(120, yBoard, 680, yBoard);
        //red tile 
        g2d.setColor(Color.red);
        g2d.fillOval(360, yBoard - 110, 80, 80);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(360, yBoard - 110, 80, 80);
        //left arrow
        Polygon arrow = new Polygon();
        arrow.addPoint(340, yBoard - 85);
        arrow.addPoint(340, yBoard - 55);
        arrow.addPoint(300, yBoard - 55);
        arrow.addPoint(300, yBoard - 35);
        arrow.addPoint(265, yBoard - 70);
        arrow.addPoint(300, yBoard - 105);
        arrow.addPoint(300, yBoard - 85);
        g2d.fillPolygon(arrow);
        //right arrow
        Polygon arrow1 = new Polygon();
        arrow1.addPoint(460, yBoard - 85);
        arrow1.addPoint(460, yBoard - 55);
        arrow1.addPoint(500, yBoard - 55);
        arrow1.addPoint(500, yBoard - 35);
        arrow1.addPoint(535, yBoard - 70);
        arrow1.addPoint(500, yBoard - 105);
        arrow1.addPoint(500, yBoard - 85);
        g2d.fillPolygon(arrow1);
    }
    
    public void drawExampleBoard(Graphics2D g2d, int yBoard)
    {
        //example board
        g2d.setColor(board);
        g2d.fillRect(120, yBoard, 560, 160);
        g2d.drawRect(120, yBoard, 560, 160);
        //holes in board
        g2d.setColor(Color.white);
        g2d.fillOval(150, yBoard + 40, 80, 80);
        g2d.fillOval(255, yBoard + 40, 80, 80);
        g2d.fillOval(360, yBoard + 40, 80, 80);
        g2d.fillOval(465, yBoard + 40, 80, 80);
        g2d.fillOval(570, yBoard + 40, 80, 80);
        g2d.setColor(Color.black);
        g2d.drawOval(150, yBoard + 40, 80, 80);
        g2d.drawOval(255, yBoard + 40, 80, 80);
        g2d.drawOval(360, yBoard + 40, 80, 80);
        g2d.drawOval(465, yBoard + 40, 80, 80);
        g2d.drawOval(570, yBoard + 40, 80, 80);
    }

    public void drawRules2(Graphics2D g2d)
    {
        int y = 82;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0, 800, 600);
        drawRightArrow(g2d);
        drawLeftArrow(g2d);
        g2d.setFont(ins);
        g2d.setColor(Color.BLACK);
        g2d.drawString("If you win the minigame the tile is yours!", 205, 40);
        g2d.drawString("If you get 4 in a row, you win!", 250, 65);
        g2d.drawString("If you lose the minigame the tile goes to the bot.", 170, 273);
        g2d.drawString("If the bot gets 4 in a row, you lose.", 235, 298);
        //drawing both example boards
        drawExampleBoard(g2d, y);
        drawExampleBoard(g2d, y + 232);
        //draw line for realism
        g2d.setColor(Color.black);
        g2d.drawLine(120, y + 160, 680, y+160);
        g2d.drawLine(120, y + 395, 680, y+395);
        //drawing win board
        g2d.setColor(Color.red);
        g2d.fillOval(150, y + 40, 80, 80);
        g2d.fillOval(255, y + 40, 80, 80);
        g2d.fillOval(360, y + 40, 80, 80);
        g2d.fillOval(465, y + 40, 80, 80);
        g2d.setColor(Color.black);
        g2d.drawOval(150, y + 40, 80, 80);
        g2d.drawOval(255, y + 40, 80, 80);
        g2d.drawOval(360, y + 40, 80, 80);
        g2d.drawOval(465, y + 40, 80, 80);
        //drawing lose board
        g2d.setColor(Color.yellow);
        g2d.fillOval(570, y + 272, 80, 80);
        g2d.fillOval(255, y + 272, 80, 80);
        g2d.fillOval(360, y + 272, 80, 80);
        g2d.fillOval(465, y + 272, 80, 80);
        g2d.setColor(Color.black);
        g2d.drawOval(570, y + 272, 80, 80);
        g2d.drawOval(255, y + 272, 80, 80);
        g2d.drawOval(360, y + 272, 80, 80);
        g2d.drawOval(465, y + 272, 80, 80);
    }

    public void drawRules3(Graphics2D g2d)
    {
        int y = 40;
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0, 800, 600);
        drawLeftArrow(g2d);
        g2d.setFont(ins);
        g2d.setColor(Color.BLACK);
        //key commands, difficulties, and how cyan text
        g2d.drawString("You can also change the difficulties of the", 200, y);
        g2d.drawString("minigames if you feel they're too easy or too hard", 165, y + 25);
        g2d.drawString("on the difficulty page from the title screen.", 193, y + 50);
        g2d.drawString("--Commands--", 320, y + 125);
        g2d.setFont(insBold);
    
        g2d.drawString("t", 278, y + 150);
        g2d.drawString("r", 323, y + 175);
        g2d.drawString("Good luck!", 344, y + 360);
        
        g2d.setFont(ins);
        g2d.drawString("Pressing", 191, y + 150);
        g2d.drawString(" will return you to the title screen.", 288, y + 150);
        g2d.drawString("Pressing", 236, y + 175);
        g2d.drawString(" will restart your board.", 333, y + 175);
        g2d.drawString("The instructions of the minigames", 240, y + 250);
        g2d.drawString("will be in the cyan text below.", 260, y + 275);
    }

    public void drawTile(Graphics2D g2d)
    {
        g2d.setColor(Color.red);
        g2d.fillOval(xPosArr[index], yPos, 50, 50);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(xPosArr[index], yPos, 50, 50);
        if((Keys.space || Keys.down) && count[index] >= 0 && lock3 == 0)
        {
            yPos = yPosArr[index][count[index]];
            count[index]--;
            lock3 = 1;
            place = true;
            allPlacedTiles[tile][0] = xPosArr[index];
            allPlacedTiles[tile][1] = yPos;
            allPlacedTiles[tile][2] = 1;
            tile++;
            
            minigameDecider = (int)(Math.random() * 3);
            if(minigameDecider + 6 == lastGame)
            {
                streak++;
            }
            else 
            {
                streak = 1;
            }
            if(streak >= 3)
            {
                while(minigameDecider + 6 == lastGame)
                {
                    minigameDecider = (int)(Math.random() * 3);
                }
                streak = 1;
            }
            phase = minigameDecider + 6;
            lastGame = phase;
            
        }
        if(!(Keys.space) && !(Keys.down))
        {
            lock3 = 0;
        }
        if(place && lock3 == 0)
        {
            yPos = 37;
            index = 3;
            place = false;
        }
        if(Keys.left && lock2 == 0 && index > 0 && !(place))
        {
            index--;
            lock2 = 1;
        }
        if(Keys.right && lock2 == 0 && index < 6 && !(place))
        {
            index++;
            lock2 = 1;
        }
        if(!(Keys.left) && !(Keys.right))
        {
            lock2 = 0;
        }
    }

    public void actualGame(Graphics2D g2d)
    {
        g2d.setColor(bg);
        g2d.fillRect(0,0,800,600);
        drawBoard(g2d);
        drawTile(g2d);
        findWin(g2d);
    }

    public void minigame1(Graphics2D g2d)
    {
        boolean loseMiniGame1 = false;
        g2d.setColor(board);
        g2d.fillRect(0,0,800,600);
        g2d.setColor(bg);
        drawSquares(g2d);

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(minigame1[i][j] == 2)
                {
                    drawX(g2d, bot[map[i][j]][0], bot[map[i][j]][1]);
                }
            }
        }

        lock(g2d);

        for(int i = 0; i<3; i++)
        {
            if(minigame1[i][0] == 1 && minigame1[i][1] == 1 && minigame1[i][2] == 1)
            {
                winMiniGame1 = true;
            }
            if(minigame1[0][i] == 1 && minigame1[1][i] == 1 && minigame1[2][i] == 1)
            {
                winMiniGame1 = true;
            }
        }
        if(minigame1[0][0] == 1 && minigame1[1][1] == 1 && minigame1[2][2] == 1)
        {
            winMiniGame1 = true;
        }
        if(minigame1[0][2] == 1 && minigame1[1][1] == 1 && minigame1[2][0] == 1)
        {
            winMiniGame1 = true;
        }

        for(int i = 0; i<3; i++)
        {
            if(minigame1[i][0] == 2 && minigame1[i][1] == 2 && minigame1[i][2] == 2)
            {
                loseMiniGame1 = true;
            }
            if(minigame1[0][i] == 2 && minigame1[1][i] == 2 && minigame1[2][i] == 2)
            {
                loseMiniGame1 = true;
            }
        }
        if(minigame1[0][0] == 2 && minigame1[1][1] == 2 && minigame1[2][2] == 2)
        {
            loseMiniGame1 = true;
        }
        if(minigame1[0][2] == 2 && minigame1[1][1] == 2 && minigame1[2][0] == 2)
        {
            loseMiniGame1 = true;
        }

        if(lockOne == 1 || lockTwo == 1 || lockThree == 1 || lockFour == 1 || lockFive == 1 || lockSix == 1 || lockSeven == 1 || lockEight == 1 || lockNine == 1)
        {
            if(xPlaced == 0 && !(winMiniGame1))
            {
                //alg for tic tac toe
                if(difficulty5 == 1)
                {
                    randXEasy(g2d);
                }
                else if(difficulty5 == 2)
                {
                    randXMid(g2d);
                }
                else if(difficulty5 == 3)
                {
                    randXHard(g2d);
                }
                
                xPlaced = 1;
            }
        }

        int noWin = 0;
        if(!(winMiniGame1))
        {
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    if(!(minigame1[i][j] == 0))
                    {
                        noWin++;
                    }
                }
            }
        }

        if(winMiniGame1)
        {
            allPlacedTiles[tile - 1][2] = 1;
            phase = 1;
            winMiniGame1 = false;
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    minigame1[i][j] = 0;
                }
            }
            lockOne = 0;
            lockTwo = 0;
            lockThree = 0;
            lockFour = 0;
            lockFive = 0;
            lockSix = 0;
            lockSeven = 0;
            lockEight = 0;
            lockNine = 0;
        }
        else if(noWin == 9 || loseMiniGame1)
        {
            allPlacedTiles[tile - 1][2] = 2;
            phase = 1;
            winMiniGame1 = false;
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    minigame1[i][j] = 0;
                }
            }
            lockOne = 0;
            lockTwo = 0;
            lockThree = 0;
            lockFour = 0;
            lockFive = 0;
            lockSix = 0;
            lockSeven = 0;
            lockEight = 0;
            lockNine = 0;
        }
    }
    
    public void randXEasy(Graphics2D g2d)
    {
        boolean stop = false;
        int choice = (int)(Math.random() * 9);
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(map[i][j] == choice && minigame1[i][j] == 0 && stop == false)
                {
                    minigame1[i][j] = 2;
                    stop = true;
                }
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(minigame1[i][j] == 0 && stop == false)
                {
                    minigame1[i][j] = 2;
                    stop = true;
                }
            }
        }
    }
    
    public void randXMid(Graphics2D g2d)
    {
        boolean stop = false;
        int choice = (int)(Math.random() * 9);
        //columns
        for(int i = 0; i < 3; i++)
        {
            if((minigame1[0][i] == 1 && minigame1[1][i] == 1 && minigame1[2][i] == 0) && stop == false)
            {
                minigame1[2][i] = 2;
                stop = true;
            }
            else if((minigame1[0][i] == 1 && minigame1[1][i] == 0 && minigame1[2][i] == 1) && stop == false)
            {
                minigame1[1][i] = 2;
                stop = true;
            }
            else if((minigame1[0][i] == 0 && minigame1[1][i] == 1 && minigame1[2][i] == 1) && stop == false)
            {
                minigame1[0][i] = 2;
                stop = true;
            }
        }
        //rows
        for(int i = 0; i < 3; i++)
        {
            if((minigame1[i][0] == 1 && minigame1[i][1] == 1 && minigame1[i][2] == 0) && stop == false)
            {
                minigame1[i][2] = 2;
                stop = true;
            }
            else if((minigame1[i][0] == 1 && minigame1[i][1] == 0 && minigame1[i][2] == 1) && stop == false)
            {
                minigame1[i][1] = 2;
                stop = true;
            }
            else if((minigame1[i][0] == 0 && minigame1[i][1] == 1 && minigame1[i][2] == 1) && stop == false)
            {
                minigame1[i][0] = 2;
                stop = true;
            }    
        }
        
        //diagonals
        if((minigame1[0][0] == 1 && minigame1[1][1] == 1 && minigame1[2][2] == 0) && stop == false)
        {
            minigame1[2][2] = 2;
            stop = true;
        }
        else if((minigame1[0][0] == 0 && minigame1[1][1] == 1 && minigame1[2][2] == 1) && stop == false)
        {
            minigame1[0][0] = 2;
            stop = true;
        }
        else if((minigame1[0][0] == 1 && minigame1[1][1] == 0 && minigame1[2][2] == 1) && stop == false)
        {
            minigame1[1][1] = 2;
            stop = true;
        }
        else if((minigame1[2][0] == 0 && minigame1[1][1] == 1 && minigame1[0][2] == 1) && stop == false)
        {
            minigame1[2][0] = 2;
            stop = true;
        }
        else if((minigame1[2][0] == 1 && minigame1[1][1] == 0 && minigame1[0][2] == 1) && stop == false)
        {
            minigame1[1][1] = 2;
            stop = true;
        }
        else if((minigame1[2][0] == 1 && minigame1[1][1] == 1 && minigame1[0][2] == 0) && stop == false)
        {
            minigame1[0][2] = 2;
            stop = true;
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                
                if(map[i][j] == choice && minigame1[i][j] == 0 && stop == false)
                {
                    minigame1[i][j] = 2;
                    stop = true;
                }
                
            }
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(minigame1[i][j] == 0 && stop == false)
                {
                    minigame1[i][j] = 2;
                    stop = true;
                }
            }
        }
    }
    
    public void randXHard(Graphics2D g2d)
    {
        boolean stop = false;
        int choice = (int)(Math.random() * 9);
        //columns for X 
        
        if(minigame1[1][1] == 0)
        {
            minigame1[1][1] = 2;
            stop = true;
        }
        //columns for X
        for(int i = 0; i < 3; i++)
        {
            if((minigame1[0][i] == 2 && minigame1[1][i] == 2 && minigame1[2][i] == 0) && stop == false)
            {
                minigame1[2][i] = 2;
                stop = true;
            }
            else if((minigame1[0][i] == 2 && minigame1[1][i] == 0 && minigame1[2][i] == 2) && stop == false)
            {
                minigame1[1][i] = 2;
                stop = true;
            }
            else if((minigame1[0][i] == 0 && minigame1[1][i] == 2 && minigame1[2][i] == 2) && stop == false)
            {
                minigame1[0][i] = 2;
                stop = true;
            }
        }
        //rows for X
        for(int i = 0; i < 3; i++)
        {
            if((minigame1[i][0] == 2 && minigame1[i][1] == 2 && minigame1[i][2] == 0) && stop == false)
            {
                minigame1[i][2] = 2;
                stop = true;
            }
            else if((minigame1[i][0] == 2 && minigame1[i][1] == 0 && minigame1[i][2] == 2) && stop == false)
            {
                minigame1[i][1] = 2;
                stop = true;
            }
            else if((minigame1[i][0] == 0 && minigame1[i][1] == 2 && minigame1[i][2] == 2) && stop == false)
            {
                minigame1[i][0] = 2;
                stop = true;
            }    
        }
        
        //columns for O blocking
        for(int i = 0; i < 3; i++)
        {
            if((minigame1[0][i] == 1 && minigame1[1][i] == 1 && minigame1[2][i] == 0) && stop == false)
            {
                minigame1[2][i] = 2;
                stop = true;
            }
            else if((minigame1[0][i] == 1 && minigame1[1][i] == 0 && minigame1[2][i] == 1) && stop == false)
            {
                minigame1[1][i] = 2;
                stop = true;
            }
            else if((minigame1[0][i] == 0 && minigame1[1][i] == 1 && minigame1[2][i] == 1) && stop == false)
            {
                minigame1[0][i] = 2;
                stop = true;
            }
        }
        //rows for O blocking
        for(int i = 0; i < 3; i++)
        {
            if((minigame1[i][0] == 1 && minigame1[i][1] == 1 && minigame1[i][2] == 0) && stop == false)
            {
                minigame1[i][2] = 2;
                stop = true;
            }
            else if((minigame1[i][0] == 1 && minigame1[i][1] == 0 && minigame1[i][2] == 1) && stop == false)
            {
                minigame1[i][1] = 2;
                stop = true;
            }
            else if((minigame1[i][0] == 0 && minigame1[i][1] == 1 && minigame1[i][2] == 1) && stop == false)
            {
                minigame1[i][0] = 2;
                stop = true;
            }    
        }
        
        //diagonal attacking
        if((minigame1[0][0] == 2 && minigame1[1][1] == 2 && minigame1[2][2] == 0) && stop == false)
        {
            minigame1[2][2] = 2;
            stop = true;
        }
        else if((minigame1[0][0] == 0 && minigame1[1][1] == 2 && minigame1[2][2] == 2) && stop == false)
        {
            minigame1[0][0] = 2;
            stop = true;
        }
        else if((minigame1[0][0] == 2 && minigame1[1][1] == 0 && minigame1[2][2] == 2) && stop == false)
        {
            minigame1[1][1] = 2;
            stop = true;
        }
        else if((minigame1[0][2] == 0 && minigame1[1][1] == 2 && minigame1[2][0] == 2) && stop == false)
        {
            minigame1[0][2] = 2;
            stop = true;
        }
        else if((minigame1[0][2] == 2 && minigame1[1][1] == 0 && minigame1[2][0] == 2) && stop == false)
        {
            minigame1[1][1] = 2;
            stop = true;
        }
        else if((minigame1[0][2] == 2 && minigame1[1][1] == 2 && minigame1[2][0] == 0) && stop == false)
        {
            minigame1[2][0] = 2;
            stop = true;
        }
        
        //diagonals for O blocking
        if((minigame1[0][0] == 1 && minigame1[1][1] == 1 && minigame1[2][2] == 0) && stop == false)
        {
            minigame1[2][2] = 2;
            stop = true;
        }
        else if((minigame1[0][0] == 0 && minigame1[1][1] == 1 && minigame1[2][2] == 1) && stop == false)
        {
            minigame1[0][0] = 2;
            stop = true;
        }
        else if((minigame1[0][0] == 1 && minigame1[1][1] == 0 && minigame1[2][2] == 1) && stop == false)
        {
            minigame1[1][1] = 2;
            stop = true;
        }
        else if((minigame1[0][2] == 0 && minigame1[1][1] == 1 && minigame1[2][0] == 1) && stop == false)
        {
            minigame1[0][2] = 2;
            stop = true;
        }
        else if((minigame1[0][2] == 1 && minigame1[1][1] == 0 && minigame1[2][0] == 1) && stop == false)
        {
            minigame1[1][1] = 2;
            stop = true;
        }
        else if((minigame1[0][2] == 1 && minigame1[1][1] == 1 && minigame1[2][0] == 0) && stop == false)
        {
            minigame1[2][0] = 2;
            stop = true;
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                
                if(map[i][j] == choice && minigame1[i][j] == 0 && stop == false)
                {
                    minigame1[i][j] = 2;
                    stop = true;
                }
                
            }
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(minigame1[i][j] == 0 && stop == false)
                {
                    minigame1[i][j] = 2;
                    stop = true;
                }
            }
        }
    }

    public void lock(Graphics2D g2d)
    {
        if(Mouse.button && Mouse.x > 170 && Mouse.x < 290 && Mouse.y > 70 && Mouse.y < 190 && minigame1[0][0] == 0)
        {
            drawO(g2d, 170, 70);
            lockOne = 1;
            minigame1[0][0] = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockOne == 1)
        {
            drawO(g2d, 170, 70);
        }
        if(lockOne == 1 && Mouse.button)
        {
            drawO(g2d, 170, 70);
        }

        if(Mouse.button && Mouse.x > 350 && Mouse.x < 470 && Mouse.y > 70 && Mouse.y < 190 && minigame1[0][1] == 0)
        {
            drawO(g2d, 350, 70);
            lockTwo = 1;
            minigame1[0][1] = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockTwo == 1)
        {
            drawO(g2d, 350, 70);
        }
        if(lockTwo == 1 && Mouse.button)
        {
            drawO(g2d, 350, 70);
        }

        if(Mouse.button && Mouse.x > 530 && Mouse.x < 650 && Mouse.y > 70 && Mouse.y < 190 && minigame1[0][2] == 0)
        {
            drawO(g2d, 530, 70);
            lockThree = 1;
            minigame1[0][2] = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockThree == 1)
        {
            drawO(g2d, 530, 70);
        }
        if(lockThree == 1 && Mouse.button)
        {
            drawO(g2d, 530, 70);
        }

        if(Mouse.button && Mouse.x > 170 && Mouse.x < 290 && Mouse.y > 250 && Mouse.y < 370 && minigame1[1][0] == 0)
        {
            drawO(g2d, 170, 250);
            lockFour = 1;
            minigame1[1][0] = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockFour == 1)
        {
            drawO(g2d, 170, 250);
        }
        if(lockFour == 1 && Mouse.button)
        {
            drawO(g2d, 170, 250);
        }

        if(Mouse.button && Mouse.x > 350 && Mouse.x < 470 && Mouse.y > 250 && Mouse.y < 370 && minigame1[1][1] == 0)
        {
            drawO(g2d, 350, 250);
            lockFive = 1;
            minigame1[1][1] = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockFive == 1)
        {
            drawO(g2d, 350, 250);
        }
        if(lockFive == 1 && Mouse.button)
        {
            drawO(g2d, 350, 250);
        }

        if(Mouse.button && Mouse.x > 530 && Mouse.x < 650 && Mouse.y > 250 && Mouse.y < 370 && minigame1[1][2] == 0)
        {
            drawO(g2d, 530, 250);
            lockSix = 1;
            minigame1[1][2] = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockSix == 1)
        {
            drawO(g2d, 530, 250);
        }
        if(lockSix == 1 && Mouse.button)
        {
            drawO(g2d, 530, 250);
        }

        if(Mouse.button && Mouse.x > 170 && Mouse.x < 290 && Mouse.y > 430 && Mouse.y < 550 && minigame1[2][0] == 0)
        {
            drawO(g2d, 170, 430);
            lockSeven = 1;
            minigame1[2][0] = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockSeven == 1)
        {
            drawO(g2d, 170, 430);
        }
        if(lockSeven == 1 && Mouse.button)
        {
            drawO(g2d, 170, 430);
        }

        if(Mouse.button && Mouse.x > 350 && Mouse.x < 470 && Mouse.y > 430 && Mouse.y < 550 && minigame1[2][1] == 0)
        {
            drawO(g2d, 350, 430);
            lockEight = 1;
            minigame1[2][1] = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockEight == 1)
        {
            drawO(g2d, 350, 430);
        }
        if(lockEight == 1 && Mouse.button)
        {
            drawO(g2d, 350, 430);
        }

        if(Mouse.button && Mouse.x > 530 && Mouse.x < 650 && Mouse.y > 430 && Mouse.y < 550 && minigame1[2][2] == 0)
        {
            drawO(g2d, 530, 430);
            minigame1[2][2] = 1;
            lockNine = 1;
            xPlaced = 0;
        }
        if(!(Mouse.button) && lockNine == 1)
        {
            drawO(g2d, 530, 430);
        }
        if(lockNine == 1 && Mouse.button)
        {
            drawO(g2d, 530, 430);
        }
    }

    

    public void reset(Graphics2D g2d)
    {
        tile = 0;
        yPos = 37;
        place = false;
        for(int i = 0; i < 7; i++)
        {
            count[i] = 5;
        }
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                b[i][j] = 0;
            }
        }
    }

    public void drawO(Graphics2D g2d, int x, int y)
    {
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.orange);
        g2d.fillOval(x + 20, y + 20, 80, 80);
        g2d.setColor(Color.black);
        g2d.drawOval(x + 20, y + 20, 80, 80);
        g2d.setColor(bg);
        g2d.fillOval(x + 35, y + 35, 50, 50);
        g2d.setColor(Color.black);
        g2d.drawOval(x + 35, y + 35, 50, 50);
    }

    public void drawX(Graphics2D g2d, int x, int y)
    {
        g2d.setColor(Color.red);
        Polygon shapeX = new Polygon();
        shapeX.addPoint(x, y);
        shapeX.addPoint(x - 20, y + 20);
        shapeX.addPoint(x, y + 40);
        shapeX.addPoint(x - 20, y + 60);
        shapeX.addPoint(x, y + 80);
        shapeX.addPoint(x + 20, y + 60);
        shapeX.addPoint(x + 40, y + 80);
        shapeX.addPoint(x + 60, y + 60);
        shapeX.addPoint(x + 40, y + 40);
        shapeX.addPoint(x + 60, y + 20);
        shapeX.addPoint(x + 40, y);
        shapeX.addPoint(x + 20, y + 20);
        g2d.fillPolygon(shapeX);
        g2d.setColor(Color.black);
        g2d.drawPolygon(shapeX);
    }

    public void drawSquares(Graphics2D g2d)
    {
        g2d.fillRect(170, 70, 120, 120);
        g2d.fillRect(170, 250, 120, 120);
        g2d.fillRect(170, 430, 120, 120);
        g2d.fillRect(350, 70, 120, 120);
        g2d.fillRect(350, 250, 120, 120);
        g2d.fillRect(350, 430, 120, 120);
        g2d.fillRect(530, 70, 120, 120);
        g2d.fillRect(530, 250, 120, 120);
        g2d.fillRect(530, 430, 120, 120);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(170, 70, 120, 120);
        g2d.drawRect(170, 250, 120, 120);
        g2d.drawRect(170, 430, 120, 120);
        g2d.drawRect(350, 70, 120, 120);
        g2d.drawRect(350, 250, 120, 120);
        g2d.drawRect(350, 430, 120, 120);
        g2d.drawRect(530, 70, 120, 120);
        g2d.drawRect(530, 250, 120, 120);
        g2d.drawRect(530, 430, 120, 120);
    }

    public void drawPlaced(Graphics2D g2d,int xPos, int yPos, int color)
    {
        if(color == 2)
        {
            g2d.setColor(Color.yellow);
        }
        else if(color == 1)
        {
            g2d.setColor(Color.red);
        }
        g2d.fillOval(xPos, yPos, 50, 50);
        g2d.setColor(Color.black);
        g2d.drawOval(xPos, yPos, 50, 50);

        //finding if you won or not
        //each array will be {xPos, yPos, rowIndex, columnIndex};
        for(int i = 0; i< 42; i++)
        {
            if(map2[i][0] == xPos && map2[i][1] == yPos && color == 2)
            {
                b[map2[i][2]][map2[i][3]] = 2;
            }
            else if(map2[i][0] == xPos && map2[i][1] == yPos && color == 1)
            {
                b[map2[i][2]][map2[i][3]] = 1;
            }
        }
    }

    public void findWin(Graphics2D g2d)
    {
        //vertical
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(b[i][j] == b[i+1][j] && b[i+1][j] == b[i+2][j] && b[i+2][j] == b[i+3][j])
                {
                    if(b[i][j] == 1)
                    {
                        phase = 9;
                    }
                    else if(b[i][j] == 2)
                    {
                        phase = 10;
                    }
                }
            }
        }
        //horizontal
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(b[i][j] == b[i][j+1] && b[i][j+1] == b[i][j+2] && b[i][j+2] == b[i][j+3])
                {
                    if(b[i][j] == 1)
                    {
                        phase = 9;
                    }
                    else if(b[i][j] == 2)
                    {
                        phase = 10;
                    }
                }
            }
        }
        //diagonal from top left to bottom right
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(b[i][j] == b[i+1][j+1] && b[i+1][j+1] == b[i+2][j+2] && b[i+2][j+2] == b[i+3][j+3])
                {
                    if(b[i][j] == 1)
                    {
                        phase = 9;
                    }
                    else if(b[i][j] == 2)
                    {
                        phase = 10;
                    }
                }
            }
        }
        //diagonal from top right to bottom left
        for(int i = 0; i < 3; i++)
        {
            for(int j = 3; j < 7; j++)
            {
                if(b[i][j] == b[i+1][j-1] && b[i+1][j-1] == b[i+2][j-2] && b[i+2][j-2] == b[i+3][j-3])
                {
                    if(b[i][j] == 1)
                    {
                        phase = 9;
                    }
                    else if(b[i][j] == 2)
                    {
                        phase = 10;
                    }
                }
            }
        }
    }

    public void win(Graphics2D g2d)
    {
        g2d.setColor(bg);
        g2d.fillRect(0,0,800, 600);
        redFallTile(g2d);
        g2d.setColor(Color.red);
        g2d.setStroke(new BasicStroke(2));
        for(int i = 0; i< yellowTitleCircles.length; i++)
        {
            g2d.fillOval(yellowTitleCircles[i][0], yellowTitleCircles[i][1], yellowTitleCircles[i][2], yellowTitleCircles[i][3]);
            g2d.setColor(Color.BLACK);
            g2d.drawOval(yellowTitleCircles[i][0], yellowTitleCircles[i][1], yellowTitleCircles[i][2], yellowTitleCircles[i][3]);
            g2d.setColor(Color.red);
            speed = (int)(Math.random() * 50);
            yellowTitleCircles[i][1] += speed;
            if(yellowTitleCircles[i][1] > 600)
            {
                yellowTitleCircles[i][1] = yFall;
            }
        }
        g2d.setColor(Color.black);
        g2d.setFont(title);
        g2d.drawString("You win!!", 275, 100);
        g2d.setFont(title3);
        g2d.drawString("Press t to return to title screen", 180, 140);
    }

    public void lose(Graphics2D g2d)
    {
        g2d.setColor(bg);
        g2d.fillRect(0,0,800, 600);
        yellowFallTile(g2d);
        g2d.setColor(Color.yellow);
        g2d.setStroke(new BasicStroke(2));
        for(int i = 0; i< redTitleCircles.length; i++)
        {
            g2d.fillOval(redTitleCircles[i][0], redTitleCircles[i][1], redTitleCircles[i][2], redTitleCircles[i][3]);
            g2d.setColor(Color.BLACK);
            g2d.drawOval(redTitleCircles[i][0], redTitleCircles[i][1], redTitleCircles[i][2], redTitleCircles[i][3]);
            g2d.setColor(Color.yellow);
            speed = (int)(Math.random() * 50);
            redTitleCircles[i][1] += speed;
            if(redTitleCircles[i][1] > 600)
            {
                redTitleCircles[i][1] = yFall;
            }
        }
        g2d.setColor(Color.black);
        g2d.setFont(title);
        g2d.drawString("You lose...", 272, 100);
        g2d.setFont(title3);
        g2d.drawString("Press t to return to title screen", 180, 140);
    }

    public void drawStart(Graphics2D g2d)
    {
        g2d.setColor(Color.black);
        g2d.fillRect(260, 60, 280, 100);
        g2d.setColor(Color.green);
        g2d.setFont(title2);
        g2d.drawString("START", 301, 130);
    }

    public void drawTarget(Graphics2D g2d)
    {
        boolean start = false;
        g2d.setColor(bg);
        g2d.fillRect(0,0, 800, 600);
        if(lockA == 0)
        {
            drawStart(g2d);
        }
        if(lockD != 1 && lockA == 0 && Mouse.button && Mouse.x > 200 && Mouse.x < 600 && Mouse.y > 60 && Mouse.y < 160)
        {
            start = true;
            lockA = 1;
            score(g2d);
        }
        if(Mouse.button && lockA == 0 && !(Mouse.x > 200 && Mouse.x < 600 && Mouse.y > 60 && Mouse.y < 160))
        {
            lockD = 1;
        }
        if(lockA == 1)
        {
            start = true;
            if(lockB == 0)
            {
                xTar = (int)(Math.random() * (640 - 20 + 1) + 20);
                yTar = (int)(Math.random() * (440 - 100 + 1) + 100);
                lockB = 1;
            }
        }
        if(!(Mouse.button))
        {
            lockC = 0;
            lockD = 0;
        }
        if((lockC == 0 && start && Mouse.button && Mouse.x> xTar && Mouse.x < xTar + 100 && Mouse.y > yTar && Mouse.y < yTar + 100) || (lockC == 0 && start && Mouse.button && Mouse.x > xTar - 30 && Mouse.x < xTar + 130 && Mouse.y > yTar + 45 && Mouse.y < yTar + 55) || (lockC == 0 && start && Mouse.button && Mouse.x > xTar + 45 && Mouse.x < xTar + 55 && Mouse.y > yTar - 30 && Mouse.y < yTar + 130))
        {
            xTar = (int)(Math.random() * (640 - 20 + 1) + 20);
            yTar = (int)(Math.random() * (440 - 100 + 1) + 100);
            lockC = 1;
            countt++;
        }
        if(lockC == 0 && Mouse.button && !(Mouse.x> xTar && Mouse.x < xTar + 100 && Mouse.y > yTar && Mouse.y < yTar + 100))
        {
            lockC = 1;
        }
        targetSprite(g2d);
        if(lockA != 0)
        {
            score(g2d);
            timer(g2d);
        }
        if(timer > 0 && countt >= 5)
        {
            allPlacedTiles[tile - 1][2] = 1;
            timer = 900;
            countt = 0;
            lockA = 0;
            lockB = 0;
            lockC = 0;
            lockD = 0;
            phase = 1;
            xTar = -200;
            yTar = -200;
        }
        if(timer <= 0 && countt <5)
        {
            allPlacedTiles[tile - 1][2] = 2;
            timer = 900;
            countt = 0;
            lockA = 0;
            lockB = 0;
            lockC = 0;
            lockD = 0;
            phase = 1;
            xTar = -200;
            yTar = -200;
        }
    }

    public void targetSprite(Graphics2D g2d)
    {
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.red);
        g2d.fillRect(xTar + 45, yTar - 30, 10, 160);
        g2d.fillRect(xTar - 30, yTar + 45, 160, 10);
        g2d.setColor(Color.white);
        g2d.fillOval(xTar, yTar, 100, 100);
        g2d.setColor(Color.red);
        g2d.drawOval(xTar, yTar, 100, 100);
        g2d.drawOval(xTar + 15 , yTar + 15, 70, 70);
        g2d.drawOval(xTar + 30 , yTar + 30, 40, 40);
        g2d.fillOval(xTar + 45, yTar + 45, 10, 10);
    }

    public void score(Graphics2D g2d)
    {
        g2d.setColor(Color.black);
        Font target = new Font("TimesRoman", Font.BOLD, 40);
        g2d.setFont(target);
        g2d.drawString("Score: " + countt, 20, 50);
    }

    public void timer(Graphics2D g2d)
    {
        g2d.setColor(Color.red);
        g2d.fillRect(400, 30, timer/3, 10);
        g2d.setColor(Color.black);
        g2d.drawRect(400, 30, 300, 10);
        if(timer > 0)
        {
            timer -= difficulty2;
        }
        else
        {
            alert = true;
        }
    }

    public void minigame2(Graphics2D g2d)
    {
        drawTarget(g2d);
    }

    public void drawChar(Graphics2D g2d)
    {
        g2d.setColor(Color.white);
        if(Keys.left || Keys.a)
        {
            g2d.fillRect(xPlayer - 2, yPlayer + 3, 25, 15);
            xPlayer -= xPlayerVel;
        }
        else if(Keys.right || Keys.d)
        {
            g2d.fillRect(xPlayer - 3, yPlayer + 3, 25, 15);
            xPlayer += xPlayerVel;
        }
        else if(Keys.up || Keys.w)
        {
            g2d.fillRect(xPlayer + 2, yPlayer - 3, 15, 25);
            yPlayer -= yPlayerVel;
        }
        else if(Keys.down || Keys.s)
        {
            g2d.fillRect(xPlayer + 2, yPlayer - 2, 15, 25);
            yPlayer += yPlayerVel;
        }
        if(xPlayer < 0)
        {
            xPlayer += xPlayerVel;
        }
        if(xPlayer > 780)
        {
            xPlayer -= xPlayerVel;
        }
        if(yPlayer < 0)
        {
            yPlayer += yPlayerVel;
        }
        if(yPlayer > 585)
        {
            yPlayer -= yPlayerVel;
        }
        if(!(Keys.down || Keys.up || Keys.left || Keys.right || Keys.w || Keys.a || Keys.s || Keys.d))
        {
            g2d.fillRect(xPlayer, yPlayer, 20, 20);
        }
    }

    public void minigame3(Graphics2D g2d)
    {
        //other variables
        boolean reset = false;
        int yMin = 100;
        int yMax = 500;
        int[] minigame3Player = {xPlayer, yPlayer, 20, 20};
        int[][] walls6 = {  {xWalls, 0, 40, yRange},
                        {xWalls, yRange + difficulty4, 40, 600 - yRange - difficulty4},
                        {xWalls2, 0, 40, yRange2},
                        {xWalls2, yRange2 + difficulty4, 40, 600 - yRange2 - difficulty4},
                        {xWalls3, 0, 40, yRange3},
                        {xWalls3, yRange3 + difficulty4, 40, 600 - yRange3 - difficulty4}};
        
        
        //moving and getting the variables
        if(lockE == 0)
        {
            yRange = (int)(Math.random() * (yMax - yMin + 1) + yMin);
            lockE = 1;
        }
        if(lockF == 0)
        {
            yRange2 = (int)(Math.random() * (yMax - yMin + 1) + yMin);
            lockF = 1;
        }
        if(lockG == 0)
        {
            yRange3 = (int)(Math.random() * (yMax - yMin + 1) + yMin);
            lockG = 1;
        }
        
        xWalls += difficulty3;
        xWalls2 += difficulty3;
        xWalls3 += difficulty3;
        
        if(xWalls > 800)
        {
            xWalls -= 840;
            lockE = 0;
        }
        if(xWalls2 > 800)
        {
            xWalls2 -= 840;
            lockF = 0;
        }
        if(xWalls3 > 800)
        {
            xWalls3 -= 840;
            lockG = 0;
        }
        //get the variables in the array
        
        
        //draw the green line
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, 800, 600);
        g2d.setColor(Color.green);
        g2d.fillRect(0, 0, 10, 600);
        
        
        //drqw the 6 walls
        g2d.setColor(Color.white);
        for(int i = 0; i< 6; i++)
        {
            g2d.fillRect(walls6[i][0], walls6[i][1], walls6[i][2], walls6[i][3]);
        }
        
        
        drawChar(g2d);
        
        //check win 
        if(xPlayer < 20)
        {
            allPlacedTiles[tile - 1][2] = 1;
            phase = 1;
            reset = true;
        }
        
        for(int i = 0; i <6; i++)
        {
            if(collide(minigame3Player, walls6[i]))
            {
                allPlacedTiles[tile - 1][2] = 2;
                phase = 1;
                reset = true;
            }
        }
        
        if(reset)
        {
            xPlayer = 700;
            yPlayer = 290;
            yRange = 0;
            yRange2 = 0;
            yRange3 = 0;
            xWalls = -240;
            xWalls2 = 40;
            xWalls3 = -520;
            lockE = 0;
            lockF = 0;
            lockG = 0;
            reset = false;
        }
    }

    public boolean collide(int[] a, int[] b)
    {
        if( a[0] + a[2] <= b[0]        ||
            a[0]        >= b[0] + b[2] ||
            a[1] + a[3] <= b[1]        ||
            a[1]        >= b[1] + b[3])
            {
                return false;
            }
        else
        {
            return true;
        }
    }
}