public class Colton_Kelsey_SerialNumber {
    private String first;
    private String second;
    private String third;
    private boolean valid;

    public Colton_Kelsey_SerialNumber(String serNum){
    }

    public boolean isValid() {
        return valid;
    }

    private void validate(){
        isFirstGroupValid();
        isSecondGroupValid();
        isThirdGroupValid();
    }

    private boolean isFirstGroupValid(){  
        if (first.length() != 5)   // immediately invalidates if length != 5
            return false;

        try {                                          // should attempt to parse an int, if it can, it returns false
            int firstInt = Integer.parseInt(first);
            return false;
            }
            catch (Exception e){
                System.out.println("ERROR");
            }
        else {                                        // if it is length of 5 and cannot be parsed into an int, it is valid
            return true;
        }
    }

    private boolean isSecondGroupValid(){
        if (second.length() == 5)
            try {
                int secondInt = Integer.parseInt(second);
                return true;
            }
            catch(Exception e) {
                System.out.println("ERROR");
            }
            else {
                return false; 
            }
    }

    private boolean isThirdGroupValid(){
        if(third.length() != 5)
            return false;
        
        try{
            int thirdInt = Integer.parseInt(third);
            return false;
        }
        catch (Exception e){
            System.out.println("ERROR");
        }
        else{
            return true;
        }
    }

    // tester
    public static void main(String []args){

    }
    
}
