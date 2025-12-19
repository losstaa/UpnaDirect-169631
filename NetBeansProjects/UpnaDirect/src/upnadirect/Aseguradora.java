package upnadirect;

public interface Aseguradora {
    String getNombre();
    Oferta calcularOferta(Cliente cliente, Bien bien, int annoActual);
}