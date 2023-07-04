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
@JsonSerialize(using = CIAppAggregateSortType.CIAppAggregateSortTypeSerializer.class)
public class CIAppAggregateSortType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alphabetical", "measure"));

  public static final CIAppAggregateSortType ALPHABETICAL =
      new CIAppAggregateSortType("alphabetical");
  public static final CIAppAggregateSortType MEASURE = new CIAppAggregateSortType("measure");

  CIAppAggregateSortType(String value) {
    super(value, allowedValues);
  }

  public static class CIAppAggregateSortTypeSerializer
      extends StdSerializer<CIAppAggregateSortType> {
    public CIAppAggregateSortTypeSerializer(Class<CIAppAggregateSortType> t) {
      super(t);
    }

    public CIAppAggregateSortTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppAggregateSortType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppAggregateSortType fromValue(String value) {
    return new CIAppAggregateSortType(value);
  }
}
