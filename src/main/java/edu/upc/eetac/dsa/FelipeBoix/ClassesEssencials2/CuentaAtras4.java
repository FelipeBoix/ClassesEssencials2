package edu.upc.eetac.dsa.FelipeBoix.ClassesEssencials2;

public class CuentaAtras4 extends Thread {

		int c;
		String id;
		static String ultimaescritura;

		static int cont = 0;

public CuentaAtras4(String v, int c) {

			this.c = c;
			this.id = v;

			++cont;
		

		}

	

		public int GetCont() {
			return cont;
		}

		public void SetCont() {
			--cont;
		}

		public void run() {
			while (c >= 0) {
				try {
					Thread.sleep(1000);

				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				if (c == 0) {
					SetCont();
					synchronized (this) {
						System.out.println("ultima escritura " + id + " quedan " + GetCont() + " Threads activos");

						System.out.println(id + " - " + c + " ultima escritura " + ultimaescritura);
					}
				} else
					synchronized (this) {
						System.out.println(id + " - " + c + " ultima escritura " + ultimaescritura);
					}
				--c;

				synchronized (this) {
					ultimaescritura = id;
				}
			}
		}
	}