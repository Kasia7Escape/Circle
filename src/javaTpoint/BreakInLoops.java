package javaTpoint;

public class BreakInLoops {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
            System.out.println(i);
            if(i == 3){
                break;
            }
        }
    }
}
