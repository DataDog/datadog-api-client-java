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

/** Type of the group widget. */
@JsonSerialize(using = GroupWidgetDefinitionType.GroupWidgetDefinitionTypeSerializer.class)
public class GroupWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("group"));

  public static final GroupWidgetDefinitionType GROUP = new GroupWidgetDefinitionType("group");

  GroupWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class GroupWidgetDefinitionTypeSerializer
      extends StdSerializer<GroupWidgetDefinitionType> {
    public GroupWidgetDefinitionTypeSerializer(Class<GroupWidgetDefinitionType> t) {
      super(t);
    }

    public GroupWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GroupWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GroupWidgetDefinitionType fromValue(String value) {
    return new GroupWidgetDefinitionType(value);
  }
}
