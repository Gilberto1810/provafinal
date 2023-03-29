package br.com.tech4me.pedidos.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.tech4me.pedidos.model.Pastel;

@FeignClient(name = "pastelaria", fallback = PastelariaClientFallback.class)
public interface PastelariaClient {
    
    @RequestMapping(value="/cardapio/{id}", method=RequestMethod.GET)
    Pastel obterPastel(@PathVariable String id);
}

@Component
class PastelariaClientFallback implements PastelariaClient {
    @Override
    public Pastel obterPastel(String id) {
        return new Pastel();
    }
}
