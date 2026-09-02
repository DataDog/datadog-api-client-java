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

/**
 * Discriminator for a single <code>display_block</code> content block. Adding a variant requires
 * coordinated changes in the frontend renderer.
 */
@JsonSerialize(using = LLMObsContentBlockType.LLMObsContentBlockTypeSerializer.class)
public class LLMObsContentBlockType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("markdown", "header", "text", "json", "image", "widget", "llmobs_trace"));

  public static final LLMObsContentBlockType MARKDOWN = new LLMObsContentBlockType("markdown");
  public static final LLMObsContentBlockType HEADER = new LLMObsContentBlockType("header");
  public static final LLMObsContentBlockType TEXT = new LLMObsContentBlockType("text");
  public static final LLMObsContentBlockType JSON = new LLMObsContentBlockType("json");
  public static final LLMObsContentBlockType IMAGE = new LLMObsContentBlockType("image");
  public static final LLMObsContentBlockType WIDGET = new LLMObsContentBlockType("widget");
  public static final LLMObsContentBlockType LLMOBS_TRACE =
      new LLMObsContentBlockType("llmobs_trace");

  LLMObsContentBlockType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsContentBlockTypeSerializer
      extends StdSerializer<LLMObsContentBlockType> {
    public LLMObsContentBlockTypeSerializer(Class<LLMObsContentBlockType> t) {
      super(t);
    }

    public LLMObsContentBlockTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsContentBlockType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsContentBlockType fromValue(String value) {
    return new LLMObsContentBlockType(value);
  }
}
