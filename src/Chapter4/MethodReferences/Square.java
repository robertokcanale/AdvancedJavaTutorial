package Chapter4.MethodReferences;

public class Square {
    int sideLength;
    public Square(int sideLength){
        this.sideLength = sideLength;
    }

    public int calculateArea(){
        return this.sideLength*this.sideLength;
    }
}
