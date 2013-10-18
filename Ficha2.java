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
    private JPanel panelSTR=new JPanel(new GridLayout(1,4));
    
    //inteligencia
    private JButton addINT=new JButton("+");
    private JButton subINT=new JButton("-");
    private JTextField textINT=new JTextField();
    private JLabel labelINT=new JLabel("Inteligencia: ");
    private JPanel panelINT=new JPanel(new GridLayout(1,4));
    
    //destreza
    private JButton addDEX=new JButton("+");
    private JButton subDEX=new JButton("-");
    private JTextField textDEX=new JTextField();
    private JLabel labelDEX=new JLabel("Destreza: ");
    private JPanel panelDEX=new JPanel(new GridLayout(1,4));
    
    //percepcion
    private JButton addPER=new JButton("+");
    private JButton subPER=new JButton("-");
    private JTextField textPER=new JTextField();
    private JLabel labelPER=new JLabel("Percepcion: ");
    private JPanel panelPER=new JPanel(new GridLayout(1,4));
    
    //resistencia
    private JButton addRES=new JButton("+");
    private JButton subRES=new JButton("-");
    private JTextField textRES=new JTextField();
    private JLabel labelRES=new JLabel("Resistencia: ");
    private JPanel panelRES=new JPanel(new GridLayout(1,4));
    
    //labels de apartados
    private JLabel Atrib=new JLabel("Atributos: ");
    private JLabel Habi=new JLabel("Habilidades: ");
    private JLabel Dote=new JLabel("Dotes: ");
    private JLabel Equi=new JLabel("Equipo: ");
    private JLabel Crear1=new JLabel("                           Created By: ");
    private JLabel Crear2=new JLabel("                           Linksamaru");
    
    //botones de apartados
    private JButton Hab=new JButton("Añadir Habilidades");
    private JButton Dot=new JButton("Añadir Dotes");
    private JButton Equ=new JButton("Añadir Equipo");
    private JButton Fic=new JButton("Visualizar Ficha");
    
    //paneles de apartados
    private JPanel Atributos=new JPanel(new GridLayout(6,1));
    private JPanel Visual=new JPanel();
    private JPanel Habilidades=new JPanel(new GridLayout(2,1));
    private JPanel Dotes=new JPanel(new GridLayout(2,1));
    private JPanel Equipo=new JPanel(new GridLayout(2,1));
    private JPanel Creador=new JPanel(new GridLayout(2,1));
    
    //paneles de ordenacion
    private JPanel General11=new JPanel(new GridLayout(3,1));
    private JPanel General12=new JPanel(new GridLayout(3,1));
    private JPanel General1=new JPanel(new GridLayout(1,2));
    
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
        //panel atributo percepcion
        this.panelPER.add(labelPER);
        this.panelPER.add(addPER);
        this.panelPER.add(textPER);
        this.panelPER.add(subPER);
        //panel atributo resistencia
        this.panelRES.add(labelRES);
        this.panelRES.add(addRES);
        this.panelRES.add(textRES);
        this.panelRES.add(subRES);
        //panel atributos
        this.Atributos.add(Atrib);
        this.Atributos.add(panelSTR);
        this.Atributos.add(panelINT);
        this.Atributos.add(panelDEX);
        this.Atributos.add(panelPER);
        this.Atributos.add(panelRES);
        //panel visualizacion
        this.Visual.add(Fic);
        //panel habilidades
        this.Habilidades.add(Habi);
        this.Habilidades.add(Hab);
        //panel dotes
        this.Dotes.add(Dote);
        this.Dotes.add(Dot);
        //panel equipo
        this.Equipo.add(Equi);
        this.Equipo.add(Equ);
        //panel creador
        this.Creador.add(Crear1);
        this.Creador.add(Crear2);
        /*paneles de ordenacion
        * this.AtriVisua.add(Atributos);
        * this.AtriVisua.add(Visual);
        * this.AtriVisuaCrea(AtriVisua);
        * this.AtriVisuaCrea(Creador);
        * dado q no quiere funcionar lo añadire
        * con una grid de 3x2 y rezare 
        * al monstruo del espaguetti volador 
        * para q funcione
        */
        this.addDEX.setSize(3, 3);
        this.labelSTR.setSize(2, 8);
        this.General11.add(Atributos);
        this.General12.add(Habilidades);
        this.General11.add(Visual);
        this.General12.add(Dotes);
        this.General11.add(Creador);
        this.General12.add(Equipo);
        
        this.General1.add(General11);
        this.General1.add(General12);
        this.add(General1);
        
        this.setBounds(200, 100, 550, 500);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
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
