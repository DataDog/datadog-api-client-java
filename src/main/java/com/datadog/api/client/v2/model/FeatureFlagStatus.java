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

/** The status of a feature flag in an environment. */
@JsonSerialize(using = FeatureFlagStatus.FeatureFlagStatusSerializer.class)
public class FeatureFlagStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ENABLED", "DISABLED"));

  public static final FeatureFlagStatus ENABLED = new FeatureFlagStatus("ENABLED");
  public static final FeatureFlagStatus DISABLED = new FeatureFlagStatus("DISABLED");

  FeatureFlagStatus(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagStatusSerializer extends StdSerializer<FeatureFlagStatus> {
    public FeatureFlagStatusSerializer(Class<FeatureFlagStatus> t) {
      super(t);
    }

    public FeatureFlagStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(FeatureFlagStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagStatus fromValue(String value) {
    return new FeatureFlagStatus(value);
  }
}
