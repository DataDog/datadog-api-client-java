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

/** The namespace associated with the tag filter entry. */
public enum AWSNamespace {
  ELB("elb"),

  APPLICATION_ELB("application_elb"),

  SQS("sqs"),

  RDS("rds"),

  CUSTOM("custom"),

  NETWORK_ELB("network_elb"),

  LAMBDA("lambda");

  private String value;

  AWSNamespace(String value) {
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
  public static AWSNamespace fromValue(String value) {
    for (AWSNamespace b : AWSNamespace.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
