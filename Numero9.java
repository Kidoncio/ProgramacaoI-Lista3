package lista.exercicios.tres;

class Numero {
    	private int[] elementos;
    	private int maximo;
    	private int minimo;
    
   	Numero (int numero){
        	this.elementos = new int[numero];
    	}

    public void setElementos (int i, int numero) {
        if (i >= 0 && i < this.elementos.length) {
            this.elementos[i] = numero;
        }
    }
    
    void exibir (){
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.printf("\n Elementos[%d]: %d ", i, this.elementos[i]);
        }
        System.out.println("");
    }
    
    public int getMaximo() {
        return maximo;
    }

    public int getMinimo() {
        return minimo;
    }
    
    public int getElementos (int i) {
        if (i >= 0 && i < this.elementos.length) {
            return this.elementos[i];
        }
        return 0;
    } 
}

// ** classe AppTesta ...
public class Numero9 {
    public static void main(String[] args) {
        
        Numero array = new Numero (4);
        
        array.setElementos(0, 15);
        array.setElementos(1, 25);
        array.setElementos(2, 47);
        array.setElementos(3, 54); 
        
        System.out.println("Posição 0: " +array.getElementos(0));
        System.out.println("Posição 1: " +array.getElementos(1));
        System.out.println("Posição 2: " +array.getElementos(2));
        System.out.println("Posição 3: " +array.getElementos(3));

        System.out.println("\n*************\n");
        
        array.exibir();
    }
}