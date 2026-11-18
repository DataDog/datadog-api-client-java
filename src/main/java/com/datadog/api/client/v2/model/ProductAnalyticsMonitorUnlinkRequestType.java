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

/** Product Analytics monitor unlink request resource type. */
@JsonSerialize(
    using =
        ProductAnalyticsMonitorUnlinkRequestType.ProductAnalyticsMonitorUnlinkRequestTypeSerializer
            .class)
public class ProductAnalyticsMonitorUnlinkRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pa_monitor_unlink_request"));

  public static final ProductAnalyticsMonitorUnlinkRequestType PA_MONITOR_UNLINK_REQUEST =
      new ProductAnalyticsMonitorUnlinkRequestType("pa_monitor_unlink_request");

  ProductAnalyticsMonitorUnlinkRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsMonitorUnlinkRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsMonitorUnlinkRequestType> {
    public ProductAnalyticsMonitorUnlinkRequestTypeSerializer(
        Class<ProductAnalyticsMonitorUnlinkRequestType> t) {
      super(t);
    }

    public ProductAnalyticsMonitorUnlinkRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsMonitorUnlinkRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsMonitorUnlinkRequestType fromValue(String value) {
    return new ProductAnalyticsMonitorUnlinkRequestType(value);
  }
}
