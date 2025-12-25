package Lesson5_InterfaceSegregationPrinciple.ProblamaticCode;

public interface User {
     boolean canBuyProducts();

     boolean canModifyProducts();

     boolean canAddProducts();

     boolean canApproveProducts();

     void approveProducts();
}
