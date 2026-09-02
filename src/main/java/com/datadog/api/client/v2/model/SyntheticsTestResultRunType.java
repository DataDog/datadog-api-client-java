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

/** The type of run for a Synthetic test result. */
@JsonSerialize(using = SyntheticsTestResultRunType.SyntheticsTestResultRunTypeSerializer.class)
public class SyntheticsTestResultRunType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("scheduled", "fast", "ci", "triggered"));

  public static final SyntheticsTestResultRunType SCHEDULED =
      new SyntheticsTestResultRunType("scheduled");
  public static final SyntheticsTestResultRunType FAST = new SyntheticsTestResultRunType("fast");
  public static final SyntheticsTestResultRunType CI = new SyntheticsTestResultRunType("ci");
  public static final SyntheticsTestResultRunType TRIGGERED =
      new SyntheticsTestResultRunType("triggered");

  SyntheticsTestResultRunType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestResultRunTypeSerializer
      extends StdSerializer<SyntheticsTestResultRunType> {
    public SyntheticsTestResultRunTypeSerializer(Class<SyntheticsTestResultRunType> t) {
      super(t);
    }

    public SyntheticsTestResultRunTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestResultRunType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestResultRunType fromValue(String value) {
    return new SyntheticsTestResultRunType(value);
  }
}
