/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Test status that the disable policy applies to. Must be either <code>active</code> or <code>
 * quarantined</code>.
 */
@JsonSerialize(
    using =
        TestOptimizationFlakyTestsManagementPoliciesDisabledStatus
            .TestOptimizationFlakyTestsManagementPoliciesDisabledStatusSerializer.class)
public class TestOptimizationFlakyTestsManagementPoliciesDisabledStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "quarantined"));

  public static final TestOptimizationFlakyTestsManagementPoliciesDisabledStatus ACTIVE =
      new TestOptimizationFlakyTestsManagementPoliciesDisabledStatus("active");
  public static final TestOptimizationFlakyTestsManagementPoliciesDisabledStatus QUARANTINED =
      new TestOptimizationFlakyTestsManagementPoliciesDisabledStatus("quarantined");

  TestOptimizationFlakyTestsManagementPoliciesDisabledStatus(String value) {
    super(value, allowedValues);
  }

  public static class TestOptimizationFlakyTestsManagementPoliciesDisabledStatusSerializer
      extends StdSerializer<TestOptimizationFlakyTestsManagementPoliciesDisabledStatus> {
    public TestOptimizationFlakyTestsManagementPoliciesDisabledStatusSerializer(
        Class<TestOptimizationFlakyTestsManagementPoliciesDisabledStatus> t) {
      super(t);
    }

    public TestOptimizationFlakyTestsManagementPoliciesDisabledStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TestOptimizationFlakyTestsManagementPoliciesDisabledStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TestOptimizationFlakyTestsManagementPoliciesDisabledStatus fromValue(String value) {
    return new TestOptimizationFlakyTestsManagementPoliciesDisabledStatus(value);
  }
}
