public class Demo {  
    public static void main(String args[]) {    
        Estudiante s1;
        s1 = new Estudiante();
        s1.increment();
        s1.showData("s1");    
        Estudiante s2 = new Estudiante(); 
        s2.showData("s2");    

        Estudiante.b++;   
        s1.showData("s1");
    }
} 

class Estudiante {
    private int a; // inicializado a cero
    /*private*/ static int b; // inicializado a cero solo cuando la clase no está cargada para cada objeto creado.   

    Estudiante() {  
        // Constructor incrementa la variable estática b  
        b++; 
    }   
    
    public void showData(String nomobj) {     
		    String nomclase = this.getClass().getName();
			System.out.println ("Ejecutando codigo de la clase: " + nomclase + " de la instancia: " + nomobj);
            System.out.println("Valor de a =" + a);     
            System.out.println("Valor de b =" + b);  
            System.out.println();
    }
        
    public void increment() {
            a++;
    } 
}
