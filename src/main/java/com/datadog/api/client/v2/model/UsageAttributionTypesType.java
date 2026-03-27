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

/** Type of usage attribution types data. */
@JsonSerialize(using = UsageAttributionTypesType.UsageAttributionTypesTypeSerializer.class)
public class UsageAttributionTypesType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("usage_attribution_types"));

  public static final UsageAttributionTypesType USAGE_ATTRIBUTION_TYPES =
      new UsageAttributionTypesType("usage_attribution_types");

  UsageAttributionTypesType(String value) {
    super(value, allowedValues);
  }

  public static class UsageAttributionTypesTypeSerializer
      extends StdSerializer<UsageAttributionTypesType> {
    public UsageAttributionTypesTypeSerializer(Class<UsageAttributionTypesType> t) {
      super(t);
    }

    public UsageAttributionTypesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UsageAttributionTypesType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UsageAttributionTypesType fromValue(String value) {
    return new UsageAttributionTypesType(value);
  }
}
