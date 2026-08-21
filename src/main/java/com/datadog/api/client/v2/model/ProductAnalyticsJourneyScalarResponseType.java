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

/** The resource type identifier for a journey scalar response. */
@JsonSerialize(
    using =
        ProductAnalyticsJourneyScalarResponseType
            .ProductAnalyticsJourneyScalarResponseTypeSerializer.class)
public class ProductAnalyticsJourneyScalarResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("journey_scalar_response"));

  public static final ProductAnalyticsJourneyScalarResponseType JOURNEY_SCALAR_RESPONSE =
      new ProductAnalyticsJourneyScalarResponseType("journey_scalar_response");

  ProductAnalyticsJourneyScalarResponseType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsJourneyScalarResponseTypeSerializer
      extends StdSerializer<ProductAnalyticsJourneyScalarResponseType> {
    public ProductAnalyticsJourneyScalarResponseTypeSerializer(
        Class<ProductAnalyticsJourneyScalarResponseType> t) {
      super(t);
    }

    public ProductAnalyticsJourneyScalarResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsJourneyScalarResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsJourneyScalarResponseType fromValue(String value) {
    return new ProductAnalyticsJourneyScalarResponseType(value);
  }
}
