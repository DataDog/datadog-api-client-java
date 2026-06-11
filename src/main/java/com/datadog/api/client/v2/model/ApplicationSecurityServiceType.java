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

/** The type of the resource. The value should always be <code>service_env</code>. */
@JsonSerialize(
    using = ApplicationSecurityServiceType.ApplicationSecurityServiceTypeSerializer.class)
public class ApplicationSecurityServiceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("service_env"));

  public static final ApplicationSecurityServiceType SERVICE_ENV =
      new ApplicationSecurityServiceType("service_env");

  ApplicationSecurityServiceType(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityServiceTypeSerializer
      extends StdSerializer<ApplicationSecurityServiceType> {
    public ApplicationSecurityServiceTypeSerializer(Class<ApplicationSecurityServiceType> t) {
      super(t);
    }

    public ApplicationSecurityServiceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityServiceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityServiceType fromValue(String value) {
    return new ApplicationSecurityServiceType(value);
  }
}
