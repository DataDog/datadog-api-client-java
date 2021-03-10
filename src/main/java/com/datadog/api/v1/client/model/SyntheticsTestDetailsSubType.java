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
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The subtype of the Synthetic API test, &#x60;http&#x60;, &#x60;ssl&#x60;, &#x60;tcp&#x60;, &#x60;dns&#x60; or &#x60;multi&#x60;.
 */
public enum SyntheticsTestDetailsSubType {
  
  HTTP("http"),
  
  SSL("ssl"),
  
  TCP("tcp"),
  
  DNS("dns"),
  
  MULTI("multi");

  private String value;

  SyntheticsTestDetailsSubType(String value) {
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
  public static SyntheticsTestDetailsSubType fromValue(String value) {
    for (SyntheticsTestDetailsSubType b : SyntheticsTestDetailsSubType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

