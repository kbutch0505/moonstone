package nickel.moonstone.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;
import java.util.List;
import java.util.ArrayList;

import nickel.moonstone.domain.service.Weather;

@Service
public class WeatherService {

    private final RestTemplate rt = new RestTemplate();

    public static final String baseurl = "http://weather.livedoor.com/forecast/webservice/json/v1?city=";

    public Weather getWeather() {
      String url = baseurl + "270000";

      Weather response = rt.getForObject(url, Weather.class);
      return response;
    }

}