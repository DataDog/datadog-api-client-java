

# SunburstWidgetLegend

Configuration of the legend.

## oneOf schemas
* [SunburstWidgetLegendInlineAutomatic](SunburstWidgetLegendInlineAutomatic.md)
* [SunburstWidgetLegendTable](SunburstWidgetLegendTable.md)

## Example
```java
// Import classes:
import com.datadog.api.v1.client.model.SunburstWidgetLegend;
import com.datadog.api.v1.client.model.SunburstWidgetLegendInlineAutomatic;
import com.datadog.api.v1.client.model.SunburstWidgetLegendTable;

public class Example {
    public static void main(String[] args) {
        SunburstWidgetLegend exampleSunburstWidgetLegend = new SunburstWidgetLegend();

        // create a new SunburstWidgetLegendInlineAutomatic
        SunburstWidgetLegendInlineAutomatic exampleSunburstWidgetLegendInlineAutomatic = new SunburstWidgetLegendInlineAutomatic();
        // set SunburstWidgetLegend to SunburstWidgetLegendInlineAutomatic
        exampleSunburstWidgetLegend.setActualInstance(exampleSunburstWidgetLegendInlineAutomatic);
        // to get back the SunburstWidgetLegendInlineAutomatic set earlier
        SunburstWidgetLegendInlineAutomatic testSunburstWidgetLegendInlineAutomatic = (SunburstWidgetLegendInlineAutomatic) exampleSunburstWidgetLegend.getActualInstance();

        // create a new SunburstWidgetLegendTable
        SunburstWidgetLegendTable exampleSunburstWidgetLegendTable = new SunburstWidgetLegendTable();
        // set SunburstWidgetLegend to SunburstWidgetLegendTable
        exampleSunburstWidgetLegend.setActualInstance(exampleSunburstWidgetLegendTable);
        // to get back the SunburstWidgetLegendTable set earlier
        SunburstWidgetLegendTable testSunburstWidgetLegendTable = (SunburstWidgetLegendTable) exampleSunburstWidgetLegend.getActualInstance();
    }
}
```


