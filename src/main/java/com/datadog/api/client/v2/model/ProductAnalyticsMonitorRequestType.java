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

/** Product Analytics monitor request resource type. */
@JsonSerialize(
    using = ProductAnalyticsMonitorRequestType.ProductAnalyticsMonitorRequestTypeSerializer.class)
public class ProductAnalyticsMonitorRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pa_monitor_request"));

  public static final ProductAnalyticsMonitorRequestType PA_MONITOR_REQUEST =
      new ProductAnalyticsMonitorRequestType("pa_monitor_request");

  ProductAnalyticsMonitorRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsMonitorRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsMonitorRequestType> {
    public ProductAnalyticsMonitorRequestTypeSerializer(
        Class<ProductAnalyticsMonitorRequestType> t) {
      super(t);
    }

    public ProductAnalyticsMonitorRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsMonitorRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsMonitorRequestType fromValue(String value) {
    return new ProductAnalyticsMonitorRequestType(value);
  }
}
