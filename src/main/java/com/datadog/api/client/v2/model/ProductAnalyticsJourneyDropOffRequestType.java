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

/** The resource type identifier for a journey drop-off analysis request. */
@JsonSerialize(
    using =
        ProductAnalyticsJourneyDropOffRequestType
            .ProductAnalyticsJourneyDropOffRequestTypeSerializer.class)
public class ProductAnalyticsJourneyDropOffRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("journey_drop_off_analysis_request"));

  public static final ProductAnalyticsJourneyDropOffRequestType JOURNEY_DROP_OFF_ANALYSIS_REQUEST =
      new ProductAnalyticsJourneyDropOffRequestType("journey_drop_off_analysis_request");

  ProductAnalyticsJourneyDropOffRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsJourneyDropOffRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsJourneyDropOffRequestType> {
    public ProductAnalyticsJourneyDropOffRequestTypeSerializer(
        Class<ProductAnalyticsJourneyDropOffRequestType> t) {
      super(t);
    }

    public ProductAnalyticsJourneyDropOffRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsJourneyDropOffRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsJourneyDropOffRequestType fromValue(String value) {
    return new ProductAnalyticsJourneyDropOffRequestType(value);
  }
}
