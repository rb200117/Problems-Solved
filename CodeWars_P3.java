
import java.util.Arrays;

public class CodeWars_P3 {

    public static double[] crusoe(int n, double d, int ang, double distmult, double angmult) {
        // your code
        double[] xAxis = new double[n+1];
        double[] yAxis = new double[n+1];
        double[] Output = new double[2];
        double x_1_coord;
        double xCoordinate = 0;
        double yCoordinate = 0;
        double dAngle = ang;
        xAxis[0]=0.0;
        yAxis[0]=0.0;
        for(int i=1; i<=n; i++){
            //for x-axis
            x_1_coord = Math.cos(Math.toRadians(dAngle))*d;
            xCoordinate = xCoordinate + (Math.cos(Math.toRadians(dAngle))*d);
            //for y-axis
            yCoordinate = yCoordinate+Math.tan(Math.toRadians(dAngle))*x_1_coord;
            xAxis[i]=xCoordinate;
            yAxis[i]=yCoordinate;
            //Changing angle and distance
            dAngle = dAngle*angmult;
            d *= distmult;
        }
        Output[0]=xAxis[n];
        Output[1]=yAxis[n];
 return Output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(crusoe(5, 0.2, 30, 1.02, 1.1)));
    }
}
