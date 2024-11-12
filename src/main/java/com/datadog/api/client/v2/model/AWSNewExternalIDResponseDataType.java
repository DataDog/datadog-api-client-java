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

/** The <code>AWSNewExternalIDResponseData</code> <code>type</code>. */
@JsonSerialize(
    using = AWSNewExternalIDResponseDataType.AWSNewExternalIDResponseDataTypeSerializer.class)
public class AWSNewExternalIDResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("external_id"));

  public static final AWSNewExternalIDResponseDataType EXTERNAL_ID =
      new AWSNewExternalIDResponseDataType("external_id");

  AWSNewExternalIDResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class AWSNewExternalIDResponseDataTypeSerializer
      extends StdSerializer<AWSNewExternalIDResponseDataType> {
    public AWSNewExternalIDResponseDataTypeSerializer(Class<AWSNewExternalIDResponseDataType> t) {
      super(t);
    }

    public AWSNewExternalIDResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AWSNewExternalIDResponseDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AWSNewExternalIDResponseDataType fromValue(String value) {
    return new AWSNewExternalIDResponseDataType(value);
  }
}
