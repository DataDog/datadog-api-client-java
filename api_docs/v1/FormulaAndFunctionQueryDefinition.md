

# FormulaAndFunctionQueryDefinition

A formula and function query.

## oneOf schemas
* [TimeSeriesFormulaAndFunctionEventQueryDefinition](TimeSeriesFormulaAndFunctionEventQueryDefinition.md)
* [TimeSeriesFormulaAndFunctionMetricQueryDefinition](TimeSeriesFormulaAndFunctionMetricQueryDefinition.md)
* [TimeSeriesFormulaAndFunctionProcessQueryDefinition](TimeSeriesFormulaAndFunctionProcessQueryDefinition.md)

## Example
```java
// Import classes:
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionEventQueryDefinition;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionProcessQueryDefinition;

public class Example {
    public static void main(String[] args) {
        FormulaAndFunctionQueryDefinition exampleFormulaAndFunctionQueryDefinition = new FormulaAndFunctionQueryDefinition();

        // create a new TimeSeriesFormulaAndFunctionEventQueryDefinition
        TimeSeriesFormulaAndFunctionEventQueryDefinition exampleTimeSeriesFormulaAndFunctionEventQueryDefinition = new TimeSeriesFormulaAndFunctionEventQueryDefinition();
        // set FormulaAndFunctionQueryDefinition to TimeSeriesFormulaAndFunctionEventQueryDefinition
        exampleFormulaAndFunctionQueryDefinition.setActualInstance(exampleTimeSeriesFormulaAndFunctionEventQueryDefinition);
        // to get back the TimeSeriesFormulaAndFunctionEventQueryDefinition set earlier
        TimeSeriesFormulaAndFunctionEventQueryDefinition testTimeSeriesFormulaAndFunctionEventQueryDefinition = (TimeSeriesFormulaAndFunctionEventQueryDefinition) exampleFormulaAndFunctionQueryDefinition.getActualInstance();

        // create a new TimeSeriesFormulaAndFunctionMetricQueryDefinition
        TimeSeriesFormulaAndFunctionMetricQueryDefinition exampleTimeSeriesFormulaAndFunctionMetricQueryDefinition = new TimeSeriesFormulaAndFunctionMetricQueryDefinition();
        // set FormulaAndFunctionQueryDefinition to TimeSeriesFormulaAndFunctionMetricQueryDefinition
        exampleFormulaAndFunctionQueryDefinition.setActualInstance(exampleTimeSeriesFormulaAndFunctionMetricQueryDefinition);
        // to get back the TimeSeriesFormulaAndFunctionMetricQueryDefinition set earlier
        TimeSeriesFormulaAndFunctionMetricQueryDefinition testTimeSeriesFormulaAndFunctionMetricQueryDefinition = (TimeSeriesFormulaAndFunctionMetricQueryDefinition) exampleFormulaAndFunctionQueryDefinition.getActualInstance();

        // create a new TimeSeriesFormulaAndFunctionProcessQueryDefinition
        TimeSeriesFormulaAndFunctionProcessQueryDefinition exampleTimeSeriesFormulaAndFunctionProcessQueryDefinition = new TimeSeriesFormulaAndFunctionProcessQueryDefinition();
        // set FormulaAndFunctionQueryDefinition to TimeSeriesFormulaAndFunctionProcessQueryDefinition
        exampleFormulaAndFunctionQueryDefinition.setActualInstance(exampleTimeSeriesFormulaAndFunctionProcessQueryDefinition);
        // to get back the TimeSeriesFormulaAndFunctionProcessQueryDefinition set earlier
        TimeSeriesFormulaAndFunctionProcessQueryDefinition testTimeSeriesFormulaAndFunctionProcessQueryDefinition = (TimeSeriesFormulaAndFunctionProcessQueryDefinition) exampleFormulaAndFunctionQueryDefinition.getActualInstance();
    }
}
```


