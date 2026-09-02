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

/** The self-service resource type. */
@JsonSerialize(using = AppSelfServiceType.AppSelfServiceTypeSerializer.class)
public class AppSelfServiceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("selfService"));

  public static final AppSelfServiceType SELFSERVICE = new AppSelfServiceType("selfService");

  AppSelfServiceType(String value) {
    super(value, allowedValues);
  }

  public static class AppSelfServiceTypeSerializer extends StdSerializer<AppSelfServiceType> {
    public AppSelfServiceTypeSerializer(Class<AppSelfServiceType> t) {
      super(t);
    }

    public AppSelfServiceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AppSelfServiceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AppSelfServiceType fromValue(String value) {
    return new AppSelfServiceType(value);
  }
}
