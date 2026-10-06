package sintactico;

public class Analisis extends Variables{
    
    private Variables ValorFinal; //Lee El Ultimo Valor Ingresado
    
    public Analisis(){
        
        ValorFinal = null; //Inicializacion De La Variable
    }
    
    public void Agregar(char Dato){ 
        
        Variables NuevaV = new Variables(); //Objeto De Tipo Variables
        NuevaV.Datos = Dato; //Guarda La Informacion Ingresada
        
        if(ValorFinal==null){ //Si No Se Han Ingresado Datos
            
            NuevaV.Interno = null;
            ValorFinal = NuevaV; //Deja Los Datos Como Null
            
        }else  //Si Se Ingresa Informacion
            
            NuevaV.Interno = ValorFinal;
            ValorFinal = NuevaV; //Deja Los Datos Ingresados
    }
    
    public char Abstraer(){ 
        
        if(ValorFinal != null){ //Si El Ultimo Dato Ingresado Es Diferente De null
            
            char Info = ValorFinal.Datos; //Guarda La Informacion En Una Nueva Variable Char
            ValorFinal = ValorFinal.Interno; //Deja La Informacion Con Su Apuntador 
            return Info; 
            
        }else
            return Character.MIN_VALUE; //Retorno De Un Elemento De Tipo Char
    }
    
    public boolean Vacio(){
        
        return ValorFinal == null; //Nos Dice Que No Hay Datos
    }
}
