package ux;

import polygons.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        int choice = 999;
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your choice: ");
            System.out.println("1 - polygon");
            System.out.println("2 - rectangle");
            System.out.println("3 - triangle");
            System.out.println("4 - parallelogram");
            System.out.println("0 - exit");
            choice = Integer.parseInt(reader.readLine());
            createObject(choice);
        } while(choice != 0);
            printGeometries();
            System.out.println("You choose to exit!");
    }

    private static void printGeometries() {
        ArrayList<Polygon> geometries = Geometries.getGeometries();
        for (Polygon geometry : geometries) {
            try {
                Class c = Class.forName(geometry.getClass().getName());
                Class superC = c.getSuperclass();
                System.out.println("{");
                System.out.println("Class name: " + c.getSimpleName());
                if(superC != null && superC != Object.class) {
                    System.out.println("Extends: " + superC.getSimpleName());
                }
                printConstructors(c);
                printMethods(c);
                System.out.println("}");
            } catch(ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean createObject(int choiceTaken) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = 0, apothem = 0, numberOfVertix = 0;
        int base = 0, height = 0;
        try {
            switch(choiceTaken) {
                case 1:
                    System.out.println("Insert the length of a side");
                    length = Integer.parseInt(reader.readLine());
                    System.out.println("Insert the length of the apothem");
                    apothem = Integer.parseInt(reader.readLine());
                    System.out.println("How many vertixes does your regular polygon have?");
                    numberOfVertix = Integer.parseInt(reader.readLine());
                    RegularPolygon newPolygon = new RegularPolygon(numberOfVertix, apothem, length);
                    Geometries.addPolygon(newPolygon);
                    break;
                case 2:
                    System.out.println("Insert the length of base");
                    base = Integer.parseInt(reader.readLine());
                    System.out.println("Insert the length of heigth");
                    height = Integer.parseInt(reader.readLine());
                    Rectangle newRectangle = new Rectangle(base, height);
                    Geometries.addPolygon(newRectangle);
                    break;
                case 3:
                    System.out.println("Insert the length of base");
                    base = Integer.parseInt(reader.readLine());
                    System.out.println("Insert the length of heigth");
                    height = Integer.parseInt(reader.readLine());
                    Triangle newTriangle = new Triangle(base , height);
                    Geometries.addPolygon(newTriangle);
                    break;
                case 4:
                    System.out.println("Insert the length of base");
                    base = Integer.parseInt(reader.readLine());
                    System.out.println("Insert the length of heigth");
                    height = Integer.parseInt(reader.readLine());
                    Parallelogram newParallelogram = new Parallelogram(height, base);
                    Geometries.addPolygon(newParallelogram);
                    break;
                default:
                    return false;
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void printMethods(Class cl) {
        try {
            Method[] methods = cl.getDeclaredMethods();
            System.out.println("Methods");
            for(Method m: methods) {
                System.out.println("Return type: " + m.getReturnType());
                System.out.println("Name of the method: " + m.getName());

                Class[] params = m.getParameterTypes();
                for(int j = 0; j < params.length; j++) {
                    if(j > 0) {
                        System.out.println("");
                    }
                    System.out.println(params[j].getName());
                }
            }
        } catch(SecurityException s) {
            System.out.println("Message error: " +s.getLocalizedMessage() + "\nCause of the error: " + s.getCause());
        }


    }

    private static void printConstructors(Class cl) {
        try {
            Constructor[] constructors = cl.getDeclaredConstructors();
            System.out.println("Constructors: ");
            for(Constructor c : constructors) {
                String name = c.getName();
                System.out.println("" + Modifier.toString(c.getModifiers()));
                System.out.println("Name of the constructor: " + name);
            }
        } catch(SecurityException s) {
            System.out.println("Security exception: " + s.getLocalizedMessage() + "\nCause: " + s.getCause());
        }

    }
}

