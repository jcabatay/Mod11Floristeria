package com.floristeria.view;

import javax.swing.JOptionPane;

public class Utilities { 

	/**
	 * Funció per validar si un text es un númeric o no
	 * 
	 * @param str
	 *            string
	 * @return True si es un nunéric / False si no ho és
	 */
	public boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public void checkField(String field, String input) {
		if (input.isEmpty()) {
			throw new RuntimeException("El camp " + field + ". No pot esta buit.");
		}
	}
	
	/**
	 * Mètode per mostrar missatge al usuari i obtenir la resposta d'aquest
	 * 
	 * @param messageToUser
	 *                      Missatge a mostrar al usuari
	 * @return Valor que ha introduït el usuari
	 */
	public String getUserInput(String messageToUser) {
		//Scanner reader = null;

//		System.out.print(messageToUser);
//		Scanner reader = new Scanner(System.in);
//
//		String s = reader.nextLine();
//		// reader.close();
		
		String userInput = JOptionPane.showInputDialog(messageToUser);
		
		return userInput;
	}

	
}
