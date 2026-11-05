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

/** Proposed operation for preview. Write endpoints infer it from the HTTP method. */
@JsonSerialize(
    using =
        AiGatewayCaptureCreateRequestDataAttributesOperation
            .AiGatewayCaptureCreateRequestDataAttributesOperationSerializer.class)
public class AiGatewayCaptureCreateRequestDataAttributesOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("create", "replace", "delete"));

  public static final AiGatewayCaptureCreateRequestDataAttributesOperation CREATE =
      new AiGatewayCaptureCreateRequestDataAttributesOperation("create");
  public static final AiGatewayCaptureCreateRequestDataAttributesOperation REPLACE =
      new AiGatewayCaptureCreateRequestDataAttributesOperation("replace");
  public static final AiGatewayCaptureCreateRequestDataAttributesOperation DELETE =
      new AiGatewayCaptureCreateRequestDataAttributesOperation("delete");

  AiGatewayCaptureCreateRequestDataAttributesOperation(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureCreateRequestDataAttributesOperationSerializer
      extends StdSerializer<AiGatewayCaptureCreateRequestDataAttributesOperation> {
    public AiGatewayCaptureCreateRequestDataAttributesOperationSerializer(
        Class<AiGatewayCaptureCreateRequestDataAttributesOperation> t) {
      super(t);
    }

    public AiGatewayCaptureCreateRequestDataAttributesOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureCreateRequestDataAttributesOperation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureCreateRequestDataAttributesOperation fromValue(String value) {
    return new AiGatewayCaptureCreateRequestDataAttributesOperation(value);
  }
}
