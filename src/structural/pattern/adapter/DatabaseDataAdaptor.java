package structural.pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class DatabaseDataAdaptor implements DatabaseDataConverter{

    /**
     * Convert a list of DatabaseData to a list of DatabaseData3rdParty
     * @param data
     * @return
     */
    @Override
    public List<DatabaseData3rdParty> convertData(List<DatabaseData> data) {
        List<DatabaseData3rdParty> returnList = new ArrayList<>();
        for (DatabaseData datum : data) {
            float index = datum.position;
            String position = Integer.toString(datum.amount);
            DatabaseData3rdParty databaseData3RdParty = new DatabaseData3rdParty(index, position);
            returnList.add(databaseData3RdParty);
        }

        return returnList;
    }
}
