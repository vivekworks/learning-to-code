package warmup;

public class ElectronicsShop {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int moneySpent=-1;
        for(int kb :keyboards){
            for(int drive :drives){
                if(kb+drive>moneySpent && kb+drive<=b)
                    moneySpent=kb+drive;
            }
        }
        return moneySpent;
    }
}
