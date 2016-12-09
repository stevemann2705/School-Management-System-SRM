/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import student.management.system.Main;
import static student.management.system.Main.a;
import static student.management.system.Main.b;
import static student.management.system.Main.ba;
import static student.management.system.Main.c;
import static student.management.system.Main.labelDelete;
import static student.management.system.Main.labelModify;
import static student.management.system.Main.labelNew;
import static student.management.system.Main.labelResult;
import student.management.system.login;
/**
 *
 * @author Developer
 */
public class DesignHelper {
    static String hello = Main.selected;
    public static void labelClicked(JPanel a, JPanel b, JPanel c, JPanel d){
        a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        JPanel r = student.management.system.Main.defaultPanel;
        r.setVisible(false);
    }
    
    public static void setLabelColor(JLabel a, JLabel b, JLabel c, JLabel d) {
        a.setBackground(Main.a);
        b.setBackground(Color.WHITE);
        c.setBackground(Color.WHITE);
        d.setBackground(Color.WHITE);
    }

    public static void colorLabel_MouseEntered(JLabel a, JLabel b, JLabel c, JLabel d) {
        if (a.getBackground() == Main.a) {
            b.setBackground(Color.WHITE);
            a.setBackground(Main.a);
            c.setBackground(Color.WHITE);
            d.setBackground(Color.WHITE);
        } else {
            a.setBackground(Main.b);
        }
    }

    public static void colorLabel_MouseExited(JLabel a, JLabel b, JLabel c, JLabel d) {
        if (a.getBackground() == Main.a) {
            b.setBackground(Color.WHITE);
            a.setBackground(Main.a);
            c.setBackground(Color.WHITE);
            d.setBackground(Color.WHITE);
        } else {
            a.setBackground(Color.WHITE);
        }
    }
    
    public static void button_Entered(JLabel a){
        a.setBackground(Main.b);
    }
    
    public static void button_Exited(JLabel a){
        a.setBackground(Color.WHITE);
    }
    
    public static void button_Pressed(JLabel a){
        a.setBackground(Main.a);
    }
    
    public static void button_Released(JLabel a){
        a.setBackground(Main.b);
    }
    
    
    
    public static void themeChange(){
        javax.swing.JComboBox cb = Main.cbTheme;
        javax.swing.JLabel logo = Main.labelLogo;
        float[] hsb = new float[3];
        //float[] ba = Color.RGBtoHSB(255, 80, 80, hsb);
        //Color b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
        //System.out.println("SelectedItem for cb in themeChange() : " + cb.getSelectedItem());
        if((cb.getSelectedItem()).equals("Red")){
            c=a;
            a= Color.red;
            ba = Color.RGBtoHSB(255, 200, 200, hsb);
            b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
            logo.setBackground(a);
            Main.color="Red";
        }
        else if((cb.getSelectedItem()).equals("Blue")){
            c=a;
            a = Color.BLUE;
            ba = Color.RGBtoHSB(200, 200, 255, hsb);
            b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
            logo.setBackground(a);
            Main.color="Blue";
        }
        else if((cb.getSelectedItem()).equals("Cyan")){
            c=a;
            a = Color.CYAN;
            ba = Color.RGBtoHSB(200, 255, 255, hsb);
            b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
            logo.setBackground(a);
            Main.color="Cyan";
        }
        else if((cb.getSelectedItem()).equals("Gray")){
            c=a;
            a = Color.GRAY;
            b=Color.LIGHT_GRAY;
            logo.setBackground(a);
            Main.color="Gray";
        }
        else if((cb.getSelectedItem()).equals("Green")){
            c=a;
            a = Color.GREEN;
            ba = Color.RGBtoHSB(200, 255, 200, hsb);
            b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
            logo.setBackground(a);
            Main.color="Green";
        }
        else if((cb.getSelectedItem()).equals("Magenta")){
            c=a;
            a = Color.MAGENTA;
            ba = Color.RGBtoHSB(255, 200, 255, hsb);
            b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
            logo.setBackground(a);
            Main.color="Magenta";
        }
        else if((cb.getSelectedItem()).equals("Orange")){
            c=a;
            a = Color.ORANGE;
            ba = Color.RGBtoHSB(255, 200, 100, hsb);
            b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
            logo.setBackground(a);
            Main.color="Orange";
        }
        else if((cb.getSelectedItem()).equals("Pink")){
            c=a;
            a = Color.PINK;
            ba = Color.RGBtoHSB(255, 200, 200, hsb);
            b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
            logo.setBackground(a);
            Main.color="Pink";
        }
        else if((cb.getSelectedItem()).equals("Yellow")){
            c=a;
            a = Color.YELLOW;
            ba = Color.RGBtoHSB(255, 255, 200, hsb);
            b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
            logo.setBackground(a);
            Main.color="Yellow";
        }
        
        /*Connection con = helpers.DBHelper.getConnection();
        Statement stmt = helpers.DBHelper.getStatement(con);
        String query = "insert into colorchoice values('"+login.userna+"', '"+Main.color+"';";
        
        try {
            stmt.execute(query);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error1");
        }*/
    }
}
