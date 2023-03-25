import java.util.Scanner;
import static java.lang.Math.*;
public class IMC {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Introduzca su peso en kg: ");
       double peso = scanner.nextDouble();
        
       System.out.println("Introduzca su altura en metros: ");
       double altura = scanner.nextDouble();
        
       System.out.println("Introduzca '1' si es mujer y '2' si es hombre: ");
       int sexo = scanner.nextInt();
        
       double imc = peso / pow(altura, 2);

       if(sexo == 1){
        if(imc <= 16){
            System.out.println("Usted tiene desnutrición.");
        }else if(imc <= 20 && imc >= 17){
            System.out.println("Usted tiene bajo peso.");  
        }else if(imc <= 24 && imc >= 21){
            System.out.println("Usted tiene un peso normal.");  
        }else if(imc <= 29 && imc >= 25){
            System.out.println("Usted tiene sobrepeso.");  
        }else if(imc <= 34 && imc >= 30){
            System.out.println("Usted tiene obesidad.");  
        }else if(imc <= 39 && imc >= 35){
            System.out.println("Usted tiene una obesidad marcada.");  
        }else if(imc > 40){
            System.out.println("Usted tiene una obesidad mórbida.");  
        }
       }else{
         if(imc < 16){
            System.out.println("Usted tiene desnutrición.");
         }else if(imc <= 20 && imc >= 18){
            System.out.println("Usted tiene bajo peso.");  
         }else if(imc <= 25 && imc >= 21){
            System.out.println("Usted tiene un peso normal.");  
         }else if(imc <= 30 && imc >= 26){
            System.out.println("Usted tiene sobrepeso.");  
         }else if(imc <= 35 && imc >= 31){
            System.out.println("Usted tiene obesidad.");  
         }else if(imc <= 40 && imc >= 36){
            System.out.println("Usted tiene una obesidad marcada.");  
         }else if(imc > 40){
            System.out.println("Usted tiene una obesidad mórbida.");  
         }
       } 
             
    }
}