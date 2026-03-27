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

/** Assertion operator to apply. */
@JsonSerialize(
    using = SyntheticsAssertionJSONPathOperator.SyntheticsAssertionJSONPathOperatorSerializer.class)
public class SyntheticsAssertionJSONPathOperator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("validatesJSONPath"));

  public static final SyntheticsAssertionJSONPathOperator VALIDATES_JSON_PATH =
      new SyntheticsAssertionJSONPathOperator("validatesJSONPath");

  SyntheticsAssertionJSONPathOperator(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsAssertionJSONPathOperatorSerializer
      extends StdSerializer<SyntheticsAssertionJSONPathOperator> {
    public SyntheticsAssertionJSONPathOperatorSerializer(
        Class<SyntheticsAssertionJSONPathOperator> t) {
      super(t);
    }

    public SyntheticsAssertionJSONPathOperatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAssertionJSONPathOperator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsAssertionJSONPathOperator fromValue(String value) {
    return new SyntheticsAssertionJSONPathOperator(value);
  }
}
