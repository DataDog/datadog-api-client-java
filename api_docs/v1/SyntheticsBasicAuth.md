# SyntheticsBasicAuth

Object to handle basic authentication when performing the test.

## oneOf schemas

- [SyntheticsBasicAuthNTLM](SyntheticsBasicAuthNTLM.md)
- [SyntheticsBasicAuthSigv4](SyntheticsBasicAuthSigv4.md)
- [SyntheticsBasicAuthWeb](SyntheticsBasicAuthWeb.md)

## Example

```java
// Import classes:
import com.datadog.api.v1.client.model.SyntheticsBasicAuth;
import com.datadog.api.v1.client.model.SyntheticsBasicAuthNTLM;
import com.datadog.api.v1.client.model.SyntheticsBasicAuthSigv4;
import com.datadog.api.v1.client.model.SyntheticsBasicAuthWeb;

public class Example {
    public static void main(String[] args) {
        SyntheticsBasicAuth exampleSyntheticsBasicAuth = new SyntheticsBasicAuth();

        // create a new SyntheticsBasicAuthNTLM
        SyntheticsBasicAuthNTLM exampleSyntheticsBasicAuthNTLM = new SyntheticsBasicAuthNTLM();
        // set SyntheticsBasicAuth to SyntheticsBasicAuthNTLM
        exampleSyntheticsBasicAuth.setActualInstance(exampleSyntheticsBasicAuthNTLM);
        // to get back the SyntheticsBasicAuthNTLM set earlier
        SyntheticsBasicAuthNTLM testSyntheticsBasicAuthNTLM = (SyntheticsBasicAuthNTLM) exampleSyntheticsBasicAuth.getActualInstance();

        // create a new SyntheticsBasicAuthSigv4
        SyntheticsBasicAuthSigv4 exampleSyntheticsBasicAuthSigv4 = new SyntheticsBasicAuthSigv4();
        // set SyntheticsBasicAuth to SyntheticsBasicAuthSigv4
        exampleSyntheticsBasicAuth.setActualInstance(exampleSyntheticsBasicAuthSigv4);
        // to get back the SyntheticsBasicAuthSigv4 set earlier
        SyntheticsBasicAuthSigv4 testSyntheticsBasicAuthSigv4 = (SyntheticsBasicAuthSigv4) exampleSyntheticsBasicAuth.getActualInstance();

        // create a new SyntheticsBasicAuthWeb
        SyntheticsBasicAuthWeb exampleSyntheticsBasicAuthWeb = new SyntheticsBasicAuthWeb();
        // set SyntheticsBasicAuth to SyntheticsBasicAuthWeb
        exampleSyntheticsBasicAuth.setActualInstance(exampleSyntheticsBasicAuthWeb);
        // to get back the SyntheticsBasicAuthWeb set earlier
        SyntheticsBasicAuthWeb testSyntheticsBasicAuthWeb = (SyntheticsBasicAuthWeb) exampleSyntheticsBasicAuth.getActualInstance();
    }
}
```
