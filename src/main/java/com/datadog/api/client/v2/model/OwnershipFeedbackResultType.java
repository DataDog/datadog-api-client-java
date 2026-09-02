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
 * The type of the ownership feedback result resource. The value should always be <code>
 * ownership_feedback_result</code>.
 */
@JsonSerialize(using = OwnershipFeedbackResultType.OwnershipFeedbackResultTypeSerializer.class)
public class OwnershipFeedbackResultType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ownership_feedback_result"));

  public static final OwnershipFeedbackResultType OWNERSHIP_FEEDBACK_RESULT =
      new OwnershipFeedbackResultType("ownership_feedback_result");

  OwnershipFeedbackResultType(String value) {
    super(value, allowedValues);
  }

  public static class OwnershipFeedbackResultTypeSerializer
      extends StdSerializer<OwnershipFeedbackResultType> {
    public OwnershipFeedbackResultTypeSerializer(Class<OwnershipFeedbackResultType> t) {
      super(t);
    }

    public OwnershipFeedbackResultTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OwnershipFeedbackResultType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OwnershipFeedbackResultType fromValue(String value) {
    return new OwnershipFeedbackResultType(value);
  }
}
