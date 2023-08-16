package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Calculadora;

public class UsaCalculadora {

	public static void main(String[] args) {

		String aux, escolha = "sim";
		float num1, num2;
		int opcao;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("escolha um numero real");
				num1 = Float.parseFloat(aux);
				aux = JOptionPane.showInputDialog("escolha um numero real ");
				num2 = Float.parseFloat(aux);
				Calculadora calc = new Calculadora();
				calc.setNumero1(num1);
				calc.setNumero2(num2);
				aux = JOptionPane.showInputDialog("escolha a operação: " + 
				"\n 1 soma \n 2 subtração \n 3 multiplicação \n 4 divisão ");
				opcao = Integer.parseInt(aux);
				switch (opcao){
				case 1:
					JOptionPane.showMessageDialog(null, "soma:\n" + calc.adicao());
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Subtração: \n " + calc.subtracao());
					break;
				case 3:
					JOptionPane.showMessageDialog(null, " Multiplicação: \n " + calc.multiplicacao());
				case 4:
					try {
						JOptionPane.showMessageDialog(null, "Divisão \n" + calc.divisao());
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida! ");
				}

			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			escolha = JOptionPane.showInputDialog("Deseja continuar?");
		}

	}

}
