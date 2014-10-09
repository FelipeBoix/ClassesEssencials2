package edu.upc.eetac.dsa.FelipeBoix.ClassesEssencials2;

public class CuentaAtras3 extends Thread {
	int c;
	String id;
	static String ultimaescritura;

	static int cont = 0;

	
	public CuentaAtras3(String v, int c)  {

		this.c = c;
		this.id = v;
		ultimaescritura = "";

		++cont;
		// System.out.println(cont);

	}

	public void Setescritura(String escritura) {
		ultimaescritura = escritura;
	}

	public String Getescritura() {

		return ultimaescritura;
	}

	public int GetCont() {
		return cont;
	}

	public void SetCont() {
		--cont;
	}

	public void run() {
		while (c >= 0) {

			if (c == 0) {
				SetCont();
				System.out.println("ultima escritura " + id + " quedan "+ GetCont() + " Threads activos");
				System.out.println(id + " - " + c + " ultima escritura "+ Getescritura());

			} else
				System.out.println(id + " - " + c + " ultima escritura "+ Getescritura());
			--c;
			Setescritura(id);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}
	}
}