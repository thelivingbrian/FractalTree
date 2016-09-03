package bsu.edu.btlynch;

public class FractalTree {

    private final int MAX_LAYERS = 9, X_START = 400, Y_START = 600;
    private final double STARTING_ANGLE = -90;
    private Point initialPoint;
    private Line initialLine;
    private LineGenerator lineGenerator;
    private ListOfLines savedLines;

    public FractalTree() {
        initialPoint = new Point(X_START, Y_START);
        initialLine = new Line.LineBuilder()
                .angle(STARTING_ANGLE).startPoint(initialPoint).depth(MAX_LAYERS).build();
        savedLines = new ListOfLines();
        lineGenerator = new LineGenerator(savedLines);
    }

    public void generateLines(){
        lineGenerator.saveLine(initialLine);
    }

    public Line getLineNumber(int lineNumber){
        return savedLines.getLineAt(lineNumber);
    }

    public int getNumOfLines() { return savedLines.getNumOfLines(); }

}

