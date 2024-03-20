package empresaMantenimientoRaul;

import java.util.ArrayList;
import java.util.List;

// Interfaz para elementos que pueden ser mantenidos
interface Mantenible {
    void realizarMantenimiento();
}

// Clase A
class Empleados implements Mantenible {
    String nombre;
    int edad;
    double salario;

    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Getters y Setters

    
    public void realizarMantenimiento() {
        // Lógica específica para el mantenimiento de empleados
        System.out.println("Realizando mantenimiento para el empleado: " + nombre);
    }
}

// Clase B
class Equipo implements Mantenible {
    String tipo;
    double costo;
    int horasMantenimientoRecomendadas;

    public Equipo(String tipo, double costo, int horasMantenimientoRecomendadas) {
        this.tipo = tipo;
        this.costo = costo;
        this.horasMantenimientoRecomendadas = horasMantenimientoRecomendadas;
    }

    // Getters y Setters

    
    public void realizarMantenimiento() {
        // Lógica específica para el mantenimiento del equipo
        System.out.println("Realizando mantenimiento para el equipo: " + tipo);
    }
}

// Clase C
class Gestor {
    List<Empleados> listaA;
    List<Equipo> listaB;

    public Gestor() {
        this.listaA = new ArrayList<>();
        this.listaB = new ArrayList<>();
    }
    
    
    // Método para añadir elementos a las listas
    public void agregarElementoA(Empleados elementoA) {
        this.listaA.add(elementoA);
    }

    public void agregarElementoB(Equipo elementoB) {
        this.listaB.add(elementoB);
    }

    // Método para eliminar elementos de las listas
    public void eliminarElementoA(Empleados elementoA) {
        this.listaA.remove(elementoA);
    }

    public void eliminarElementoB(Equipo elementoB) {
        this.listaB.remove(elementoB);
    }

    // Método para establecer relaciones entre las clases A y B
    public void establecerRelacionAB(Empleados elementoA, Equipo elementoB) {
        // Lógica para establecer la relación entre A y B
    }

    // Método para obtener lista de elementos relacionados y no relacionados de una clase A
    public List<Empleados> obtenerElementosRelacionadosA() {
        // Lógica para obtener elementos relacionados de la listaA
        return listaA;
    }

    // Método para obtener lista de elementos relacionados para un B dado
    public List<Empleados> obtenerElementosRelacionadosParaB(Equipo elementoB) {
        // Lógica para obtener elementos relacionados de la listaA para un B dado
        return listaA;
    }

    public void asignarTareaMantenimiento(Empleados empleado, Equipo equipo) {
        // Lógica para asignar una tarea de mantenimiento a un empleado para un equipo específico
        System.out.println("Asignando tarea de mantenimiento a " + empleado.nombre + " para el equipo " + equipo.tipo);
    }

    // Otros métodos y lógica según sea necesario
}

public class Mantenimiento {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Empleados a1 = new Empleados("Juan", 25, 30000.0);
        Equipo b1 = new Equipo("Impresora", 500.0, 100);

        // Crear instancia de la clase C
        Gestor c = new Gestor();

        // Agregar elementos a las listas de la clase C
        c.agregarElementoA(a1);
        c.agregarElementoB(b1);

        // Realizar operaciones y pruebas según sea necesario
        a1.realizarMantenimiento(); // Ejemplo de realizar mantenimiento para un empleado
        b1.realizarMantenimiento(); // Ejemplo de realizar mantenimiento para un equipo

        // Asignar tarea de mantenimiento
        c.asignarTareaMantenimiento(a1, b1);
    }
}

