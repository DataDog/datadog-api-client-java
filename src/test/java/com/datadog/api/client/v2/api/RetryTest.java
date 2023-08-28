package com.datadog.api.client.v2.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import com.datadog.api.MockRetryConfig;
import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.RetryConfig;
import com.datadog.api.client.v1.model.DashboardList;
import com.datadog.api.client.v2.model.*;
import java.security.NoSuchAlgorithmException;
import org.junit.AssumptionViolatedException;
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

  public void createDashboardList() throws ApiException, NoSuchAlgorithmException {
    dashboardListsApiV1 =
        new com.datadog.api.client.v1.api.DashboardListsApi(generalApiClientWithRetry);
    DashboardList res =
        dashboardListsApiV1.createDashboardList(new DashboardList().name(getUniqueEntityName()));
    dashboardListID = res.getId();
  }

  @Test
  public void retryWithDashboardListItemGetTest429() throws ApiException, NoSuchAlgorithmException {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }
    createDashboardList();
    DashboardListItems getResponse = api.getDashboardListItems(dashboardListID);
    MockRetryConfig retryConfig = (MockRetryConfig) generalApiClientWithRetry.getRetry();
    assertEquals(1, retryConfig.getIntervalList().get(0).intValue());
    assertEquals(1, retryConfig.getIntervalList().get(1).intValue());
    assertEquals(1, retryConfig.getIntervalList().get(2).intValue());
    assertNotNull(getResponse.getTotal());
    assertEquals(0, (long) getResponse.getTotal());
    assertEquals(0, getResponse.getDashboards().size());
  }

  @Test
  public void retryWithDashboardListItemGetTest500() throws ApiException, NoSuchAlgorithmException {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }
    createDashboardList();
    DashboardListItems getResponse = api.getDashboardListItems(dashboardListID);
    MockRetryConfig mockRetryConfig = (MockRetryConfig) generalApiClientWithRetry.getRetry();
    assertEquals(2, mockRetryConfig.getIntervalList().get(3).intValue());
    assertEquals(4, mockRetryConfig.getIntervalList().get(4).intValue());
    assertEquals(8, mockRetryConfig.getIntervalList().get(5).intValue());
    assertNotNull(getResponse.getTotal());
    assertEquals(0, (long) getResponse.getTotal());
    assertEquals(0, getResponse.getDashboards().size());
  }

  @Test
  public void backoffBaseCannotBeSmallerThanTwo() {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new RetryConfig(true, 2, 1, 3);
        });
  }
}
