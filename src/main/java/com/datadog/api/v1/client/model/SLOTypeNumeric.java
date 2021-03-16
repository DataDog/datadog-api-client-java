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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A numeric representation of the type of the service level objective (&#x60;0&#x60; for monitor,
 * &#x60;1&#x60; for metric). Always included in service level objective responses. Ignored in
 * create/update requests.
 */
public enum SLOTypeNumeric {
  MONITOR(0),

  METRIC(1);

  private Integer value;

  SLOTypeNumeric(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SLOTypeNumeric fromValue(Integer value) {
    for (SLOTypeNumeric b : SLOTypeNumeric.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
