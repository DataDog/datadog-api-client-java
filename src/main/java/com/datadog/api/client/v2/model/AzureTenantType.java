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

/** The definition of the <code>AzureTenant</code> object. */
@JsonSerialize(using = AzureTenantType.AzureTenantTypeSerializer.class)
public class AzureTenantType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("AzureTenant"));

  public static final AzureTenantType AZURETENANT = new AzureTenantType("AzureTenant");

  AzureTenantType(String value) {
    super(value, allowedValues);
  }

  public static class AzureTenantTypeSerializer extends StdSerializer<AzureTenantType> {
    public AzureTenantTypeSerializer(Class<AzureTenantType> t) {
      super(t);
    }

    public AzureTenantTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AzureTenantType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AzureTenantType fromValue(String value) {
    return new AzureTenantType(value);
  }
}
