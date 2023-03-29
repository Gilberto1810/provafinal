package br.com.tech4me.pedidos.shared;

import jakarta.validation.constraints.Positive;

public class PedidoCompletoDto {
    private String id;
    private String nomeCliente;
    private String idPastel;
    @Positive
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
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
