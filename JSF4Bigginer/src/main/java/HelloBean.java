import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="beenObj")
@SessionScoped
public class HelloBean implements Serializable {

private static final long serialVersionUID = 1L;
private String greeting="Hello World JSF :D";


 public String getGreeting() {

  return greeting;

 }


 public void setGreeting(String greeting) {

  this.greeting = greeting;

 }

 

}



