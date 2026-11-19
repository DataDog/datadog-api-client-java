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
 * How subjects are assigned to variants. <code>DATADOG</code> is the native scheme. <code>EPPO
 * </code> reproduces the assignments that Eppo made for a flag migrated from Eppo, so its subjects
 * keep their variants. Set when the flag is created and never changed.
 */
@JsonSerialize(using = FeatureFlagBucketingMode.FeatureFlagBucketingModeSerializer.class)
public class FeatureFlagBucketingMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("DATADOG", "EPPO"));

  public static final FeatureFlagBucketingMode DATADOG = new FeatureFlagBucketingMode("DATADOG");
  public static final FeatureFlagBucketingMode EPPO = new FeatureFlagBucketingMode("EPPO");

  FeatureFlagBucketingMode(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagBucketingModeSerializer
      extends StdSerializer<FeatureFlagBucketingMode> {
    public FeatureFlagBucketingModeSerializer(Class<FeatureFlagBucketingMode> t) {
      super(t);
    }

    public FeatureFlagBucketingModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagBucketingMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagBucketingMode fromValue(String value) {
    return new FeatureFlagBucketingMode(value);
  }
}
