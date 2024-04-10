package launchexception;

public class DrawPoint {

    // Private attributes
    private int x;
    private int y;

    // Constructor equipped with exception to handle negative coordinates
    DrawPoint(int x, int y) throws ErrorCoordinatesException {

        if ( x < 0 || y < 0 ){
            throw new ErrorCoordinatesException(x, y); // launch or throw an exception of type Coordinates Error
        }

        this.x = x;
        this.y = y;

    }

    public void displacement(int deltaX, int deltaY) throws ErrorDisplacementException {

        int finalPositionX = x + deltaX;
        int finalPositionY = y + deltaY;
        if( finalPositionX < 0 || finalPositionY < 0){
            throw new ErrorDisplacementException("Final position coordinate negative.");
        }
        x = finalPositionX;
        y = finalPositionY;

    }

    @Override
    public String toString() {

        return "DrawPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';

    }
}
