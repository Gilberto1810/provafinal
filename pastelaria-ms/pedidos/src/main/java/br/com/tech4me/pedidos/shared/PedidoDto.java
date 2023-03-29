package br.com.tech4me.pedidos.shared;

import br.com.tech4me.pedidos.model.Pastel;

public class PedidoDto {
    private String nomeCliente;
    private String idPastel;
    private Pastel dadosPastel;
    private Double valor;
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdPastel() {
        return idPastel;
    }
    public Pastel getDadosPastel() {
        return dadosPastel;
    }
    public void setDadosPastel(Pastel dadosPastel) {
        this.dadosPastel = dadosPastel;
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
