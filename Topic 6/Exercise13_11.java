public class Exercise13_11 extends Octagon {

    public static void main(String[] args) {
        Octagon oc1 = new Octagon(5);
        Octagon oc2 = (Octagon)oc1.clone();

        int compare = oc1.compareTo(oc2);
        
        System.out.println("Octagon 1: \n"
        		+ "\t Side = " + oc1.getPerimeter() / 8 + "\n"
        		+ "\t Perimeter = " + oc1.getPerimeter() + "\n"
        		+ "\t Area = " + oc1.getArea());
        System.out.println("Octagon 2: \n"
        		+ "\t Side = " + oc2.getPerimeter() / 8 + "\n"
        		+ "\t Perimeter = " + oc2.getPerimeter() + "\n"
        		+ "\t Area = " + oc2.getArea());
        
        if (compare == 1) {
        	System.out.println("Octagon 1 is greater than octagon 2.");
        }
        else if (compare == 0) {
        	System.out.println("Octagon 1 is equal to octagon 2.");
        }
        else if (compare == -1) {
        	System.out.println("Octagon 2 is greater than octagon 1.");
        	
        }
    }
}