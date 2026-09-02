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

/** The type of sorting algorithm */
@JsonSerialize(using = LogsAggregateSortType.LogsAggregateSortTypeSerializer.class)
public class LogsAggregateSortType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alphabetical", "measure"));

  public static final LogsAggregateSortType ALPHABETICAL =
      new LogsAggregateSortType("alphabetical");
  public static final LogsAggregateSortType MEASURE = new LogsAggregateSortType("measure");

  LogsAggregateSortType(String value) {
    super(value, allowedValues);
  }

  public static class LogsAggregateSortTypeSerializer extends StdSerializer<LogsAggregateSortType> {
    public LogsAggregateSortTypeSerializer(Class<LogsAggregateSortType> t) {
      super(t);
    }

    public LogsAggregateSortTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsAggregateSortType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsAggregateSortType fromValue(String value) {
    return new LogsAggregateSortType(value);
  }
}
