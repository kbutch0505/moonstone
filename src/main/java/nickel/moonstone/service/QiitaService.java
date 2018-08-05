package nickel.moonstone.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nickel.moonstone.service.User;
// import nickel.moonstone.service.UserList;

@Service
public class QiitaService {

    private final RestTemplate rt = new RestTemplate();

    private static final String url = "https://qiita.com/api/v2/users/keb";

    public User Service() {
        ResponseEntity<User> response = rt.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<User>() {});
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