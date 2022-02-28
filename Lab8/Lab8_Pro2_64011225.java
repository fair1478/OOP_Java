public class Lab8_Pro2_64011225 {
    public static void main(String[] args) {
        Square[] squares = new Square[5];
        squares[0] = new Square("Yellow",true,20);
        squares[1] = new Square("Green",true,10);
        squares[2] = new Square("White",true,5);
        squares[3] = new Square("Red",true,13);
        squares[4] = new Square("Blue",true,4);

        for(int i = 0;i<squares.length;i++)
        {
            System.out.println("square_"+(i+1)+"\n"+squares[i].toString());
            if(squares[i].isFilled())
                squares[i].howToColor();
            System.out.println("---------------------------");
        }
    }
}
