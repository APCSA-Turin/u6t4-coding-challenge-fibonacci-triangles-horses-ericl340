package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    public int getX() {
      return x;
    }
    public int getY() {
      return y;
    }
    public void setX(int t) {
      x = t;
    }
    public void setY(int t) {
      y = t;
    }
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      int xDist = x - other.getX();
      int yDist = y - other.getY();
      return Math.sqrt(xDist * xDist + yDist * yDist);
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")";
    }
  }
  