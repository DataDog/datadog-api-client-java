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

/** Type of the parent suite resource. */
@JsonSerialize(using = SyntheticsTestParentSuiteType.SyntheticsTestParentSuiteTypeSerializer.class)
public class SyntheticsTestParentSuiteType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("parent_suite"));

  public static final SyntheticsTestParentSuiteType PARENT_SUITE =
      new SyntheticsTestParentSuiteType("parent_suite");

  SyntheticsTestParentSuiteType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestParentSuiteTypeSerializer
      extends StdSerializer<SyntheticsTestParentSuiteType> {
    public SyntheticsTestParentSuiteTypeSerializer(Class<SyntheticsTestParentSuiteType> t) {
      super(t);
    }

    public SyntheticsTestParentSuiteTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestParentSuiteType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestParentSuiteType fromValue(String value) {
    return new SyntheticsTestParentSuiteType(value);
  }
}
