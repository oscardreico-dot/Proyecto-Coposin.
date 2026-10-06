package sintactico;

import java.util.Scanner;

public class Sintactico extends Variables{

    public static void main(String[] args) {
        
        Insertar();
        if(Validacion()){ //Si La Validacion Es Verdadera
            System.out.println("\nLa Formula No Tiene Errores Sintacticos.");
        }else //Si La validacion Es Falsa
            System.out.println("\nLa Formula Tiene Errores Sintacticos.");
        
    }    
        
    public static boolean Validacion(){
              
        Analisis Analizador = new Analisis(); //Objeto De Clase Analisis
        String Tamaño;
        
        Tamaño=Informacion; //Pasa La Informacion De Una Variable A Otra Para Compararla
        
        for(int i=0;i< Tamaño.length();i++){ //Lee La Cadena De Datos
            
            switch (Tamaño.charAt(i)) { //Recorre  Toda Los Datos Para Buscar Un Dato En Especifico
                case '(': //Si hay Un (
                case '{': //Si hay Un {
                case '[': //Si hay Un [
                    Analizador.Agregar(Tamaño.charAt(i)); //Guarda El Daro Que Encontro
                    break;
                case ')': //Compara Los Corchetes
                    if(Analizador.Abstraer()!='('){
                        return false;
                    }   break;
                case '}': //Compara Las LLaves
                    if(Analizador.Abstraer()!='{'){
                        return false;
                    }   break;
                case ']': //Compara Corchetes Cuadrados
                    if(Analizador.Abstraer()!='['){
                        return false;
                    }   break;
                default:
                    break;            
            }
      }
        return Analizador.Vacio();  //En Caso De Que No Hay Ninguno De Los Datos Comparados
 }

    private static void Insertar() {
        
        Scanner Z = new Scanner(System.in);
        
        System.out.println("Digite Una Formula Matematica: ");
        Informacion=Z.next(); //Guarda La Informacion En La Variable 
    }
}

