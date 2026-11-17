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

/** Launch resource type. */
@JsonSerialize(using = ProductAnalyticsLaunchType.ProductAnalyticsLaunchTypeSerializer.class)
public class ProductAnalyticsLaunchType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("liftoff"));

  public static final ProductAnalyticsLaunchType LIFTOFF =
      new ProductAnalyticsLaunchType("liftoff");

  ProductAnalyticsLaunchType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsLaunchTypeSerializer
      extends StdSerializer<ProductAnalyticsLaunchType> {
    public ProductAnalyticsLaunchTypeSerializer(Class<ProductAnalyticsLaunchType> t) {
      super(t);
    }

    public ProductAnalyticsLaunchTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsLaunchType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsLaunchType fromValue(String value) {
    return new ProductAnalyticsLaunchType(value);
  }
}
