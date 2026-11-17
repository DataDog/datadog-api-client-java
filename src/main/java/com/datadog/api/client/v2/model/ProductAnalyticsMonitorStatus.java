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

/**
 * Current alert status of the monitor. <code>No Data</code> is returned when the monitor has not
 * been evaluated yet.
 */
@JsonSerialize(using = ProductAnalyticsMonitorStatus.ProductAnalyticsMonitorStatusSerializer.class)
public class ProductAnalyticsMonitorStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("OK", "Alert", "Warn", "No Data"));

  public static final ProductAnalyticsMonitorStatus OK = new ProductAnalyticsMonitorStatus("OK");
  public static final ProductAnalyticsMonitorStatus ALERT =
      new ProductAnalyticsMonitorStatus("Alert");
  public static final ProductAnalyticsMonitorStatus WARN =
      new ProductAnalyticsMonitorStatus("Warn");
  public static final ProductAnalyticsMonitorStatus NO_DATA =
      new ProductAnalyticsMonitorStatus("No Data");

  ProductAnalyticsMonitorStatus(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsMonitorStatusSerializer
      extends StdSerializer<ProductAnalyticsMonitorStatus> {
    public ProductAnalyticsMonitorStatusSerializer(Class<ProductAnalyticsMonitorStatus> t) {
      super(t);
    }

    public ProductAnalyticsMonitorStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsMonitorStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsMonitorStatus fromValue(String value) {
    return new ProductAnalyticsMonitorStatus(value);
  }
}
