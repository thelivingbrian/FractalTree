package bsu.edu.btlynch;

import java.util.ArrayList;

public class ListOfLines {

    private int lineNumber = 0;
    private ArrayList<Line> lineList = new ArrayList<>();

    public void addLine(Line lineToAdd){
        lineList.add(lineToAdd);
        lineNumber++;
    }

    public Line getLineAt(int index){ return lineList.get(index); }

    public int getNumOfLines(){
        return lineNumber;
    }

}
