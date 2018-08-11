package nickel.moonstone.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;
import java.util.List;

import nickel.moonstone.domain.service.User;

@Service
public class QiitaService {

    private final RestTemplate rt = new RestTemplate();

    public static final String baseurl = "https://qiita.com/api/v2";

    public User getUser(String user) {
      String url = baseurl + "/users/" + user;

      ResponseEntity<User> response = rt.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<User>() {});
      return response.getBody();
    }

    public List<User> getUserList() {
      String url = baseurl + "/users";

      ResponseEntity<List<User>> response = rt.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {});
      return response.getBody();
    }

}