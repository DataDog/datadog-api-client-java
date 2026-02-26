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

/** The type of the change request. */
@JsonSerialize(using = ChangeRequestChangeType.ChangeRequestChangeTypeSerializer.class)
public class ChangeRequestChangeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("NORMAL", "STANDARD", "EMERGENCY"));

  public static final ChangeRequestChangeType NORMAL = new ChangeRequestChangeType("NORMAL");
  public static final ChangeRequestChangeType STANDARD = new ChangeRequestChangeType("STANDARD");
  public static final ChangeRequestChangeType EMERGENCY = new ChangeRequestChangeType("EMERGENCY");

  ChangeRequestChangeType(String value) {
    super(value, allowedValues);
  }

  public static class ChangeRequestChangeTypeSerializer
      extends StdSerializer<ChangeRequestChangeType> {
    public ChangeRequestChangeTypeSerializer(Class<ChangeRequestChangeType> t) {
      super(t);
    }

    public ChangeRequestChangeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeRequestChangeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeRequestChangeType fromValue(String value) {
    return new ChangeRequestChangeType(value);
  }
}
