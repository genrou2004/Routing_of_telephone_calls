import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		 Operator operator1 = new Operator();
    	 Operator operator2 = new Operator();
//    	 Operator operator3 = new Operator();
    	 
    	 Map<Long,Double> operatorOnePrefixes = new HashMap<Long,Double>();
    	 operatorOnePrefixes.put(new Long(1), 0.9);
    	 operatorOnePrefixes.put(new Long(268), 5.1);
    	 operatorOnePrefixes.put(new Long(46), 0.17);
    	 operatorOnePrefixes.put(new Long(4620), 0.0);
    	 operatorOnePrefixes.put(new Long(468), 0.15);
    	 operatorOnePrefixes.put(new Long(4631), 0.15);
    	 operatorOnePrefixes.put(new Long(4673), 0.9);
    	 operatorOnePrefixes.put(new Long(46732), 1.1);
    	 
    	 operator1.setName("Operator A");
    	 operator1.setPrefixes(operatorOnePrefixes);
    	 
    	 Map<Long,Double> operatorTwoPrefixes = new HashMap<Long,Double>();
    	 operatorTwoPrefixes.put(new Long(1), 0.92);
    	 operatorTwoPrefixes.put(new Long(44), 0.5);
    	 operatorTwoPrefixes.put(new Long(46), 0.2);
    	 operatorTwoPrefixes.put(new Long(467), 1.0);
    	 operatorTwoPrefixes.put(new Long(48), 1.2);
    	 
    	 operator2.setName("Operator B");
    	 operator2.setPrefixes(operatorTwoPrefixes);
    	 
//    	 Map<Long,Double> operatorThreePrefixes = new HashMap<Long,Double>();
//    	 operatorThreePrefixes.put(new Long(46), 1.7);
//    	 operatorThreePrefixes.put(new Long(465), 0.5);
//    	 operatorThreePrefixes.put(new Long(4634545), 1.4);
//    	 operatorThreePrefixes.put(new Long(46), 2.0);
//    	 operatorThreePrefixes.put(new Long(4678), 1.4);
//    	 operatorThreePrefixes.put(new Long(4687), 0.7);
//    	    	 
//    	 operator3.setName("Operator C");
//    	 operator3.setPrefixes(operatorThreePrefixes);
    	 
    	 long telephoneNumber = 4673212345L;
      
         List<Operator> operatorList = new ArrayList<Operator>();
         operatorList.add(operator1);
         operatorList.add(operator2);
//         operatorList.add(operator3);
         
         
         OperatorPicker operatorPicker = OperatorPicker.getInstance();
         operatorPicker.GetCheapestOperator(operatorList, telephoneNumber);

         
//         OperatorPicker obj = new OperatorPicker();
//         obj.GetCheapestOperator(operatorList, telephoneNumber);

     }
     

}
