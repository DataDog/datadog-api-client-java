/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of the monitor.
 */
public enum MonitorType {
  
  COMPOSITE("composite"),
  
  EVENT_ALERT("event alert"),
  
  LOG_ALERT("log alert"),
  
  METRIC_ALERT("metric alert"),
  
  PROCESS_ALERT("process alert"),
  
  QUERY_ALERT("query alert"),
  
  SERVICE_CHECK("service check"),
  
  SYNTHETICS_ALERT("synthetics alert"),
  
  TRACE_ANALYTICS_ALERT("trace-analytics alert");

  private String value;

  MonitorType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MonitorType fromValue(String value) {
    for (MonitorType b : MonitorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

