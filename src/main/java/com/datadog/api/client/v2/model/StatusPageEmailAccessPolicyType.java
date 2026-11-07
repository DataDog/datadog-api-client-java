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

/** Status page email access policy resource type. */
@JsonSerialize(
    using = StatusPageEmailAccessPolicyType.StatusPageEmailAccessPolicyTypeSerializer.class)
public class StatusPageEmailAccessPolicyType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("email_access_policies"));

  public static final StatusPageEmailAccessPolicyType EMAIL_ACCESS_POLICIES =
      new StatusPageEmailAccessPolicyType("email_access_policies");

  StatusPageEmailAccessPolicyType(String value) {
    super(value, allowedValues);
  }

  public static class StatusPageEmailAccessPolicyTypeSerializer
      extends StdSerializer<StatusPageEmailAccessPolicyType> {
    public StatusPageEmailAccessPolicyTypeSerializer(Class<StatusPageEmailAccessPolicyType> t) {
      super(t);
    }

    public StatusPageEmailAccessPolicyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StatusPageEmailAccessPolicyType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static StatusPageEmailAccessPolicyType fromValue(String value) {
    return new StatusPageEmailAccessPolicyType(value);
  }
}
