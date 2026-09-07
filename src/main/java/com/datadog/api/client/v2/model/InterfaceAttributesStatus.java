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

/** The interface status */
@JsonSerialize(using = InterfaceAttributesStatus.InterfaceAttributesStatusSerializer.class)
public class InterfaceAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("up", "down", "warning", "off"));

  public static final InterfaceAttributesStatus UP = new InterfaceAttributesStatus("up");
  public static final InterfaceAttributesStatus DOWN = new InterfaceAttributesStatus("down");
  public static final InterfaceAttributesStatus WARNING = new InterfaceAttributesStatus("warning");
  public static final InterfaceAttributesStatus OFF = new InterfaceAttributesStatus("off");

  InterfaceAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class InterfaceAttributesStatusSerializer
      extends StdSerializer<InterfaceAttributesStatus> {
    public InterfaceAttributesStatusSerializer(Class<InterfaceAttributesStatus> t) {
      super(t);
    }

    public InterfaceAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        InterfaceAttributesStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static InterfaceAttributesStatus fromValue(String value) {
    return new InterfaceAttributesStatus(value);
  }
}
