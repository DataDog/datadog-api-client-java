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
        AiGatewayCaptureDeleteRequestDataAttributesOperation
            .AiGatewayCaptureDeleteRequestDataAttributesOperationSerializer.class)
public class AiGatewayCaptureDeleteRequestDataAttributesOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("create", "replace", "delete"));

  public static final AiGatewayCaptureDeleteRequestDataAttributesOperation CREATE =
      new AiGatewayCaptureDeleteRequestDataAttributesOperation("create");
  public static final AiGatewayCaptureDeleteRequestDataAttributesOperation REPLACE =
      new AiGatewayCaptureDeleteRequestDataAttributesOperation("replace");
  public static final AiGatewayCaptureDeleteRequestDataAttributesOperation DELETE =
      new AiGatewayCaptureDeleteRequestDataAttributesOperation("delete");

  AiGatewayCaptureDeleteRequestDataAttributesOperation(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureDeleteRequestDataAttributesOperationSerializer
      extends StdSerializer<AiGatewayCaptureDeleteRequestDataAttributesOperation> {
    public AiGatewayCaptureDeleteRequestDataAttributesOperationSerializer(
        Class<AiGatewayCaptureDeleteRequestDataAttributesOperation> t) {
      super(t);
    }

    public AiGatewayCaptureDeleteRequestDataAttributesOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureDeleteRequestDataAttributesOperation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureDeleteRequestDataAttributesOperation fromValue(String value) {
    return new AiGatewayCaptureDeleteRequestDataAttributesOperation(value);
  }
}
