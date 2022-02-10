# AuthNMappingIncluded

Included data in the AuthN Mapping response.

## oneOf schemas

- [Role](Role.md)
- [SAMLAssertionAttribute](SAMLAssertionAttribute.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.AuthNMappingIncluded;
import com.datadog.api.v2.client.model.Role;
import com.datadog.api.v2.client.model.SAMLAssertionAttribute;

public class Example {
    public static void main(String[] args) {
        AuthNMappingIncluded exampleAuthNMappingIncluded = new AuthNMappingIncluded();

        // create a new Role
        Role exampleRole = new Role();
        // set AuthNMappingIncluded to Role
        exampleAuthNMappingIncluded.setActualInstance(exampleRole);
        // to get back the Role set earlier
        Role testRole = (Role) exampleAuthNMappingIncluded.getActualInstance();

        // create a new SAMLAssertionAttribute
        SAMLAssertionAttribute exampleSAMLAssertionAttribute = new SAMLAssertionAttribute();
        // set AuthNMappingIncluded to SAMLAssertionAttribute
        exampleAuthNMappingIncluded.setActualInstance(exampleSAMLAssertionAttribute);
        // to get back the SAMLAssertionAttribute set earlier
        SAMLAssertionAttribute testSAMLAssertionAttribute = (SAMLAssertionAttribute) exampleAuthNMappingIncluded.getActualInstance();
    }
}
```
