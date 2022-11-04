public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        while(number !=0){
            int num = number;
            num = number%10;
            number = number/10;
            System.out.println(num);
        }
    }

    public int countLetter(String word, String letter) {
        int index = 0;
        int counter = 0;
        while(index != word.length()){
            if(word.substring(index, index+1).equals(letter)){
                counter++;
            }
            index++;
        }
        return counter;
    }

    public int maxDoubles(int number, int threshold) {
        int counter = 0;
        while(number <= threshold){
            number *= 2;
            if(number <= threshold){
                counter++;
            }
        }
        return counter;
    }

    public boolean isPrime(int number) {
        if(number == 1){
            if(number == 1){
                return false;
            }
        }else{
            int divideBy=2;
            while(divideBy<number){
                if(number%divideBy==0){
                    return false;
                }
                divideBy++;
            }
        }
        return true;
    }
}
