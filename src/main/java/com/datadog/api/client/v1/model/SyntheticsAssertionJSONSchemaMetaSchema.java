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

/** The JSON Schema meta-schema version used in the assertion. */
@JsonSerialize(
    using =
        SyntheticsAssertionJSONSchemaMetaSchema.SyntheticsAssertionJSONSchemaMetaSchemaSerializer
            .class)
public class SyntheticsAssertionJSONSchemaMetaSchema extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("draft-07", "draft-06"));

  public static final SyntheticsAssertionJSONSchemaMetaSchema DRAFT_07 =
      new SyntheticsAssertionJSONSchemaMetaSchema("draft-07");
  public static final SyntheticsAssertionJSONSchemaMetaSchema DRAFT_06 =
      new SyntheticsAssertionJSONSchemaMetaSchema("draft-06");

  SyntheticsAssertionJSONSchemaMetaSchema(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsAssertionJSONSchemaMetaSchemaSerializer
      extends StdSerializer<SyntheticsAssertionJSONSchemaMetaSchema> {
    public SyntheticsAssertionJSONSchemaMetaSchemaSerializer(
        Class<SyntheticsAssertionJSONSchemaMetaSchema> t) {
      super(t);
    }

    public SyntheticsAssertionJSONSchemaMetaSchemaSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAssertionJSONSchemaMetaSchema value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsAssertionJSONSchemaMetaSchema fromValue(String value) {
    return new SyntheticsAssertionJSONSchemaMetaSchema(value);
  }
}
