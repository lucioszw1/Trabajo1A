package com.example.szwarcbergini.trabajo1;
import java.io.Serializable;

/**
 * Created by 41665767 on 12/4/2016.
 */


public class Persona implements Serializable {


    public static int MASCULINO=1;
    public static int FEMENINO=2;

    private String nombre;
    private String apellido;
    private int sexo;

    public Persona(String nombre, String a, int sexo) {
        this.nombre = nombre;
        apellido=a;
        this.sexo= sexo;
    }

    public String imprimir() throws Exception {

        if (nombre.isEmpty() || apellido.isEmpty())
            throw new Exception("Falta un dato");

        return nombre + "," + apellido;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
