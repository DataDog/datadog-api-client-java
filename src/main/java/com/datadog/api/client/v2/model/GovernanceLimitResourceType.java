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

/** Limit resource type. */
@JsonSerialize(using = GovernanceLimitResourceType.GovernanceLimitResourceTypeSerializer.class)
public class GovernanceLimitResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("limit"));

  public static final GovernanceLimitResourceType LIMIT = new GovernanceLimitResourceType("limit");

  GovernanceLimitResourceType(String value) {
    super(value, allowedValues);
  }

  public static class GovernanceLimitResourceTypeSerializer
      extends StdSerializer<GovernanceLimitResourceType> {
    public GovernanceLimitResourceTypeSerializer(Class<GovernanceLimitResourceType> t) {
      super(t);
    }

    public GovernanceLimitResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GovernanceLimitResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GovernanceLimitResourceType fromValue(String value) {
    return new GovernanceLimitResourceType(value);
  }
}
