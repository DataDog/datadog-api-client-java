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
 * The type of the ownership inference resource. The value should always be <code>
 * ownership_inference</code>.
 */
@JsonSerialize(using = OwnershipInferenceType.OwnershipInferenceTypeSerializer.class)
public class OwnershipInferenceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ownership_inference"));

  public static final OwnershipInferenceType OWNERSHIP_INFERENCE =
      new OwnershipInferenceType("ownership_inference");

  OwnershipInferenceType(String value) {
    super(value, allowedValues);
  }

  public static class OwnershipInferenceTypeSerializer
      extends StdSerializer<OwnershipInferenceType> {
    public OwnershipInferenceTypeSerializer(Class<OwnershipInferenceType> t) {
      super(t);
    }

    public OwnershipInferenceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OwnershipInferenceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OwnershipInferenceType fromValue(String value) {
    return new OwnershipInferenceType(value);
  }
}
