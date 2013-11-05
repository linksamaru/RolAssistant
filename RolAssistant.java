/*
 * Asistente de rol para masters de RyF Felaria module
 * Proximamente tambien D&D
 */
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
public class RolAssistant extends JFrame implements WindowListener{
    private String regla;
    //lista
    JComboBox Reglamento=new JComboBox();
    //botones
    JButton Aceptar=new JButton("Aceptar");
    JButton Cerrar=new JButton("Cerrar");
    //labels
    JLabel Regla=new JLabel();
    JLabel Logo=new JLabel();
    //paneles
    JPanel Reglas=new JPanel(new GridLayout(1,2));
    JPanel Botones=new JPanel(new GridLayout(2,1));
    JPanel Imagen=new JPanel(new GridLayout(2,1));
    JPanel ReglaImagen=new JPanel(new GridLayout(2,1));
    JPanel General=new JPanel(new GridLayout(1,2));
    //imagenes
    Icon logoDyD=new ImageIcon("logo_d&d.jpg");
    Icon logoRyF=new ImageIcon("logo_ryf.png");
    public RolAssistant(){
        Reglamento.addItem("Felarya - RyF");
        Reglamento.addItem("Dungeons & Dragons");
        //Reglamento.setSize(20,2);
        //Reglamento.setVisible(true);
        Regla.setText("Reglamento:");
        this.Reglas.add(Regla,BorderLayout.NORTH);
        this.Reglas.add(Reglamento,BorderLayout.SOUTH);
        this.Imagen.add(Logo);
        this.ReglaImagen.add(Reglas,BorderLayout.WEST);
        this.ReglaImagen.add(Imagen,BorderLayout.EAST);
        this.Botones.add(Aceptar,BorderLayout.WEST);
        this.Botones.add(Cerrar,BorderLayout.EAST);
        this.General.add(ReglaImagen,BorderLayout.NORTH);
        this.General.add(Botones,BorderLayout.SOUTH);
        this.setTitle("Rol Assistant");
        this.setBounds(200,250,400,300);
        this.setVisible(true);
        this.setResizable(false);
        //boton cerrar
        Cerrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        //lista Reglamentos
        Reglamento.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                regla=(String)Reglamento.getSelectedItem();
                if("Felarya - RyF".equals(regla)){
                    Logo.setIcon(logoRyF);
                }else{if("Dungeons & Dragons".equals(regla))
                    Logo.setIcon(logoDyD);
                }
            }
        });
        //boton Aceptar
        Aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(0==Reglamento.getSelectedIndex())
                    Ficha2 v=new Ficha2();
                    //con VentanaHabilidades y Ficha si funciona pero con el 
                    //menu principal RolAssistant no
                else{
                    //aun no implementado
                }
            }
        });
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        dispose();
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    
    public static void main(String[] args) {
       //RolAssistant f=new RolAssistant();
        RolAssistant r=new RolAssistant();
    }
}
