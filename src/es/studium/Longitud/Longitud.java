package es.studium.Longitud;

import java.util.Scanner;

public class Longitud
{

	public static void main(String[] args)
	{
		String cadena = new String();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una cadena: ");
		cadena = teclado.nextLine();
		teclado.close();
		System.out.println("La longitud vale " + cadena.length());
		System.out.println("Sin espacios vale " + sinEspacios(cadena));
	}

	public static int sinEspacios(String c)
	{
		int longitud = 0;
		int i;
		for (i = 0; i < c.length(); i++)
		{
			if (c.charAt(i) != ' ')
			{
				longitud++;
			}
		}
		return (longitud);
	}
}
