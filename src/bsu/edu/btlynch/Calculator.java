package bsu.edu.btlynch;

public class Calculator {

    private final int SCALE_FACTOR = 10;
    private int hypotenuseLength, adjacentLineLength, oppositeLineLength;
    private double angleInRad;

    public Calculator(CalculatorBuilder builder) {
        this.angleInRad = Math.toRadians(builder.angleInDeg);
        this.hypotenuseLength = builder.depth * SCALE_FACTOR;
        this.adjacentLineLength = adjacentLineLength();
        this.oppositeLineLength = oppositeLineLength();
    }

    public int adjacentLineLength(){
        double xComponent = Math.cos(angleInRad);
        return (int) (xComponent * hypotenuseLength);
    }

    public int oppositeLineLength(){
        double yComponent = Math.sin(angleInRad);
        return (int) (yComponent * hypotenuseLength);
    }

    public Point getEndPoint(Point startPoint) {
        final int xOfEndPoint = startPoint.x() + this.adjacentLineLength;
        final int yOfEndPoint = startPoint.y() + this.oppositeLineLength;
        return new Point(xOfEndPoint, yOfEndPoint);
    }

    public static class CalculatorBuilder{
        private double angleInDeg;
        private int depth;

        public CalculatorBuilder(double angleInDeg){this.angleInDeg = angleInDeg;}
        public CalculatorBuilder depth(int depth){this.depth = depth; return this;};
        public Calculator build() {
            return new Calculator(this);
        }
    }

}
