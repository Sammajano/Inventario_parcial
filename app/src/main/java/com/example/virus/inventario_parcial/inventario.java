package com.example.virus.inventario_parcial;

public class inventario {

    private String nombre_producto;
    private String codigo;
    private int cantidad_disponible;
    private double precio_venta;
    private double precio_unidad;
    private  int foto;

    public inventario(){

    }

    public inventario(String nombre_producto, String codigo, int cantidad_disponible, double precio_venta, double precio_unidad, int foto) {
        this.nombre_producto = nombre_producto;
        this.codigo = codigo;
        this.cantidad_disponible = cantidad_disponible;
        this.precio_venta = precio_venta;
        this.precio_unidad = precio_unidad;
        this.foto = foto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(double precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
