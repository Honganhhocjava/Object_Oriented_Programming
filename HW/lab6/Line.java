package hus.oop.lab6;

public class Line {
    private Point begin , end ;
    public Line(Point begin , Point end) {
        this.begin = begin;
        this.end = end ;
    }

    public Line(int beginX , int beginY , int endX , int endY) {
        begin =  new Point(beginX , beginY);
        end = new Point(endX , endY);
    }

    @Override
    public String toString() {
        return "Line: (" + begin + "," + end + ")";
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }

    public void setBeginY( int beginY) {
        begin.setY(beginY);
    }

    public void setBeginXY(int beginX , int beginY) {
        begin.setXY(beginX,beginY);
    }

    public void setEndX(int endX) {
        begin.setX(endX);
    }

    public void setEndY( int endY) {
        begin.setY(endY);
    }

    public void setEndXY(int endX , int endY) {
        begin.setXY(endX,endY);
    }

    public int getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int)(Math.sqrt(xDiff * xDiff + yDiff * yDiff));
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff,xDiff);
    }

}
