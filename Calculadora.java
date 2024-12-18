// Importamos librerias: la cual swing nos provee de herramientas para dise�ar la interfraz y event controla los eventos que tienen una funcionalidad
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//Creamos una clase con la extencion que nos permite dise�ar la interfaz grafica, implementamos la accion que ve y dice que se va ejecutar una event dentro de la interfaz grafica
public class Calculadora extends JFrame implements ActionListener{

 //Es una clase que nos brinda un espacio para ingresar texto
 private JTextField text;
 
 //Es una clase que nos permite crear botones
 private JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonsuma,
                 botonresta, botonmulti, botondivi, botonigual, botonpunto, botonc, botonraiz,botonpotencia,botonporcentaje;

 //Variables para realizar las operaciones
 public double primernumero, segundonumero;
 public String operador;

 //Creamos el contructor
 public Calculadora(){

  //Metodo para las coordenadas
  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE); 

  //Le asignamos un nombre a la interfaz grafica
  setTitle("Calculadora");

  //Le agregamos color  al fondo de la interfaz
  getContentPane().setBackground(new Color(145,180,251));

  //Cambiamos el icono de java por uno personalizado
  setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());

  //Creamos objetos para darle dimensiones y que se impriman en la pantalla
  text = new JTextField();
  text.setBounds(25,25,245,60);
  add(text);
  
  //Ademas de la dicho en el anterior coment, aqui le agregamos que los objetos va estar atentos al ser llamados para funcionar
  botonc = new JButton("C");
  botonc.setBounds(280,35,70,50);
  add(botonc);
  botonc.addActionListener(this);

  boton1 = new JButton("1");
  boton1.setBounds(25,105,70,50);
  add(boton1);
  boton1.addActionListener(this);

  boton2 = new JButton("2");
  boton2.setBounds(110,105,70,50);
  add(boton2);
  boton2.addActionListener(this);

  boton3 = new JButton("3");
  boton3.setBounds(195,105,70,50);
  add(boton3);
  boton3.addActionListener(this);

  botonsuma = new JButton("+");
  botonsuma.setBounds(280,105,70,50);
  add(botonsuma);
  botonsuma.addActionListener(this);

  boton4 = new JButton("4");
  boton4.setBounds(25,175,70,50);
  add(boton4);
  boton4.addActionListener(this);

  boton5 = new JButton("5");
  boton5.setBounds(110,175,70,50);
  add(boton5);
  boton5.addActionListener(this);

  boton6= new JButton("6");
  boton6.setBounds(195,175,70,50);
  add(boton6);
  boton6.addActionListener(this);

  botonresta = new JButton("-");
  botonresta.setBounds(280,175,70,50);
  add(botonresta);
  botonresta.addActionListener(this);

  boton7 = new JButton("7");
  boton7.setBounds(25,245,70,50);
  add(boton7);
  boton7.addActionListener(this);

  boton8= new JButton("8");
  boton8.setBounds(110,245,70,50);
  add(boton8);
  boton8.addActionListener(this);
 
  boton9= new JButton("9");
  boton9.setBounds(195,245,70,50);
  add(boton9);
  boton9.addActionListener(this);

  botonmulti = new JButton("*");
  botonmulti.setBounds(280,245,70,50);
  add(botonmulti);
  botonmulti.addActionListener(this);

  boton0= new JButton("0");
  boton0.setBounds(25,315,70,50);
  add(boton0);
  boton0.addActionListener(this);

  botonpunto = new JButton(".");
  botonpunto.setBounds(110,315,70,50);
  add(botonpunto);
  botonpunto.addActionListener(this);

  botonigual = new JButton("=");
  botonigual.setBounds(195,315,70,50);
  add(botonigual);
  botonigual.addActionListener(this);

  botondivi = new JButton("/");
  botondivi.setBounds(280,315,70,50);
  add(botondivi);
  botondivi.addActionListener(this);

  botonraiz = new JButton("v");
  botonraiz.setBounds(25,385,85,50);
  add(botonraiz);
  botonraiz.addActionListener(this);

  botonpotencia = new JButton("x");
  botonpotencia.setBounds(147,385,85,50);
  add(botonpotencia);
  botonpotencia.addActionListener(this);

  botonporcentaje = new JButton("%");
  botonporcentaje.setBounds(270,385,85,50);
  add(botonporcentaje);
  botonporcentaje.addActionListener(this);

}
//Responde a la acciones del usuario, y declaramos una variable que contenga la accion event
public void actionPerformed(ActionEvent a){
 
 // Comparamos a los objetos con la variable que tiene declarado el accion event y lo mostramos en la pantalla
 if (a.getSource() == botonc){
  text.setText("");
}
 if (a.getSource() == boton1){
  text.setText(text.getText() + "1");
}
 if (a.getSource() == boton2){
  text.setText(text.getText() + "2");
}
 if (a.getSource() == boton3){
  text.setText(text.getText() + "3");
}
 if (a.getSource() == boton4){
  text.setText(text.getText() + "4");
}
if (a.getSource() == boton5){
  text.setText(text.getText() + "5");
}
if (a.getSource() == boton6){
  text.setText(text.getText() + "6");
}
if (a.getSource() == boton7){
  text.setText(text.getText() + "7");
}
 if (a.getSource() == boton8){
  text.setText(text.getText() + "8");
}
if (a.getSource() == boton9){
  text.setText(text.getText() + "9");
}
 if (a.getSource() == boton0){
  text.setText(text.getText() + "0");
}
// if (a.getSource() == botonsuma){
//   text.setText(text.getText() + "+");
// }
//  if (a.getSource() == botonresta){
//   text.setText(text.getText() + "-");
// }
//  if (a.getSource() == botonmulti){
//   text.setText(text.getText() + "*");
// }
 if (a.getSource() == botonpunto){
   text.setText(text.getText() + ".");
}
//  if (a.getSource() == botonigual){
//   text.setText(text.getText() + "=");
// }
//  if (a.getSource() == botondivi){
//   text.setText(text.getText() + "/");
// }
//  if (a.getSource() == botonraiz){
//   text.setText(text.getText() + "v");
// }
//  if (a.getSource() == botonpotencia) {
//   text.setText(text.getText() + "x");
// }
//  if (a.getSource() == botonporcentaje) {
//   text.setText(text.getText() + "%");
// }

// Operaciones
//Comparamos al objeto con la variable de accion del event
if (a.getSource() == botondivi) {
    //Lo que tenemos en el text lo convertimos en un numero con decimal y lo guardamos en la variable para luego usarlo en una operacion
    primernumero =  Double.parseDouble(text.getText());
    operador = "/";
    text.setText("");
}

if (a.getSource() == botonmulti) {
    primernumero = Double.parseDouble(text.getText());
    operador = "*";
    text.setText("");
}

if (a.getSource() == botonresta) {
    primernumero = Double.parseDouble(text.getText());
    operador = "-";
    text.setText("");
}

if (a.getSource() == botonsuma) {
    primernumero = Double.parseDouble(text.getText());
    operador = "+";
    text.setText("");
}

//Usamos la funcion sqrt para la raiz
if(a.getSource() == botonraiz){
      primernumero=Double.parseDouble(text.getText());
  
      if(primernumero>=0){
         double sqrt= Math.sqrt(primernumero);
         text.setText(String.valueOf(sqrt));
      }else{
        text.setText(" numero invalido");
      }
   }
if (a.getSource() == botonpotencia) {
    primernumero = Double.parseDouble(text.getText());
    operador = "x";
    text.setText("");
}   
if (a.getSource() == botonporcentaje) {
    primernumero = Double.parseDouble(text.getText());
    operador = "%";
    text.setText("");
}
//Accion

if(a.getSource() == botonigual){
    segundonumero = Double.parseDouble(text.getText());

    //Eleccion de operacion a realizar
    switch(operador){
        case "+":
            text.setText(cero(primernumero + segundonumero));
            break;
        case "-":
            text.setText(cero(primernumero - segundonumero));
            break;
        case "*":
            text.setText(cero(primernumero * segundonumero));
            break;
        case "/":
            if(segundonumero == 0) {
                text.setText("No se puede dividir 0");
            } else {
                text.setText(cero(primernumero / segundonumero));
            }
            break;
        //Usamos la funcion Math.pow para el porcentaje
        case "x":
            text.setText(cero(Math.pow(primernumero,segundonumero)));
            break;
        case "%":
            text.setText(cero(primernumero * (segundonumero/100)));
            break;

    }
}
//Si el texto tiene un punto asignado no se le agrega otro, yen caso que no lo tenga y el usuario quiera hacerlo solo podra una vez
if(a.getSource() == botonpunto){
    if(!(text.getText().contains("."))){
        text.setText(text.getText() + ".");
    }
}
}
//Funcion para quitar el .0
public String cero(Double resultado){
    String retorno = "";
    
    retorno = Double.toString(resultado);

    if(resultado % 1 == 0){
        retorno = retorno.substring(0, retorno.length() - 2);
    }

    return retorno;
}
//Metodo para la ejecucion
public static void main(String args[]){
   Calculadora calculadora1 = new Calculadora();
   calculadora1.setBounds(0,0,390,500);
   calculadora1.setVisible(true);
   calculadora1.setResizable(false);
   calculadora1.setLocationRelativeTo(null);
 }
}
