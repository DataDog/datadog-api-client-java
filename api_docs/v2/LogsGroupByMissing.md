

# LogsGroupByMissing

The value to use for logs that don't have the facet used to group by

## oneOf schemas
* [Double](Double.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.LogsGroupByMissing;
import com.datadog.api.v2.client.model.Double;
import com.datadog.api.v2.client.model.String;

public class Example {
    public static void main(String[] args) {
        LogsGroupByMissing exampleLogsGroupByMissing = new LogsGroupByMissing();

        // create a new Double
        Double exampleDouble = new Double();
        // set LogsGroupByMissing to Double
        exampleLogsGroupByMissing.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleLogsGroupByMissing.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set LogsGroupByMissing to String
        exampleLogsGroupByMissing.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLogsGroupByMissing.getActualInstance();
    }
}
```


