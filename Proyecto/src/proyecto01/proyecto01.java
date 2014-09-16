package proyecto01;

public class proyecto01 {

	public static void main(String[] args) {

		
	}
	
	public static String[] productos() {

        String[] productos = {"Leche", "Manjar", "Nectar", "Atun", "Arroz", "Fideos",
            "Mayonesa", "Bebidas", "Aceite", "Vinagre"};
        
        return productos;
    }

    public static String[] supermercados() {

        String[] supermercados = {"Lider", "Trebol", "Santa Isabel", "Mayorista 10",
            "Unimarc", "Jumbo", "Acuenta", "Alvi"};
        return supermercados;
    }
    
    public static void precio(String []superemercado, String [] productos){
    	
    }
    
    public static String buscador(String []superemercado, String [] productos, String []precio){
    	
    	String buscarProducto=JOptionPane.showInputDialog("Ingrese el producto que quiere buscar");
    	
    	String precioySuper="";
    	return precioySuper;
    }

}
