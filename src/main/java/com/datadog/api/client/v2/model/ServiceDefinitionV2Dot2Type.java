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

/** The type of service. */
@JsonSerialize(using = ServiceDefinitionV2Dot2Type.ServiceDefinitionV2Dot2TypeSerializer.class)
public class ServiceDefinitionV2Dot2Type extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("web", "db", "cache", "function", "browser", "mobile", "custom"));

  public static final ServiceDefinitionV2Dot2Type WEB = new ServiceDefinitionV2Dot2Type("web");
  public static final ServiceDefinitionV2Dot2Type DB = new ServiceDefinitionV2Dot2Type("db");
  public static final ServiceDefinitionV2Dot2Type CACHE = new ServiceDefinitionV2Dot2Type("cache");
  public static final ServiceDefinitionV2Dot2Type FUNCTION =
      new ServiceDefinitionV2Dot2Type("function");
  public static final ServiceDefinitionV2Dot2Type BROSWER =
      new ServiceDefinitionV2Dot2Type("browser");
  public static final ServiceDefinitionV2Dot2Type MOBILE =
      new ServiceDefinitionV2Dot2Type("mobile");
  public static final ServiceDefinitionV2Dot2Type CUSTOM =
      new ServiceDefinitionV2Dot2Type("custom");

  ServiceDefinitionV2Dot2Type(String value) {
    super(value, allowedValues);
  }

  public static class ServiceDefinitionV2Dot2TypeSerializer
      extends StdSerializer<ServiceDefinitionV2Dot2Type> {
    public ServiceDefinitionV2Dot2TypeSerializer(Class<ServiceDefinitionV2Dot2Type> t) {
      super(t);
    }

    public ServiceDefinitionV2Dot2TypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2Dot2Type value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceDefinitionV2Dot2Type fromValue(String value) {
    return new ServiceDefinitionV2Dot2Type(value);
  }
}
