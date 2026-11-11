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

/** The resource type for feature flag approval settings. */
@JsonSerialize(using = FeatureFlagApprovalsDataType.FeatureFlagApprovalsDataTypeSerializer.class)
public class FeatureFlagApprovalsDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("feature-flag-approvals"));

  public static final FeatureFlagApprovalsDataType FEATURE_FLAG_APPROVALS =
      new FeatureFlagApprovalsDataType("feature-flag-approvals");

  FeatureFlagApprovalsDataType(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagApprovalsDataTypeSerializer
      extends StdSerializer<FeatureFlagApprovalsDataType> {
    public FeatureFlagApprovalsDataTypeSerializer(Class<FeatureFlagApprovalsDataType> t) {
      super(t);
    }

    public FeatureFlagApprovalsDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagApprovalsDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagApprovalsDataType fromValue(String value) {
    return new FeatureFlagApprovalsDataType(value);
  }
}
