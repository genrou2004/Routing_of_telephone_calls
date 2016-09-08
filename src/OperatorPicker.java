
import java.util.List;
/**
 * 
 * @author Raya
 *
 */
public class OperatorPicker {	
 
	private static OperatorPicker op;
  
    private OperatorPicker(){
         
    }
    
    public static OperatorPicker getInstance(){
        if(op == null){
        	op = new OperatorPicker();
        }
        return op;
    }
     		
	public void GetCheapestOperator(List<Operator> operatorList, Long telephoneNumber) {

//		String ReturnValue = "";
		String leastCostOperator = null;
		Double leastPrice = null;
		try {
			for (Operator operator : operatorList) {
				long tempNumber = telephoneNumber;
				do {
					Double currentPrice = operator.getPrefixes().get(tempNumber);
					if (currentPrice != null) {
						if (leastCostOperator == null || (leastPrice != null && currentPrice < leastPrice)) {
							leastCostOperator = operator.getName();
							leastPrice = currentPrice;
						}
						break;
					}
					tempNumber = tempNumber / 10;
				} while (tempNumber > 0);

			}
			if (leastPrice == null) {
//				ReturnValue = "No Matching found";
				System.out.println("No operator found that enables calling " + telephoneNumber);
			} else {
				System.out.println("Operator Name : " + leastCostOperator);
				System.out.println("Least Price   : " + leastPrice);
//				ReturnValue = leastCostOperator.trim() + " " + leastPrice;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
//		return ReturnValue;

	}


}
