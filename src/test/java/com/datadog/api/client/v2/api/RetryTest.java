package com.datadog.api.client.v2.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.DashboardList;
import com.datadog.api.client.v2.model.*;
import java.security.NoSuchAlgorithmException;
import org.junit.Before;
import org.junit.Test;

public class RetryTest extends V2APITest {

  private static long dashboardListID;
  private static com.datadog.api.client.v1.api.DashboardListsApi dashboardListsApiV1;
  private final DashboardListsApi api = new DashboardListsApi(generalApiClientWithRetry);

  @Override
  public String getTracingEndpoint() {
    return "dashboard-lists-retry-tests";
  }

  @Before
  public void createDashboardList() throws ApiException, NoSuchAlgorithmException {
    dashboardListsApiV1 =
        new com.datadog.api.client.v1.api.DashboardListsApi(generalApiClientWithRetry);
    DashboardList res =
        dashboardListsApiV1.createDashboardList(new DashboardList().name(getUniqueEntityName()));
    dashboardListID = res.getId();
  }

  @Test
  public void retryWithDashboardListItemGetTest429() throws ApiException {
    DashboardListItems getResponse = api.getDashboardListItems(dashboardListID);
    assertNotNull(getResponse.getTotal());
    assertEquals(0, (long) getResponse.getTotal());
    assertEquals(0, getResponse.getDashboards().size());
  }

  @Test
  public void retryWithDashboardListItemGetTest500() throws ApiException {
    DashboardListItems getResponse = api.getDashboardListItems(dashboardListID);
    assertNotNull(getResponse.getTotal());
    assertEquals(0, (long) getResponse.getTotal());
    assertEquals(0, getResponse.getDashboards().size());
  }
}
