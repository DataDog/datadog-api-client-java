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

/**
 * The type of scope the retention quota configuration applies to. <code>application</code> is the
 * only supported scope type.
 */
@JsonSerialize(using = RUMRetentionQuotaScopeType.RUMRetentionQuotaScopeTypeSerializer.class)
public class RUMRetentionQuotaScopeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("application"));

  public static final RUMRetentionQuotaScopeType APPLICATION =
      new RUMRetentionQuotaScopeType("application");

  RUMRetentionQuotaScopeType(String value) {
    super(value, allowedValues);
  }

  public static class RUMRetentionQuotaScopeTypeSerializer
      extends StdSerializer<RUMRetentionQuotaScopeType> {
    public RUMRetentionQuotaScopeTypeSerializer(Class<RUMRetentionQuotaScopeType> t) {
      super(t);
    }

    public RUMRetentionQuotaScopeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMRetentionQuotaScopeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMRetentionQuotaScopeType fromValue(String value) {
    return new RUMRetentionQuotaScopeType(value);
  }
}
