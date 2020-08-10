package com.example.springsandal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* @RestController combines @Controller and @ResponseBody,
two annotations that results in web requests returning data
rather than a view.
*/
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }
}
