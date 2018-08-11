package nickel.moonstone.domain.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

  public String description;
  public String id;
  public String name;
  public String profile_image_url;

}