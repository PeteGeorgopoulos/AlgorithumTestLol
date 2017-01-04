
public class AlgorithumTest {

    public AlgorithumTest(){
        checkSolution();
    }
    public int solutionMethod(int[] A){
        return 0;
    }
    public void checkNumber(int[] B, int currentInt){
        int newInt = 0, newIntTwo = 0;
        int[] newArray = new int[B.length];
        for(int tempInt = 0; tempInt<= currentInt; tempInt++){
            newInt = newInt + B[tempInt];
            
        }
        for(int tempIntTwo = currentInt;tempIntTwo <= B.length -1; tempIntTwo++){
            newIntTwo = newIntTwo + B[tempIntTwo];
            
        }
        if(newInt == newIntTwo){
            System.out.println("matches");
        }
        else{
            System.out.println("nope");
        }
    }
    
    public void checkSolution(){
        
        int[] B = {-1, 3, -4, 5, 1, -6, 2, 1};
        for(int i = 0; i< B.length; i++){
            checkNumber(B, i);
        }
    }
    public static void main(String[] args) {
        AlgorithumTest at = new AlgorithumTest();
    }
    
}
