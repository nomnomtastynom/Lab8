package lab8;

enum GamePiece
{
RED_RACER (new GamePieceAppearance(Color.RED,Shape.RACECAR), 0), 
BLUE_RACER (new GamePieceAppearance(Color.BLUE,Shape.RACECAR), 2), 
MAGENTA_RACER (new GamePieceAppearance(Color.MAGENTA,Shape.RACECAR), 1), 
RED_THIMBLE (new GamePieceAppearance(Color.RED,Shape.THIMBLE), 1), 
BLUE_BOOT (new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5), 
GREEN_BOOT (new GamePieceAppearance(Color.GREEN,Shape.BOOT), 8), 
YELLOW_BOOT (new GamePieceAppearance(Color.YELLOW,Shape.BOOT), 7);


private GamePieceAppearance appearance; 
private int priority;
//Assigning the appearance and the priorities
private GamePiece(GamePieceAppearance appearance, int priority)
{
    this.appearance = appearance;
    this.priority = priority;
}
//Gets the color of the object
    public Color getColor(){
        return this.appearance.getColor();
    }
    public Shape getShape(){
        return this.getShape();
    }
    public GamePiece movesFirst(GamePiece a, GamePiece b){
        if (a.priority < b.priority){
            return a;
        }
        else{
            return b;
        }
    }
    public String toString(){
        return String.format("%s: a %s %s with priority %d", this.name(), this.getColor(), this.getShape(), this.priority);
    }
}
    
