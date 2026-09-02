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

/** The priority of the alert. */
@JsonSerialize(using = AlertEventAttributesPriority.AlertEventAttributesPrioritySerializer.class)
public class AlertEventAttributesPriority extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("1", "2", "3", "4", "5"));

  public static final AlertEventAttributesPriority PRIORITY_ONE =
      new AlertEventAttributesPriority("1");
  public static final AlertEventAttributesPriority PRIORITY_TWO =
      new AlertEventAttributesPriority("2");
  public static final AlertEventAttributesPriority PRIORITY_THREE =
      new AlertEventAttributesPriority("3");
  public static final AlertEventAttributesPriority PRIORITY_FOUR =
      new AlertEventAttributesPriority("4");
  public static final AlertEventAttributesPriority PRIORITY_FIVE =
      new AlertEventAttributesPriority("5");

  AlertEventAttributesPriority(String value) {
    super(value, allowedValues);
  }

  public static class AlertEventAttributesPrioritySerializer
      extends StdSerializer<AlertEventAttributesPriority> {
    public AlertEventAttributesPrioritySerializer(Class<AlertEventAttributesPriority> t) {
      super(t);
    }

    public AlertEventAttributesPrioritySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AlertEventAttributesPriority value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AlertEventAttributesPriority fromValue(String value) {
    return new AlertEventAttributesPriority(value);
  }
}
