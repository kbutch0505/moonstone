package nickel.moonstone.domain.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

  // public String description;
  // public String facebook_id;
  // public int followees_count;
  // public int followers_count;
  // public String github_login_name;
  public String id;
  public Integer items_count;
  // public String linkedin_id;
  // public String location;
  public String name;
  // public String organization;
  // public String permanent_id;
  // public String profile_image_url;
  // public String twitter_screen_name;
  // public String website_url; 

}