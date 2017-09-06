import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava2
{
    public static void main(String[] args)
    //Это главная хуёвина(окно), в которой отображается все
    {
        JFrame frame = new JFrame("HelloJava2");
        frame.add(new HelloComponent2("This is movieble text! OPA!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Эта хуёвина дает возможность выключать всё крестиком "Закрыть"
        //(самое, ска, полезное в программе)
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
class HelloComponent2 extends JComponent
implements MouseMotionListener
///Эта хуёвина отвечает за способность перемещать текст мышью
{String theMessage;
int messageX = 125, messageY = 95;
public HelloComponent2(String message){
    theMessage = message;
    addMouseMotionListener(this);
}
public void paintComponent(Graphics g){
    g.drawString(theMessage, messageX, messageY);
    //Эта хуёвина фиксирует текст в окне (самой первой хуёвине)
}
public void mouseDragged(MouseEvent e){
    messageX = e.getX();
    messageY = e.getY();
    repaint();
    //Эта хуёвина привязывает положение текста к кординатам,
    //что способствует перемещению второё хуёвины в пределах первой
}
public void mouseMoved(MouseEvent e){}
//С этой хуёвиной пока не ясно зачем она нужна
// Разобрался - просто безполязная хуёвина,
// так чисто игнорить мимо пролетающую мышь
//а ещё бкз него никак нельзя
}