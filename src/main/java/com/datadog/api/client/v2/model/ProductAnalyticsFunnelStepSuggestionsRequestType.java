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

/** Type of a step suggestions request. */
@JsonSerialize(
    using =
        ProductAnalyticsFunnelStepSuggestionsRequestType
            .ProductAnalyticsFunnelStepSuggestionsRequestTypeSerializer.class)
public class ProductAnalyticsFunnelStepSuggestionsRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("funnel_suggestions_steps_request"));

  public static final ProductAnalyticsFunnelStepSuggestionsRequestType
      FUNNEL_SUGGESTIONS_STEPS_REQUEST =
          new ProductAnalyticsFunnelStepSuggestionsRequestType("funnel_suggestions_steps_request");

  ProductAnalyticsFunnelStepSuggestionsRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsFunnelStepSuggestionsRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsFunnelStepSuggestionsRequestType> {
    public ProductAnalyticsFunnelStepSuggestionsRequestTypeSerializer(
        Class<ProductAnalyticsFunnelStepSuggestionsRequestType> t) {
      super(t);
    }

    public ProductAnalyticsFunnelStepSuggestionsRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsFunnelStepSuggestionsRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsFunnelStepSuggestionsRequestType fromValue(String value) {
    return new ProductAnalyticsFunnelStepSuggestionsRequestType(value);
  }
}
