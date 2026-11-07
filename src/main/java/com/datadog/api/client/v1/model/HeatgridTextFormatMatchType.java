/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Comparison used to match a group label. */
@JsonSerialize(using = HeatgridTextFormatMatchType.HeatgridTextFormatMatchTypeSerializer.class)
public class HeatgridTextFormatMatchType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "is", "is_not", "contains", "does_not_contain", "starts_with", "ends_with"));

  public static final HeatgridTextFormatMatchType IS = new HeatgridTextFormatMatchType("is");
  public static final HeatgridTextFormatMatchType IS_NOT =
      new HeatgridTextFormatMatchType("is_not");
  public static final HeatgridTextFormatMatchType CONTAINS =
      new HeatgridTextFormatMatchType("contains");
  public static final HeatgridTextFormatMatchType DOES_NOT_CONTAIN =
      new HeatgridTextFormatMatchType("does_not_contain");
  public static final HeatgridTextFormatMatchType STARTS_WITH =
      new HeatgridTextFormatMatchType("starts_with");
  public static final HeatgridTextFormatMatchType ENDS_WITH =
      new HeatgridTextFormatMatchType("ends_with");

  HeatgridTextFormatMatchType(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridTextFormatMatchTypeSerializer
      extends StdSerializer<HeatgridTextFormatMatchType> {
    public HeatgridTextFormatMatchTypeSerializer(Class<HeatgridTextFormatMatchType> t) {
      super(t);
    }

    public HeatgridTextFormatMatchTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridTextFormatMatchType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridTextFormatMatchType fromValue(String value) {
    return new HeatgridTextFormatMatchType(value);
  }
}
