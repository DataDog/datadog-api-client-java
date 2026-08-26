package com.datadog.api.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ApiClientTest {

  @Test
  public void testIsIaCDisabledByDefault() {
    ApiClient client = new ApiClient();
    assertFalse(client.getIsIaC());
    assertFalse(client.defaultHeaderMap.containsKey("X-Datadog-Managed-By"));
  }

  @Test
  public void testSetIsIaCTrueAddsManagedByHeaderToDefaultHeaders() {
    ApiClient client = new ApiClient();

    ApiClient returned = client.setIsIaC(true);

    assertSame(client, returned);
    assertTrue(client.getIsIaC());
    // defaultHeaderMap is merged into the headers of every request made through this client,
    // see ApiClient#createBuilder.
    assertEquals("iac", client.defaultHeaderMap.get("X-Datadog-Managed-By"));
  }

  @Test
  public void testSetIsIaCFalseRemovesManagedByHeader() {
    ApiClient client = new ApiClient();
    client.setIsIaC(true);

    client.setIsIaC(false);

    assertFalse(client.getIsIaC());
    assertFalse(client.defaultHeaderMap.containsKey("X-Datadog-Managed-By"));
  }

  @Test
  public void testSetIsIaCIsPerClientInstance() {
    ApiClient iacClient = new ApiClient();
    ApiClient defaultClient = new ApiClient();

    iacClient.setIsIaC(true);

    assertTrue(iacClient.getIsIaC());
    assertFalse(defaultClient.getIsIaC());
    assertFalse(defaultClient.defaultHeaderMap.containsKey("X-Datadog-Managed-By"));
  }
}
