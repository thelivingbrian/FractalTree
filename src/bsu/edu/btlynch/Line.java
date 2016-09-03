package bsu.edu.btlynch;

public class Line {

    private Point startPoint, endPoint;
    private double angleInDeg;
    private int depth;
    private Calculator calculator;

    private Line(LineBuilder builder){
        this.startPoint = builder.startPoint;
        this.angleInDeg = builder.angleInDeg;
        this.depth = builder.depth;
        calculator = new Calculator.CalculatorBuilder(builder.angleInDeg).depth(builder.depth).build();
        this.endPoint = calculator.getEndPoint(this.startPoint);
    }

    public Point getStartPoint() {
        return startPoint;
    }
    public Point getEndPoint() { return endPoint; }
    public int getDepth() { return depth; }
    public double getAngleInDeg() { return angleInDeg; }
    public boolean hasNoBranches() { return (depth == 0); }

    public static class LineBuilder {
        private double angleInDeg;
        private Point startPoint;
        private int depth;

        public LineBuilder angle(double angleInDeg) {this.angleInDeg = angleInDeg; return this;}
        public LineBuilder startPoint(Point pointA){this.startPoint = pointA; return this;}
        public LineBuilder depth(int depth){this.depth = depth; return this;}
        public Line build() {
            return new Line(this);
        }
    }

}



