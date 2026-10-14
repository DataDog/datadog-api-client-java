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

/** An explicit staleness status override. Omitted when no override is set. */
@JsonSerialize(
    using = FeatureFlagStalenessStatusOverride.FeatureFlagStalenessStatusOverrideSerializer.class)
public class FeatureFlagStalenessStatusOverride extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("STALE", "PERMANENT"));

  public static final FeatureFlagStalenessStatusOverride STALE =
      new FeatureFlagStalenessStatusOverride("STALE");
  public static final FeatureFlagStalenessStatusOverride PERMANENT =
      new FeatureFlagStalenessStatusOverride("PERMANENT");

  FeatureFlagStalenessStatusOverride(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagStalenessStatusOverrideSerializer
      extends StdSerializer<FeatureFlagStalenessStatusOverride> {
    public FeatureFlagStalenessStatusOverrideSerializer(
        Class<FeatureFlagStalenessStatusOverride> t) {
      super(t);
    }

    public FeatureFlagStalenessStatusOverrideSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagStalenessStatusOverride value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagStalenessStatusOverride fromValue(String value) {
    return new FeatureFlagStalenessStatusOverride(value);
  }
}
