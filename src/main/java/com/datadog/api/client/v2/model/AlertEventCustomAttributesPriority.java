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
@JsonSerialize(
    using = AlertEventCustomAttributesPriority.AlertEventCustomAttributesPrioritySerializer.class)
public class AlertEventCustomAttributesPriority extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("1", "2", "3", "4", "5"));

  public static final AlertEventCustomAttributesPriority PRIORITY_ONE =
      new AlertEventCustomAttributesPriority("1");
  public static final AlertEventCustomAttributesPriority PRIORITY_TWO =
      new AlertEventCustomAttributesPriority("2");
  public static final AlertEventCustomAttributesPriority PRIORITY_THREE =
      new AlertEventCustomAttributesPriority("3");
  public static final AlertEventCustomAttributesPriority PRIORITY_FOUR =
      new AlertEventCustomAttributesPriority("4");
  public static final AlertEventCustomAttributesPriority PRIORITY_FIVE =
      new AlertEventCustomAttributesPriority("5");

  AlertEventCustomAttributesPriority(String value) {
    super(value, allowedValues);
  }

  public static class AlertEventCustomAttributesPrioritySerializer
      extends StdSerializer<AlertEventCustomAttributesPriority> {
    public AlertEventCustomAttributesPrioritySerializer(
        Class<AlertEventCustomAttributesPriority> t) {
      super(t);
    }

    public AlertEventCustomAttributesPrioritySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AlertEventCustomAttributesPriority value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AlertEventCustomAttributesPriority fromValue(String value) {
    return new AlertEventCustomAttributesPriority(value);
  }
}
