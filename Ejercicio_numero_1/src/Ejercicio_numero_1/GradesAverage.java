package Ejercicio_numero_1;

import java.util.Scanner;
public class GradesAverage {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int numStudents, grado, suma = 0, j;
        j = 0;
        float prom;
        int grades[];
        
        System.out.println("Introduzca el número de alumnos: ");
        numStudents = ent.nextInt();
        grades = new int [numStudents];
        
        while(j<numStudents){
            System.out.print("Ingrese el grado para el estudiante "+(j+1)+ ": " );
            grado= ent.nextInt();
            
            if(grado<=100){
                if(grado>0){
                System.out.println("se ingreso correctamente la calificacion");
                grades[j]=grado;
             suma=suma+grado;
                j++; 
               
            }}else{
                System.out.println("Calificación no válida, inténtelo de nuevo...");
            }
            
        }
   
        
        System.out.println("El numero de alumnos es: "+numStudents);
         for(int i=0 ; i<numStudents ;i++){
         System.out.println("las calificaciones del alumno " +(i+1)+ " son: " +grades[i]);
         }
         //System.out.println(suma);
        prom=suma/numStudents;
        System.out.println("El pomedio es: "+prom);
        
        }}

//Jose David De la valle Acuña - 2015114083
//John Steven Rubio Castellanos - 2015214126