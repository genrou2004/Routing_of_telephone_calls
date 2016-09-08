import java.util.HashMap;
import java.util.Map;


public class Operator {
  private String name;
  private Map<Long, Double> prefixes;
  
  public Operator(){
	  name = "defaultOperator";
	  prefixes = new HashMap<Long, Double>();
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Map<Long, Double> getPrefixes() {
	return prefixes;
}

public void setPrefixes(Map<Long, Double> prefixes) {
	this.prefixes = prefixes;
}
  
  
}
