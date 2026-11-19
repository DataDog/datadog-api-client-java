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

/** Type identifier for an HCP Terraform persona mapping. */
@JsonSerialize(
    using =
        TerraformCloudAuthPersonaMappingType.TerraformCloudAuthPersonaMappingTypeSerializer.class)
public class TerraformCloudAuthPersonaMappingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("terraform_cloud_auth_config"));

  public static final TerraformCloudAuthPersonaMappingType TERRAFORM_CLOUD_AUTH_CONFIG =
      new TerraformCloudAuthPersonaMappingType("terraform_cloud_auth_config");

  TerraformCloudAuthPersonaMappingType(String value) {
    super(value, allowedValues);
  }

  public static class TerraformCloudAuthPersonaMappingTypeSerializer
      extends StdSerializer<TerraformCloudAuthPersonaMappingType> {
    public TerraformCloudAuthPersonaMappingTypeSerializer(
        Class<TerraformCloudAuthPersonaMappingType> t) {
      super(t);
    }

    public TerraformCloudAuthPersonaMappingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TerraformCloudAuthPersonaMappingType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TerraformCloudAuthPersonaMappingType fromValue(String value) {
    return new TerraformCloudAuthPersonaMappingType(value);
  }
}
