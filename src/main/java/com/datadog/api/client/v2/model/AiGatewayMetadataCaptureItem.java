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
 * An item Metadata-only capture can add to LLM Observability spans. Each is structure or a number,
 * never conversation text. <code>tool_usage</code> adds tool call and result counts; <code>
 * tool_output_size</code> adds estimated tool output tokens, total and average; <code>tool_names
 * </code> adds each tool call and result with its name, ID and type; <code>conversation_shape
 * </code> adds every message with its role and no text; <code>input_size_by_role</code> adds
 * estimated input tokens per role; <code>available_tools</code> adds the names of the tools the
 * request offered; <code>generation_settings</code> adds numeric and enumerated settings such as
 * temperature and the finish reason.
 */
@JsonSerialize(using = AiGatewayMetadataCaptureItem.AiGatewayMetadataCaptureItemSerializer.class)
public class AiGatewayMetadataCaptureItem extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "tool_usage",
              "tool_output_size",
              "tool_names",
              "conversation_shape",
              "input_size_by_role",
              "available_tools",
              "generation_settings"));

  public static final AiGatewayMetadataCaptureItem TOOL_USAGE =
      new AiGatewayMetadataCaptureItem("tool_usage");
  public static final AiGatewayMetadataCaptureItem TOOL_OUTPUT_SIZE =
      new AiGatewayMetadataCaptureItem("tool_output_size");
  public static final AiGatewayMetadataCaptureItem TOOL_NAMES =
      new AiGatewayMetadataCaptureItem("tool_names");
  public static final AiGatewayMetadataCaptureItem CONVERSATION_SHAPE =
      new AiGatewayMetadataCaptureItem("conversation_shape");
  public static final AiGatewayMetadataCaptureItem INPUT_SIZE_BY_ROLE =
      new AiGatewayMetadataCaptureItem("input_size_by_role");
  public static final AiGatewayMetadataCaptureItem AVAILABLE_TOOLS =
      new AiGatewayMetadataCaptureItem("available_tools");
  public static final AiGatewayMetadataCaptureItem GENERATION_SETTINGS =
      new AiGatewayMetadataCaptureItem("generation_settings");

  AiGatewayMetadataCaptureItem(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayMetadataCaptureItemSerializer
      extends StdSerializer<AiGatewayMetadataCaptureItem> {
    public AiGatewayMetadataCaptureItemSerializer(Class<AiGatewayMetadataCaptureItem> t) {
      super(t);
    }

    public AiGatewayMetadataCaptureItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayMetadataCaptureItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayMetadataCaptureItem fromValue(String value) {
    return new AiGatewayMetadataCaptureItem(value);
  }
}
