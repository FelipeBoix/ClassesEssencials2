package edu.upc.eetac.dsa.FelipeBoix.ClassesEssencials2;

import java.io.IOException;

public class UltimaEscritura {

public static void main(String args[])
{
CuentaAtras3 cont1 = new CuentaAtras3("ID1", 4);
CuentaAtras3 cont2 = new CuentaAtras3("ID2", 7);
CuentaAtras3 cont3 = new CuentaAtras3("ID3", 8);

cont1.start();
cont2.start();
cont3.start();

}
}

