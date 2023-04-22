import java.applet.*;
import java.awt.*;
import java.util.Scanner;
public class inputA extends Applet
{

public void paint(Graphics g){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name : ");
    String name=d.nextLine();
    g.drawString("Hello "+ name,100,100);
}
}