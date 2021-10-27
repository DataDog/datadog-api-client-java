# LogsAggregateBucketValue

A bucket value, can be either a timeseries or a single value

## oneOf schemas

- [Double](Double.md)
- [LogsAggregateBucketValueTimeseries](LogsAggregateBucketValueTimeseries.md)
- [String](String.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.LogsAggregateBucketValue;
import com.datadog.api.v2.client.model.Double;
import com.datadog.api.v2.client.model.LogsAggregateBucketValueTimeseries;
import com.datadog.api.v2.client.model.String;

public class Example {
    public static void main(String[] args) {
        LogsAggregateBucketValue exampleLogsAggregateBucketValue = new LogsAggregateBucketValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set LogsAggregateBucketValue to Double
        exampleLogsAggregateBucketValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleLogsAggregateBucketValue.getActualInstance();

        // create a new LogsAggregateBucketValueTimeseries
        LogsAggregateBucketValueTimeseries exampleLogsAggregateBucketValueTimeseries = new LogsAggregateBucketValueTimeseries();
        // set LogsAggregateBucketValue to LogsAggregateBucketValueTimeseries
        exampleLogsAggregateBucketValue.setActualInstance(exampleLogsAggregateBucketValueTimeseries);
        // to get back the LogsAggregateBucketValueTimeseries set earlier
        LogsAggregateBucketValueTimeseries testLogsAggregateBucketValueTimeseries = (LogsAggregateBucketValueTimeseries) exampleLogsAggregateBucketValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set LogsAggregateBucketValue to String
        exampleLogsAggregateBucketValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLogsAggregateBucketValue.getActualInstance();
    }
}
```
