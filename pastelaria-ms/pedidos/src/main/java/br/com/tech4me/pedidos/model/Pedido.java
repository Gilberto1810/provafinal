package br.com.tech4me.pedidos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("pedidos")
public class Pedido {
    @Id
    private String id;
    private String nomeCliente;
    private String idPastel;
    private Double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdPastel() {
        return idPastel;
    }
    public void setIdPastel(String idPastel) {
        this.idPastel = idPastel;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}
