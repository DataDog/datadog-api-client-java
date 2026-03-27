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

/** Type of the check status widget. */
@JsonSerialize(
    using = CheckStatusWidgetDefinitionType.CheckStatusWidgetDefinitionTypeSerializer.class)
public class CheckStatusWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("check_status"));

  public static final CheckStatusWidgetDefinitionType CHECK_STATUS =
      new CheckStatusWidgetDefinitionType("check_status");

  CheckStatusWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class CheckStatusWidgetDefinitionTypeSerializer
      extends StdSerializer<CheckStatusWidgetDefinitionType> {
    public CheckStatusWidgetDefinitionTypeSerializer(Class<CheckStatusWidgetDefinitionType> t) {
      super(t);
    }

    public CheckStatusWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CheckStatusWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CheckStatusWidgetDefinitionType fromValue(String value) {
    return new CheckStatusWidgetDefinitionType(value);
  }
}
