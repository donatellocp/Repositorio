/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Administrador;
import Modelo.Estudiante;
import Vista.FrmPrincipal;
import Vista.InfLogin;
import Vista.InfModificarContrasenia;
import Vista.InfCargarArchivos;
import Vista.InfConsultar;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JInternalFrame;

/**
 * Clase controlador pricipal que permite llamar a las ventanas que conforma el sistema SIGED.
 * @author Cristian Alexis Alegria C.
 * @version 1.0.0
 * @since SIGED 1.0.0
 */
public class ControladorPrincipal implements  ActionListener, MouseListener{

    private FrmPrincipal frmPrincipal;    
    private ControladorLogin clControladorLogin;    
    
    
    
    private Estudiante clEstudiante;
    private Administrador clAdministrador;
    
   
    private InfLogin infLoginAdministrador;
    private InfLogin infLoginEstudiante; 
    private InfModificarContrasenia infModificarContraseniaAdministrador;
    private InfModificarContrasenia infModificarContraseniaEstudiante;
    private InfCargarArchivos infCargarArchivos;
    private InfConsultar infConsultar;
    
   /**
    *Metodo constructor que inicializa la ventana principal y activa los escuchadores de las opciones que la conforman.
    *@param frmPrincipal FrmPrincipal:Ventana Principal.
    *@since SIGED 1.0.0
    */
    public ControladorPrincipal(FrmPrincipal frmPrincipal) {
        this.frmPrincipal = frmPrincipal;             
        activarEscuchadores();        
        
    } 

    public ControladorLogin getClControladorLogin() {
        return clControladorLogin;
    }

    public void setClControladorLogin(ControladorLogin clControladorLogin) {
        this.clControladorLogin = clControladorLogin;
    }

   
    
    
    public FrmPrincipal getFrmPrincipal() {
        return frmPrincipal;
    }

    public void setFrmPrincipal(FrmPrincipal frmPrincipal) {
        this.frmPrincipal = frmPrincipal;
    }   

    public Estudiante getClEstudiante() {
        return clEstudiante;
    }

    public void setClEstudiante(Estudiante clEstudiante) {
        this.clEstudiante = clEstudiante;
    }

    public Administrador getClAdministrador() {
        return clAdministrador;
    }

    public void setClAdministrador(Administrador clAdministrador) {
        this.clAdministrador = clAdministrador;
    }

    public InfLogin getInfLoginAdministrador() {
        return infLoginAdministrador;
    }

    public void setInfLoginAdministrador(InfLogin infLoginAdministrador) {
        this.infLoginAdministrador = infLoginAdministrador;
    }

    public InfLogin getInfLoginEstudiante() {
        return infLoginEstudiante;
    }

    public void setInfLoginEstudiante(InfLogin infLoginEstudiante) {
        this.infLoginEstudiante = infLoginEstudiante;
    }
    
    public void mostrarVentanaPrincipal(){
        this.frmPrincipal.setVisible(true);
    }
  
    

    public InfModificarContrasenia getInfModificarContraseniaAdministrador() {
        return infModificarContraseniaAdministrador;
    }

    public void setInfModificarContraseniaAdministrador(InfModificarContrasenia infModificarContraseniaAdministrador) {
        this.infModificarContraseniaAdministrador = infModificarContraseniaAdministrador;
    }

    public InfModificarContrasenia getInfModificarContraseniaEstudiante() {
        return infModificarContraseniaEstudiante;
    }

    public void setInfModificarContraseniaEstudiante(InfModificarContrasenia infModificarContraseniaEstudiante) {
        this.infModificarContraseniaEstudiante = infModificarContraseniaEstudiante;
    }  

    

    public InfCargarArchivos getInfCargarArchivos() {
        return infCargarArchivos;
    }

    public void setInfCargarArchivos(InfCargarArchivos infCargarArchivos) {
        this.infCargarArchivos = infCargarArchivos;
    }

    public InfConsultar getInfConsultar() {
        return infConsultar;
    }

    public void setInfConsultar(InfConsultar infConsultar) {
        this.infConsultar = infConsultar;
    }
    
     /**
    *Metodo encargado de dar la capacida de escucha, a cada opcion que conforma la ventana principal.   
    *@since SIGED 1.0.0
    */
    
    private void activarEscuchadores(){
     //Se pone a escuchar las acciones del usuario
        this.frmPrincipal.getMniLogueoAdministrador().addActionListener(this);
        this.frmPrincipal.getMniLogueoEstudiante().addActionListener(this);
        this.frmPrincipal.getMniModificarContraseniaAdministrador().addActionListener(this);
        this.frmPrincipal.getMniCargarArchivos().addActionListener(this);
        this.frmPrincipal.getMniBuscar().addActionListener(this);
        this.frmPrincipal.getMniModificarContraseniaEstudiante().addActionListener(this);
        this.frmPrincipal.getMnuSalir().addMouseListener(this);
    }
     
 
    
     /**
    *Metodo encargado de colocar una ventana en el centro de la pantalla del computador.
    *@param infVentana JInternalFrame:Ventana que se desea colocar en el centro de la pantalla del computador.
    *@return Point point:Retornar las coordenadas de la ubicacion de la ventana situada en el centro.
    *@since SIGED 1.0.0
    */
    public Point centradoXY(JInternalFrame infVentana) {
        Point point = new Point(0,0);
        //se obtiene dimension del contenedor
        Dimension pantalla = getFrmPrincipal().getDstContenedorPrincipal().getSize();
        //se obtiene dimension del JInternalFrame
        Dimension ventana = infVentana.getSize();
        //se calcula posición para el centrado
        point.x = (pantalla.width - ventana.width) / 2;
        point.y = (pantalla.height - ventana.height) / 2;
        return point;
    }
    
    /**
    *Metodo encargado de mostrar las ventanas que el usuario solicita en el sistema SIGED. 
    * @param actionEvent ActionEvent:Evento que se acciona. 
    *@since SIGED 1.0.0
    */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      
        String stComando = actionEvent.getActionCommand();
       
       if(stComando.equals("LogueoAdministrador")){ 
           clControladorLogin = new ControladorLogin(this);    
           limpiarDstContenedorPrincipal();
           clControladorLogin.iniciarLogueoAdministrador();
           
           clControladorLogin = null;
           System.gc();
           
           
       }else{            
            if(stComando.equals("LogueoEstudiante")){
                clControladorLogin = new ControladorLogin(this);
                limpiarDstContenedorPrincipal();                
                clControladorLogin.iniciarLogueoEstudiante();
                
                clControladorLogin = null;
                System.gc();
              
            }    
       }        
    }     
   
    /**
    *Metodo encargado de capturar y responder cuando el usuario da click en algunas de las opciones principales del sistema SIGED.
    *@param mouseEvent MouseEvent:Evento que se acciono por medio del mouse.
    *@since SIGED 1.0.0
    */
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
       if(mouseEvent.getSource()== frmPrincipal.getMnuSalir()){             
             limpiarDstContenedorPrincipal();
             deshabilitarOpcionesDeUsuarioLogueado();            
        }
    }
    
    /**
    *Metodo encargado de limpiar el contenedor de ventanas. 
    *@since SIGED 1.0.0
    */
    
    public  void limpiarDstContenedorPrincipal(){
      frmPrincipal.getDstContenedorPrincipal().removeAll();
      frmPrincipal.getDstContenedorPrincipal().updateUI();
    }
    /**
    *Metodo encargado de deshabilitar las opciones de un usuario logueado.
    *@since SIGED 1.0.0
    */
    public void deshabilitarOpcionesDeUsuarioLogueado(){
      frmPrincipal.getMnuAdministracion().setEnabled(false);
      frmPrincipal.getMnuEstudiante().setEnabled(false);
      frmPrincipal.getMnuSalir().setEnabled(false);                           
      frmPrincipal.getMnuIngresar().setEnabled(true);
      clAdministrador = null;
      clEstudiante = null;
      System.gc();
    }

    @Override
    public void mousePressed(MouseEvent me) {
       
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       
    }

    @Override
    public void mouseExited(MouseEvent me) {
       
    }
}
