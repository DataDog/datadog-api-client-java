# MonitorFormulaAndFunctionQueryDefinition

A formula and function query.

## oneOf schemas

- [MonitorFormulaAndFunctionEventQueryDefinition](MonitorFormulaAndFunctionEventQueryDefinition.md)

## Example

```java
// Import classes:
import com.datadog.api.v1.client.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.MonitorFormulaAndFunctionEventQueryDefinition;

public class Example {
    public static void main(String[] args) {
        MonitorFormulaAndFunctionQueryDefinition exampleMonitorFormulaAndFunctionQueryDefinition = new MonitorFormulaAndFunctionQueryDefinition();

        // create a new MonitorFormulaAndFunctionEventQueryDefinition
        MonitorFormulaAndFunctionEventQueryDefinition exampleMonitorFormulaAndFunctionEventQueryDefinition = new MonitorFormulaAndFunctionEventQueryDefinition();
        // set MonitorFormulaAndFunctionQueryDefinition to MonitorFormulaAndFunctionEventQueryDefinition
        exampleMonitorFormulaAndFunctionQueryDefinition.setActualInstance(exampleMonitorFormulaAndFunctionEventQueryDefinition);
        // to get back the MonitorFormulaAndFunctionEventQueryDefinition set earlier
        MonitorFormulaAndFunctionEventQueryDefinition testMonitorFormulaAndFunctionEventQueryDefinition = (MonitorFormulaAndFunctionEventQueryDefinition) exampleMonitorFormulaAndFunctionQueryDefinition.getActualInstance();
    }
}
```
