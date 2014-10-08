package edu.upc.eetac.dsa.FelipeBoix.ClassesEssencials2;

import java.io.IOException;

public class PruebaThread {
	public static void main(String args[])
	{
	CuentaAtras cont1 = new CuentaAtras("ID1", 4);
	CuentaAtras cont2 = new CuentaAtras("ID2", 7);
	CuentaAtras cont3 = new CuentaAtras("ID3", 8);
	
	cont1.start();
	cont2.start();
	cont3.start();
	
	}
}

