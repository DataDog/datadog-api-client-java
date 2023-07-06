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

/** Type of the table widget. */
@JsonSerialize(using = TableWidgetDefinitionType.TableWidgetDefinitionTypeSerializer.class)
public class TableWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("query_table"));

  public static final TableWidgetDefinitionType QUERY_TABLE =
      new TableWidgetDefinitionType("query_table");

  TableWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class TableWidgetDefinitionTypeSerializer
      extends StdSerializer<TableWidgetDefinitionType> {
    public TableWidgetDefinitionTypeSerializer(Class<TableWidgetDefinitionType> t) {
      super(t);
    }

    public TableWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TableWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TableWidgetDefinitionType fromValue(String value) {
    return new TableWidgetDefinitionType(value);
  }
}
