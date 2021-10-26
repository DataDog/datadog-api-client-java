

# ApplicationKeyResponseIncludedItem

An object related to an application key.

## oneOf schemas
* [Role](Role.md)
* [User](User.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.ApplicationKeyResponseIncludedItem;
import com.datadog.api.v2.client.model.Role;
import com.datadog.api.v2.client.model.User;

public class Example {
    public static void main(String[] args) {
        ApplicationKeyResponseIncludedItem exampleApplicationKeyResponseIncludedItem = new ApplicationKeyResponseIncludedItem();

        // create a new Role
        Role exampleRole = new Role();
        // set ApplicationKeyResponseIncludedItem to Role
        exampleApplicationKeyResponseIncludedItem.setActualInstance(exampleRole);
        // to get back the Role set earlier
        Role testRole = (Role) exampleApplicationKeyResponseIncludedItem.getActualInstance();

        // create a new User
        User exampleUser = new User();
        // set ApplicationKeyResponseIncludedItem to User
        exampleApplicationKeyResponseIncludedItem.setActualInstance(exampleUser);
        // to get back the User set earlier
        User testUser = (User) exampleApplicationKeyResponseIncludedItem.getActualInstance();
    }
}
```


