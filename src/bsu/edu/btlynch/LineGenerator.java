package bsu.edu.btlynch;

public class LineGenerator {

    private ListOfLines savedLines;
    private Line addedLine;

    public LineGenerator(ListOfLines savedLines) {
       this.savedLines = savedLines;
    }

    public void saveLine(Line line){
        savedLines.addLine(line);
        this.addedLine = line;
        if (addedLine.hasNoBranches()) {
            return;
        } else {
            addBranches();
        }
    }

    public void addBranches() {
        Line leftBranch = createBranch(-20);
        Line rightBranch = createBranch(20);
        saveLine(leftBranch);
        saveLine(rightBranch);
    }

    public Line createBranch(int changeInAngle) {
        final double previousAngle = addedLine.getAngleInDeg();
        final int previousDepth = addedLine.getDepth();
        final Point previousEndPoint = addedLine.getEndPoint();
        return new Line.LineBuilder().startPoint(previousEndPoint).depth(previousDepth-1).angle(previousAngle+changeInAngle).build();
    }

}
