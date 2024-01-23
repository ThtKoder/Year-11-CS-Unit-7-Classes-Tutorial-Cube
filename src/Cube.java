public class Cube {
    private int side;

    public Cube(){
        side = 1;
    }

    public Cube(int i) {
        if(i >= 1){
            side = i;
        }
        else{
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side >= 1){
            this.side = side;
        }
        else{
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
    }

    public int calculateSurfaceArea(){
        return 6*side*side;
    }

    public int calculateVolume(){
        return side*side*side;
    }

}
