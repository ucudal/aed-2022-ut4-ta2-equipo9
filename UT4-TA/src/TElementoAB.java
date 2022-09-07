
public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;

    }

    public Comparable getEtiqueta() {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TElementoAB<T> getHijoIzq() {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TElementoAB<T> getHijoDer() {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setHijoIzq(TElementoAB<T> elemento) {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setHijoDer(TElementoAB<T> elemento) {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        TElementoAB<T> Resultado = null;
        if (unaEtiqueta == this.etiqueta) {
            Resultado = this;
        } else {
            if (unaEtiqueta < etiqueta) {
                if (this.hijoIzq != null) {
                    Resultado = hijoIzq.buscar(unaEtiqueta);
                }
            } else {
                if (this.hijoDer != null) {
                    Resultado = hijoDer.buscar(unaEtiqueta);
                }
            }
        }
        return Resultado;
    }

    public boolean insertar(TElementoAB<T> elemento) {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String preOrden() {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String inOrden() {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String postOrden() {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public T getDatos() {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new java.lang.UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
