package edu.upc.eetac.dsa.FelipeBoix.ClassesEssencials2;

import java.io.IOException;

public class Synchronized {
	
public static void main(String args[]){
	
	CuentaAtras4 cont1 = new CuentaAtras4("ID1", 4);
	CuentaAtras4 cont2 = new CuentaAtras4("ID2", 8);
	CuentaAtras4 cont3 = new CuentaAtras4("ID3", 7);
	
	cont2.start();
	cont3.start();
	cont1.start();

}
}


