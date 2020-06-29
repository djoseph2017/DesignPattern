package Singleton.TestableIssues;

import java.util.List;

class ConfigurableRecordFinder {
    private Database database;

    public ConfigurableRecordFinder(Database database) {
        this.database = database;
    }

    public int getTotalPopulation(List<String> names) {
        int result = 0;
        for (String name : names)
            result += database.getPopulation(name);
        return result;
    }
}
