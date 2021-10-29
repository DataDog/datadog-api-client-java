

# IncidentFieldAttributes

Dynamic fields for which selections can be made, with field names as keys.

## oneOf schemas
* [IncidentFieldAttributesMultipleValue](IncidentFieldAttributesMultipleValue.md)
* [IncidentFieldAttributesSingleValue](IncidentFieldAttributesSingleValue.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.IncidentFieldAttributes;
import com.datadog.api.v2.client.model.IncidentFieldAttributesMultipleValue;
import com.datadog.api.v2.client.model.IncidentFieldAttributesSingleValue;

public class Example {
    public static void main(String[] args) {
        IncidentFieldAttributes exampleIncidentFieldAttributes = new IncidentFieldAttributes();

        // create a new IncidentFieldAttributesMultipleValue
        IncidentFieldAttributesMultipleValue exampleIncidentFieldAttributesMultipleValue = new IncidentFieldAttributesMultipleValue();
        // set IncidentFieldAttributes to IncidentFieldAttributesMultipleValue
        exampleIncidentFieldAttributes.setActualInstance(exampleIncidentFieldAttributesMultipleValue);
        // to get back the IncidentFieldAttributesMultipleValue set earlier
        IncidentFieldAttributesMultipleValue testIncidentFieldAttributesMultipleValue = (IncidentFieldAttributesMultipleValue) exampleIncidentFieldAttributes.getActualInstance();

        // create a new IncidentFieldAttributesSingleValue
        IncidentFieldAttributesSingleValue exampleIncidentFieldAttributesSingleValue = new IncidentFieldAttributesSingleValue();
        // set IncidentFieldAttributes to IncidentFieldAttributesSingleValue
        exampleIncidentFieldAttributes.setActualInstance(exampleIncidentFieldAttributesSingleValue);
        // to get back the IncidentFieldAttributesSingleValue set earlier
        IncidentFieldAttributesSingleValue testIncidentFieldAttributesSingleValue = (IncidentFieldAttributesSingleValue) exampleIncidentFieldAttributes.getActualInstance();
    }
}
```


