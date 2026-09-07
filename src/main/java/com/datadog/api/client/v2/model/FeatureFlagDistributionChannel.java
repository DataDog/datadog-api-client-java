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

/** The distribution channel for the feature flag. */
@JsonSerialize(
    using = FeatureFlagDistributionChannel.FeatureFlagDistributionChannelSerializer.class)
public class FeatureFlagDistributionChannel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ALL", "CLIENT", "SERVER"));

  public static final FeatureFlagDistributionChannel ALL =
      new FeatureFlagDistributionChannel("ALL");
  public static final FeatureFlagDistributionChannel CLIENT =
      new FeatureFlagDistributionChannel("CLIENT");
  public static final FeatureFlagDistributionChannel SERVER =
      new FeatureFlagDistributionChannel("SERVER");

  FeatureFlagDistributionChannel(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagDistributionChannelSerializer
      extends StdSerializer<FeatureFlagDistributionChannel> {
    public FeatureFlagDistributionChannelSerializer(Class<FeatureFlagDistributionChannel> t) {
      super(t);
    }

    public FeatureFlagDistributionChannelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagDistributionChannel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagDistributionChannel fromValue(String value) {
    return new FeatureFlagDistributionChannel(value);
  }
}
