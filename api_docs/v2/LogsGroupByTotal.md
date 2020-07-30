

# LogsGroupByTotal

A resulting object to put the given computes in over all the matching records.

## oneOf schemas
* [Boolean](Boolean.md)
* [Double](Double.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.LogsGroupByTotal;
import com.datadog.api.v2.client.model.Boolean;
import com.datadog.api.v2.client.model.Double;
import com.datadog.api.v2.client.model.String;

public class Example {
    public static void main(String[] args) {
        LogsGroupByTotal exampleLogsGroupByTotal = new LogsGroupByTotal();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set LogsGroupByTotal to Boolean
        exampleLogsGroupByTotal.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleLogsGroupByTotal.getActualInstance();

        // create a new Double
        Double exampleDouble = new Double();
        // set LogsGroupByTotal to Double
        exampleLogsGroupByTotal.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleLogsGroupByTotal.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set LogsGroupByTotal to String
        exampleLogsGroupByTotal.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLogsGroupByTotal.getActualInstance();
    }
}
```


