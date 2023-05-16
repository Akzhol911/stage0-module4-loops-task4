package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if (lastInRow>=0){
            for (int i =0;i<lastInRow;i++){
                if(numberToSkip>lastInRow){
                    System.out.println("number to skip is bugger then the last");
                    break;
                }
                if (i!=numberToSkip){
                    System.out.println("skipped sum is "+ i);
                    System.out.println("counted sum is "+ i);
                }
            }
        }
        else{
            System.out.println("last number in row is negative");
        }
    }
}
