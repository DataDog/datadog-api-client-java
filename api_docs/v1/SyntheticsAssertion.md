# SyntheticsAssertion

Object describing the assertions type, their associated operator, which property they apply, and upon which target.

## oneOf schemas

- [SyntheticsAssertionJSONPathTarget](SyntheticsAssertionJSONPathTarget.md)
- [SyntheticsAssertionTarget](SyntheticsAssertionTarget.md)

## Example

```java
// Import classes:
import com.datadog.api.v1.client.model.SyntheticsAssertion;
import com.datadog.api.v1.client.model.SyntheticsAssertionJSONPathTarget;
import com.datadog.api.v1.client.model.SyntheticsAssertionTarget;

public class Example {
    public static void main(String[] args) {
        SyntheticsAssertion exampleSyntheticsAssertion = new SyntheticsAssertion();

        // create a new SyntheticsAssertionJSONPathTarget
        SyntheticsAssertionJSONPathTarget exampleSyntheticsAssertionJSONPathTarget = new SyntheticsAssertionJSONPathTarget();
        // set SyntheticsAssertion to SyntheticsAssertionJSONPathTarget
        exampleSyntheticsAssertion.setActualInstance(exampleSyntheticsAssertionJSONPathTarget);
        // to get back the SyntheticsAssertionJSONPathTarget set earlier
        SyntheticsAssertionJSONPathTarget testSyntheticsAssertionJSONPathTarget = (SyntheticsAssertionJSONPathTarget) exampleSyntheticsAssertion.getActualInstance();

        // create a new SyntheticsAssertionTarget
        SyntheticsAssertionTarget exampleSyntheticsAssertionTarget = new SyntheticsAssertionTarget();
        // set SyntheticsAssertion to SyntheticsAssertionTarget
        exampleSyntheticsAssertion.setActualInstance(exampleSyntheticsAssertionTarget);
        // to get back the SyntheticsAssertionTarget set earlier
        SyntheticsAssertionTarget testSyntheticsAssertionTarget = (SyntheticsAssertionTarget) exampleSyntheticsAssertion.getActualInstance();
    }
}
```
