

public class Duck {

    private int size;
    private static int duckCount;

     public Duck() {
        // duckCount++;
        // System.out.println(duckCount);
    }

   public void increaseDuckCount(){
        // duckCount++;
        System.out.println(++duckCount);
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }



    public static void main(String[] args) {

        Duck d = new Duck();
        d.increaseDuckCount();

        // // d.setSize(2);
        
        Duck g = new Duck();
        g.increaseDuckCount();
        Duck f = new Duck();

        f.increaseDuckCount();
        

        // Duck.increaseDuckCount();
        // Duck.increaseDuckCount();
        // Duck.increaseDuckCount();
        // Duck.increaseDuckCount();

    }
    
}
