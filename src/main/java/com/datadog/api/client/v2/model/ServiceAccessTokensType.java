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

/** Service access tokens resource type. */
@JsonSerialize(using = ServiceAccessTokensType.ServiceAccessTokensTypeSerializer.class)
public class ServiceAccessTokensType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("service_access_tokens"));

  public static final ServiceAccessTokensType SERVICE_ACCESS_TOKENS =
      new ServiceAccessTokensType("service_access_tokens");

  ServiceAccessTokensType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceAccessTokensTypeSerializer
      extends StdSerializer<ServiceAccessTokensType> {
    public ServiceAccessTokensTypeSerializer(Class<ServiceAccessTokensType> t) {
      super(t);
    }

    public ServiceAccessTokensTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceAccessTokensType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceAccessTokensType fromValue(String value) {
    return new ServiceAccessTokensType(value);
  }
}
