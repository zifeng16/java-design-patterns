package structural.pattern.adapter;

import java.util.List;

public interface DatabaseDataConverter {
    public List<DatabaseData3rdParty> convertData(List<DatabaseData> data);
}
