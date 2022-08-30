package CaixaDeDialogo;

import javax.swing.*;

public class CaixaDeDialogo {
    public static void main(String[] args) {
        String name, mensagem, idade;
        JOptionPane.showMessageDialog(null, "Bem Vindo a aula de Java");
        name = JOptionPane.showInputDialog("Qual é seu nome?");
        idade = JOptionPane.showInputDialog("Qual ´d a sua idade?");
        Integer.parseInt(idade);
        mensagem = String.format("Bem vindo, %s, para a aula de Java", name);

        JOptionPane.showMessageDialog(null,mensagem+" E sua idade é: "+idade);


    }
}
