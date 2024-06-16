public class CreditPaymentService {
    public int calculate(int credit, double percent, int month) {
        double k = (percent/100/12*(Math.pow(1+percent/100/12, month)))/((Math.pow(1+percent/100/12, month))-1);
        return (int) (k*credit);
    }
}