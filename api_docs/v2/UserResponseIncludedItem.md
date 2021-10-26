

# UserResponseIncludedItem

An object related to a user.

## oneOf schemas
* [Organization](Organization.md)
* [Permission](Permission.md)
* [Role](Role.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.UserResponseIncludedItem;
import com.datadog.api.v2.client.model.Organization;
import com.datadog.api.v2.client.model.Permission;
import com.datadog.api.v2.client.model.Role;

public class Example {
    public static void main(String[] args) {
        UserResponseIncludedItem exampleUserResponseIncludedItem = new UserResponseIncludedItem();

        // create a new Organization
        Organization exampleOrganization = new Organization();
        // set UserResponseIncludedItem to Organization
        exampleUserResponseIncludedItem.setActualInstance(exampleOrganization);
        // to get back the Organization set earlier
        Organization testOrganization = (Organization) exampleUserResponseIncludedItem.getActualInstance();

        // create a new Permission
        Permission examplePermission = new Permission();
        // set UserResponseIncludedItem to Permission
        exampleUserResponseIncludedItem.setActualInstance(examplePermission);
        // to get back the Permission set earlier
        Permission testPermission = (Permission) exampleUserResponseIncludedItem.getActualInstance();

        // create a new Role
        Role exampleRole = new Role();
        // set UserResponseIncludedItem to Role
        exampleUserResponseIncludedItem.setActualInstance(exampleRole);
        // to get back the Role set earlier
        Role testRole = (Role) exampleUserResponseIncludedItem.getActualInstance();
    }
}
```


