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

/** Defines the start day of the restriction within a Layer. */
@JsonSerialize(
    using =
        LayerAttributesRestrictionsItemsStartDay.LayerAttributesRestrictionsItemsStartDaySerializer
            .class)
public class LayerAttributesRestrictionsItemsStartDay extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

  public static final LayerAttributesRestrictionsItemsStartDay MONDAY =
      new LayerAttributesRestrictionsItemsStartDay("monday");
  public static final LayerAttributesRestrictionsItemsStartDay TUESDAY =
      new LayerAttributesRestrictionsItemsStartDay("tuesday");
  public static final LayerAttributesRestrictionsItemsStartDay WEDNESDAY =
      new LayerAttributesRestrictionsItemsStartDay("wednesday");
  public static final LayerAttributesRestrictionsItemsStartDay THURSDAY =
      new LayerAttributesRestrictionsItemsStartDay("thursday");
  public static final LayerAttributesRestrictionsItemsStartDay FRIDAY =
      new LayerAttributesRestrictionsItemsStartDay("friday");
  public static final LayerAttributesRestrictionsItemsStartDay SATURDAY =
      new LayerAttributesRestrictionsItemsStartDay("saturday");
  public static final LayerAttributesRestrictionsItemsStartDay SUNDAY =
      new LayerAttributesRestrictionsItemsStartDay("sunday");

  LayerAttributesRestrictionsItemsStartDay(String value) {
    super(value, allowedValues);
  }

  public static class LayerAttributesRestrictionsItemsStartDaySerializer
      extends StdSerializer<LayerAttributesRestrictionsItemsStartDay> {
    public LayerAttributesRestrictionsItemsStartDaySerializer(
        Class<LayerAttributesRestrictionsItemsStartDay> t) {
      super(t);
    }

    public LayerAttributesRestrictionsItemsStartDaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LayerAttributesRestrictionsItemsStartDay value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LayerAttributesRestrictionsItemsStartDay fromValue(String value) {
    return new LayerAttributesRestrictionsItemsStartDay(value);
  }
}
