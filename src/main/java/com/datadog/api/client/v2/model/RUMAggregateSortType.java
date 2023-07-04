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

/** The type of sorting algorithm. */
@JsonSerialize(using = RUMAggregateSortType.RUMAggregateSortTypeSerializer.class)
public class RUMAggregateSortType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alphabetical", "measure"));

  public static final RUMAggregateSortType ALPHABETICAL = new RUMAggregateSortType("alphabetical");
  public static final RUMAggregateSortType MEASURE = new RUMAggregateSortType("measure");

  RUMAggregateSortType(String value) {
    super(value, allowedValues);
  }

  public static class RUMAggregateSortTypeSerializer extends StdSerializer<RUMAggregateSortType> {
    public RUMAggregateSortTypeSerializer(Class<RUMAggregateSortType> t) {
      super(t);
    }

    public RUMAggregateSortTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMAggregateSortType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMAggregateSortType fromValue(String value) {
    return new RUMAggregateSortType(value);
  }
}
