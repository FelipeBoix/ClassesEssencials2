package edu.upc.eetac.dsa.FelipeBoix.ClassesEssencials2;

public class CuentaAtras extends Thread  {
	
	int c;
	String id;

	public CuentaAtras(String v, int c)  {
		
		this.c = c;
		this.id = v;

		
	}
	 public void run() {
		 while (c >= 0) {
				System.out.println(id + " - " + c);
				--c;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
	    }
			
		
	}
