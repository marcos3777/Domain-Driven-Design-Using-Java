public class Carro {

    private long id;
    private String placa;
    private String marca;
    private String modelo;
    
    public Carro() {
    }



    public Carro(long id, String placa, String marca, String modelo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
