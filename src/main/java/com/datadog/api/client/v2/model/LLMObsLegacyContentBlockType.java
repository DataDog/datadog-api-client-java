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

/** Type discriminator for an existing non-frontend display block. */
@JsonSerialize(using = LLMObsLegacyContentBlockType.LLMObsLegacyContentBlockTypeSerializer.class)
public class LLMObsLegacyContentBlockType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("markdown", "header", "text", "json", "image", "widget", "llmobs_trace"));

  public static final LLMObsLegacyContentBlockType MARKDOWN =
      new LLMObsLegacyContentBlockType("markdown");
  public static final LLMObsLegacyContentBlockType HEADER =
      new LLMObsLegacyContentBlockType("header");
  public static final LLMObsLegacyContentBlockType TEXT = new LLMObsLegacyContentBlockType("text");
  public static final LLMObsLegacyContentBlockType JSON = new LLMObsLegacyContentBlockType("json");
  public static final LLMObsLegacyContentBlockType IMAGE =
      new LLMObsLegacyContentBlockType("image");
  public static final LLMObsLegacyContentBlockType WIDGET =
      new LLMObsLegacyContentBlockType("widget");
  public static final LLMObsLegacyContentBlockType LLMOBS_TRACE =
      new LLMObsLegacyContentBlockType("llmobs_trace");

  LLMObsLegacyContentBlockType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsLegacyContentBlockTypeSerializer
      extends StdSerializer<LLMObsLegacyContentBlockType> {
    public LLMObsLegacyContentBlockTypeSerializer(Class<LLMObsLegacyContentBlockType> t) {
      super(t);
    }

    public LLMObsLegacyContentBlockTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsLegacyContentBlockType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsLegacyContentBlockType fromValue(String value) {
    return new LLMObsLegacyContentBlockType(value);
  }
}
