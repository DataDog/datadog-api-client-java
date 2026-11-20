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
    using = RUMSdkConfigDynamicOptionStrategy.RUMSdkConfigDynamicOptionStrategySerializer.class)
public class RUMSdkConfigDynamicOptionStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("js", "cookie", "dom", "localStorage"));

  public static final RUMSdkConfigDynamicOptionStrategy JS =
      new RUMSdkConfigDynamicOptionStrategy("js");
  public static final RUMSdkConfigDynamicOptionStrategy COOKIE =
      new RUMSdkConfigDynamicOptionStrategy("cookie");
  public static final RUMSdkConfigDynamicOptionStrategy DOM =
      new RUMSdkConfigDynamicOptionStrategy("dom");
  public static final RUMSdkConfigDynamicOptionStrategy LOCAL_STORAGE =
      new RUMSdkConfigDynamicOptionStrategy("localStorage");

  RUMSdkConfigDynamicOptionStrategy(String value) {
    super(value, allowedValues);
  }

  public static class RUMSdkConfigDynamicOptionStrategySerializer
      extends StdSerializer<RUMSdkConfigDynamicOptionStrategy> {
    public RUMSdkConfigDynamicOptionStrategySerializer(Class<RUMSdkConfigDynamicOptionStrategy> t) {
      super(t);
    }

    public RUMSdkConfigDynamicOptionStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMSdkConfigDynamicOptionStrategy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMSdkConfigDynamicOptionStrategy fromValue(String value) {
    return new RUMSdkConfigDynamicOptionStrategy(value);
  }
}
