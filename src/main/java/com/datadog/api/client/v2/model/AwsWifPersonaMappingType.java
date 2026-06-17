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

/** Type identifier for an AWS WIF persona mapping. */
@JsonSerialize(using = AwsWifPersonaMappingType.AwsWifPersonaMappingTypeSerializer.class)
public class AwsWifPersonaMappingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws_wif_config"));

  public static final AwsWifPersonaMappingType AWS_WIF_CONFIG =
      new AwsWifPersonaMappingType("aws_wif_config");

  AwsWifPersonaMappingType(String value) {
    super(value, allowedValues);
  }

  public static class AwsWifPersonaMappingTypeSerializer
      extends StdSerializer<AwsWifPersonaMappingType> {
    public AwsWifPersonaMappingTypeSerializer(Class<AwsWifPersonaMappingType> t) {
      super(t);
    }

    public AwsWifPersonaMappingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AwsWifPersonaMappingType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AwsWifPersonaMappingType fromValue(String value) {
    return new AwsWifPersonaMappingType(value);
  }
}
