public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private String sku; // código único del producto.
    private String categoria; // categoría a la que pertenece.
    private boolean esActivo; //  indica si el producto está activo en tienda.
    private boolean descuentoAplicable; // indica si el producto tiene descuento.


    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEsActivo() {
        return esActivo;
    }

    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }

    public boolean isDescuentoAplicable() {
        return descuentoAplicable;
    }

    public void setDescuentoAplicable(boolean descuentoAplicable) {
        this.descuentoAplicable = descuentoAplicable;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", sku='" + sku + '\'' +
                ", categoria='" + categoria + '\'' +
                ", esActivo=" + esActivo +
                ", descuentoAplicable=" + descuentoAplicable +
                '}';
    }
}