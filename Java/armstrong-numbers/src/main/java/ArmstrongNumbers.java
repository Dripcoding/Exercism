class ArmstrongNumbers {
    public boolean isArmstrongNumber(int numberToCheck) {
        if (numberToCheck == 0) {
            return true;
        }

        double digits = Math.floor(getNumberOfDigits(numberToCheck));
        double counter = digits;
        double next = numberToCheck;
        int result = 0;

        while (counter != 0) {
            double current  = next % 10;
            result += Math.pow(current, digits);
            next = Math.floor(next / 10);
            counter--;
        }

        return numberToCheck == result;
    }

    public double getNumberOfDigits(int numberToCheck) {
        if (numberToCheck == 0) {
            return 0;
        }
        return Math.log10(numberToCheck) + 1;
    }

}
