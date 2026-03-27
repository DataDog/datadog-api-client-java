/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RetryConfig {
  public boolean enableRetry;
  public int backOffMultiplier;
  public int backOffBase;
  public int maxRetries;
  private static final Logger log = Logger.getLogger(RetryConfig.class.getName());

  /**
   * @param enableRetry Enable retry when rate limited
   * @param backOffMultiplier Multiplier for retry backoff
   * @param backOffBase Base for retry backoff
   * @param maxRetries Maximum number of retries
   */
  public RetryConfig(boolean enableRetry, int backOffMultiplier, int backOffBase, int maxRetries) {
    if (backOffBase < 2) {
      throw new IllegalArgumentException("backOffBase cannot be smaller than 2");
    }
    this.enableRetry = enableRetry;
    this.backOffMultiplier = backOffMultiplier;
    this.backOffBase = backOffBase;
    this.maxRetries = maxRetries;
  }

  public boolean isEnableRetry() {
    return enableRetry;
  }

  public int getBackOffMultiplier() {
    return backOffMultiplier;
  }

  public int getBackOffBase() {
    return backOffBase;
  }

  public int getMaxRetries() {
    return maxRetries;
  }

  public void setEnableRetry(boolean enableRetry) {
    this.enableRetry = enableRetry;
  }

  public void setBackOffMultiplier(int backOffMultiplier) {
    this.backOffMultiplier = backOffMultiplier;
  }

  public void setBackOffBase(int backOffBase) {
    this.backOffBase = backOffBase;
  }

  public void setMaxRetries(int maxRetries) {
    this.maxRetries = maxRetries;
  }

  public void sleepInterval(int sleepInterval) {
    try {
      Thread.sleep(sleepInterval * 1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      log.log(Level.FINE, "Retry sleep interrupted", e);
    }
  }
}