# IncidentTeamIncludedItems

An object related to an incident team which is present in the included payload.

## oneOf schemas

- [User](User.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.IncidentTeamIncludedItems;
import com.datadog.api.v2.client.model.User;

public class Example {

  public static void main(String[] args) {
    IncidentTeamIncludedItems exampleIncidentTeamIncludedItems = new IncidentTeamIncludedItems();

    // create a new User
    User exampleUser = new User();
    // set IncidentTeamIncludedItems to User
    exampleIncidentTeamIncludedItems.setActualInstance(exampleUser);
    // to get back the User set earlier
    User testUser = (User) exampleIncidentTeamIncludedItems.getActualInstance();
  }
}

```
