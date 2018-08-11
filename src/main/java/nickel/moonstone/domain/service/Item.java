package nickel.moonstone.domain.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

  // public String render_body;
  public String body;

}