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

/** Type of the Synthetic test result resource, <code>result</code>. */
@JsonSerialize(using = SyntheticsTestResultType.SyntheticsTestResultTypeSerializer.class)
public class SyntheticsTestResultType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("result"));

  public static final SyntheticsTestResultType RESULT = new SyntheticsTestResultType("result");

  SyntheticsTestResultType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestResultTypeSerializer
      extends StdSerializer<SyntheticsTestResultType> {
    public SyntheticsTestResultTypeSerializer(Class<SyntheticsTestResultType> t) {
      super(t);
    }

    public SyntheticsTestResultTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestResultType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestResultType fromValue(String value) {
    return new SyntheticsTestResultType(value);
  }
}
