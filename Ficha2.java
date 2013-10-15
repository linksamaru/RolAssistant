package asistenterol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Linksamaru
 * @version 2.0
 *  MIT licensed
 */
//la version 1.0 fue con AWT mientras q la 2.0 con SWING

public class Ficha2 extends JFrame implements WindowListener{
    //fuerza
    private JButton addSTR=new JButton("+");
    private JButton subSTR=new JButton("-");
    private JTextField textSTR=new JTextField();
    private JLabel labelSTR=new JLabel("Fuerza: ");
    private JPanel panelSTR=new JPanel(new BorderLayout(4,1));
    
    //inteligencia
    private JButton addINT=new JButton("+");
    private JButton subINT=new JButton("-");
    private JTextField textINT=new JTextField();
    private JLabel labelINT=new JLabel("Inteligencia: ");
    private JPanel panelINT=new JPanel(new BorderLayout(4,1));
    
    //destreza
    private JButton addDEX=new JButton("+");
    private JButton subDEX=new JButton("-");
    private JTextField textDEX=new JTextField();
    private JLabel labelDEX=new JLabel("Destreza: ");
    private JPanel panelDEX=new JPanel(new BorderLayout(4,1));
    
    //percepcion
    private JButton addPER=new JButton("+");
    private JButton subPER=new JButton("-");
    private JTextField textPER=new JTextField();
    private JLabel labelPER=new JLabel("Percepcion: ");
    private JPanel panelPER=new JPanel(new BorderLayout(4,1));
    
    //resistencia
    private JButton addRES=new JButton("+");
    private JButton subRES=new JButton("-");
    private JTextField textRES=new JTextField();
    private JLabel labelRES=new JLabel("Resistencia: ");
    private JPanel panelRES=new JPanel(new BorderLayout(4,1));
    
    //labels de apartados
    private JLabel Atrib=new JLabel("Atributos: ");
    private JLabel Habi=new JLabel("Habilidades: ");
    private JLabel Dot=new JLabel("Dotes: ");
    private JLabel Equi=new JLabel("Equipo: ");
    private JLabel Crear1=new JLabel("Created By: ");
    private JLabel Crear2=new JLabel("Linksamaru");
    
    //paneles de apartados
    private JPanel Atributos=new JPanel(new BorderLayout(1,2));
    private JPanel Habilidades=new JPanel(new BorderLayout(1,2));
    private JPanel Dotes=new JPanel(new BorderLayout(1,2));
    private JPanel Equipo=new JPanel(new BorderLayout(1,2));
    private JPanel Creador=new JPanel(new BorderLayout(1,2));
    
    public Ficha2(){
        //panel atributo fuerza
        this.panelSTR.add(labelSTR);
        this.panelSTR.add(addSTR);
        this.panelSTR.add(textSTR);
        this.panelSTR.add(subSTR);
        //panel atributo inteligencia
        this.panelINT.add(labelINT);
        this.panelINT.add(addINT);
        this.panelINT.add(textINT);
        this.panelINT.add(subINT);
        //panel atributo destreza
        this.panelDEX.add(labelDEX);
        this.panelDEX.add(addDEX);
        this.panelDEX.add(textDEX);
        this.panelDEX.add(subDEX);
        //panel atributo fuerza
        this.panelPER.add(labelPER);
        this.panelPER.add(addPER);
        this.panelPER.add(textPER);
        this.panelPER.add(subPER);
        //panel atributo fuerza
        this.panelRES.add(labelRES);
        this.panelRES.add(addRES);
        this.panelRES.add(textRES);
        this.panelRES.add(subRES);
        //panel atributos
        this.Atributos.add(Atrib,BorderLayout.NORTH);
        
        
        
    }
    
    //funciones varias de ventana
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}
