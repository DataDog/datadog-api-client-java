

# TeamIncludedItems

An object related to a team which is present in the included payload.

## oneOf schemas
* [User](User.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.TeamIncludedItems;
import com.datadog.api.v2.client.model.User;

public class Example {
    public static void main(String[] args) {
        TeamIncludedItems exampleTeamIncludedItems = new TeamIncludedItems();

        // create a new User
        User exampleUser = new User();
        // set TeamIncludedItems to User
        exampleTeamIncludedItems.setActualInstance(exampleUser);
        // to get back the User set earlier
        User testUser = (User) exampleTeamIncludedItems.getActualInstance();
    }
}
```


