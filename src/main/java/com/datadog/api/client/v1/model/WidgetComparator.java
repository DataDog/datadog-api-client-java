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

/** Comparator to apply. */
@JsonSerialize(using = WidgetComparator.WidgetComparatorSerializer.class)
public class WidgetComparator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("=", ">", ">=", "<", "<="));

  public static final WidgetComparator EQUAL_TO = new WidgetComparator("=");
  public static final WidgetComparator GREATER_THAN = new WidgetComparator(">");
  public static final WidgetComparator GREATER_THAN_OR_EQUAL_TO = new WidgetComparator(">=");
  public static final WidgetComparator LESS_THAN = new WidgetComparator("<");
  public static final WidgetComparator LESS_THAN_OR_EQUAL_TO = new WidgetComparator("<=");

  WidgetComparator(String value) {
    super(value, allowedValues);
  }

  public static class WidgetComparatorSerializer extends StdSerializer<WidgetComparator> {
    public WidgetComparatorSerializer(Class<WidgetComparator> t) {
      super(t);
    }

    public WidgetComparatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetComparator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetComparator fromValue(String value) {
    return new WidgetComparator(value);
  }
}
