package calificacionesalumnos;

public class Calificacionesalumnos {
    
    static int[] cali=new int[10];
    
    public static void calificacionesAlumns(){
        
    cali[0]= 15;
    cali[1]= 11;    
    cali[2]= 16;
    cali[3]= 8;
    cali[4]= 20;
    cali[5]= 7;
    cali[6]= 14;
    cali[7]= 19;
    cali[8]= 15;
    cali[9]= 18;
        
        int r=0;
        for(int i=0; i<cali.length; i++){
        
            r= r+cali[i];
            
        }
        
        System.out.println("|-----Calificaciones-----|");
        System.out.println("El promedio de calificaciones es: "+r/cali.length);
        System.out.println("La MAYOR calificacion es: "+cali[4]);
        System.out.println("La MENOR calificacion es: "+cali[5]);
        
        
    
    }
    
   
    


    public static void main(String[] args) {
        
        calificacionesAlumns();
        
    }
    
}
