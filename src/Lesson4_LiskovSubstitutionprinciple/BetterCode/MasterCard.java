package Lesson4_LiskovSubstitutionprinciple.BetterCode;

public class MasterCard extends CreditCard implements InternationalPaymentCompatibleCreditCard, upiCompatibleCreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of MasterCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("International payment impl of MasterCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("upi payment impl of MasterCard");
    }
}
