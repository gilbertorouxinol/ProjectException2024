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
public class MainException {
    //public static void main(String[] args) throws ErrorCoordinatesException, ErrorDisplacementException {
    public static void main(String[] args) {
        try {
            DrawPoint p1 = new DrawPoint(0,10);
            System.out.println(p1.toString());

            p1.displacement(100,-100);
            System.out.println(p1.toString());

            DrawPoint p2 = new DrawPoint(1,1);
            System.out.println(p2.toString());

            //} catch (ErrorCoordinatesException | ErrorDisplacementException e) {
        } catch (ErrorCoordinatesException e) {

            System.out.println("Error Message: " + e.getMessage());
            System.out.println("Error Message: x = " + e.alpha + "  y = " + e.beta);
            //System.exit(-1);

        } catch (ErrorDisplacementException e){

            System.out.println("Error Message: " + e.getMessage());
            //System.exit(-1);

        }

        System.out.println("Now, outside the try catch block.");
    }
}
