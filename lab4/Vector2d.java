package agh.cs.lab4;

public class Vector2d {
    public final int x;
    public final int y;

    public Vector2d(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object other){
        if(this == other)
            return true;

        if(!(other instanceof Vector2d))
            return false;

        Vector2d that = (Vector2d) other;

        return this.x == that.x && this.y == that.y;
    }
}
