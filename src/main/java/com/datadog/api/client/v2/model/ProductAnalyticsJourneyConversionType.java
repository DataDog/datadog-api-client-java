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

/** Whether to return the entities that converted at the target step, or those that dropped off. */
@JsonSerialize(
    using =
        ProductAnalyticsJourneyConversionType.ProductAnalyticsJourneyConversionTypeSerializer.class)
public class ProductAnalyticsJourneyConversionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("conversion", "drop-off"));

  public static final ProductAnalyticsJourneyConversionType CONVERSION =
      new ProductAnalyticsJourneyConversionType("conversion");
  public static final ProductAnalyticsJourneyConversionType DROP_OFF =
      new ProductAnalyticsJourneyConversionType("drop-off");

  ProductAnalyticsJourneyConversionType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsJourneyConversionTypeSerializer
      extends StdSerializer<ProductAnalyticsJourneyConversionType> {
    public ProductAnalyticsJourneyConversionTypeSerializer(
        Class<ProductAnalyticsJourneyConversionType> t) {
      super(t);
    }

    public ProductAnalyticsJourneyConversionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsJourneyConversionType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsJourneyConversionType fromValue(String value) {
    return new ProductAnalyticsJourneyConversionType(value);
  }
}
