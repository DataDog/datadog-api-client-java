# IncidentServiceIncludedItems

An object related to an incident service which is present in the included payload.

## oneOf schemas

- [User](User.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.IncidentServiceIncludedItems;
import com.datadog.api.v2.client.model.User;

public class Example {
    public static void main(String[] args) {
        IncidentServiceIncludedItems exampleIncidentServiceIncludedItems = new IncidentServiceIncludedItems();

        // create a new User
        User exampleUser = new User();
        // set IncidentServiceIncludedItems to User
        exampleIncidentServiceIncludedItems.setActualInstance(exampleUser);
        // to get back the User set earlier
        User testUser = (User) exampleIncidentServiceIncludedItems.getActualInstance();
    }
}
```
