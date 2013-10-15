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
public class VentanaHabilidades extends JFrame implements WindowListener{
    //listas
    JComboBox Habs=new JComboBox();
    JComboBox Atr=new JComboBox();
    //labels
    JLabel Desc=new JLabel("Seleccione el Atributo y luego la Habilidad.");
    JLabel Atri=new JLabel("Atributos:");
    JLabel Habi=new JLabel("Habilidades:");
    //botones
    JButton Annadir=new JButton("Añadir");
    JButton Cerrar=new JButton("Cerrar");
    //paneles
    JPanel Botones=new JPanel();
    JPanel Descripcion=new JPanel();
    JPanel ListaHabilidades=new JPanel();
    JPanel ListaAtributos=new JPanel();
    JPanel Listas=new JPanel();
    public VentanaHabilidades(){
        this.Descripcion.add(Desc);
        this.ListaHabilidades.add(Habi);
        this.ListaHabilidades.add(Habs);
        this.ListaAtributos.add(Atri);
        this.ListaAtributos.add(Atr);
        this.Botones.add(Annadir,BorderLayout.WEST);
        this.Botones.add(Cerrar,BorderLayout.EAST);
        this.Listas.add(ListaAtributos,BorderLayout.WEST);
        this.Listas.add(ListaHabilidades,BorderLayout.EAST);
        this.add(Descripcion,BorderLayout.NORTH);
        this.add(Listas,BorderLayout.CENTER);
        this.add(Botones,BorderLayout.SOUTH);
        
        this.setTitle("Habilidades");
        this.setBounds(400,350,300,200);
        this.setVisible(true);
        this.setResizable(false);
        
        Annadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                }
        });
        Cerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    
    //mierdas necesaris para q la clase compile y funciones
    //no os compliqueis CTRL+C -> CTRL+V
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
class Habilidades{//Habilidades
    public int costo;
    public String nombre;
    public int rango;
    public int bonifRango;
    public String descripcion;
    public Habilidades (int c,int r,String n){
        this.costo=c;
        this.nombre=n;
        this.rango=r;
    }
    public int rango(){
        return this.bonifRango*this.rango;
    }
}
