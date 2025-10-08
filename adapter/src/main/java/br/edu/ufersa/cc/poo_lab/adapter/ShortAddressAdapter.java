package br.edu.ufersa.cc.poo_lab.adapter;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ShortAddressAdapter extends Address {

    private final ObjectMapper mapper = new ObjectMapper();

    public ShortAddressAdapter(final ShortAddress shortAddress) {
        // Preencher dados em comum
        setZip(shortAddress.getZip());
        setNumber(shortAddress.getNumber());
        setComplement(shortAddress.getComplement());
        setReference(shortAddress.getReference());

        final var cep = getCep(getZip());

        setCountry("Brasil");
        setState(cep.getEstado());
        setCity(cep.getLocalidade());
        setNeighborhood(cep.getBairro());
        setStreet(cep.getLogradouro());
    }

    private ViaCepResponse getCep(final String zip) {
        final var cep = zip.replaceAll("\\D", "");

        try (final var client = HttpClient.newHttpClient()) {
            final var request = HttpRequest.newBuilder()
                    .uri(URI.create("http://viacep.com.br/ws/" + cep + "/json/"))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return mapper.readValue(response.body(), ViaCepResponse.class);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

}
