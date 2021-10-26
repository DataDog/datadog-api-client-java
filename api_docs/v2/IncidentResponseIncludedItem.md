# IncidentResponseIncludedItem

An object related to an incident that is included in the response.

## oneOf schemas

- [User](User.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.IncidentResponseIncludedItem;
import com.datadog.api.v2.client.model.User;

public class Example {
    public static void main(String[] args) {
        IncidentResponseIncludedItem exampleIncidentResponseIncludedItem = new IncidentResponseIncludedItem();

        // create a new User
        User exampleUser = new User();
        // set IncidentResponseIncludedItem to User
        exampleIncidentResponseIncludedItem.setActualInstance(exampleUser);
        // to get back the User set earlier
        User testUser = (User) exampleIncidentResponseIncludedItem.getActualInstance();
    }
}
```
