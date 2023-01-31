public class ZombiePlant {
    private int potency;
    private int treatments;

    public ZombiePlant(int potency, int treatments){
        this.potency = potency;
        this.treatments = treatments;
    }

    public int treatmentsNeeded(){
        return this.treatments;
    }
    public void treat(int n){
        if(n>this.potency){
            this.treatments++;
        }else if(treatments==0 || n<=0){
            return;
        }else{
            this.treatments--;
        }
    }

    public boolean isDangerous(){
        if(treatments==0) return false;
        return true;
    }

    public int getPotencyRequired(){
        return this.potency;
    }

}
