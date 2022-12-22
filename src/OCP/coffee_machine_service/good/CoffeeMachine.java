package OCP.coffee_machine_service.good;

public class CoffeeMachine {
    private BeveragePreparerFactory beveragePreparerFactory;


    void prepareBeverage(String beverageName) {
        beveragePreparerFactory.getBeveragePreparer(beverageName).prepare();
    }
}
