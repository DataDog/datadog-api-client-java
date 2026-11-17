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

/** Product Analytics monitor resource type. */
@JsonSerialize(using = ProductAnalyticsMonitorType.ProductAnalyticsMonitorTypeSerializer.class)
public class ProductAnalyticsMonitorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("pa_monitor"));

  public static final ProductAnalyticsMonitorType PA_MONITOR =
      new ProductAnalyticsMonitorType("pa_monitor");

  ProductAnalyticsMonitorType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsMonitorTypeSerializer
      extends StdSerializer<ProductAnalyticsMonitorType> {
    public ProductAnalyticsMonitorTypeSerializer(Class<ProductAnalyticsMonitorType> t) {
      super(t);
    }

    public ProductAnalyticsMonitorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsMonitorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsMonitorType fromValue(String value) {
    return new ProductAnalyticsMonitorType(value);
  }
}
