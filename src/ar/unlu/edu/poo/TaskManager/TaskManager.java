package ar.unlu.edu.poo.TaskManager;

public class TaskManager {
    public static void main(String[] args) {
        Task tarea1 = new Task("Ir al supermercado mañana",1,"26/08/2024");
        Task tarea2 = new Task("Consultar repuesto del auto",1,"24/08/2024");
        Task tarea3 = new Task("Ir al cine a ver la nueva película de Marvel",1,"24/08/2024");
        tarea2.terminada();
        System.out.println(tarea1.mostrarTarea());
        System.out.println(tarea2.mostrarTarea());
        System.out.println(tarea3.mostrarTarea());

        tarea1.modificarDescripcion("Ir al supermercado");
        System.out.println(tarea1.mostrarTarea());

    }


}
