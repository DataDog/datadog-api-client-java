/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Condition for counting user return. */
@JsonSerialize(using = RetentionReturnCondition.RetentionReturnConditionSerializer.class)
public class RetentionReturnCondition extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("conversion_on", "conversion_on_or_after"));

  public static final RetentionReturnCondition CONVERSION_ON =
      new RetentionReturnCondition("conversion_on");
  public static final RetentionReturnCondition CONVERSION_ON_OR_AFTER =
      new RetentionReturnCondition("conversion_on_or_after");

  RetentionReturnCondition(String value) {
    super(value, allowedValues);
  }

  public static class RetentionReturnConditionSerializer
      extends StdSerializer<RetentionReturnCondition> {
    public RetentionReturnConditionSerializer(Class<RetentionReturnCondition> t) {
      super(t);
    }

    public RetentionReturnConditionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RetentionReturnCondition value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RetentionReturnCondition fromValue(String value) {
    return new RetentionReturnCondition(value);
  }
}
