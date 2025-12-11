Autor del proyecto
Nombre: Rodrigo Flores Elizondo
Seccion 003_A
Carrera: Analista Programador Computacional
Sede: Campus Online

Descripcion del proyecto
El proyecto es una continuacion del proyecto de Salmontt. Esta version resuelve la problematica de distintos tipos de unidades operativas reutilizando atributos y modelando jerarquicamente

Estructura general del proyecto
El proyecto esta estructurado en 3 paquetes: Model que contiene las clases UnidadOperativa, PlantaProceso y CentroCultivo; Data que contiene las clase gestordatos encargado del proceso de creacion de instancias e impresion de estas; 
y UI que contiene la clase main donde se ejecuta el codigo.

Instrucciones
1- Clone el repositorio desde Github https://github.com/rodrigoflo02/POO-Semana6.git
2- Abrir el proyecto con Intellij Idea 
3- En menu, abrir el proyecto seleccionando la carpeta de este 
4- Para modificar las plantas o centros en la clase GestorDatos  o use la sintaxis del comando PlantaProceso nombreplanta = new PlantaProceso("nombre","comuna",capacidadproceso,numerolineas) o 
CentroCultivo nombre = new CentroCultivo("Nombre", "Comuna", TonaladasdeProducicion (con decimales), numerojaulas (con enteros)); en el codigo hay ejemplos con la que se puede guiar. Luego System.out.println(NombreCentroOPlanta) para poder imprimir por consola
5- Si desea agregar mas plantas o procesos añada a la lista con el comando ListaUnidadOperativa.add(); donde dentro de () debe colocar el nombre de la variable de la planta o centro
6- Ejecutar el Archivo Main.java desde el paquete UI (Ctrl + F5).
