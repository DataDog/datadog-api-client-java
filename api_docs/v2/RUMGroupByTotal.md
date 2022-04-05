# RUMGroupByTotal

A resulting object to put the given computes in over all the matching records.

## oneOf schemas

- [Boolean](Boolean.md)
- [Double](Double.md)
- [String](String.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.RUMGroupByTotal;
import com.datadog.api.v2.client.model.Boolean;
import com.datadog.api.v2.client.model.Double;
import com.datadog.api.v2.client.model.String;

public class Example {
    public static void main(String[] args) {
        RUMGroupByTotal exampleRUMGroupByTotal = new RUMGroupByTotal();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set RUMGroupByTotal to Boolean
        exampleRUMGroupByTotal.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleRUMGroupByTotal.getActualInstance();

        // create a new Double
        Double exampleDouble = new Double();
        // set RUMGroupByTotal to Double
        exampleRUMGroupByTotal.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleRUMGroupByTotal.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set RUMGroupByTotal to String
        exampleRUMGroupByTotal.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleRUMGroupByTotal.getActualInstance();
    }
}
```
