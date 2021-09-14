

# FormulaAndFunctionQueryDefinition

A formula and function query.

## oneOf schemas
* [FormulaAndFunctionApmDependencyStatsQueryDefinition](FormulaAndFunctionApmDependencyStatsQueryDefinition.md)
* [FormulaAndFunctionEventQueryDefinition](FormulaAndFunctionEventQueryDefinition.md)
* [FormulaAndFunctionMetricQueryDefinition](FormulaAndFunctionMetricQueryDefinition.md)
* [FormulaAndFunctionProcessQueryDefinition](FormulaAndFunctionProcessQueryDefinition.md)

## Example
```java
// Import classes:
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionApmDependencyStatsQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionProcessQueryDefinition;

public class Example {
    public static void main(String[] args) {
        FormulaAndFunctionQueryDefinition exampleFormulaAndFunctionQueryDefinition = new FormulaAndFunctionQueryDefinition();

        // create a new FormulaAndFunctionApmDependencyStatsQueryDefinition
        FormulaAndFunctionApmDependencyStatsQueryDefinition exampleFormulaAndFunctionApmDependencyStatsQueryDefinition = new FormulaAndFunctionApmDependencyStatsQueryDefinition();
        // set FormulaAndFunctionQueryDefinition to FormulaAndFunctionApmDependencyStatsQueryDefinition
        exampleFormulaAndFunctionQueryDefinition.setActualInstance(exampleFormulaAndFunctionApmDependencyStatsQueryDefinition);
        // to get back the FormulaAndFunctionApmDependencyStatsQueryDefinition set earlier
        FormulaAndFunctionApmDependencyStatsQueryDefinition testFormulaAndFunctionApmDependencyStatsQueryDefinition = (FormulaAndFunctionApmDependencyStatsQueryDefinition) exampleFormulaAndFunctionQueryDefinition.getActualInstance();

        // create a new FormulaAndFunctionEventQueryDefinition
        FormulaAndFunctionEventQueryDefinition exampleFormulaAndFunctionEventQueryDefinition = new FormulaAndFunctionEventQueryDefinition();
        // set FormulaAndFunctionQueryDefinition to FormulaAndFunctionEventQueryDefinition
        exampleFormulaAndFunctionQueryDefinition.setActualInstance(exampleFormulaAndFunctionEventQueryDefinition);
        // to get back the FormulaAndFunctionEventQueryDefinition set earlier
        FormulaAndFunctionEventQueryDefinition testFormulaAndFunctionEventQueryDefinition = (FormulaAndFunctionEventQueryDefinition) exampleFormulaAndFunctionQueryDefinition.getActualInstance();

        // create a new FormulaAndFunctionMetricQueryDefinition
        FormulaAndFunctionMetricQueryDefinition exampleFormulaAndFunctionMetricQueryDefinition = new FormulaAndFunctionMetricQueryDefinition();
        // set FormulaAndFunctionQueryDefinition to FormulaAndFunctionMetricQueryDefinition
        exampleFormulaAndFunctionQueryDefinition.setActualInstance(exampleFormulaAndFunctionMetricQueryDefinition);
        // to get back the FormulaAndFunctionMetricQueryDefinition set earlier
        FormulaAndFunctionMetricQueryDefinition testFormulaAndFunctionMetricQueryDefinition = (FormulaAndFunctionMetricQueryDefinition) exampleFormulaAndFunctionQueryDefinition.getActualInstance();

        // create a new FormulaAndFunctionProcessQueryDefinition
        FormulaAndFunctionProcessQueryDefinition exampleFormulaAndFunctionProcessQueryDefinition = new FormulaAndFunctionProcessQueryDefinition();
        // set FormulaAndFunctionQueryDefinition to FormulaAndFunctionProcessQueryDefinition
        exampleFormulaAndFunctionQueryDefinition.setActualInstance(exampleFormulaAndFunctionProcessQueryDefinition);
        // to get back the FormulaAndFunctionProcessQueryDefinition set earlier
        FormulaAndFunctionProcessQueryDefinition testFormulaAndFunctionProcessQueryDefinition = (FormulaAndFunctionProcessQueryDefinition) exampleFormulaAndFunctionQueryDefinition.getActualInstance();
    }
}
```


