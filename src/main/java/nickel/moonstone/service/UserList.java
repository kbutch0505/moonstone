package nickel.moonstone.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import nickel.moonstone.service.User;

import java.util.List;
import java.util.ArrayList;

// @JsonIgnoreProperties(ignoreUnknown = true)
public class UserList {
  List<User> result = new ArrayList<User>();

}