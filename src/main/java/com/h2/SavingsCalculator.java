package com.h2;

public class SavingsCalculator {

    private float[] credits;
    private float[] debits;

//This is a constructor, it has two inputs: credits and debits.
    //Within that constructor this.credits it telling the constructor that the inputs within it are connected to the
    // cooresponding variables with in the SavingsCalculator class above.
    public SavingsCalculator ( float[] credits, float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;
        for(float credit: credits) {
            sum += credit;
        }
        return sum;
    }
private float sumOfDebits() {
        return 0.0f;
}
}