import java.util.Random;

public class Jar {

    private String item;
    private int maxNum;
    private int answer;

    public Jar(String item, int maxNum) {
        this.item = item;
        this.maxNum = maxNum;
        Random random = new Random();
        answer = 1 + random.nextInt(maxNum);

    }

    public String getItem() {
        return item;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int getAnswer() {
        return answer;
    }
}