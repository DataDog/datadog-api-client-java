# APIKeyResponseIncludedItem

An object related to an API key.

## oneOf schemas

- [User](User.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.APIKeyResponseIncludedItem;
import com.datadog.api.v2.client.model.User;

public class Example {
    public static void main(String[] args) {
        APIKeyResponseIncludedItem exampleAPIKeyResponseIncludedItem = new APIKeyResponseIncludedItem();

        // create a new User
        User exampleUser = new User();
        // set APIKeyResponseIncludedItem to User
        exampleAPIKeyResponseIncludedItem.setActualInstance(exampleUser);
        // to get back the User set earlier
        User testUser = (User) exampleAPIKeyResponseIncludedItem.getActualInstance();
    }
}
```
