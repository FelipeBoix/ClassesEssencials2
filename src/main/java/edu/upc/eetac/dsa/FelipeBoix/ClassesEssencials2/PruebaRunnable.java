package edu.upc.eetac.dsa.FelipeBoix.ClassesEssencials2;

public class PruebaRunnable {

public static void main(String args[])
	{
	
				CuentaAtras2 cont1 = new CuentaAtras2("ID1", 4);
				CuentaAtras2 cont2 = new CuentaAtras2("ID2", 7);
				CuentaAtras2 cont3 = new CuentaAtras2("ID3", 8);
// el metodo run es propio de java y el start usa el metodo run 
				cont1.start();
				cont2.start();
				cont3.start();
}		
}