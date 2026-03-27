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

/** Type of browser test variable. */
@JsonSerialize(using = SyntheticsBrowserVariableType.SyntheticsBrowserVariableTypeSerializer.class)
public class SyntheticsBrowserVariableType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("element", "email", "global", "text"));

  public static final SyntheticsBrowserVariableType ELEMENT =
      new SyntheticsBrowserVariableType("element");
  public static final SyntheticsBrowserVariableType EMAIL =
      new SyntheticsBrowserVariableType("email");
  public static final SyntheticsBrowserVariableType GLOBAL =
      new SyntheticsBrowserVariableType("global");
  public static final SyntheticsBrowserVariableType TEXT =
      new SyntheticsBrowserVariableType("text");

  SyntheticsBrowserVariableType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsBrowserVariableTypeSerializer
      extends StdSerializer<SyntheticsBrowserVariableType> {
    public SyntheticsBrowserVariableTypeSerializer(Class<SyntheticsBrowserVariableType> t) {
      super(t);
    }

    public SyntheticsBrowserVariableTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBrowserVariableType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBrowserVariableType fromValue(String value) {
    return new SyntheticsBrowserVariableType(value);
  }
}
