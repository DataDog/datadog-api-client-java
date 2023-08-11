package com.datadog.api;

import java.util.ArrayList;
import java.util.List;
import com.datadog.api.client.RetryConfig;

public class MockRetryConfig extends RetryConfig {
  public List<Integer> intervalList = new ArrayList<Integer>();

  public MockRetryConfig(boolean enableRetry, int backOffMultiplier, int backOffBase, int maxRetries) {
    super(enableRetry, backOffMultiplier, backOffBase, maxRetries);
  }

  public List<Integer> getIntervalList() {
    return intervalList;
  }

  @Override
  public void sleepInterval(int sleepInterval) {
    try {
      intervalList.add(sleepInterval);
      Thread.sleep(1);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      e.printStackTrace();
    }
  }
}
