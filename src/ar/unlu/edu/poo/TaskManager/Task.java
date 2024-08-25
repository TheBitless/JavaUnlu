package ar.unlu.edu.poo.TaskManager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    private static final DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String descripcion;
    private int prioridad;
    private int estado;
    private LocalDate fechaLimite;

    public Task(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = 0;
    }

    public Task(String descripcion, int prioridad,String fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = 0;
        this.fechaLimite = LocalDate.parse(fechaLimite,parser);
    }

    public void modificarDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void terminada() {
        this.estado = 1;
    }

    public boolean isVencida(){
        if (fechaLimite != null && estado != -1){
            if (fechaLimite.isBefore(LocalDate.now())){
                estado = -1;
                return true;
            }
        }
        return false;
    }

    public String mostrarTarea(){
        String prefix = "";
        if (this.estado == 1){
            prefix = prefix.concat("(Terminada) ");
        }
        else if(this.isVencida()){
            prefix = prefix.concat("(Vencida) ");
        }
        return prefix.concat(descripcion);
    }
}
