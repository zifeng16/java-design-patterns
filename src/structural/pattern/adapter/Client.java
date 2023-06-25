package structural.pattern.adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        DatabaseDataGenerator databaseDataGenerator = new DatabaseDataGenerator();
        DatabaseDataAdaptor databaseDataAdaptor = new DatabaseDataAdaptor();

        List<DatabaseData3rdParty> databaseData3rdPartyList = databaseDataAdaptor.convertData(databaseDataGenerator.generateData());
        for (DatabaseData3rdParty datum : databaseData3rdPartyList) {
            datum.displayData();
        }
    }
}
