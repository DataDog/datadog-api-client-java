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

/** Status of a Synthetic test result. */
@JsonSerialize(using = SyntheticsTestResultStatus.SyntheticsTestResultStatusSerializer.class)
public class SyntheticsTestResultStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("passed", "failed", "no_data"));

  public static final SyntheticsTestResultStatus PASSED = new SyntheticsTestResultStatus("passed");
  public static final SyntheticsTestResultStatus FAILED = new SyntheticsTestResultStatus("failed");
  public static final SyntheticsTestResultStatus NO_DATA =
      new SyntheticsTestResultStatus("no_data");

  SyntheticsTestResultStatus(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestResultStatusSerializer
      extends StdSerializer<SyntheticsTestResultStatus> {
    public SyntheticsTestResultStatusSerializer(Class<SyntheticsTestResultStatus> t) {
      super(t);
    }

    public SyntheticsTestResultStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestResultStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestResultStatus fromValue(String value) {
    return new SyntheticsTestResultStatus(value);
  }
}
