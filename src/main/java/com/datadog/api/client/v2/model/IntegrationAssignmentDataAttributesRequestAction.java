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

/** Action to perform on the assignment. Can be "assign" or "un_assign". */
@JsonSerialize(
    using =
        IntegrationAssignmentDataAttributesRequestAction
            .IntegrationAssignmentDataAttributesRequestActionSerializer.class)
public class IntegrationAssignmentDataAttributesRequestAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("assign", "un_assign"));

  public static final IntegrationAssignmentDataAttributesRequestAction ASSIGN =
      new IntegrationAssignmentDataAttributesRequestAction("assign");
  public static final IntegrationAssignmentDataAttributesRequestAction UN_ASSIGN =
      new IntegrationAssignmentDataAttributesRequestAction("un_assign");

  IntegrationAssignmentDataAttributesRequestAction(String value) {
    super(value, allowedValues);
  }

  public static class IntegrationAssignmentDataAttributesRequestActionSerializer
      extends StdSerializer<IntegrationAssignmentDataAttributesRequestAction> {
    public IntegrationAssignmentDataAttributesRequestActionSerializer(
        Class<IntegrationAssignmentDataAttributesRequestAction> t) {
      super(t);
    }

    public IntegrationAssignmentDataAttributesRequestActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IntegrationAssignmentDataAttributesRequestAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IntegrationAssignmentDataAttributesRequestAction fromValue(String value) {
    return new IntegrationAssignmentDataAttributesRequestAction(value);
  }
}
