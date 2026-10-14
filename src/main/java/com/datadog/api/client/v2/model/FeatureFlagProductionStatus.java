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

/** The status of a feature flag across production environments. */
@JsonSerialize(using = FeatureFlagProductionStatus.FeatureFlagProductionStatusSerializer.class)
public class FeatureFlagProductionStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ENABLED", "DISABLED", "OVERRIDDEN"));

  public static final FeatureFlagProductionStatus ENABLED =
      new FeatureFlagProductionStatus("ENABLED");
  public static final FeatureFlagProductionStatus DISABLED =
      new FeatureFlagProductionStatus("DISABLED");
  public static final FeatureFlagProductionStatus OVERRIDDEN =
      new FeatureFlagProductionStatus("OVERRIDDEN");

  FeatureFlagProductionStatus(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagProductionStatusSerializer
      extends StdSerializer<FeatureFlagProductionStatus> {
    public FeatureFlagProductionStatusSerializer(Class<FeatureFlagProductionStatus> t) {
      super(t);
    }

    public FeatureFlagProductionStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagProductionStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagProductionStatus fromValue(String value) {
    return new FeatureFlagProductionStatus(value);
  }
}
