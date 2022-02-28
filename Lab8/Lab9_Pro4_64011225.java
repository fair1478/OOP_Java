public class Lab9_Pro4_64011225 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon octagonReal = new Octagon("Blue",true,5);
        System.out.println("octagonReal");
        System.out.println(octagonReal.toString());

        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        Octagon octagonCopy = (Octagon)octagonReal.clone();
        System.out.println("octagonCopy");
        System.out.println(octagonCopy.toString());

        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        switch (octagonReal.compareTo(octagonCopy)) {
            case 0:
                System.out.println("octagonReal is equal octagonCopy");
                break;
            case -1:
                System.out.println("octagonReal is less than octagonCopy");
                break;
            case 1:
                System.out.println("octagonReal is less than octagonCopy");
                break;
            default:
                break;
        }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
}
