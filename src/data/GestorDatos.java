package data;

import model.CentroCultivo;
import model.PlantaProceso;

public class GestorDatos {

    public void ImpresionDatos(){
        PlantaProceso plantaproceso1 = new PlantaProceso("Planta Frutillar", "Frutillar", 6.5, 6);
        PlantaProceso plantaproceso2 = new PlantaProceso("Planta Puerto Montt", "Puerto Montt", 10.0, 10);
        CentroCultivo centrocultivo1 = new CentroCultivo("Centro Pichipelluco", "Pichipelluco", 4.0, 3);
        CentroCultivo centrocultivo2 = new CentroCultivo("Centro Mirasol", "Mirasol", 4.0, 3);
        System.out.println("*************** Unidades Operativas Activas ***************");
        System.out.println(plantaproceso1);
        System.out.println(plantaproceso2);
        System.out.println(centrocultivo1);
        System.out.println(centrocultivo2);
    }
}
