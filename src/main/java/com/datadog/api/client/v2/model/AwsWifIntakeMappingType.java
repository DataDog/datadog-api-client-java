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

/** Type identifier for an AWS WIF intake mapping. */
@JsonSerialize(using = AwsWifIntakeMappingType.AwsWifIntakeMappingTypeSerializer.class)
public class AwsWifIntakeMappingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws_wif_intake_mapping"));

  public static final AwsWifIntakeMappingType AWS_WIF_INTAKE_MAPPING =
      new AwsWifIntakeMappingType("aws_wif_intake_mapping");

  AwsWifIntakeMappingType(String value) {
    super(value, allowedValues);
  }

  public static class AwsWifIntakeMappingTypeSerializer
      extends StdSerializer<AwsWifIntakeMappingType> {
    public AwsWifIntakeMappingTypeSerializer(Class<AwsWifIntakeMappingType> t) {
      super(t);
    }

    public AwsWifIntakeMappingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AwsWifIntakeMappingType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AwsWifIntakeMappingType fromValue(String value) {
    return new AwsWifIntakeMappingType(value);
  }
}
