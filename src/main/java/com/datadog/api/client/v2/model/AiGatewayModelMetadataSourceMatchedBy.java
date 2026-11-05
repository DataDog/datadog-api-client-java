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
 * Identifier strategy used to match the gateway catalog entry. Date-suffix and shared
 * canonical-model fallback matches produce partial metadata.
 */
@JsonSerialize(
    using =
        AiGatewayModelMetadataSourceMatchedBy.AiGatewayModelMetadataSourceMatchedBySerializer.class)
public class AiGatewayModelMetadataSourceMatchedBy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "override", "wire_id", "canonical_id", "wire_id_date_suffix", "canonical_model"));

  public static final AiGatewayModelMetadataSourceMatchedBy OVERRIDE =
      new AiGatewayModelMetadataSourceMatchedBy("override");
  public static final AiGatewayModelMetadataSourceMatchedBy WIRE_ID =
      new AiGatewayModelMetadataSourceMatchedBy("wire_id");
  public static final AiGatewayModelMetadataSourceMatchedBy CANONICAL_ID =
      new AiGatewayModelMetadataSourceMatchedBy("canonical_id");
  public static final AiGatewayModelMetadataSourceMatchedBy WIRE_ID_DATE_SUFFIX =
      new AiGatewayModelMetadataSourceMatchedBy("wire_id_date_suffix");
  public static final AiGatewayModelMetadataSourceMatchedBy CANONICAL_MODEL =
      new AiGatewayModelMetadataSourceMatchedBy("canonical_model");

  AiGatewayModelMetadataSourceMatchedBy(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelMetadataSourceMatchedBySerializer
      extends StdSerializer<AiGatewayModelMetadataSourceMatchedBy> {
    public AiGatewayModelMetadataSourceMatchedBySerializer(
        Class<AiGatewayModelMetadataSourceMatchedBy> t) {
      super(t);
    }

    public AiGatewayModelMetadataSourceMatchedBySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelMetadataSourceMatchedBy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelMetadataSourceMatchedBy fromValue(String value) {
    return new AiGatewayModelMetadataSourceMatchedBy(value);
  }
}
