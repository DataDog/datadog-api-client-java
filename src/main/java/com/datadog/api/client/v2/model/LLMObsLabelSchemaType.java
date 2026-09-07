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

/** Type of a label in an annotation queue label schema. */
@JsonSerialize(using = LLMObsLabelSchemaType.LLMObsLabelSchemaTypeSerializer.class)
public class LLMObsLabelSchemaType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("score", "categorical", "boolean", "text"));

  public static final LLMObsLabelSchemaType SCORE = new LLMObsLabelSchemaType("score");
  public static final LLMObsLabelSchemaType CATEGORICAL = new LLMObsLabelSchemaType("categorical");
  public static final LLMObsLabelSchemaType BOOLEAN = new LLMObsLabelSchemaType("boolean");
  public static final LLMObsLabelSchemaType TEXT = new LLMObsLabelSchemaType("text");

  LLMObsLabelSchemaType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsLabelSchemaTypeSerializer extends StdSerializer<LLMObsLabelSchemaType> {
    public LLMObsLabelSchemaTypeSerializer(Class<LLMObsLabelSchemaType> t) {
      super(t);
    }

    public LLMObsLabelSchemaTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsLabelSchemaType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsLabelSchemaType fromValue(String value) {
    return new LLMObsLabelSchemaType(value);
  }
}
