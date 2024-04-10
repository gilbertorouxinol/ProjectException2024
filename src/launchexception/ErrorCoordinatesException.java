package launchexception;

public class ErrorCoordinatesException extends Exception{
    public int alpha;
    public int beta;
    public String msg;

    public ErrorCoordinatesException(int alpha, int beta) {

        this.alpha = alpha;
        this.beta = beta;

        msg = "Negative coordinates: (" + this.alpha + ", " + this.beta + ")";

    }

    @Override
    public String getMessage(){

        return msg;

    }
}
