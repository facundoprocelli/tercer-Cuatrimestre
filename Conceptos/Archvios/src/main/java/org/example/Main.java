package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        //grabarArchvio();
        //leerArchvio();
        //grabarArchivoObjetos();
        leerArchivoObjeto();


    }

    static void grabarArchivoObjetos() {
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("alumnos.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(new Alumno("Facu", 19));
            objectOutputStream.writeObject(new Alumno("Nico", 19));


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("No puedo cerrarlo");
            }
        }

    }

    static void leerArchivoObjeto() {
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("alumnos.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                Alumno alumno = (Alumno) objectInputStream.readObject();
                System.out.println(alumno);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            System.out.println("no se encuentra la clase");
        }

    }

    static void leerArchvio() {


        DataInputStream dataInputStream = null;
        try {

            FileInputStream fileInputStream = new FileInputStream("Temperatura.dat");//Almacena bytes Y solo se puede leer
            dataInputStream = new DataInputStream(fileInputStream);

            String palabra = dataInputStream.readUTF(); // Transfroma los bytes del file InputSram  datos primitivos
            boolean boolea = dataInputStream.readBoolean();
            double doub = dataInputStream.readDouble();
            System.out.println(palabra);
            System.out.println(boolea);
            System.out.println(doub);

            // System.out.println(dataInputStream.readUTF());


        } catch (FileNotFoundException ex) {
            System.out.println("Archvio no encontrado");
        } catch (IOException e) {
            System.out.println("Archvio no encontrado");

        } catch (Exception e) {
            System.out.println("Archvio no encontrado");

        } finally {
            try {
                dataInputStream.close();
            } catch (IOException e) {
                System.out.println("No puedo cerrar");
            }
        }

    }

    static void grabarArchvio() {
        DataOutputStream dataOutputStream = null;
        try {
            FileOutputStream inputStream = new FileOutputStream("Temperatura.dat");
            dataOutputStream = new DataOutputStream(inputStream);

            dataOutputStream.writeUTF("Facu");
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeDouble(10.0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                System.out.println("No puedo cerrar");
            }
        }

    }
}