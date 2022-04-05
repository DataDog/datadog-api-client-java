# RUMGroupByMissing

The value to use for logs that don't have the facet used to group by.

## oneOf schemas

- [Double](Double.md)
- [String](String.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.RUMGroupByMissing;
import com.datadog.api.v2.client.model.Double;
import com.datadog.api.v2.client.model.String;

public class Example {
    public static void main(String[] args) {
        RUMGroupByMissing exampleRUMGroupByMissing = new RUMGroupByMissing();

        // create a new Double
        Double exampleDouble = new Double();
        // set RUMGroupByMissing to Double
        exampleRUMGroupByMissing.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleRUMGroupByMissing.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set RUMGroupByMissing to String
        exampleRUMGroupByMissing.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleRUMGroupByMissing.getActualInstance();
    }
}
```
