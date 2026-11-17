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

/** Type of a step suggestions response. */
@JsonSerialize(
    using =
        ProductAnalyticsFunnelStepSuggestionsResponseType
            .ProductAnalyticsFunnelStepSuggestionsResponseTypeSerializer.class)
public class ProductAnalyticsFunnelStepSuggestionsResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("funnel_suggestions_steps_response"));

  public static final ProductAnalyticsFunnelStepSuggestionsResponseType
      FUNNEL_SUGGESTIONS_STEPS_RESPONSE =
          new ProductAnalyticsFunnelStepSuggestionsResponseType(
              "funnel_suggestions_steps_response");

  ProductAnalyticsFunnelStepSuggestionsResponseType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsFunnelStepSuggestionsResponseTypeSerializer
      extends StdSerializer<ProductAnalyticsFunnelStepSuggestionsResponseType> {
    public ProductAnalyticsFunnelStepSuggestionsResponseTypeSerializer(
        Class<ProductAnalyticsFunnelStepSuggestionsResponseType> t) {
      super(t);
    }

    public ProductAnalyticsFunnelStepSuggestionsResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsFunnelStepSuggestionsResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsFunnelStepSuggestionsResponseType fromValue(String value) {
    return new ProductAnalyticsFunnelStepSuggestionsResponseType(value);
  }
}
