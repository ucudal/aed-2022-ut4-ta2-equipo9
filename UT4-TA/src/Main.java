public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        TArbolBB arbolito = new TArbolBB();                         // "consultaPrueba.txt"
        String[] contenido = ManejadorArchivosGenerico.leerArchivo("All Files	C:\\Users\\Administrador\\OneDrive\\Escritorio\\final\\aed-2022-ut4-ta2-equipo9\\UT4-TA\\src\\consultaPrueba.txt");
        for (String linea : contenido) {
            IElementoAB<Integer> nodi = new TElementoAB(Integer.parseInt(linea), null) {};

            arbolito.insertar((TElementoAB) nodi);
        }
    }

}
