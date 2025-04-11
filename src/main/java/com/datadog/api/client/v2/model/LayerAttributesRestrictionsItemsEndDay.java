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

/** Defines the end day of the restriction within a Layer. */
@JsonSerialize(
    using =
        LayerAttributesRestrictionsItemsEndDay.LayerAttributesRestrictionsItemsEndDaySerializer
            .class)
public class LayerAttributesRestrictionsItemsEndDay extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

  public static final LayerAttributesRestrictionsItemsEndDay MONDAY =
      new LayerAttributesRestrictionsItemsEndDay("monday");
  public static final LayerAttributesRestrictionsItemsEndDay TUESDAY =
      new LayerAttributesRestrictionsItemsEndDay("tuesday");
  public static final LayerAttributesRestrictionsItemsEndDay WEDNESDAY =
      new LayerAttributesRestrictionsItemsEndDay("wednesday");
  public static final LayerAttributesRestrictionsItemsEndDay THURSDAY =
      new LayerAttributesRestrictionsItemsEndDay("thursday");
  public static final LayerAttributesRestrictionsItemsEndDay FRIDAY =
      new LayerAttributesRestrictionsItemsEndDay("friday");
  public static final LayerAttributesRestrictionsItemsEndDay SATURDAY =
      new LayerAttributesRestrictionsItemsEndDay("saturday");
  public static final LayerAttributesRestrictionsItemsEndDay SUNDAY =
      new LayerAttributesRestrictionsItemsEndDay("sunday");

  LayerAttributesRestrictionsItemsEndDay(String value) {
    super(value, allowedValues);
  }

  public static class LayerAttributesRestrictionsItemsEndDaySerializer
      extends StdSerializer<LayerAttributesRestrictionsItemsEndDay> {
    public LayerAttributesRestrictionsItemsEndDaySerializer(
        Class<LayerAttributesRestrictionsItemsEndDay> t) {
      super(t);
    }

    public LayerAttributesRestrictionsItemsEndDaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LayerAttributesRestrictionsItemsEndDay value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LayerAttributesRestrictionsItemsEndDay fromValue(String value) {
    return new LayerAttributesRestrictionsItemsEndDay(value);
  }
}
