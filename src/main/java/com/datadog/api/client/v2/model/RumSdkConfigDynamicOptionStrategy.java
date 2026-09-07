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

/** The strategy used to extract the dynamic value. */
@JsonSerialize(
    using = RumSdkConfigDynamicOptionStrategy.RumSdkConfigDynamicOptionStrategySerializer.class)
public class RumSdkConfigDynamicOptionStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("js", "cookie", "dom", "localStorage"));

  public static final RumSdkConfigDynamicOptionStrategy JS =
      new RumSdkConfigDynamicOptionStrategy("js");
  public static final RumSdkConfigDynamicOptionStrategy COOKIE =
      new RumSdkConfigDynamicOptionStrategy("cookie");
  public static final RumSdkConfigDynamicOptionStrategy DOM =
      new RumSdkConfigDynamicOptionStrategy("dom");
  public static final RumSdkConfigDynamicOptionStrategy LOCAL_STORAGE =
      new RumSdkConfigDynamicOptionStrategy("localStorage");

  RumSdkConfigDynamicOptionStrategy(String value) {
    super(value, allowedValues);
  }

  public static class RumSdkConfigDynamicOptionStrategySerializer
      extends StdSerializer<RumSdkConfigDynamicOptionStrategy> {
    public RumSdkConfigDynamicOptionStrategySerializer(Class<RumSdkConfigDynamicOptionStrategy> t) {
      super(t);
    }

    public RumSdkConfigDynamicOptionStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumSdkConfigDynamicOptionStrategy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumSdkConfigDynamicOptionStrategy fromValue(String value) {
    return new RumSdkConfigDynamicOptionStrategy(value);
  }
}
