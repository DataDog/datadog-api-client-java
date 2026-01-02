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

/** The type of Product Analytics event. Must be <code>server</code> for server-side events. */
@JsonSerialize(using = ProductAnalyticsEventType.ProductAnalyticsEventTypeSerializer.class)
public class ProductAnalyticsEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("server"));

  public static final ProductAnalyticsEventType SERVER = new ProductAnalyticsEventType("server");

  ProductAnalyticsEventType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsEventTypeSerializer
      extends StdSerializer<ProductAnalyticsEventType> {
    public ProductAnalyticsEventTypeSerializer(Class<ProductAnalyticsEventType> t) {
      super(t);
    }

    public ProductAnalyticsEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsEventType fromValue(String value) {
    return new ProductAnalyticsEventType(value);
  }
}
