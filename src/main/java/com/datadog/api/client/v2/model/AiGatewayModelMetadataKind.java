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

/** Primary model kind. Decision models return a choice or score instead of generated text. */
@JsonSerialize(using = AiGatewayModelMetadataKind.AiGatewayModelMetadataKindSerializer.class)
public class AiGatewayModelMetadataKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("language", "embedding", "image", "audio", "decision", "reranking"));

  public static final AiGatewayModelMetadataKind LANGUAGE =
      new AiGatewayModelMetadataKind("language");
  public static final AiGatewayModelMetadataKind EMBEDDING =
      new AiGatewayModelMetadataKind("embedding");
  public static final AiGatewayModelMetadataKind IMAGE = new AiGatewayModelMetadataKind("image");
  public static final AiGatewayModelMetadataKind AUDIO = new AiGatewayModelMetadataKind("audio");
  public static final AiGatewayModelMetadataKind DECISION =
      new AiGatewayModelMetadataKind("decision");
  public static final AiGatewayModelMetadataKind RERANKING =
      new AiGatewayModelMetadataKind("reranking");

  AiGatewayModelMetadataKind(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelMetadataKindSerializer
      extends StdSerializer<AiGatewayModelMetadataKind> {
    public AiGatewayModelMetadataKindSerializer(Class<AiGatewayModelMetadataKind> t) {
      super(t);
    }

    public AiGatewayModelMetadataKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelMetadataKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelMetadataKind fromValue(String value) {
    return new AiGatewayModelMetadataKind(value);
  }
}
