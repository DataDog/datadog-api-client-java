/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Execution rule for a Synthetics test. */
@JsonSerialize(using = SyntheticsTestExecutionRule.SyntheticsTestExecutionRuleSerializer.class)
public class SyntheticsTestExecutionRule {

  public static final SyntheticsTestExecutionRule BLOCKING =
      new SyntheticsTestExecutionRule("blocking");
  public static final SyntheticsTestExecutionRule NON_BLOCKING =
      new SyntheticsTestExecutionRule("non_blocking");
  public static final SyntheticsTestExecutionRule SKIPPED =
      new SyntheticsTestExecutionRule("skipped");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("blocking", "non_blocking", "skipped"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsTestExecutionRule(String value) {
    this.value = value;
  }

  public static class SyntheticsTestExecutionRuleSerializer
      extends StdSerializer<SyntheticsTestExecutionRule> {
    public SyntheticsTestExecutionRuleSerializer(Class<SyntheticsTestExecutionRule> t) {
      super(t);
    }

    public SyntheticsTestExecutionRuleSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestExecutionRule value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SyntheticsTestExecutionRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsTestExecutionRule) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsTestExecutionRule fromValue(String value) {
    return new SyntheticsTestExecutionRule(value);
  }
}
