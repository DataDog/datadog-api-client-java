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
 * JSON:API type for Flaky Tests Management policies response. The value must always be <code>
 * test_optimization_flaky_tests_management_policies</code>.
 */
@JsonSerialize(
    using =
        TestOptimizationFlakyTestsManagementPoliciesType
            .TestOptimizationFlakyTestsManagementPoliciesTypeSerializer.class)
public class TestOptimizationFlakyTestsManagementPoliciesType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("test_optimization_flaky_tests_management_policies"));

  public static final TestOptimizationFlakyTestsManagementPoliciesType
      TEST_OPTIMIZATION_FLAKY_TESTS_MANAGEMENT_POLICIES =
          new TestOptimizationFlakyTestsManagementPoliciesType(
              "test_optimization_flaky_tests_management_policies");

  TestOptimizationFlakyTestsManagementPoliciesType(String value) {
    super(value, allowedValues);
  }

  public static class TestOptimizationFlakyTestsManagementPoliciesTypeSerializer
      extends StdSerializer<TestOptimizationFlakyTestsManagementPoliciesType> {
    public TestOptimizationFlakyTestsManagementPoliciesTypeSerializer(
        Class<TestOptimizationFlakyTestsManagementPoliciesType> t) {
      super(t);
    }

    public TestOptimizationFlakyTestsManagementPoliciesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TestOptimizationFlakyTestsManagementPoliciesType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TestOptimizationFlakyTestsManagementPoliciesType fromValue(String value) {
    return new TestOptimizationFlakyTestsManagementPoliciesType(value);
  }
}
