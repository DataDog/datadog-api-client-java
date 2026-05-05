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

/** Resource type for the API key validation response. */
@JsonSerialize(using = ValidateV2Type.ValidateV2TypeSerializer.class)
public class ValidateV2Type extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("validate_v2"));

  public static final ValidateV2Type ValidateV2 = new ValidateV2Type("validate_v2");

  ValidateV2Type(String value) {
    super(value, allowedValues);
  }

  public static class ValidateV2TypeSerializer extends StdSerializer<ValidateV2Type> {
    public ValidateV2TypeSerializer(Class<ValidateV2Type> t) {
      super(t);
    }

    public ValidateV2TypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ValidateV2Type value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ValidateV2Type fromValue(String value) {
    return new ValidateV2Type(value);
  }
}
