/*
HU: Requiero de una calculadora con interfaz gráfica para realizar operaciones simples.
Criterios de aceptación:
•	Debe contar con una interfaz gráfica, con un display para mostrar las operaciones.
•	Se debe poder ajustar el tamaño y reposicionar en la pantalla.
•	Debe contar con las funciones de suma, resta, división, multiplicación, igual y limpiar.
•	Al realizar una operación, debe mostrar el resultado en el display.
*/

import javax.swing.*;
import java.awt.event.*;

//public class Calculadora extends JFrame implements ActionListener {

public class Calculadora implements ActionListener {
    
    JFrame calcFrame = new JFrame("Calculadora 10% ");              //Frame
    JTextField texto = new JTextField();                            //Texto

    JButton boton1 = new JButton("1");              //Creacion de elementos
    JButton boton2 = new JButton("2");
    JButton boton3 = new JButton("3");
    JButton boton4 = new JButton("4");
    JButton boton5 = new JButton("5");
    JButton boton6 = new JButton("6");
    JButton boton7 = new JButton("7");
    JButton boton8 = new JButton("8");
    JButton boton9 = new JButton("9");
    JButton boton0 = new JButton("0");
    JButton punto = new JButton(".");
    JButton suma = new JButton("+");
    JButton resta = new JButton("-");
    JButton mult = new JButton("*");
    JButton divi = new JButton("/");
    JButton igual = new JButton("=");
    JButton limpiar = new JButton("C");

    static double x=0, y=0, resultado=0;                    //Operandos
    static int  caso=0;

    public Calculadora() {                                          //Constructor
        calcFrame.setSize(420,340);                                 //Tamaño
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Default close
        calcFrame.setVisible(true);                                 //Visible
        calcFrame.setLayout(null);                          //Desactiva layout manager.

        calcFrame.add(boton1);                              //Conformacion del frame
        calcFrame.add(boton2);
        calcFrame.add(boton3);
        calcFrame.add(boton4);
        calcFrame.add(boton5);
        calcFrame.add(boton6);
        calcFrame.add(boton7);
        calcFrame.add(boton8);
        calcFrame.add(boton9);
        calcFrame.add(boton0);
        calcFrame.add(punto);
        calcFrame.add(suma);
        calcFrame.add(resta);
        calcFrame.add(mult);
        calcFrame.add(divi);
        calcFrame.add(igual);
        calcFrame.add(limpiar);
        calcFrame.add(texto);

        texto.setBounds(40,40,330,30);                              //Posiciones

        boton1.setBounds(40,100,50,30);
		boton2.setBounds(110,100,50,30);
		boton3.setBounds(180,100,50,30);
        boton4.setBounds(250,100,50,30);
        boton5.setBounds(320,100,50,30);
        boton6.setBounds(40,150,50,30);
		boton7.setBounds(110,150,50,30);
        boton8.setBounds(180,150,50,30);
        boton9.setBounds(250,150,50,30);
        boton0.setBounds(320,150,50,30);

        suma.setBounds(40,200,50,30);
		resta.setBounds(110,200,50,30);
        mult.setBounds(180,200,50,30);
        divi.setBounds(250,200,50,30);
        punto.setBounds(320,200,50,30);
        limpiar.setBounds(40,250,200,30);
        igual.setBounds(250,250,110,30);

        boton1.addActionListener(this);                             //ActionListener
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        boton0.addActionListener(this);
        punto.addActionListener(this);
        suma.addActionListener(this);
        resta.addActionListener(this);
        mult.addActionListener(this);
        divi.addActionListener(this);
        igual.addActionListener(this);
        limpiar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){                //ActionPerformed
        if(ae.getSource() == boton1)
            texto.setText(texto.getText().concat("1"));         //Escritura en display
        if(ae.getSource() == boton2)
            texto.setText(texto.getText().concat("2"));
        if(ae.getSource() == boton3)
            texto.setText(texto.getText().concat("3"));
        if(ae.getSource() == boton4)
            texto.setText(texto.getText().concat("4"));  
        if(ae.getSource() == boton5)
            texto.setText(texto.getText().concat("5"));  
        if(ae.getSource() == boton6)
            texto.setText(texto.getText().concat("6"));  
        if(ae.getSource() == boton7)
            texto.setText(texto.getText().concat("7"));  
        if(ae.getSource() == boton8)
            texto.setText(texto.getText().concat("8"));  
        if(ae.getSource() == boton9)
            texto.setText(texto.getText().concat("9"));  
        if(ae.getSource() == boton0)
            texto.setText(texto.getText().concat("0"));  
        if(ae.getSource() == punto)
            texto.setText(texto.getText().concat("."));
        if(ae.getSource() == limpiar) {
            texto.setText("");
        }

        if(ae.getSource() == suma) {                            //Operaciones
            x = Double.parseDouble(texto.getText());
            caso = 1;
            texto.setText("");
        }

        if(ae.getSource() == resta) {
            x = Double.parseDouble(texto.getText());
            caso = 2;
            texto.setText("");
        }
        if(ae.getSource() == mult) {
            x = Double.parseDouble(texto.getText());
            caso = 3;
            texto.setText("");
        }
        if(ae.getSource() == divi) {
            x = Double.parseDouble(texto.getText());
            caso = 4;
            texto.setText("");
        }

        if(ae.getSource() == igual) {                       //Resultado con switch case
            y = Double.parseDouble(texto.getText());
            switch(caso) {
                case 1: resultado = x + y;
                break;
                case 2: resultado = x - y;
                break;
                case 3: resultado = x * y;
                break;
                case 4: resultado = x / y;
                break;
            }
            String resultadoString = String.valueOf(resultado); //Resultado en string
            texto.setText(resultadoString);
        }
    };

    public static void main(String args[]) {                    //Constructor invocado
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculadora();
            }
        });
    }
}

