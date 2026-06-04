package main;

import modelo.CategoriaGama;
import modelo.Celular;
import util.Validador;
import modelo.Cliente;
import servicio.GestorClientes;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a TecnoStore");

        Celular celular = new Celular(1, "Samsung", "A55", 1500000, 10, "Android", CategoriaGama.BAJA);
        System.out.println(celular);
        
        System.out.println(Validador.correoValido("juan@gmail.com"));
        System.out.println(Validador.correoValido("juan@gmail"));
        
        GestorClientes gestorClientes = new GestorClientes();
        Cliente cliente1 = new Cliente(1, "Ana Pérez", "123", "ana@gmail.com", "3001111111");
        Cliente cliente2 = new Cliente(2, "Luis Gómez", "123", "luis@gmail.com", "3002222222");
        
        try {
            gestorClientes.registrarCliente(cliente1);
            gestorClientes.listarClientes();
            gestorClientes.registrarCliente(cliente2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
