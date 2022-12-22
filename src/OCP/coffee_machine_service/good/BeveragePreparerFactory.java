package OCP.coffee_machine_service.good;

import lombok.NonNull;

import java.util.Map;

public class BeveragePreparerFactory {

    private Map<String, BeveragePreparer> beveragePreparer;

    public BeveragePreparer getBeveragePreparer(@NonNull final String beverageName) {
        return beveragePreparer.get(beverageName);
    }
}
