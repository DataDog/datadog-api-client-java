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

/** Product Analytics monitor list resource type. */
@JsonSerialize(
    using = ProductAnalyticsMonitorListType.ProductAnalyticsMonitorListTypeSerializer.class)
public class ProductAnalyticsMonitorListType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pa_monitor_list"));

  public static final ProductAnalyticsMonitorListType PA_MONITOR_LIST =
      new ProductAnalyticsMonitorListType("pa_monitor_list");

  ProductAnalyticsMonitorListType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsMonitorListTypeSerializer
      extends StdSerializer<ProductAnalyticsMonitorListType> {
    public ProductAnalyticsMonitorListTypeSerializer(Class<ProductAnalyticsMonitorListType> t) {
      super(t);
    }

    public ProductAnalyticsMonitorListTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsMonitorListType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsMonitorListType fromValue(String value) {
    return new ProductAnalyticsMonitorListType(value);
  }
}
