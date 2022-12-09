

package ciclaramanga;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Registro extends JFrame{
    
    //Panel1
    private JPanel panel1;
    private JPanel panel12;
    private JLabel registro;
    
    
    //Panel2
    private JPanel panel2;
    private JButton boton1;
    
    //Panel3
    private JPanel panel3;
    private JButton boton2;
    
    
    Registro(String titulo)
    {
        super(titulo);
        panel1=new JPanel();
        panel1.setLayout(new BorderLayout());
        panel12=new JPanel();
        panel12.setLayout(new BorderLayout());
        registro =new JLabel();
        registro.setText("Registro");
        panel12.add(registro, BorderLayout.CENTER);
        panel1.add(panel12, BorderLayout.PAGE_START);
        
        this.add(panel1);
        
        panel2=new JPanel();
        boton1=new JButton();
        boton1.setText("Registrar Usuario");
        panel2.add(boton1);
       // add(panel2);
        
        
        
        panel3=new JPanel();
        boton2=new JButton();
        boton2.setText("Registrar Ruta");
        panel3.add(boton2);
        //add(panel3);
        
    }

  
    public static void main(String[] args) {
        
        //crear rutas
        
        ArrayList<Ruta> rutas=new ArrayList<>();
        rutas.add(new Ruta("Uis","Estacion Provenza","Uis-Provenza","8 am - 8 pm",60,3));
        rutas.add(new Ruta("Uis","Cañaveral","Uis-Cañaveral","8 am - 8 pm",120,6));
        rutas.add(new Ruta("Cacique","Parque central de florida","Cacique-Florida","8 am - 8 pm",60,3));
        
        
        //crear usuarios
        
        ArrayList<Usuario> usuarios=new ArrayList<>();
        usuarios.add(new Usuario("Pepito","1005670383"));
        usuarios.add(new Usuario("Pepita","0925893321"));
        usuarios.add(new Usuario("Pepo","9864541246"));
        
        
        
        
        //crear viajes (usuario.get(x), rutas.get(x))
        
        ArrayList<Viajes> viajes=new ArrayList<>();
        viajes.add(new Viajes(rutas.get(0),usuarios.get(0),60,true));
        viajes.add(new Viajes(rutas.get(1),usuarios.get(1),100,true));
        viajes.add(new Viajes(rutas.get(2),usuarios.get(2),60,true));
        
        
        //interfaz
        
        Registro interfaz=new Registro("Ciclaramanga");
        interfaz.setSize(400,400);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
