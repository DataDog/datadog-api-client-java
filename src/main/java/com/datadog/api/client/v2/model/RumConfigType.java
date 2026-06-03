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

/** The type of the resource. The value should always be <code>rum_config</code>. */
@JsonSerialize(using = RumConfigType.RumConfigTypeSerializer.class)
public class RumConfigType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("rum_config"));

  public static final RumConfigType RUM_CONFIG = new RumConfigType("rum_config");

  RumConfigType(String value) {
    super(value, allowedValues);
  }

  public static class RumConfigTypeSerializer extends StdSerializer<RumConfigType> {
    public RumConfigTypeSerializer(Class<RumConfigType> t) {
      super(t);
    }

    public RumConfigTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RumConfigType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumConfigType fromValue(String value) {
    return new RumConfigType(value);
  }
}
