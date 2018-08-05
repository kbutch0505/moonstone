package nickel.moonstone.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QiitaService {

    private final RestTemplate rt = new RestTemplate();

    private static final String url = "http://gturnquist-quoters.cfapps.io/api/random";

    public List<RandomValue> Service() {
        ResponseEntity<List<RandomValue>> response = rt.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<RandomValue>>() {});
        return response.getBody();
    }

  public static class RandomValue {
    public String type;
    public Value value;
  }
  public static class Value {
    public long id;
    public String quote;
  }

}