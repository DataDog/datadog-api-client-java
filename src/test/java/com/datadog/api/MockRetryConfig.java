package com.datadog.api;

import com.datadog.api.client.RetryConfig;

public class MockRetryConfig extends RetryConfig {

  public MockRetryConfig(
      boolean enableRetry, int backOffMultiplier, int backOffBase, int maxRetries) {
    super(enableRetry, backOffMultiplier, backOffBase, maxRetries);
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