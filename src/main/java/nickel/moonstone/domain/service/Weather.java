package nickel.moonstone.domain.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

  // Forcast
  public String title;
  public List<Forecasts> forecasts;

  public static class Forecasts {
    public String dateLabel;
    public String telop;
    public Image image;
  }

  public static class Image {
    public String url;
  }

  // Copyright
  public Copyright copyright;

  public static class Copyright {
    public List<Provider> provider;
  }

  public static class Provider {
    public String link;
    public String name;
  }

}