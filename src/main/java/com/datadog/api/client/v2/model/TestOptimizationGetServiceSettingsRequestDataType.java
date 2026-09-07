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
 * JSON:API type for get service settings request. The value must always be <code>
 * test_optimization_get_service_settings_request</code>.
 */
@JsonSerialize(
    using =
        TestOptimizationGetServiceSettingsRequestDataType
            .TestOptimizationGetServiceSettingsRequestDataTypeSerializer.class)
public class TestOptimizationGetServiceSettingsRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("test_optimization_get_service_settings_request"));

  public static final TestOptimizationGetServiceSettingsRequestDataType
      TEST_OPTIMIZATION_GET_SERVICE_SETTINGS_REQUEST =
          new TestOptimizationGetServiceSettingsRequestDataType(
              "test_optimization_get_service_settings_request");

  TestOptimizationGetServiceSettingsRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class TestOptimizationGetServiceSettingsRequestDataTypeSerializer
      extends StdSerializer<TestOptimizationGetServiceSettingsRequestDataType> {
    public TestOptimizationGetServiceSettingsRequestDataTypeSerializer(
        Class<TestOptimizationGetServiceSettingsRequestDataType> t) {
      super(t);
    }

    public TestOptimizationGetServiceSettingsRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TestOptimizationGetServiceSettingsRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TestOptimizationGetServiceSettingsRequestDataType fromValue(String value) {
    return new TestOptimizationGetServiceSettingsRequestDataType(value);
  }
}
