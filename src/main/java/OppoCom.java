import java.util.Random;

public class OppoCom {
    private int[] ansArr = new int[3];

    OppoCom() {
        ansArr = randomArr();
    }

    public int[] randomArr() {
        Random rand = new Random();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }

    public int[] checkNum(int inp) {
        int[] inpArr = {inp / 100, inp % 100 / 10, inp % 100 % 10};

        int[] statArr = {0, 0, 0};

        for(int i = 0; i<3;i++) {
            if(inpArr[i] == this.ansArr[i]) {
                statArr[0]++;
            }
            else if(inpArr[i] == this.ansArr[0] || inpArr[i] == this.ansArr[1] || inpArr[i] == this.ansArr[2]) {
                statArr[1]++;
            }
            else {
                statArr[2]++;
            }
        }
        return statArr;
    }

    public int[] getAnsArr() {
        return this.ansArr;
    }

    public void setAnsArr(int[] ansArr) {
        this.ansArr = ansArr;
    }
}
