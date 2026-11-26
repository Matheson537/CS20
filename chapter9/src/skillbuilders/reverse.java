package skillbuilders;

public class reverse

{	
	
    public static void main(String[] args) {
        int[] squares = new int[10];

        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }

        for (int i = squares.length - 1; i >= 0; i--) {
        	System.out.println("Index " + i + ": " + squares[i]);
            
            
        }
    }
}
