package Caculadora;

import javax.swing.*;

public class Soma {
    public static void main(String[] args) {
        String valor1,valor2,resultado;
        //int resultado;
        valor1 = JOptionPane.showInputDialog("Digite o primeiro valor");
        valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
        //resultado = Integer.parseInt(valor1)+Integer.parseInt(valor2);
        resultado = JOptionPane.showInputDialog(null,"O Resultado é: ",Integer.parseInt(valor1)+Integer.parseInt(valor2));
        JOptionPane.showMessageDialog(null,"O Resultado é: "+resultado);

    }
}
