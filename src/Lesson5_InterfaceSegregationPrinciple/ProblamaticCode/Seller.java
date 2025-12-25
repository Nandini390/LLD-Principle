package Lesson5_InterfaceSegregationPrinciple.ProblamaticCode;

public class Seller implements User{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    //We are forced to override this, as we know that the seller can not approve products.
    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public void approveProducts() {

    }
}
