

# ServiceIncludedItems

An object related to a service which is present in the included payload.

## oneOf schemas
* [User](User.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.ServiceIncludedItems;
import com.datadog.api.v2.client.model.User;

public class Example {
    public static void main(String[] args) {
        ServiceIncludedItems exampleServiceIncludedItems = new ServiceIncludedItems();

        // create a new User
        User exampleUser = new User();
        // set ServiceIncludedItems to User
        exampleServiceIncludedItems.setActualInstance(exampleUser);
        // to get back the User set earlier
        User testUser = (User) exampleServiceIncludedItems.getActualInstance();
    }
}
```


