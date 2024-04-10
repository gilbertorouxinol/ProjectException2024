package launchexception;

/**
 * IntelliJ IDEA 2021.2.2 (Ultimate Edition)<br>
 * Licensed to Gilberto Rouxinol<br>
 * For educational use only.<br><br>
 * <p>
 * Polytechnic Institute of Viseu<br>
 * School of Technology and Management of Viseu<br><br>
 * <p>
 * Class created by Gilberto Rouxinol on 2024<br>
 * Copyright © 2024 Gilberto Rouxinol<br>
 * All rights reserved<br><br>
 * <p>
 * @author Gilberto Rouxinol
 * @version 2024.04.10
 */
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
