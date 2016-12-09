/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Steve
 */
public class Main extends javax.swing.JFrame {

    static float[] hsb = new float[3];
    public static Color a;
    public static Color c = Color.red;
    public static float[] ba = Color.RGBtoHSB(255, 200, 200, hsb);
    public static Color b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
    public static String selected = "none";
    public static String color;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        String user = login.userna;
        //String color = null;
        ResultSet rsk;
        int index = 0;
        String query50 = "select color from colorchoice where username ='" + login.userna + "';";
        
            try {
                rsk = s.executeQuery(query50);
                while (rsk.next()) {
                    color = rsk.getString("color");
                    //System.out.println(rsk.getString("color"));
                    if (color.equals("red") || color.equals("Red") || color.equals("RED")) {
                        a = Color.red;
                        index=0;
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("blue") || color.equals("Blue") || color.equals("BLUE")) {
                        a = Color.BLUE;
                        index=1;
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("cyan") || color.equals("Cyan") || color.equals("CYAN")) {
                        a = Color.CYAN;
                        index=2;
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("green") || color.equals("Green") || color.equals("GREEN")) {
                        a = Color.GREEN;
                        index=4;
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("gray")|| color.equals("Gray") || color.equals("GRAY")) {
                        a = Color.GRAY;
                        index=3;
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("yellow") || color.equals("Yellow") || color.equals("YELLOW")) {
                        a = Color.YELLOW;
                        index=8;
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("magenta") || color.equals("Magenta") || color.equals("MAGENTA")) {
                        a = Color.MAGENTA;
                        index=5;
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("orange") || color.equals("Orange") || color.equals("ORANGE")) {
                        a = Color.ORANGE;
                        index=6;
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("pink") || color.equals("Pink") || color.equals("PINK")) {
                        a = Color.PINK;
                        index=7;
                        //helpers.DesignHelper.themeChange();
                    } else {
                        a = Color.red;
                        //helpers.DesignHelper.themeChange();
                    }
                    
                    //themeChange();
                }
                rsk.close();
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        cbTheme.setSelectedIndex(index);
        //System.out.println("SelectedItem for cb in Main() : " + cbTheme.getSelectedItem() + " Index: " + index);
        getTeachersDetails();

        jButton1.setMnemonic(KeyEvent.VK_L);
    }

    public void getColors() {
        ResultSet rsk;
        String query50 = "select color from colorchoice where username ='" + login.userna + "';";
        {
            try {
                rsk = s.executeQuery(query50);
                while (rsk.next()) {
                    color = rsk.getString("color");
                    System.out.println(rsk.getString("color"));
                    if (color.equals("red") || color.equals("Red") || color.equals("RED")) {
                        a = Color.red;
                        cbTheme.setSelectedIndex(0);
                        //helpers.DesignHelper.themeChange();
                    } else if (color.equals("blue") || color.equals("Blue") || color.equals("BLUE")) {
                        a = Color.BLUE;
                        cbTheme.setSelectedIndex(1);
                        //helpers.DesignHelper.themeChange();
                    } else if (color == "cyan" || color == "Cyan" || color == "CYAN") {
                        a = Color.CYAN;
                        cbTheme.setSelectedIndex(2);
                        //helpers.DesignHelper.themeChange();
                    } else if (color == "green" || color == "Green" || color == "GREEN") {
                        a = Color.GREEN;
                        cbTheme.setSelectedIndex(4);
                        //helpers.DesignHelper.themeChange();
                    } else if (color == "gray" || color == "Gray" || color == "GRAY") {
                        a = Color.GRAY;
                        cbTheme.setSelectedIndex(3);
                        //helpers.DesignHelper.themeChange();
                    } else if (color == "yellow" || color == "Yellow" || color == "YELLOW") {
                        a = Color.YELLOW;
                        cbTheme.setSelectedIndex(8);
                        //helpers.DesignHelper.themeChange();
                    } else if (color == "magenta" || color == "Magenta" || color == "MAGENTA") {
                        a = Color.MAGENTA;
                        cbTheme.setSelectedIndex(5);
                        //helpers.DesignHelper.themeChange();
                    } else if (color == "orange" || color == "Orange" || color == "ORANGE") {
                        a = Color.ORANGE;
                        cbTheme.setSelectedIndex(6);
                        //helpers.DesignHelper.themeChange();
                    } else if (color == "pink" || color == "Pink" || color == "PINK") {
                        a = Color.PINK;
                        cbTheme.setSelectedIndex(7);
                        //helpers.DesignHelper.themeChange();
                    } else {
                        a = Color.red;
                        //helpers.DesignHelper.themeChange();
                    }
                    System.out.println("SelectedItem for cb in Main() : " + cbTheme.getSelectedItem());
                    themeChange();
                }
                rsk.close();
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }

    public void themeChange() {

        float[] hsb = new float[3];
        //float[] ba = Color.RGBtoHSB(255, 80, 80, hsb);
        //Color b = Color.getHSBColor(hsb[0],hsb[1],hsb[2]);
        //System.out.println("SelectedItem for cb in themeChange() : " + cb.getSelectedItem());
        if ((cbTheme.getSelectedItem()).equals("Red")) {
            c = a;
            a = Color.red;
            ba = Color.RGBtoHSB(255, 200, 200, hsb);
            b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
            labelLogo.setBackground(a);
            color = "Red";
        } else if ((cbTheme.getSelectedItem()).equals("Blue")) {
            c = a;
            a = Color.BLUE;
            ba = Color.RGBtoHSB(200, 200, 255, hsb);
            b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
            labelLogo.setBackground(a);
            color = "Blue";
        } else if ((cbTheme.getSelectedItem()).equals("Cyan")) {
            c = a;
            a = Color.CYAN;
            ba = Color.RGBtoHSB(200, 255, 255, hsb);
            b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
            labelLogo.setBackground(a);
            color = "Cyan";
        } else if ((cbTheme.getSelectedItem()).equals("Gray")) {
            c = a;
            a = Color.GRAY;
            b = Color.LIGHT_GRAY;
            labelLogo.setBackground(a);
            color = "Gray";
        } else if ((cbTheme.getSelectedItem()).equals("Green")) {
            c = a;
            a = Color.GREEN;
            ba = Color.RGBtoHSB(200, 255, 200, hsb);
            b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
            labelLogo.setBackground(a);
            color = "Green";
        } else if ((cbTheme.getSelectedItem()).equals("Magenta")) {
            c = a;
            a = Color.MAGENTA;
            ba = Color.RGBtoHSB(255, 200, 255, hsb);
            b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
            labelLogo.setBackground(a);
            color = "Magenta";
        } else if ((cbTheme.getSelectedItem()).equals("Orange")) {
            c = a;
            a = Color.ORANGE;
            ba = Color.RGBtoHSB(255, 200, 100, hsb);
            b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
            labelLogo.setBackground(a);
            color = "Orange";
        } else if ((cbTheme.getSelectedItem()).equals("Pink")) {
            c = a;
            a = Color.PINK;
            ba = Color.RGBtoHSB(255, 200, 200, hsb);
            b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
            labelLogo.setBackground(a);
            color = "Pink";
        } else if ((cbTheme.getSelectedItem()).equals("Yellow")) {
            c = a;
            a = Color.YELLOW;
            ba = Color.RGBtoHSB(255, 255, 200, hsb);
            b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
            labelLogo.setBackground(a);
            color = "Yellow";
        }
    }

    void getTeachersDetails() {
        ResultSet rs;
        String tos = "T";

        query = "select category from login where username='" + login.userna + "';";
        try {
            rs = s.executeQuery(query);
            while (rs.next()) {
                tos = rs.getString("category");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet rs1;
        String loggedinUsername = null;
        if (tos.equals("T") || tos.equals("t")) {
            query = "select name from teachers_details where username='" + login.userna + "';";
        } else {
            query = "select name from students_details where username='" + login.userna + "';";
        }
        try {
            rs1 = s.executeQuery(query);
            while (rs1.next()) {
                loggedinUsername = rs1.getString("name");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (loggedinUsername == null) {
            jLabel1.setText("Hello " + login.userna + ".");
        } else {
            jLabel1.setText("Hello " + loggedinUsername + ".");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        newPanel = new javax.swing.JPanel();
        cbSection = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        new_tfName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        new_tfRollNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        new_tfCompulsory1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        new_tfCompulsory2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        new_tfCompulsory3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        new_tfOptional1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        new_tfOptional2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        new_bCancel = new javax.swing.JLabel();
        new_bSave = new javax.swing.JLabel();
        modifyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        mod_tfCompulsory1 = new javax.swing.JTextField();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        mod_tfCompulsory2 = new javax.swing.JTextField();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        mod_tfCompulsory3 = new javax.swing.JTextField();
        labelOptional1 = new javax.swing.JLabel();
        mod_bSave = new javax.swing.JLabel();
        mod_tfOptional1 = new javax.swing.JTextField();
        cbMod_Section = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mod_tfName = new javax.swing.JTextField();
        labelOptional2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        mod_tfOptional2 = new javax.swing.JTextField();
        cbMod_RollNo = new javax.swing.JComboBox();
        deletePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbDel_Section = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        cbDel_RollNo = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        del_tfName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        del_tfCompulsory1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        del_tfCompulsory2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        del_tfCompulsory3 = new javax.swing.JTextField();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        delLabelOptional1 = new javax.swing.JLabel();
        del_tfOptional1 = new javax.swing.JTextField();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        delLabelOptional2 = new javax.swing.JLabel();
        del_tfOptional2 = new javax.swing.JTextField();
        bDelete = new javax.swing.JLabel();
        resultPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        defaultPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        labelNew = new javax.swing.JLabel();
        labelDelete = new javax.swing.JLabel();
        labelModify = new javax.swing.JLabel();
        labelResult = new javax.swing.JLabel();
        bExit = new javax.swing.JLabel();
        cbTheme = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        newPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Section");

        jLabel7.setText("Name");

        jLabel8.setText("Roll No");

        jLabel9.setText("Physics");

        jLabel10.setText("Chemistry");

        jLabel11.setText("English");

        jLabel12.setText("Optional");

        jLabel13.setText("Optional");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Maths");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Biology");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("IP");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("IT");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("PHE");
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseClicked(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("OP");
        jRadioButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton6MouseClicked(evt);
            }
        });

        new_bCancel.setBackground(new java.awt.Color(255, 255, 255));
        new_bCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_bCancel.setText("Cancel");
        new_bCancel.setOpaque(true);
        new_bCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_bCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                new_bCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new_bCancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                new_bCancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new_bCancelMouseReleased(evt);
            }
        });

        new_bSave.setBackground(new java.awt.Color(255, 255, 255));
        new_bSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_bSave.setText("Save");
        new_bSave.setOpaque(true);
        new_bSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_bSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                new_bSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new_bSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                new_bSaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new_bSaveMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout newPanelLayout = new javax.swing.GroupLayout(newPanel);
        newPanel.setLayout(newPanelLayout);
        newPanelLayout.setHorizontalGroup(
            newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(newPanelLayout.createSequentialGroup()
                        .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(new_tfOptional1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newPanelLayout.createSequentialGroup()
                        .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(new_tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbSection, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(new_tfRollNo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(new_tfCompulsory1)
                                .addComponent(new_tfCompulsory2)
                                .addComponent(new_tfCompulsory3))
                            .addGroup(newPanelLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))))
                    .addGroup(newPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(new_tfOptional2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(new_bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        newPanelLayout.setVerticalGroup(
            newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(new_tfRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(new_tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(new_tfCompulsory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(new_tfCompulsory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(new_tfCompulsory3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_tfOptional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_tfOptional2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(73, 73, 73)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainPanel.add(newPanel, "card2");

        modifyPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Modify Panel");

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Maths");
        jRadioButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton7MouseClicked(evt);
            }
        });

        jLabel14.setText("Physics");

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Biology");
        jRadioButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton8MouseClicked(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setText("IP");
        jRadioButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton9MouseClicked(evt);
            }
        });

        jLabel15.setText("Chemistry");

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setText("IT");
        jRadioButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton10MouseClicked(evt);
            }
        });

        mod_tfCompulsory2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_tfCompulsory2ActionPerformed(evt);
            }
        });

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton11);
        jRadioButton11.setText("PHE");
        jRadioButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton11MouseClicked(evt);
            }
        });

        jLabel16.setText("English");

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setText("OP");
        jRadioButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton12MouseClicked(evt);
            }
        });

        labelOptional1.setText("Optional");

        mod_bSave.setBackground(new java.awt.Color(255, 255, 255));
        mod_bSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mod_bSave.setText("Save");
        mod_bSave.setOpaque(true);
        mod_bSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mod_bSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mod_bSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mod_bSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mod_bSaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mod_bSaveMouseReleased(evt);
            }
        });

        cbMod_Section.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMod_SectionItemStateChanged(evt);
            }
        });

        jLabel18.setText("Section");

        jLabel19.setText("Name");

        labelOptional2.setText("Optional");

        jLabel21.setText("Roll No");

        cbMod_RollNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMod_RollNoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout modifyPanelLayout = new javax.swing.GroupLayout(modifyPanel);
        modifyPanel.setLayout(modifyPanelLayout);
        modifyPanelLayout.setHorizontalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mod_bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelOptional1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton12))
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addComponent(labelOptional2)
                        .addGap(9, 9, 9)))
                .addGap(48, 48, 48)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton11))
                    .addComponent(cbMod_Section, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMod_RollNo, 0, 92, Short.MAX_VALUE)
                    .addComponent(mod_tfCompulsory2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(mod_tfName)
                    .addComponent(mod_tfCompulsory3)
                    .addComponent(mod_tfOptional1)
                    .addComponent(mod_tfOptional2))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(modifyPanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18)
                        .addComponent(jLabel21)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jLabel19))
                    .addGap(48, 48, 48)
                    .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(modifyPanelLayout.createSequentialGroup()
                            .addComponent(jRadioButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton8))
                        .addComponent(mod_tfCompulsory1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 151, Short.MAX_VALUE)))
        );
        modifyPanelLayout.setVerticalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbMod_Section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMod_RollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mod_tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(mod_tfCompulsory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mod_tfCompulsory3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mod_tfOptional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOptional1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOptional2)
                    .addComponent(mod_tfOptional2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(mod_bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(modifyPanelLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel21)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel19)
                    .addGap(31, 31, 31)
                    .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(mod_tfCompulsory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel16)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton8)
                        .addComponent(jRadioButton7))
                    .addContainerGap(175, Short.MAX_VALUE)))
        );

        mainPanel.add(modifyPanel, "card3");

        deletePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Delete panel");

        jLabel17.setText("Section");

        cbDel_Section.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDel_SectionItemStateChanged(evt);
            }
        });

        jLabel20.setText("Roll No");

        cbDel_RollNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDel_RollNoItemStateChanged(evt);
            }
        });

        jLabel22.setText("Name");

        jLabel23.setText("Physics");

        jLabel24.setText("Chemistry");

        jLabel25.setText("English");

        jRadioButton13.setText("Maths");

        jRadioButton14.setText("Biology");

        delLabelOptional1.setText("Optional");

        jRadioButton15.setText("OP");

        jRadioButton16.setText("IP");

        jRadioButton17.setText("IT");

        jRadioButton18.setText("Physical");

        delLabelOptional2.setText("Optional");

        bDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bDelete.setText("Delete");
        bDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bDeleteMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(delLabelOptional1)
                    .addComponent(jRadioButton15)
                    .addComponent(delLabelOptional2))
                .addGap(39, 39, 39)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addComponent(jRadioButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton18))
                    .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(deletePanelLayout.createSequentialGroup()
                            .addComponent(jRadioButton13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton14))
                        .addComponent(del_tfName)
                        .addComponent(del_tfCompulsory1)
                        .addComponent(del_tfCompulsory2)
                        .addComponent(del_tfCompulsory3)
                        .addComponent(del_tfOptional1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(cbDel_RollNo, 0, 92, Short.MAX_VALUE)
                        .addComponent(cbDel_Section, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(del_tfOptional2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbDel_Section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(cbDel_RollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(del_tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(del_tfCompulsory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(del_tfCompulsory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(del_tfCompulsory3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delLabelOptional1)
                    .addComponent(del_tfOptional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(del_tfOptional2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delLabelOptional2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(deletePanel, "card4");

        resultPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Result Panel");

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        mainPanel.add(resultPanel, "card5");

        defaultPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Please select an option from your left");

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultPanelLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(114, 114, 114))
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel5)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        mainPanel.add(defaultPanel, "card6");

        labelLogo.setBackground(java.awt.Color.red);
        labelLogo.setFont(new java.awt.Font("Terminator Two", 1, 18)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(255, 255, 255));
        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setText("Student Databse Management System");
        labelLogo.setOpaque(true);

        labelNew.setBackground(new java.awt.Color(255, 255, 255));
        labelNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNew.setText("New Record");
        labelNew.setOpaque(true);
        labelNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelNewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelNewMouseReleased(evt);
            }
        });

        labelDelete.setBackground(new java.awt.Color(255, 255, 255));
        labelDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDelete.setText("Delete Record");
        labelDelete.setOpaque(true);
        labelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelDeleteMouseReleased(evt);
            }
        });

        labelModify.setBackground(new java.awt.Color(255, 255, 255));
        labelModify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModify.setText("Modify Record");
        labelModify.setOpaque(true);
        labelModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelModifyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelModifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelModifyMouseExited(evt);
            }
        });

        labelResult.setBackground(new java.awt.Color(255, 255, 255));
        labelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResult.setText("Result Analysis");
        labelResult.setOpaque(true);
        labelResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelResultMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelResultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelResultMouseExited(evt);
            }
        });

        bExit.setBackground(new java.awt.Color(255, 255, 255));
        bExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bExit.setText("Exit");
        bExit.setOpaque(true);
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bExitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bExitMouseReleased(evt);
            }
        });

        cbTheme.setMaximumRowCount(9);
        cbTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Red", "Blue", "Cyan", "Gray", "Green", "Magenta", "Orange", "Pink", "Yellow" }));
        cbTheme.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbThemeItemStateChanged(evt);
            }
        });

        jButton1.setText("Log Out");
        jButton1.setToolTipText("Press alt+L to log out...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton2.setText("About");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelModify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cbTheme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(31, 31, 31)))
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelModify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewMouseClicked
        helpers.DesignHelper.labelClicked(newPanel, deletePanel, modifyPanel, resultPanel);
        helpers.DesignHelper.setLabelColor(labelNew, labelDelete, labelResult, labelModify);
        setSectionsTaught(cbSection);
        getStream(cbSection);
        getSubjects();
    }//GEN-LAST:event_labelNewMouseClicked

    private void labelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseClicked
        helpers.DesignHelper.labelClicked(deletePanel, newPanel, modifyPanel, resultPanel);
        helpers.DesignHelper.setLabelColor(labelDelete, labelNew, labelResult, labelModify);
        refreshDel();
    }//GEN-LAST:event_labelDeleteMouseClicked

    void getRollno(JComboBox ar, JComboBox br) {
        section = (String) ar.getSelectedItem();
        query = "select rollno from " + section + ";";
        Vector<String> sr = new Vector<>();
        try {
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                sr.add(rs.getString("rollno"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Request could not be completed due to an error.\nPlease contact administrator for more details.");
        }
        DefaultComboBoxModel jcbModel;
        jcbModel = new DefaultComboBoxModel(sr);
        br.setModel(jcbModel);
    }

    public static String optional1, optional2;

    private void labelModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModifyMouseClicked
        helpers.DesignHelper.labelClicked(modifyPanel, newPanel, deletePanel, resultPanel);
        helpers.DesignHelper.setLabelColor(labelModify, labelDelete, labelResult, labelNew);

        refreshMod();


    }//GEN-LAST:event_labelModifyMouseClicked

    private void labelResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResultMouseClicked
        helpers.DesignHelper.labelClicked(resultPanel, newPanel, deletePanel, modifyPanel);
        helpers.DesignHelper.setLabelColor(labelResult, labelDelete, labelNew, labelModify);
    }//GEN-LAST:event_labelResultMouseClicked

    private void labelNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewMouseEntered
        helpers.DesignHelper.colorLabel_MouseEntered(labelNew, labelDelete, labelResult, labelModify);
    }//GEN-LAST:event_labelNewMouseEntered

    private void labelNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewMouseExited
        helpers.DesignHelper.colorLabel_MouseExited(labelNew, labelDelete, labelResult, labelModify);
    }//GEN-LAST:event_labelNewMouseExited

    private void labelNewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewMousePressed
        helpers.DesignHelper.button_Pressed(labelNew);
    }//GEN-LAST:event_labelNewMousePressed

    private void labelNewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewMouseReleased
        helpers.DesignHelper.button_Released(labelNew);
    }//GEN-LAST:event_labelNewMouseReleased

    private void labelDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseEntered
        helpers.DesignHelper.colorLabel_MouseEntered(labelDelete, labelNew, labelResult, labelModify);
    }//GEN-LAST:event_labelDeleteMouseEntered

    private void labelDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseExited
        helpers.DesignHelper.colorLabel_MouseExited(labelDelete, labelNew, labelResult, labelModify);
    }//GEN-LAST:event_labelDeleteMouseExited

    private void labelDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMousePressed
        helpers.DesignHelper.button_Pressed(labelDelete);
    }//GEN-LAST:event_labelDeleteMousePressed

    private void labelDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseReleased
        helpers.DesignHelper.button_Released(labelDelete);
    }//GEN-LAST:event_labelDeleteMouseReleased

    private void labelModifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModifyMouseEntered
        helpers.DesignHelper.colorLabel_MouseEntered(labelModify, labelDelete, labelResult, labelNew);
    }//GEN-LAST:event_labelModifyMouseEntered

    private void labelModifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModifyMouseExited
        helpers.DesignHelper.colorLabel_MouseExited(labelModify, labelDelete, labelResult, labelNew);
    }//GEN-LAST:event_labelModifyMouseExited

    private void labelResultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResultMouseEntered
        helpers.DesignHelper.colorLabel_MouseEntered(labelResult, labelDelete, labelModify, labelNew);
    }//GEN-LAST:event_labelResultMouseEntered

    private void labelResultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResultMouseExited
        helpers.DesignHelper.colorLabel_MouseExited(labelResult, labelDelete, labelModify, labelNew);
    }//GEN-LAST:event_labelResultMouseExited


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void bExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseClicked
        ResultSet rs;
        String query1 = "select * from colorchoice;";
        String us;
        boolean ar = false;
        try {
            rs = s.executeQuery(query1);
            while (rs.next()) {
                us = rs.getString("username");
                if (us.equals(login.userna)) {
                    ar = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query2;
        if (ar) {
            query2 = "update colorchoice set color ='" + color + "' where username ='" + login.userna + "';";
            PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query2);
            try {
                stmt.execute(query2);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: bLogoutClicked(query2colorchoicemodify)");
            }
        } else {
            query2 = "insert into colorchoice values('" + login.userna + "','" + color + "');";
            //System.out.println(query2);
            PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query2);
            try {
                stmt.execute(query2);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: bLogoutClicked(query2colorchoiceinsert)"
                        + ex.getMessage());
            }
        }

        System.exit(0);
    }//GEN-LAST:event_bExitMouseClicked

    private void bExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseEntered
        helpers.DesignHelper.button_Entered(bExit);
    }//GEN-LAST:event_bExitMouseEntered

    private void bExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseExited
        helpers.DesignHelper.button_Exited(bExit);
    }//GEN-LAST:event_bExitMouseExited

    private void bExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMousePressed
        helpers.DesignHelper.button_Pressed(bExit);
    }//GEN-LAST:event_bExitMousePressed

    private void bExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseReleased

    }//GEN-LAST:event_bExitMouseReleased

    private void cbThemeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbThemeItemStateChanged
        helpers.DesignHelper.themeChange();
        if (labelNew.getBackground() == c) {
            labelNew.setBackground(a);
            labelDelete.setBackground(Color.WHITE);
            labelModify.setBackground(Color.WHITE);
            labelResult.setBackground(Color.WHITE);
        }
        if (labelDelete.getBackground() == c) {
            labelDelete.setBackground(a);
            labelNew.setBackground(Color.WHITE);
            labelModify.setBackground(Color.WHITE);
            labelResult.setBackground(Color.WHITE);
        }
        if (labelModify.getBackground() == c) {
            labelModify.setBackground(a);
            labelDelete.setBackground(Color.WHITE);
            labelNew.setBackground(Color.WHITE);
            labelResult.setBackground(Color.WHITE);
        }
        if (labelResult.getBackground() == c) {
            labelResult.setBackground(a);
            labelDelete.setBackground(Color.WHITE);
            labelModify.setBackground(Color.WHITE);
            labelNew.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_cbThemeItemStateChanged

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        jLabel13.setText("IP");
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        jLabel13.setText("IT");
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jRadioButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseClicked
        jLabel13.setText("PHE");
    }//GEN-LAST:event_jRadioButton5MouseClicked

    private void jRadioButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton6MouseClicked
        if (stream.equalsIgnoreCase("commerce")) {
            jLabel13.setText("Accountancy");
        }
        if (stream.equalsIgnoreCase("humanities")) {
            jLabel13.setText("Economics");
        }
    }//GEN-LAST:event_jRadioButton6MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        jLabel12.setText("Maths");
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        jLabel12.setText("Biology");
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ResultSet rs;
        String query1 = "select * from colorchoice;";
        String us;
        boolean ar = false;
        try {
            rs = s.executeQuery(query1);
            while (rs.next()) {
                us = rs.getString("username");
                if (us.equals(login.userna)) {
                    ar = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query2;
        if (ar) {
            query2 = "update colorchoice set color ='" + color + "' where username ='" + login.userna + "';";
            PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query2);
            try {
                stmt.execute(query2);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: bLogoutClicked(query2colorchoicemodify)");
            }
        } else {
            query2 = "insert into colorchoice values('" + login.userna + "','" + color + "');";
            //System.out.println(query2);
            PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query2);
            try {
                stmt.execute(query2);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: bLogoutClicked(query2colorchoiceinsert)"
                        + ex.getMessage());
            }
        }

        a = Color.red;
        c = Color.red;
        ba = Color.RGBtoHSB(255, 200, 200, hsb);
        b = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
        selected = "none";
        color = "Red";

        this.setVisible(false);
        login login = new login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void new_bSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bSaveMouseEntered
        helpers.DesignHelper.button_Entered(new_bSave);
    }//GEN-LAST:event_new_bSaveMouseEntered

    private void new_bSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bSaveMouseExited
        helpers.DesignHelper.button_Exited(new_bSave);
    }//GEN-LAST:event_new_bSaveMouseExited

    private void new_bSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bSaveMousePressed
        helpers.DesignHelper.button_Pressed(new_bSave);
    }//GEN-LAST:event_new_bSaveMousePressed

    private void new_bSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bSaveMouseReleased
        helpers.DesignHelper.button_Released(new_bSave);
    }//GEN-LAST:event_new_bSaveMouseReleased

    private void new_bCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bCancelMouseEntered
        helpers.DesignHelper.button_Entered(new_bCancel);
    }//GEN-LAST:event_new_bCancelMouseEntered

    private void new_bCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bCancelMouseExited
        helpers.DesignHelper.button_Exited(new_bCancel);
    }//GEN-LAST:event_new_bCancelMouseExited

    private void new_bCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bCancelMousePressed
        helpers.DesignHelper.button_Pressed(new_bCancel);
    }//GEN-LAST:event_new_bCancelMousePressed

    private void new_bCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bCancelMouseReleased
        helpers.DesignHelper.button_Released(new_bCancel);
    }//GEN-LAST:event_new_bCancelMouseReleased

    void clearNew() {
        new_tfRollNo.setText(null);
        new_tfName.setText(null);
        new_tfCompulsory1.setText(null);
        new_tfCompulsory2.setText(null);
        new_tfCompulsory3.setText(null);
        new_tfOptional1.setText(null);
        new_tfOptional2.setText(null);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }
    private void new_bCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bCancelMouseClicked
        clearNew();
        JOptionPane.showMessageDialog(null, "Operation Canceled.");
    }//GEN-LAST:event_new_bCancelMouseClicked

    public static String name, op, op2, section, query = null, username = null;
    public static int rollno, comp1, comp2, comp3, opt1, opt2;
    public static Connection con = helpers.DBHelper.getConnection();
    public static Statement s = helpers.DBHelper.getStatement(con);

    void getNewInput() {
        name = new_tfName.getText();
        section = (String) cbSection.getSelectedItem();
        rollno = Integer.parseInt(new_tfRollNo.getText());
        comp1 = Integer.parseInt(new_tfCompulsory1.getText());
        comp2 = Integer.parseInt(new_tfCompulsory2.getText());
        comp3 = Integer.parseInt(new_tfCompulsory3.getText());
        opt1 = Integer.parseInt(new_tfOptional1.getText());
        opt2 = Integer.parseInt(new_tfOptional2.getText());

    }

    void getModInput() {
        name = mod_tfName.getText();
        section = (String) cbMod_Section.getSelectedItem();

        comp1 = Integer.parseInt(mod_tfCompulsory1.getText());
        comp2 = Integer.parseInt(mod_tfCompulsory2.getText());
        comp3 = Integer.parseInt(mod_tfCompulsory3.getText());
        opt1 = Integer.parseInt(mod_tfOptional1.getText());
        opt2 = Integer.parseInt(mod_tfOptional2.getText());

    }

    void getDelInput() {
        name = del_tfName.getText();
        section = (String) cbDel_Section.getSelectedItem();

        comp1 = Integer.parseInt(del_tfCompulsory1.getText());
        comp2 = Integer.parseInt(del_tfCompulsory2.getText());
        comp3 = Integer.parseInt(del_tfCompulsory3.getText());
        opt1 = Integer.parseInt(del_tfOptional1.getText());
        opt2 = Integer.parseInt(del_tfOptional2.getText());
    }

    void sciOpt2() {

        ResultSet rs;
        query = "select username from students_details where rollno=" + rollno + ";";
        try {
            rs = s.executeQuery(query);
            while (rs.next()) {
                username = rs.getString("username");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (jRadioButton1.isSelected()) {
            op = "maths";
        } else if (jRadioButton2.isSelected()) {
            op = "biology";
        } else {
            op = null;
            JOptionPane.showMessageDialog(null, "Please select optional subject 1");
        }

        if (jRadioButton3.isSelected()) {
            query = "insert into " + section + "(username, rollno, name, physics, chemistry, " + op + ", IP, english) values('" + username + "', " + rollno + ", '" + name + "', " + comp1 + ", " + comp2 + ", " + opt1 + ", " + opt2 + ", " + comp3 + ");";
            PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query);
            try {
                stmt.execute(query);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Record successfully inserted in " + section + "'s table.");
        }
        if (jRadioButton4.isSelected()) {
            query = "insert into " + section + "(username, rollno, name, physics, chemistry, " + op + ", IT, english) values('" + username + "', " + rollno + ", '" + name + "', " + comp1 + ", " + comp2 + ", " + opt1 + ", " + opt2 + ", " + comp3 + ");";
            PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query);
            try {
                stmt.execute(query);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Record successfully inserted in " + section + "'s table.");
        }
        if (jRadioButton5.isSelected()) {
            query = "insert into " + section + "(username, rollno, name, physics, chemistry, " + op + ", physical, english) values('" + username + "', " + rollno + ", '" + name + "', " + comp1 + ", " + comp2 + ", " + opt1 + ", " + opt2 + ", " + comp3 + ");";
            PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query);
            try {
                stmt.execute(query);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Record successfully inserted in " + section + "'s table.");
        }
    }

    void humOpt() {

        getNewInput();
        ResultSet rs;
        query = "select username from students_details where rollno=" + rollno + ";";
        try {
            rs = s.executeQuery(query);
            while (rs.next()) {
                username = rs.getString("username");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jRadioButton3.isSelected()) {
            op = "IP";
        } else if (jRadioButton4.isSelected()) {
            op = "IT";
        } else if (jRadioButton5.isSelected()) {
            op = "physical";
        } else if (jRadioButton6.isSelected()) {
            op = "economics";
        } else {
            op = null;
            JOptionPane.showMessageDialog(null, "Please select option subject");
        }
        query = "insert into " + section + "(username, rollno, name, english, politicalscience, " + op + ", geography, history) values('" + username + "', " + rollno + ", '" + name + "', " + comp1 + ", " + comp2 + ", " + opt2 + ", " + comp3 + ", " + opt1 + ");";
        PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query);
        try {
            stmt.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Record successfully inserted in " + section + "'s table.");

    }

    void comOpt() {

        getNewInput();
        ResultSet rs;
        query = "select username from students_details where rollno=" + rollno + ";";
        try {
            rs = s.executeQuery(query);
            while (rs.next()) {
                username = rs.getString("username");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jRadioButton3.isSelected()) {
            op = "IP";
        } else if (jRadioButton4.isSelected()) {
            op = "IT";
        } else if (jRadioButton5.isSelected()) {
            op = "physical";
        } else if (jRadioButton6.isSelected()) {
            op = "accountancy";
        } else {
            op = null;
            JOptionPane.showMessageDialog(null, "Please select option subject");
        }
        query = "insert into " + section + "(username, rollno, name, english, buisnessstudies, " + op + ", economics, maths) values('" + username + "', " + rollno + ", '" + name + "', " + comp1 + ", " + comp2 + ", " + opt2 + ", " + comp3 + ", " + opt1 + ");";
        PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query);
        try {
            stmt.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Record successfully inserted in " + section + "'s table.");
    }

    private void new_bSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_bSaveMouseClicked
        try {
            if (stream.equals("Science")) {
                getNewInput();
                sciOpt2();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: sciopt2");
        }
        try {
            if (stream.equals("Humanites")) {
                humOpt();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: humopt");
        }
        try {
            if (stream.equals("Commerce")) {
                comOpt();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: comopt");
        }
        clearNew();
    }//GEN-LAST:event_new_bSaveMouseClicked

    private void jRadioButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7MouseClicked

    private void jRadioButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8MouseClicked

    private void jRadioButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9MouseClicked

    private void jRadioButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10MouseClicked

    private void jRadioButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11MouseClicked

    private void jRadioButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12MouseClicked

    private void mod_bSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mod_bSaveMouseClicked
        try {
            if (stream.equals("Science")) {
                getModInput();
                ResultSet rs;
                query = "select username from students_details where rollno=" + rollno + ";";
                try {
                    rs = s.executeQuery(query);
                    while (rs.next()) {
                        username = rs.getString("username");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (jRadioButton7.isSelected()) {
                    op = "maths";
                } else if (jRadioButton8.isSelected()) {
                    op = "biology";
                } else {
                    op = null;
                    JOptionPane.showMessageDialog(null, "Please select optional subject 1");
                }

                if (jRadioButton9.isSelected()) {
                    op2 = "IP";
                }
                if (jRadioButton10.isSelected()) {
                    op2 = "IT";
                }
                if (jRadioButton11.isSelected()) {
                    op2 = "physical";
                }
                query = "update " + section + " set name ='" + name + "', physics=" + comp1 + ", chemistry =" + comp2 + ", english =" + comp3 + ", " + op + " = " + opt1 + ", " + op2 + " = " + opt2 + " where rollno = " + rollno + ";";
                PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query);
                try {
                    stmt.execute(query);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: bSaveMouseClicked(errStreamsci)");
                }
                JOptionPane.showMessageDialog(null, "Record modified successfully in " + section + "'s table.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: sciopt2");
        }
        try {
            if (stream.equals("Humanites")) {
                getModInput();
                ResultSet rs;
                query = "select username from students_details where rollno=" + rollno + ";";
                try {
                    rs = s.executeQuery(query);
                    while (rs.next()) {
                        username = rs.getString("username");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: humusernameinput");
                }

                if (jRadioButton9.isSelected()) {
                    op2 = "IP";
                }
                if (jRadioButton10.isSelected()) {
                    op2 = "IT";
                }
                if (jRadioButton11.isSelected()) {
                    op2 = "physical";
                }
                if (jRadioButton12.isSelected()) {
                    op2 = "economics";
                }
                query = "update " + section + " set name ='" + name + "', " + op2 + "=" + opt2 + ", politicalscience =" + comp2 + ", english =" + comp1 + ", history = " + opt1 + ", geography = " + comp3 + " where rollno = " + rollno + ";";
                PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query);
                try {
                    stmt.execute(query);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: bSaveMouseClicked(errStreamhum)");
                }
                JOptionPane.showMessageDialog(null, "Record modified successfully in " + section + "'s table.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: humopt");
        }
        try {
            if (stream.equals("Commerce")) {
                getModInput();
                ResultSet rs;
                query = "select username from students_details where rollno=" + rollno + ";";
                try {
                    rs = s.executeQuery(query);
                    while (rs.next()) {
                        username = rs.getString("username");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: comusernameinput");
                }

                if (jRadioButton9.isSelected()) {
                    op2 = "IP";
                }
                if (jRadioButton10.isSelected()) {
                    op2 = "IT";
                }
                if (jRadioButton11.isSelected()) {
                    op2 = "physical";
                }
                if (jRadioButton12.isSelected()) {
                    op2 = "accountancy";
                }
                query = "update " + section + " set name ='" + name + "', " + op2 + "=" + opt2 + ", buisnessstudies =" + comp2 + ", english =" + comp1 + ", maths = " + opt1 + ", economics = " + comp3 + " where rollno = " + rollno + ";";
                PreparedStatement stmt = helpers.DBHelper.getPreparedStatement(con, query);
                try {
                    stmt.execute(query);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: bSaveMouseClicked(errStreamcom)");
                }
                JOptionPane.showMessageDialog(null, "Record modified successfully in " + section + "'s table.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: comopt");
        }


    }//GEN-LAST:event_mod_bSaveMouseClicked

    void refreshDel() {
        setSectionsTaught(cbDel_Section);
        getStream(cbDel_Section);

        getRollno(cbDel_Section, cbDel_RollNo);
        jRadioButton13.setVisible(false);
        jRadioButton14.setVisible(false);
        jRadioButton15.setVisible(false);
        jRadioButton16.setVisible(false);
        jRadioButton17.setVisible(false);
        jRadioButton18.setVisible(false);
        try {
            rollno = Integer.parseInt((String) cbDel_RollNo.getSelectedItem());
        } catch (NumberFormatException e) {
            //JOptionPane.showMessageDialog(null, "No record found for this section.");
        }
        section = (String) cbDel_Section.getSelectedItem();
        query = "select * from " + section + " where rollno=" + rollno + ";";
        try {
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                try {
                    if (stream.equals("Science")) {

                        try {
                            if (!(rs.getString("maths")).equals(null)) {
                                optional1 = "Maths";
                                jRadioButton13.setSelected(true);

                                del_tfOptional1.setText(rs.getString("maths"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("biology")).equals(null)) {
                                optional1 = "Biology";
                                jRadioButton14.setSelected(true);
                                del_tfOptional1.setText(rs.getString("biology"));
                            }
                        } catch (Exception e) {
                        }

                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton16.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton17.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton18.setSelected(true);
                                del_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }

                        delLabelOptional1.setText(optional1);
                        delLabelOptional2.setText(optional2);
                        jLabel23.setText("Physics");
                        jLabel24.setText("Chemistry");
                        jLabel25.setText("English");
                        del_tfName.setText(rs.getString("name"));
                        del_tfCompulsory1.setText(rs.getString("physics"));
                        del_tfCompulsory2.setText(rs.getString("chemistry"));
                        del_tfCompulsory3.setText(rs.getString("english"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Science");
                }

                try {
                    if (stream.equals("Commerce")) {
                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton16.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton17.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton18.setSelected(true);
                                del_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("accountancy")).equals(null)) {
                                optional2 = "Accountancy";
                                jRadioButton15.setSelected(true);
                                del_tfOptional2.setText(rs.getString("accountancy"));
                            }
                        } catch (Exception e) {
                        }

                        delLabelOptional1.setText("Economics");
                        delLabelOptional2.setText(optional2);
                        jLabel23.setText("English");
                        jLabel24.setText("Buisness Studies");
                        jLabel25.setText("Economics");
                        del_tfName.setText(rs.getString("name"));
                        del_tfCompulsory1.setText(rs.getString("english"));
                        del_tfCompulsory2.setText(rs.getString("buisnessstudies"));
                        del_tfCompulsory3.setText(rs.getString("economics"));
                        del_tfOptional1.setText(rs.getString("maths"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Eco");
                }
                if (stream.equals("Humanities")) {
                    try {
                        if (!(rs.getString("IP")).equals(null)) {
                            optional2 = "IP";
                            jRadioButton16.setSelected(true);
                            del_tfOptional2.setText(rs.getString("IP"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("IT")).equals(null)) {
                            optional2 = "IT";
                            jRadioButton17.setSelected(true);
                            del_tfOptional2.setText(rs.getString("IT"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("physical")).equals(null)) {
                            optional2 = "Physical";
                            jRadioButton18.setSelected(true);
                            del_tfOptional2.setText(rs.getString("physical"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("economics")).equals(null)) {
                            optional2 = "Econimics";
                            jRadioButton15.setSelected(true);
                            del_tfOptional2.setText(rs.getString("accountancy"));
                        }
                    } catch (Exception e) {
                    }
                    delLabelOptional1.setText("History");
                    delLabelOptional2.setText(optional2);
                    jLabel23.setText("English");
                    jLabel24.setText("Political Science");
                    jLabel25.setText("Geography");
                    del_tfName.setText(rs.getString("name"));
                    del_tfCompulsory1.setText(rs.getString("english"));
                    del_tfCompulsory2.setText(rs.getString("politicalscience"));
                    del_tfCompulsory3.setText(rs.getString("geography"));
                    del_tfOptional1.setText(rs.getString("history"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    void refreshMod() {
        setSectionsTaught(cbMod_Section);
        getStream(cbMod_Section);

        getRollno(cbMod_Section, cbMod_RollNo);
        jRadioButton7.setVisible(false);
        jRadioButton8.setVisible(false);
        jRadioButton9.setVisible(false);
        jRadioButton10.setVisible(false);
        jRadioButton11.setVisible(false);
        jRadioButton12.setVisible(false);
        try {
            rollno = Integer.parseInt((String) cbMod_RollNo.getSelectedItem());
        } catch (NumberFormatException e) {
            // JOptionPane.showMessageDialog(null, "No record found for this section.");
        }
        section = (String) cbMod_Section.getSelectedItem();
        query = "select * from " + section + " where rollno=" + rollno + ";";
        try {
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                try {
                    if (stream.equals("Science")) {

                        try {
                            if (!(rs.getString("maths")).equals(null)) {
                                optional1 = "Maths";
                                jRadioButton7.setSelected(true);

                                mod_tfOptional1.setText(rs.getString("maths"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("biology")).equals(null)) {
                                optional1 = "Biology";
                                jRadioButton8.setSelected(true);
                                mod_tfOptional1.setText(rs.getString("biology"));
                            }
                        } catch (Exception e) {
                        }

                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton9.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton10.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton11.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }

                        labelOptional1.setText(optional1);
                        labelOptional2.setText(optional2);
                        jLabel14.setText("Physics");
                        jLabel15.setText("Chemistry");
                        jLabel16.setText("English");
                        mod_tfName.setText(rs.getString("name"));
                        mod_tfCompulsory1.setText(rs.getString("physics"));
                        mod_tfCompulsory2.setText(rs.getString("chemistry"));
                        mod_tfCompulsory3.setText(rs.getString("english"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Science");
                }

                try {
                    if (stream.equals("Commerce")) {
                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton9.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton10.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton11.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("accountancy")).equals(null)) {
                                optional2 = "Accountancy";
                                jRadioButton12.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("accountancy"));
                            }
                        } catch (Exception e) {
                        }

                        labelOptional1.setText("Economics");
                        labelOptional2.setText(optional2);
                        jLabel14.setText("English");
                        jLabel15.setText("Buisness Studies");
                        jLabel16.setText("Economics");
                        mod_tfName.setText(rs.getString("name"));
                        mod_tfCompulsory1.setText(rs.getString("english"));
                        mod_tfCompulsory2.setText(rs.getString("buisnessstudies"));
                        mod_tfCompulsory3.setText(rs.getString("economics"));
                        mod_tfOptional1.setText(rs.getString("maths"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Eco");
                }
                if (stream.equals("Humanities")) {
                    try {
                        if (!(rs.getString("IP")).equals(null)) {
                            optional2 = "IP";
                            jRadioButton9.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("IP"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("IT")).equals(null)) {
                            optional2 = "IT";
                            jRadioButton10.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("IT"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("physical")).equals(null)) {
                            optional2 = "Physical";
                            jRadioButton11.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("physical"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("economics")).equals(null)) {
                            optional2 = "Econimics";
                            jRadioButton12.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("accountancy"));
                        }
                    } catch (Exception e) {
                    }
                    labelOptional1.setText("History");
                    labelOptional2.setText(optional2);
                    jLabel14.setText("English");
                    jLabel15.setText("Political Science");
                    jLabel16.setText("Geography");
                    mod_tfName.setText(rs.getString("name"));
                    mod_tfCompulsory1.setText(rs.getString("english"));
                    mod_tfCompulsory2.setText(rs.getString("politicalscience"));
                    mod_tfCompulsory3.setText(rs.getString("geography"));
                    mod_tfOptional1.setText(rs.getString("history"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    private void mod_bSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mod_bSaveMouseEntered
        helpers.DesignHelper.button_Entered(mod_bSave);
    }//GEN-LAST:event_mod_bSaveMouseEntered

    private void mod_bSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mod_bSaveMouseExited
        helpers.DesignHelper.button_Exited(mod_bSave);
    }//GEN-LAST:event_mod_bSaveMouseExited

    private void mod_bSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mod_bSaveMousePressed
        helpers.DesignHelper.button_Pressed(mod_bSave);
    }//GEN-LAST:event_mod_bSaveMousePressed

    private void mod_bSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mod_bSaveMouseReleased
        helpers.DesignHelper.button_Released(mod_bSave);
    }//GEN-LAST:event_mod_bSaveMouseReleased

    private void mod_tfCompulsory2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_tfCompulsory2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mod_tfCompulsory2ActionPerformed

    private void cbMod_SectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMod_SectionItemStateChanged
        getRollno(cbMod_Section, cbMod_RollNo);

        try {
            rollno = Integer.parseInt((String) cbMod_RollNo.getSelectedItem());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No record found for this section.");
        }
        section = (String) cbMod_Section.getSelectedItem();
        query = "select * from " + section + " where rollno=" + rollno + ";";
        try {
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                try {
                    if (stream.equals("Science")) {

                        try {
                            if (!(rs.getString("maths")).equals(null)) {
                                optional1 = "Maths";
                                jRadioButton7.setSelected(true);

                                mod_tfOptional1.setText(rs.getString("maths"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("biology")).equals(null)) {
                                optional1 = "Biology";
                                jRadioButton8.setSelected(true);
                                mod_tfOptional1.setText(rs.getString("biology"));
                            }
                        } catch (Exception e) {
                        }

                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton9.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton10.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton11.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }

                        labelOptional1.setText(optional1);
                        labelOptional2.setText(optional2);
                        jLabel14.setText("Physics");
                        jLabel15.setText("Chemistry");
                        jLabel16.setText("English");
                        mod_tfName.setText(rs.getString("name"));
                        mod_tfCompulsory1.setText(rs.getString("physics"));
                        mod_tfCompulsory2.setText(rs.getString("chemistry"));
                        mod_tfCompulsory3.setText(rs.getString("english"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Science");
                }

                try {
                    if (stream.equals("Commerce")) {
                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton9.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton10.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton11.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("accountancy")).equals(null)) {
                                optional2 = "Accountancy";
                                jRadioButton12.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("accountancy"));
                            }
                        } catch (Exception e) {
                        }

                        labelOptional1.setText("Economics");
                        labelOptional2.setText(optional2);
                        jLabel14.setText("English");
                        jLabel15.setText("Buisness Studies");
                        jLabel16.setText("Economics");
                        mod_tfName.setText(rs.getString("name"));
                        mod_tfCompulsory1.setText(rs.getString("english"));
                        mod_tfCompulsory2.setText(rs.getString("buisnessstudies"));
                        mod_tfCompulsory3.setText(rs.getString("economics"));
                        mod_tfOptional1.setText(rs.getString("maths"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Eco");
                }
                if (stream.equals("Humanities")) {
                    try {
                        if (!(rs.getString("IP")).equals(null)) {
                            optional2 = "IP";
                            jRadioButton9.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("IP"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("IT")).equals(null)) {
                            optional2 = "IT";
                            jRadioButton10.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("IT"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("physical")).equals(null)) {
                            optional2 = "Physical";
                            jRadioButton11.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("physical"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("economics")).equals(null)) {
                            optional2 = "Econimics";
                            jRadioButton12.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("accountancy"));
                        }
                    } catch (Exception e) {
                    }
                    labelOptional1.setText("History");
                    labelOptional2.setText(optional2);
                    jLabel14.setText("English");
                    jLabel15.setText("Political Science");
                    jLabel16.setText("Geography");
                    mod_tfName.setText(rs.getString("name"));
                    mod_tfCompulsory1.setText(rs.getString("english"));
                    mod_tfCompulsory2.setText(rs.getString("politicalscience"));
                    mod_tfCompulsory3.setText(rs.getString("geography"));
                    mod_tfOptional1.setText(rs.getString("history"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_cbMod_SectionItemStateChanged

    private void cbMod_RollNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMod_RollNoItemStateChanged
        try {
            rollno = Integer.parseInt((String) cbMod_RollNo.getSelectedItem());
        } catch (NumberFormatException e) {
            // JOptionPane.showMessageDialog(null, "No record found for this section.");
        }
        section = (String) cbMod_Section.getSelectedItem();
        query = "select * from " + section + " where rollno=" + rollno + ";";
        try {
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                try {
                    if (stream.equals("Science")) {

                        try {
                            if (!(rs.getString("maths")).equals(null)) {
                                optional1 = "Maths";
                                jRadioButton7.setSelected(true);
                                mod_tfOptional1.setText(rs.getString("maths"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("biology")).equals(null)) {
                                optional1 = "Biology";
                                jRadioButton8.setSelected(true);
                                mod_tfOptional1.setText(rs.getString("biology"));
                            }
                        } catch (Exception e) {
                        }

                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton9.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton10.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton11.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }

                        labelOptional1.setText(optional1);
                        labelOptional2.setText(optional2);
                        jLabel14.setText("Physics");
                        jLabel15.setText("Chemistry");
                        jLabel16.setText("English");
                        mod_tfName.setText(rs.getString("name"));
                        mod_tfCompulsory1.setText(rs.getString("physics"));
                        mod_tfCompulsory2.setText(rs.getString("chemistry"));
                        mod_tfCompulsory3.setText(rs.getString("english"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Science");
                }

                try {
                    if (stream.equals("Commerce")) {
                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton9.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton10.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton11.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("accountancy")).equals(null)) {
                                optional2 = "Accountancy";
                                jRadioButton12.setSelected(true);
                                mod_tfOptional2.setText(rs.getString("accountancy"));
                            }
                        } catch (Exception e) {
                        }

                        labelOptional1.setText("Economics");
                        labelOptional2.setText(optional2);
                        jLabel14.setText("English");
                        jLabel15.setText("Buisness Studies");
                        jLabel16.setText("Economics");
                        mod_tfName.setText(rs.getString("name"));
                        mod_tfCompulsory1.setText(rs.getString("english"));
                        mod_tfCompulsory2.setText(rs.getString("buisnessstudies"));
                        mod_tfCompulsory3.setText(rs.getString("economics"));
                        mod_tfOptional1.setText(rs.getString("maths"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Eco");
                }
                if (stream.equals("Humanities")) {
                    try {
                        if (!(rs.getString("IP")).equals(null)) {
                            optional2 = "IP";
                            jRadioButton9.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("IP"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("IT")).equals(null)) {
                            optional2 = "IT";
                            jRadioButton10.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("IT"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("physical")).equals(null)) {
                            optional2 = "Physical";
                            jRadioButton11.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("physical"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("economics")).equals(null)) {
                            optional2 = "Econimics";
                            jRadioButton12.setSelected(true);
                            mod_tfOptional2.setText(rs.getString("accountancy"));
                        }
                    } catch (Exception e) {
                    }
                    labelOptional1.setText("History");
                    labelOptional2.setText(optional2);
                    jLabel14.setText("English");
                    jLabel15.setText("Political Science");
                    jLabel16.setText("Geography");
                    mod_tfName.setText(rs.getString("name"));
                    mod_tfCompulsory1.setText(rs.getString("english"));
                    mod_tfCompulsory2.setText(rs.getString("politicalscience"));
                    mod_tfCompulsory3.setText(rs.getString("geography"));
                    mod_tfOptional1.setText(rs.getString("history"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_cbMod_RollNoItemStateChanged

    private void bDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDeleteMouseEntered
        helpers.DesignHelper.button_Entered(bDelete);
    }//GEN-LAST:event_bDeleteMouseEntered

    private void bDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDeleteMouseExited
        helpers.DesignHelper.button_Exited(bDelete);
    }//GEN-LAST:event_bDeleteMouseExited

    private void bDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDeleteMousePressed
        helpers.DesignHelper.button_Pressed(bDelete);
    }//GEN-LAST:event_bDeleteMousePressed

    private void bDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDeleteMouseReleased
        helpers.DesignHelper.button_Released(bDelete);
    }//GEN-LAST:event_bDeleteMouseReleased

    private void cbDel_SectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDel_SectionItemStateChanged
        getRollno(cbDel_Section, cbDel_RollNo);
        jRadioButton13.setVisible(false);
        jRadioButton14.setVisible(false);
        jRadioButton15.setVisible(false);
        jRadioButton16.setVisible(false);
        jRadioButton17.setVisible(false);
        jRadioButton18.setVisible(false);
        try {
            rollno = Integer.parseInt((String) cbDel_RollNo.getSelectedItem());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No record found for this section.");
        }
        section = (String) cbDel_Section.getSelectedItem();
        query = "select * from " + section + " where rollno=" + rollno + ";";
        try {
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                try {
                    if (stream.equals("Science")) {

                        try {
                            if (!(rs.getString("maths")).equals(null)) {
                                optional1 = "Maths";
                                jRadioButton13.setSelected(true);

                                del_tfOptional1.setText(rs.getString("maths"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("biology")).equals(null)) {
                                optional1 = "Biology";
                                jRadioButton14.setSelected(true);
                                del_tfOptional1.setText(rs.getString("biology"));
                            }
                        } catch (Exception e) {
                        }

                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton16.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton17.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton18.setSelected(true);
                                del_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }

                        delLabelOptional1.setText(optional1);
                        delLabelOptional2.setText(optional2);
                        jLabel23.setText("Physics");
                        jLabel24.setText("Chemistry");
                        jLabel25.setText("English");
                        del_tfName.setText(rs.getString("name"));
                        del_tfCompulsory1.setText(rs.getString("physics"));
                        del_tfCompulsory2.setText(rs.getString("chemistry"));
                        del_tfCompulsory3.setText(rs.getString("english"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Science");
                }

                try {
                    if (stream.equals("Commerce")) {
                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton16.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton17.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton18.setSelected(true);
                                del_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("accountancy")).equals(null)) {
                                optional2 = "Accountancy";
                                jRadioButton15.setSelected(true);
                                del_tfOptional2.setText(rs.getString("accountancy"));
                            }
                        } catch (Exception e) {
                        }

                        delLabelOptional1.setText("Economics");
                        delLabelOptional2.setText(optional2);
                        jLabel23.setText("English");
                        jLabel24.setText("Buisness Studies");
                        jLabel25.setText("Economics");
                        del_tfName.setText(rs.getString("name"));
                        del_tfCompulsory1.setText(rs.getString("english"));
                        del_tfCompulsory2.setText(rs.getString("buisnessstudies"));
                        del_tfCompulsory3.setText(rs.getString("economics"));
                        del_tfOptional1.setText(rs.getString("maths"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Eco");
                }
                if (stream.equals("Humanities")) {
                    try {
                        if (!(rs.getString("IP")).equals(null)) {
                            optional2 = "IP";
                            jRadioButton16.setSelected(true);
                            del_tfOptional2.setText(rs.getString("IP"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("IT")).equals(null)) {
                            optional2 = "IT";
                            jRadioButton17.setSelected(true);
                            del_tfOptional2.setText(rs.getString("IT"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("physical")).equals(null)) {
                            optional2 = "Physical";
                            jRadioButton18.setSelected(true);
                            del_tfOptional2.setText(rs.getString("physical"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("economics")).equals(null)) {
                            optional2 = "Econimics";
                            jRadioButton15.setSelected(true);
                            del_tfOptional2.setText(rs.getString("accountancy"));
                        }
                    } catch (Exception e) {
                    }
                    delLabelOptional1.setText("History");
                    delLabelOptional2.setText(optional2);
                    jLabel23.setText("English");
                    jLabel24.setText("Political Science");
                    jLabel25.setText("Geography");
                    del_tfName.setText(rs.getString("name"));
                    del_tfCompulsory1.setText(rs.getString("english"));
                    del_tfCompulsory2.setText(rs.getString("politicalscience"));
                    del_tfCompulsory3.setText(rs.getString("geography"));
                    del_tfOptional1.setText(rs.getString("history"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_cbDel_SectionItemStateChanged

    private void cbDel_RollNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDel_RollNoItemStateChanged
        jRadioButton13.setVisible(false);
        jRadioButton14.setVisible(false);
        jRadioButton15.setVisible(false);
        jRadioButton16.setVisible(false);
        jRadioButton17.setVisible(false);
        jRadioButton18.setVisible(false);
        try {
            rollno = Integer.parseInt((String) cbDel_RollNo.getSelectedItem());
        } catch (NumberFormatException e) {
            // JOptionPane.showMessageDialog(null, "No record found for this section.");
        }
        section = (String) cbDel_Section.getSelectedItem();
        query = "select * from " + section + " where rollno=" + rollno + ";";
        try {
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                try {
                    if (stream.equals("Science")) {

                        try {
                            if (!(rs.getString("maths")).equals(null)) {
                                optional1 = "Maths";
                                jRadioButton13.setSelected(true);

                                del_tfOptional1.setText(rs.getString("maths"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("biology")).equals(null)) {
                                optional1 = "Biology";
                                jRadioButton14.setSelected(true);
                                del_tfOptional1.setText(rs.getString("biology"));
                            }
                        } catch (Exception e) {
                        }

                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton16.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton17.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton18.setSelected(true);
                                del_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }

                        delLabelOptional1.setText(optional1);
                        delLabelOptional2.setText(optional2);
                        jLabel23.setText("Physics");
                        jLabel24.setText("Chemistry");
                        jLabel25.setText("English");
                        del_tfName.setText(rs.getString("name"));
                        del_tfCompulsory1.setText(rs.getString("physics"));
                        del_tfCompulsory2.setText(rs.getString("chemistry"));
                        del_tfCompulsory3.setText(rs.getString("english"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Science");
                }

                try {
                    if (stream.equals("Commerce")) {
                        try {
                            if (!(rs.getString("IP")).equals(null)) {
                                optional2 = "IP";
                                jRadioButton16.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IP"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("IT")).equals(null)) {
                                optional2 = "IT";
                                jRadioButton17.setSelected(true);
                                del_tfOptional2.setText(rs.getString("IT"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("physical")).equals(null)) {
                                optional2 = "Physical";
                                jRadioButton18.setSelected(true);
                                del_tfOptional2.setText(rs.getString("physical"));
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (!(rs.getString("accountancy")).equals(null)) {
                                optional2 = "Accountancy";
                                jRadioButton15.setSelected(true);
                                del_tfOptional2.setText(rs.getString("accountancy"));
                            }
                        } catch (Exception e) {
                        }

                        delLabelOptional1.setText("Economics");
                        delLabelOptional2.setText(optional2);
                        jLabel23.setText("English");
                        jLabel24.setText("Buisness Studies");
                        jLabel25.setText("Economics");
                        del_tfName.setText(rs.getString("name"));
                        del_tfCompulsory1.setText(rs.getString("english"));
                        del_tfCompulsory2.setText(rs.getString("buisnessstudies"));
                        del_tfCompulsory3.setText(rs.getString("economics"));
                        del_tfOptional1.setText(rs.getString("maths"));

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Eco");
                }
                if (stream.equals("Humanities")) {
                    try {
                        if (!(rs.getString("IP")).equals(null)) {
                            optional2 = "IP";
                            jRadioButton16.setSelected(true);
                            del_tfOptional2.setText(rs.getString("IP"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("IT")).equals(null)) {
                            optional2 = "IT";
                            jRadioButton17.setSelected(true);
                            del_tfOptional2.setText(rs.getString("IT"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("physical")).equals(null)) {
                            optional2 = "Physical";
                            jRadioButton18.setSelected(true);
                            del_tfOptional2.setText(rs.getString("physical"));
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (!(rs.getString("economics")).equals(null)) {
                            optional2 = "Econimics";
                            jRadioButton15.setSelected(true);
                            del_tfOptional2.setText(rs.getString("accountancy"));
                        }
                    } catch (Exception e) {
                    }
                    delLabelOptional1.setText("History");
                    delLabelOptional2.setText(optional2);
                    jLabel23.setText("English");
                    jLabel24.setText("Political Science");
                    jLabel25.setText("Geography");
                    del_tfName.setText(rs.getString("name"));
                    del_tfCompulsory1.setText(rs.getString("english"));
                    del_tfCompulsory2.setText(rs.getString("politicalscience"));
                    del_tfCompulsory3.setText(rs.getString("geography"));
                    del_tfOptional1.setText(rs.getString("history"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_cbDel_RollNoItemStateChanged

    private void bDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDeleteMouseClicked
        rollno = Integer.parseInt((String) cbDel_RollNo.getSelectedItem());
        query = "delete from " + section + " where rollno=" + rollno + ";";
        try {
            s.execute(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error.");
        }
    }//GEN-LAST:event_bDeleteMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point frameLocation = this.getLocationOnScreen();
        Point drag = evt.getPoint();
        int zx, zy;
        zx = drag.x;
        zy = drag.y;
        int px, py, pa, pb;
        px = frameLocation.x;
        py = frameLocation.y;
        pa = inFrameLocation.x;
        pb = inFrameLocation.y;
        this.setLocation((zx + px) - pa, (zy + py) - pb);
    }//GEN-LAST:event_formMouseDragged
    Point inFrameLocation;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        inFrameLocation = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this, "©Steve Mann"
                + "\n"
                + "\n"
                + "This program is free software: you can redistribute it and/or modify\n"
                + "it under the terms of the GNU General Public License as published by\n"
                + "the Free Software Foundation, either version 3 of the License, or\n"
                + "(at your option) any later version.\n"
                + "\n"
                + "This program is distributed in the hope that it will be useful,\n"
                + "but WITHOUT ANY WARRANTY; without even the implied warranty of\n"
                + "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n"
                + "GNU General Public License for more details.\n"
                + "\n"
                + "You should have received a copy of the GNU General Public License\n"
                + "along with this program.  If not, see <http://www.gnu.org/licenses/>.");
    }//GEN-LAST:event_jButton2ActionPerformed

    public static String stream;

    void setSectionsTaught(JComboBox ar) {
        String query = "select section from sectionstaught where username='" + login.userna + "';";
        Vector<String> sr = new Vector<>();
        try {
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                sr.add(rs.getString("section"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Request could not be completed due to an error.\nPlease contact administrator for more details.");
        }
        DefaultComboBoxModel jcbModel;
        jcbModel = new DefaultComboBoxModel(sr);
        ar.setModel(jcbModel);

    }

    void getStream(JComboBox br) {
        String section = (String) br.getSelectedItem();

        String queryy = "select distinct stream from sections_list where section='" + section + "';";
        try {
            ResultSet rss = s.executeQuery(queryy);
            while (rss.next()) {
                stream = rss.getString("stream");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void getSubjects() {
        try {
            if (stream.equals("Science")) {
                jLabel9.setText("Physics");
                jLabel10.setText("Chemistry");
                jLabel11.setText("English");
                if (jRadioButton1.isSelected()) {
                    jLabel12.setText("Maths");
                } else if (jRadioButton2.isSelected()) {
                    jLabel12.setText("Biology");
                }
                if (jRadioButton3.isSelected()) {
                    jLabel13.setText("IP");
                } else if (jRadioButton4.isSelected()) {
                    jLabel13.setText("IT");
                } else if (jRadioButton5.isSelected()) {
                    jLabel13.setText("PHE");
                }
                jRadioButton6.setVisible(false);

            } else if (stream.equals("Commerce")) {
                jLabel9.setText("English");
                jLabel10.setText("Buisness Studies");
                jLabel11.setText("Economics");
                jLabel12.setText("Maths");
                jRadioButton1.setVisible(false);
                jRadioButton2.setVisible(false);
                jRadioButton3.setVisible(true);
                jRadioButton4.setVisible(true);
                jRadioButton5.setVisible(true);
                jRadioButton6.setVisible(true);
                jRadioButton6.setText("Accountancy");
            } else if (stream.equals("Humanities")) {
                jLabel9.setText("English");
                jLabel10.setText("Political Science");
                jLabel11.setText("Geography");
                jLabel12.setText("History");
                jRadioButton1.setVisible(false);
                jRadioButton2.setVisible(false);
                jRadioButton3.setVisible(true);
                jRadioButton4.setVisible(true);
                jRadioButton5.setVisible(true);
                jRadioButton6.setVisible(true);
                jRadioButton6.setText("Economics");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Null Pointer Exception 0x2887");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bDelete;
    private javax.swing.JLabel bExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbDel_RollNo;
    private javax.swing.JComboBox cbDel_Section;
    private javax.swing.JComboBox cbMod_RollNo;
    private javax.swing.JComboBox cbMod_Section;
    private javax.swing.JComboBox cbSection;
    public static javax.swing.JComboBox cbTheme;
    public static javax.swing.JPanel defaultPanel;
    private javax.swing.JLabel delLabelOptional1;
    private javax.swing.JLabel delLabelOptional2;
    private javax.swing.JTextField del_tfCompulsory1;
    private javax.swing.JTextField del_tfCompulsory2;
    private javax.swing.JTextField del_tfCompulsory3;
    private javax.swing.JTextField del_tfName;
    private javax.swing.JTextField del_tfOptional1;
    private javax.swing.JTextField del_tfOptional2;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    public static javax.swing.JLabel labelDelete;
    public static javax.swing.JLabel labelLogo;
    public static javax.swing.JLabel labelModify;
    public static javax.swing.JLabel labelNew;
    private javax.swing.JLabel labelOptional1;
    private javax.swing.JLabel labelOptional2;
    public static javax.swing.JLabel labelResult;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mod_bSave;
    private javax.swing.JTextField mod_tfCompulsory1;
    private javax.swing.JTextField mod_tfCompulsory2;
    private javax.swing.JTextField mod_tfCompulsory3;
    private javax.swing.JTextField mod_tfName;
    private javax.swing.JTextField mod_tfOptional1;
    private javax.swing.JTextField mod_tfOptional2;
    private javax.swing.JPanel modifyPanel;
    private javax.swing.JPanel newPanel;
    private javax.swing.JLabel new_bCancel;
    private javax.swing.JLabel new_bSave;
    private javax.swing.JTextField new_tfCompulsory1;
    private javax.swing.JTextField new_tfCompulsory2;
    private javax.swing.JTextField new_tfCompulsory3;
    private javax.swing.JTextField new_tfName;
    private javax.swing.JTextField new_tfOptional1;
    private javax.swing.JTextField new_tfOptional2;
    private javax.swing.JTextField new_tfRollNo;
    private javax.swing.JPanel resultPanel;
    // End of variables declaration//GEN-END:variables
}
