# RUMAggregateBucketValue

A bucket value, can be either a timeseries or a single value.

## oneOf schemas

- [Double](Double.md)
- [RUMAggregateBucketValueTimeseries](RUMAggregateBucketValueTimeseries.md)
- [String](String.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.RUMAggregateBucketValue;
import com.datadog.api.v2.client.model.Double;
import com.datadog.api.v2.client.model.RUMAggregateBucketValueTimeseries;
import com.datadog.api.v2.client.model.String;

public class Example {
    public static void main(String[] args) {
        RUMAggregateBucketValue exampleRUMAggregateBucketValue = new RUMAggregateBucketValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set RUMAggregateBucketValue to Double
        exampleRUMAggregateBucketValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleRUMAggregateBucketValue.getActualInstance();

        // create a new RUMAggregateBucketValueTimeseries
        RUMAggregateBucketValueTimeseries exampleRUMAggregateBucketValueTimeseries = new RUMAggregateBucketValueTimeseries();
        // set RUMAggregateBucketValue to RUMAggregateBucketValueTimeseries
        exampleRUMAggregateBucketValue.setActualInstance(exampleRUMAggregateBucketValueTimeseries);
        // to get back the RUMAggregateBucketValueTimeseries set earlier
        RUMAggregateBucketValueTimeseries testRUMAggregateBucketValueTimeseries = (RUMAggregateBucketValueTimeseries) exampleRUMAggregateBucketValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set RUMAggregateBucketValue to String
        exampleRUMAggregateBucketValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleRUMAggregateBucketValue.getActualInstance();
    }
}
```
