public class Exercise5_39 {

	public static void main(String[] args) {
		int desiredCommission = 30000;
        int salesAmount = 0;
        double commissionRate = 0;
        double commissionAmount = 0;
        System.out.println("Sales Amount" + "\t\t" + "Commission Rate" + "\t\t" + "Commission Amount");
         
        for (salesAmount=1; salesAmount <= 500000;salesAmount++){
        if(salesAmount <= 5000){
            commissionRate =  0.08;
        }
        if(salesAmount >= 5001 &&  salesAmount <= 10000){
            commissionRate = 0.10;
        }
        if(salesAmount >= 10000){
            commissionRate = 0.12;  
        }   
        salesAmount += 4999;
        commissionAmount = salesAmount * commissionRate;
        System.out.println(salesAmount + "\t\t\t" + commissionRate + "\t\t\t" + commissionAmount);
        if(commissionAmount==desiredCommission){
            break;}
        }
        System.out.print("The sale must be at least $" + salesAmount + " to earn a commission of $" + desiredCommission + ".");

		}

	}


