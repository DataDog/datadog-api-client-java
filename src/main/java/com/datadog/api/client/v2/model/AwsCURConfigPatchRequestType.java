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

/** Type of AWS CUR config Patch Request. */
@JsonSerialize(using = AwsCURConfigPatchRequestType.AwsCURConfigPatchRequestTypeSerializer.class)
public class AwsCURConfigPatchRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws_cur_config_patch_request"));

  public static final AwsCURConfigPatchRequestType AWS_CUR_CONFIG_PATCH_REQUEST =
      new AwsCURConfigPatchRequestType("aws_cur_config_patch_request");

  AwsCURConfigPatchRequestType(String value) {
    super(value, allowedValues);
  }

  public static class AwsCURConfigPatchRequestTypeSerializer
      extends StdSerializer<AwsCURConfigPatchRequestType> {
    public AwsCURConfigPatchRequestTypeSerializer(Class<AwsCURConfigPatchRequestType> t) {
      super(t);
    }

    public AwsCURConfigPatchRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AwsCURConfigPatchRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AwsCURConfigPatchRequestType fromValue(String value) {
    return new AwsCURConfigPatchRequestType(value);
  }
}
