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

/** The definition of the <code>CircleCIAPIKey</code> object. */
@JsonSerialize(using = CircleCIAPIKeyType.CircleCIAPIKeyTypeSerializer.class)
public class CircleCIAPIKeyType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("CircleCIAPIKey"));

  public static final CircleCIAPIKeyType CIRCLECIAPIKEY = new CircleCIAPIKeyType("CircleCIAPIKey");

  CircleCIAPIKeyType(String value) {
    super(value, allowedValues);
  }

  public static class CircleCIAPIKeyTypeSerializer extends StdSerializer<CircleCIAPIKeyType> {
    public CircleCIAPIKeyTypeSerializer(Class<CircleCIAPIKeyType> t) {
      super(t);
    }

    public CircleCIAPIKeyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(CircleCIAPIKeyType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CircleCIAPIKeyType fromValue(String value) {
    return new CircleCIAPIKeyType(value);
  }
}
