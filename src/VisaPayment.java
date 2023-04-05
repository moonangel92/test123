public class VisaPayment {
    public void payViaVisa(String bank){

        System.out.println("Some payment from: " + bank);

    }

    public void payViaVisaGold(String bank){
        System.out.println("Payment from: " + bank);
    }

    public void payViaVisaStandart(String bank){
        System.out.println("Payment from: " + bank);
    }

    public static void main(String[] args) {
        VisaPayment pay = new VisaPayment();
        pay.payViaVisa("Kyrgyzstan");
    }
}
