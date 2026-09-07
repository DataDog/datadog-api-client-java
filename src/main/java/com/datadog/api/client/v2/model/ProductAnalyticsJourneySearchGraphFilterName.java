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

/** The journey-level metric the graph filter applies to. */
@JsonSerialize(
    using =
        ProductAnalyticsJourneySearchGraphFilterName
            .ProductAnalyticsJourneySearchGraphFilterNameSerializer.class)
public class ProductAnalyticsJourneySearchGraphFilterName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("__dd.time_to_convert", "__dd.session", "__dd.dropoff_rate"));

  public static final ProductAnalyticsJourneySearchGraphFilterName TIME_TO_CONVERT =
      new ProductAnalyticsJourneySearchGraphFilterName("__dd.time_to_convert");
  public static final ProductAnalyticsJourneySearchGraphFilterName SESSION =
      new ProductAnalyticsJourneySearchGraphFilterName("__dd.session");
  public static final ProductAnalyticsJourneySearchGraphFilterName DROPOFF_RATE =
      new ProductAnalyticsJourneySearchGraphFilterName("__dd.dropoff_rate");

  ProductAnalyticsJourneySearchGraphFilterName(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsJourneySearchGraphFilterNameSerializer
      extends StdSerializer<ProductAnalyticsJourneySearchGraphFilterName> {
    public ProductAnalyticsJourneySearchGraphFilterNameSerializer(
        Class<ProductAnalyticsJourneySearchGraphFilterName> t) {
      super(t);
    }

    public ProductAnalyticsJourneySearchGraphFilterNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsJourneySearchGraphFilterName value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsJourneySearchGraphFilterName fromValue(String value) {
    return new ProductAnalyticsJourneySearchGraphFilterName(value);
  }
}
