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
public class PresentacionFicha extends JFrame implements WindowListener{

    JLabel Reglamento=new JLabel();
    JLabel Nombre=new JLabel();
    JLabel Clase=new JLabel();
    JLabel Raza=new JLabel();
    JLabel lvl=new JLabel();
    JLabel Experiencia=new JLabel();
    JLabel Master=new JLabel();
    JLabel Campaña=new JLabel();
    JLabel STR=new JLabel();
    JLabel PER=new JLabel();
    JLabel INT=new JLabel();
    JLabel RES=new JLabel();
    JLabel DEX=new JLabel();
    JLabel Habilidades=new JLabel();
    JLabel Dotes=new JLabel();
    JLabel Equipo=new JLabel();
    //paneles
    JPanel Cabecera=new JPanel(new GridLayout(1,3));
    JPanel Atributos=new JPanel(new GridLayout(5,0));
    JPanel Jugador=new JPanel(new GridLayout(1,3));
    JPanel Lvl=new JPanel(new GridLayout(2,1));
    JPanel Dote=new JPanel();
    JPanel Habilidad=new JPanel();
    JPanel Equipamiento=new JPanel();
    public PresentacionFicha(int st,int i,int r,int d,int p,int l,int e,
        String n,String c,String m,String reg,String cam,String ra/*,Item equipo[]*/){
        
        //panel de cabecera
        this.Cabecera.add(Reglamento);
        this.Cabecera.add(Master);
        this.Cabecera.add(Campaña);
        //panel de Jugador
        this.Jugador.add(Nombre);
        this.Jugador.add(Clase);
        this.Jugador.add(Raza);
        //panel de nivel
        this.Lvl.add(lvl);
        this.Lvl.add(Experiencia);
        //panel de atributos
        this.Atributos.add(STR);
        this.Atributos.add(INT);
        this.Atributos.add(DEX);
        this.Atributos.add(RES);
        this.Atributos.add(PER);
        //panel de dotes
        this.Dote.add(Dotes);
        //panel de equipo
        this.Equipamiento.add(Equipo);
        //panel de habilidades
        this.Habilidad.add(Habilidades);
        //añadido de valores
        this.Reglamento.setText(reg);
        this.Master.setText(m);
        this.Campaña.setText(cam);
        this.Nombre.setText(n);
        this.Clase.setText(c);
        this.Raza.setText(ra);
        //this.lvl.setText();
        this.Experiencia.setText(m);
        this.STR.setText(cam);
        this.INT.setText(n);
        this.DEX.setText(c);
        this.RES.setText(ra);
        this.PER.setText(reg);
        //añadido de paneles
        this.add(Cabecera);
        this.add(Jugador);
        this.add(Lvl);
        this.add(Atributos);
        this.add(Habilidad,"EAST");
        this.add(Dotes,"CENTER");
        this.add(Equipamiento,"WEST");
        //propiedades de la ventana
        this.setTitle("Ficha de "+n);
        this.setBounds(250,150,450,800);
        this.setVisible(true);
        this.setResizable(false);
    }
    /*public static void main(String args[]){
     PresentacionFicha f=new PresentacionFicha(16,12,18,18,20,1,1000,"Yo","Bardo","Yo,Again","RyF,Felarya","Humano");
    }*/
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
