public class IllegalTriangleException extends Exception {
    
    IllegalTriangleException(String st){
        super(st);
    }

    @Override
    public String getLocalizedMessage() {
        return "IIllegalTriangle Try again";
    }
}
    
