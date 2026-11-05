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
        AiGatewayCaptureUpdateRequestDataAttributesOperation
            .AiGatewayCaptureUpdateRequestDataAttributesOperationSerializer.class)
public class AiGatewayCaptureUpdateRequestDataAttributesOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("create", "replace", "delete"));

  public static final AiGatewayCaptureUpdateRequestDataAttributesOperation CREATE =
      new AiGatewayCaptureUpdateRequestDataAttributesOperation("create");
  public static final AiGatewayCaptureUpdateRequestDataAttributesOperation REPLACE =
      new AiGatewayCaptureUpdateRequestDataAttributesOperation("replace");
  public static final AiGatewayCaptureUpdateRequestDataAttributesOperation DELETE =
      new AiGatewayCaptureUpdateRequestDataAttributesOperation("delete");

  AiGatewayCaptureUpdateRequestDataAttributesOperation(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureUpdateRequestDataAttributesOperationSerializer
      extends StdSerializer<AiGatewayCaptureUpdateRequestDataAttributesOperation> {
    public AiGatewayCaptureUpdateRequestDataAttributesOperationSerializer(
        Class<AiGatewayCaptureUpdateRequestDataAttributesOperation> t) {
      super(t);
    }

    public AiGatewayCaptureUpdateRequestDataAttributesOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureUpdateRequestDataAttributesOperation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureUpdateRequestDataAttributesOperation fromValue(String value) {
    return new AiGatewayCaptureUpdateRequestDataAttributesOperation(value);
  }
}
