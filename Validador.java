/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package documentos;

import javax.swing.JOptionPane;

/**
 *
 * @author vmkurz
 */
public class Validador {
  int retornar;
  public   boolean algunDigito = false;
  public    boolean algunaLetra = false;
  public String TipoDato;
  
 

      
      public void ComprovarTipoDeCadena(String cadena){
         
      {

        for (int i = 0; i < cadena.length(); i++)
            
            if (Character.isDigit(cadena.charAt(i))) {
                algunDigito = true;
            } else {
                algunaLetra = true; 
            }
        }
        if(algunDigito && !algunaLetra){
            System.out.println("TODO DIGITOS no lostfocus");
         //   if(TipoDato=="SoloNumeros") {

            //}
           
           ReiniciarBooleanas();
            retornar=1;
        }else if (algunDigito && algunaLetra){
            System.out.println("Aca tenemos numeros y letras");
            retornar=2;
            ReiniciarBooleanas();
        }else if(algunaLetra ){
            System.out.println("Solamente letras");
            retornar=3;
            ReiniciarBooleanas();
        }else if (!algunDigito && !algunaLetra){
            System.out.println("Cadena Vacia");

           ReiniciarBooleanas();
           retornar=4;
        }
  
   if(cadena.length()>4){
           retornar=5;
           System.out.println("Cadena Muy larga");
     }
 }

      public void ReiniciarBooleanas(){
          algunDigito=false;
          algunaLetra=false;
    }
         
         public void ComprovarTipoDeCadenaLostfocus2(String cadena ,String ignorar){
             if(cadena.length()>4){
                 if(ignorar!="5"){
                    retornar=5;
                         JOptionPane.showMessageDialog(null, "Cadena Muy larga Hasta 30 Letras  " , "Atencion",
                         JOptionPane.INFORMATION_MESSAGE);}
                         return;
             }else{
                 for (int i = 0; i < cadena.length(); i++)
                 if (Character.isDigit(cadena.charAt(i))) {
                    algunDigito = true;
                 } else {
                    algunaLetra = true;
            }
        }
             
        if(algunDigito && !algunaLetra){
            System.out.println("TODO DIGITOS");
            retornar=1;
            ReiniciarBooleanas();
                if(ignorar!="1"){
                    JOptionPane.showMessageDialog(null, "No se Adminten Numeros  " , "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            }
                 return;
        }else if (algunDigito && algunaLetra){
            System.out.println("Aca tenemos numeros y letras");
            if(ignorar!="2"){
            JOptionPane.showMessageDialog(null, "En este Campo No se adminten Valores Alfanumericos   " , "Atencion",
            JOptionPane.INFORMATION_MESSAGE);
            ReiniciarBooleanas();
            retornar=2;
            ReiniciarBooleanas();
            }
            return;
        }else if(algunaLetra ){
        System.out.println("Solamente letras");
        if(ignorar!="3"){
        JOptionPane.showMessageDialog(null, "No se Adminten Letras  " , "Atencion",
        JOptionPane.INFORMATION_MESSAGE);
        ReiniciarBooleanas();
        retornar=3;
        }
        return;
        }else if (!algunDigito && !algunaLetra){
            System.out.println("Cadena Vacia Metdo ComprovarTipoDeCadenaLostfocus ");
            ReiniciarBooleanas();
            retornar=4;
            if(ignorar!="4"){
            JOptionPane.showMessageDialog(null, "Campo Vacio  " , "Atencion",
            JOptionPane.INFORMATION_MESSAGE);
            }
            return;
        }

  
          
    }


         


   



         
         
         
         
         
         
         
         
         
         
         
         
         
 public void ComprovarTipoDeCadenaLostfocus(String cadena ,String ignorar){
 ////si so`porta cadenas largas>40
 if(cadena.length()>4){
 if(ignorar!="5"){
   retornar=5;
   JOptionPane.showMessageDialog(null, "Cadena Muy larga Hasta 30 Letras  " , "Atencion",
   JOptionPane.INFORMATION_MESSAGE);}
    return;
     }else
      {
          for (int i = 0; i < cadena.length(); i++)
            if (Character.isDigit(cadena.charAt(i))) {

                algunDigito = true;
            } else {
                algunaLetra = true;
            }
        }

        if(algunDigito && !algunaLetra){
            System.out.println("TODO DIGITOS");
            if(ignorar!="Numeros"  ){
            JOptionPane.showMessageDialog(null, "No se Adminten Numeros  " , "Atencion",
            JOptionPane.INFORMATION_MESSAGE);
            retornar=1;//retorna si esta ok y pasa el enfoque
            }else  {
             retornar=2;//restorna si esta mal y no pasa el enfoque.
            }
            ReiniciarBooleanas();
            return;
        }else if (algunDigito && algunaLetra){
            System.out.println("Aca tenemos numeros y letras");
            if(ignorar!="NumerosLetras"){
            JOptionPane.showMessageDialog(null, "En este Campo No se adminten Valores Alfanumericos   " , "Atencion",
            JOptionPane.INFORMATION_MESSAGE);
           
            retornar=1;//retorna si esta ok y pasa el enfoque
         
            }else{
            retornar=2;//restorna si esta mal y no pasa el enfoque.
            }
            ReiniciarBooleanas();
            return;
        }else if(algunaLetra ){
        System.out.println("Solamente letras");
        if( ignorar!="NumerosLetras"){
        JOptionPane.showMessageDialog(null, "No se Adminten Letras  " , "Atencion",
        JOptionPane.INFORMATION_MESSAGE);
        retornar=1;//all ok
        }else{
         retornar=2;// no paso la prueba
        }
        ReiniciarBooleanas();
        return;
        }else if (!algunDigito && !algunaLetra){
            System.out.println("Cadena Vacia Metdo ComprovarTipoDeCadenaLostfocus "); 
            if(ignorar!="5"){
            JOptionPane.showMessageDialog(null, "Campo Vacio  " , "Atencion",
            JOptionPane.INFORMATION_MESSAGE);
            retornar=1;
            }

            ReiniciarBooleanas();
            return;
        }



    }

}