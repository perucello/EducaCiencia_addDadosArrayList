package com.educaciencia.addDados;


import java.util.ArrayList;
import java.util.Arrays;

/**************************************
 * ******* EDUCACIENCIA FASTCODE ******
 * ******* MANIPULANDO LISTAS *********
 * *******     29/09/2022     *********
 **************************************/

public class Main {

	public static void main(String[] args) {		
		addDadosArrayList();
	}
	
	/* Adicionando dados em uma ArrayList */
	public static void addDadosArrayList() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode");
		listaNome.add("CobraDev");
		System.out.println("Lista: " + Arrays.toString(listaNome.toArray()));
	}
	
	
}