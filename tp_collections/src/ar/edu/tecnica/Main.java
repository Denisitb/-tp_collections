package ar.edu.tecnica;

/**
 * @author DENIS ITURBE
 * 
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		ejemploList();
		ejemploSet();
		ejemploMap();
		ejemploQueue();
		ejemploDeque();

		ejemploSort();
		ejemploReverse();
		ejemploShuffle();
		ejemploSwap();
		ejemploFill();
		ejemploMin();
		ejemploMax();
	}

	
	{ public static void main(String[] args) {
	        
	        ArrayList<Integer> numeros = new ArrayList<Integer>();


	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);
	      
	        System.out.println("1, 2, 3, 4, 5");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }
	    }
	}

	
	{ public static void main(String[] args) {
	       
	        HashSet<Integer> numeros = new HashSet<Integer>();

	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        nuemros.add(4);
	        numeros.add(5);
	        
	        System.out.println("1, 2, 3, 4, 5");
	        for (Integer numeros : set) {
	            System.out.println(numeros);
	        }
	    }
	
	}
	
	
	

	{
	    public static void main(String[] args) {

	    	PriorityQueue<Integer> numeros = new PriorityQueue<Integer>();

	        
	        nuemros.add(5);
	        nuemros.add(1);
	        nuemros.add(3);
	        numeros.add(4);
	        numeros.add(2);

	        
	        System.out.println("5, 1, 3, 4, 2");
	        while (!colaPrioridad.isEmpty()) {
	           
	            System.out.println(filaPrioridad.poll());
	        }
	    }
	}



	{
	    public static void main(String[] args) {
	        
	        ArrayDeque<Integer> numeros = new ArrayDeque<Integer>();

	        
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);

	       
	        System.out.println("2, 3, 4, 5");
	        for (Integer numeros : deque) {
	            System.out.println(numeros);
	        }
	    }
	}

	
	
	
	public static void ejemploMap() {
		// HashMap
		HashMap<String, Integer> numeros = new HashMap<String, Integer>();
		// numeros.put("X", 0);
	}

{
	    public static void main(String[] args) {
	        
	    	HashMap<String, Integer> numeros = new HashMap<String, Integer>();

	        
	        numeros.put("Rojo", 1);
	        numeros.put("Azul", 2);
	        numeros.put("Verde", 3);
	        numeros.put("Amarillo", 4);
	        numeros.put("Rosa", 5);

	        
	        System.out.println("Rojo, Azul, Verde, Amarillo, Rosa");
	        for (String clave : mapa.keySet()) {
	            Integer numeros = mapa.get(clave);
	            System.out.println(clave + " -> " + valor);
	        }
	    }
	}

	
	
{
	    public static void main(String[] args) {

	    	ArrayList<Integer> numeros = new ArrayList<Integer>();

	        
	        lista.add(5);
	        lista.add(2);
	        lista.add(4);
	        lista.add(1);
	        lista.add(3);

	        System.out.println("5, 2, 4, 1, 3");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }

	        Collections.sort(lista);

	        System.out.println("1, 2, 3, 4, 5");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }
	    }
	}




	    {public static void main(String[] args) {
	        
	        ArrayList<Integer> nuemros = new ArrayList<Integer>();

	     
	        lista.add(1);
	        lista.add(2);
	        lista.add(3);
	        lista.add(4);
	        lista.add(5);

	        
	        System.out.println("1, 2, 3, 4, 5");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }

	        Collections.reverse(lista);


	        System.out.println("5, 4, 3, 2, 1");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }
	    }
	}


	{
	    public static void main(String[] args) {
	        
	        ArrayList<Integer> numeros = new ArrayList<>();

	        
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);

	  
	        System.out.println("1, 2, 3, 4, 5");
	        for (Integer numero : lista) {
	            System.out.println(numero);
	        }

	    
	        Collections.shuffle(lista);

	        
	        System.out.println("3, 5, 1, 2, 4");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }
	    }
	}

	
{
	    public static void main(String[] args) {
	      
	        ArrayList<Integer> numeros = new ArrayList<Integer>();

	     
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);

	        
	        System.out.println("1, 2, 3, 4, 5");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }

	      
	        Collections.swap(lista, 1, 3);

	        // Imprimir la lista después del intercambio
	        System.out.println("2, 4");
	        for (Integer numero : lista) {
	            System.out.println(numero);
	        }
	    }
	}

	

	{
	    public static void main(String[] args) {
	        
	        ArrayList<Integer> numeros = new ArrayList<Integer>();

	        
	        lista.add(1);
	        lista.add(2);
	        lista.add(3);
	        lista.add(4);
	        lista.add(5);

	       
	        System.out.println("1, 2, 3, 4, 5");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }

	        
	        Collections.fill(lista, 10);

	       
	        System.out.println("10, 10, 10, 10, 10");
	        for (Integer numeros : lista) {
	            System.out.println(numero);
	        }
	    }
	}

	

	{
	    public static void ejemploMin() {
	       
	        ArrayList<Integer> numeros = new ArrayList<Integer>();

	        
	        numeros.add(2);
	        numeros.add(33);
	        numeros.add(-32);

	        
	        var min = Collections.min(numeros);

	        
	        System.out.println("""
	                El mínimo es:
	                              """ + min);
	    }

	    public static void main(String[] args) {
	        
	        ejemploMin();
	    }
	}

	
	public static void ejemploMax() {
		
	}

{
	    public static void ejemploMax() {

	    	ArrayList<Integer> numeros = new ArrayList<>();

	       
	        numeros.add(2);
	        numeros.add(33);
	        numeros.add(-32);
	        numeros.add(50);
	        numeros.add(15);

	       
	        var max = Collections.max(numeros);

	  
	        System.out.println("""
	                El máximo es:
	                              """ + max);
	    }

	    public static void main(String[] args) {
	      
	        ejemploMax();
	    }
	}

	
}
