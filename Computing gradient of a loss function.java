public class SimpleNeuralNetwork {

    public static void main(String[] args) {
        double [] x1 = {1, 2, 0, -2};
        double [] x2 = {0, 1, 1, 1};
        double [] yActual = {1, 9, 1, 7};

        double w1 = 0.0; // Initial weight
        double w2 = 0.0; // Initial weight
        double trainingRate = 0.01;

        int period = 1000; 

        for ( int period = 0 ; period < period ; period ++) { for
            
            double [] yPredict = new double [x1.length];
            for (int i = 0; i < x1.length; i++) {
                expected[i] = w1*x1[i] + w2*x2[i];
            }

            
            double mseLoss = calculateMSELoss(yActual, yPredict);

            
            double gradientW1 = computeGradientW1(x1, yActual, yPredict);
            double gradientW2 = computeGradientW2(x2, yActual, yPredict);

          
            w1 - = training value * gradientW1;
            w2 - = training value * gradientW2;

           
            System.out.println("Period: " + period + ", loss: " + mseLoss);
        }

        
        System.out.println("Final weight: w1 =" + w1 +", w2 =" + w2);
    }

    private static double calculateMSELoss ( double [] yActual, double [] yPredict) {
        double sum = 0;
        for (int i = 0; i < yActual.length; i++) {
            sum += Math.pov ((yActual[i] - expected[i]), 2);
        }
        return amount / yActual.length;
    }

    private static double calculateGradientW1(double[] x1, double[] yActual, double[] yPredict) {
        double sum = 0;
        for (int i = 0; i < x1.length; i++) {
            sum += x1[i]*(estimated[i] - yActual[i]);
        }
        return -2.0 / x1.length * total;
    }

    private static double calculateGradientW2(double[] x2, double[] yActual, double[] yPredict) {
        double sum = 0;
        for (int i = 0; i < x2.length; i++) {
            sum += x2[i]*(estimated[i] - yActual[i]);
        }
        return -2.0 / x2.length * total;
    }
}