

# IncidentTimelineCellCreateAttributes

The timeline cell's attributes for a create request.

## oneOf schemas
* [IncidentTimelineCellMarkdownCreateAttributes](IncidentTimelineCellMarkdownCreateAttributes.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.IncidentTimelineCellCreateAttributes;
import com.datadog.api.v2.client.model.IncidentTimelineCellMarkdownCreateAttributes;

public class Example {
    public static void main(String[] args) {
        IncidentTimelineCellCreateAttributes exampleIncidentTimelineCellCreateAttributes = new IncidentTimelineCellCreateAttributes();

        // create a new IncidentTimelineCellMarkdownCreateAttributes
        IncidentTimelineCellMarkdownCreateAttributes exampleIncidentTimelineCellMarkdownCreateAttributes = new IncidentTimelineCellMarkdownCreateAttributes();
        // set IncidentTimelineCellCreateAttributes to IncidentTimelineCellMarkdownCreateAttributes
        exampleIncidentTimelineCellCreateAttributes.setActualInstance(exampleIncidentTimelineCellMarkdownCreateAttributes);
        // to get back the IncidentTimelineCellMarkdownCreateAttributes set earlier
        IncidentTimelineCellMarkdownCreateAttributes testIncidentTimelineCellMarkdownCreateAttributes = (IncidentTimelineCellMarkdownCreateAttributes) exampleIncidentTimelineCellCreateAttributes.getActualInstance();
    }
}
```


