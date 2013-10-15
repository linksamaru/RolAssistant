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
public class Ficha extends JFrame implements WindowListener{
    public int fue;
    public int inte;
    public int dex;
    public int res;
    public int per;
    public int Lvl;
    public int exp;
    public String m;
    public String n;
    public String c;
    public String cl;
    public String r;
    //botones de estadisticas
    JButton STR =new JButton();
    JButton PER =new JButton();
    JButton INT =new JButton();
    JButton DEX =new JButton();
    JButton RES =new JButton();
    JButton lvl =new JButton();
    JButton Exp =new JButton();
    JButton Master =new JButton();
    JButton Campaña =new JButton();
    JButton Nombre =new JButton();
    JButton Clase =new JButton();
    JButton Raza =new JButton();
    JButton lvlUp=new JButton();
    JButton Hab=new JButton();
    //constructor
    public Ficha(){
        super("Ficha");
        JPanel paneltotal=new JPanel();
        JPanel panelGeneral=new JPanel();
        JPanel paneltexto=new JPanel();
        panelGeneral.setLayout(new GridLayout(6,2));
        paneltexto.setLayout(new GridLayout());
        final JTextField l =new JTextField(); // Crear campo de texto
        //propiedades de los botones
        STR.setLabel("Fuerza");
        PER.setLabel("Percepcion");
        INT.setLabel("Inteligencia");
        DEX.setLabel("Destreza");
        RES.setLabel("Resistencia");
        lvl.setLabel("Nivel");
        Exp.setLabel("Experiencia");
        Master.setLabel("Master");
        Campaña.setLabel("Campaña");
        Nombre.setLabel("Nombre");
        Clase.setLabel("Clase");
        Raza.setLabel("Raza");
        lvlUp.setLabel("LvlUP!");
        Hab.setLabel("Habilidades");
        //propiedades del textField
        l.setColumns(30);
        //añadiendo botones
        panelGeneral.add(STR);
        panelGeneral.add(PER);
        panelGeneral.add(INT);
        panelGeneral.add(DEX);
        panelGeneral.add(RES);
        panelGeneral.add(lvl);
        panelGeneral.add(Exp);
        panelGeneral.add(Master);
        panelGeneral.add(Campaña);
        panelGeneral.add(Nombre);
        panelGeneral.add(Clase);
        panelGeneral.add(Raza);
        panelGeneral.add(lvlUp);
        panelGeneral.add(Hab);
        //Acciones de Botones
        Hab.addActionListener(new ActionListener() {//Ventana Habilidades
            public void actionPerformed(ActionEvent e) {
                VentanaHabilidades v=new VentanaHabilidades();
            }
        });
        lvlUp.addActionListener(new ActionListener() {//lvl UP
            public void actionPerformed(ActionEvent e) {
                try{
                    //PresentacionLista(16,12,18,18,20,1,1000,"Yo","Bardo","Yo,Again","RyF,Felarya","Felarya","Humano");
                }
                catch(Exception x){
                    System.err.println("Error en el acceso de la clase Presentacion Ficha");
                }
            }
        });
        STR.addActionListener(new ActionListener() {//fuerza
            public void actionPerformed(ActionEvent e) {
                fue=Integer.parseInt(l.getText());
            }
        });
        PER.addActionListener(new ActionListener() {//percepcion
            public void actionPerformed(ActionEvent e) {
                per=Integer.parseInt(l.getText());
            }
        });
        INT.addActionListener(new ActionListener() {//inteligencia
            public void actionPerformed(ActionEvent e) {
                inte=Integer.parseInt(l.getText());
            }
        });
        DEX.addActionListener(new ActionListener() {//destreza
            public void actionPerformed(ActionEvent e) {
                dex=Integer.parseInt(l.getText());
            }
        });
        RES.addActionListener(new ActionListener() {//resistencia
            public void actionPerformed(ActionEvent e) {
                res=Integer.parseInt(l.getText());
            }
        });
        lvl.addActionListener(new ActionListener() {//nivel
            public void actionPerformed(ActionEvent e) {
                Lvl=Integer.parseInt(l.getText());
            }
        });
        Exp.addActionListener(new ActionListener() {//experiencia
            public void actionPerformed(ActionEvent e) {
                exp=Integer.parseInt(l.getText());
            }
        });
        Master.addActionListener(new ActionListener() {//Master
            public void actionPerformed(ActionEvent e) {
                m=l.getText();
            }
        });
        Campaña.addActionListener(new ActionListener() {//campaña
            public void actionPerformed(ActionEvent e) {
                c=l.getText();
            }
        });
        Nombre.addActionListener(new ActionListener() {//nombre pj
            public void actionPerformed(ActionEvent e) {
                n=l.getText();
            }
        });
        Clase.addActionListener(new ActionListener() {//Clase
            public void actionPerformed(ActionEvent e) {
                cl=l.getText();
            }
        });
        Raza.addActionListener(new ActionListener() {//raza
            public void actionPerformed(ActionEvent e) {
                r=l.getText();
            }
        });
        //paneles
        paneltotal.setBackground(Color.LIGHT_GRAY);
        paneltexto.add(l);
        paneltotal.add("West",panelGeneral);
        paneltotal.add("East",paneltexto);
        this.add(paneltotal);

        paneltexto.setVisible(true);
        panelGeneral.setVisible(true);
        paneltotal.setVisible(true);
        super.pack();
        this.setBounds(200,200,450,500);
        this.setVisible(true);
    }
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
