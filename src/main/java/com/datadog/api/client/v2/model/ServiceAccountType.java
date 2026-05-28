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

/** Service account resource type. */
@JsonSerialize(using = ServiceAccountType.ServiceAccountTypeSerializer.class)
public class ServiceAccountType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("service_account"));

  public static final ServiceAccountType SERVICE_ACCOUNT =
      new ServiceAccountType("service_account");

  ServiceAccountType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceAccountTypeSerializer extends StdSerializer<ServiceAccountType> {
    public ServiceAccountTypeSerializer(Class<ServiceAccountType> t) {
      super(t);
    }

    public ServiceAccountTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ServiceAccountType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceAccountType fromValue(String value) {
    return new ServiceAccountType(value);
  }
}
