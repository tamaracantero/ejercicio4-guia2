/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.guia2;

/**
 *
 * @author valkiria
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categorias categoria;

    public Producto(int codigo, String descripcion, double precio, int stock, Categorias categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Producto o) {
        if(codigo==o.codigo){
            return 0;
        }else if(codigo>o.codigo){
            return 1;
        }else{
            return -1;
        }
    }
    
}
