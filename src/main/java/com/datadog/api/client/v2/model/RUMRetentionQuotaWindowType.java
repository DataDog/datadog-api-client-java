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

/** The window type over which the session limit is enforced. */
@JsonSerialize(using = RUMRetentionQuotaWindowType.RUMRetentionQuotaWindowTypeSerializer.class)
public class RUMRetentionQuotaWindowType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("daily"));

  public static final RUMRetentionQuotaWindowType DAILY = new RUMRetentionQuotaWindowType("daily");

  RUMRetentionQuotaWindowType(String value) {
    super(value, allowedValues);
  }

  public static class RUMRetentionQuotaWindowTypeSerializer
      extends StdSerializer<RUMRetentionQuotaWindowType> {
    public RUMRetentionQuotaWindowTypeSerializer(Class<RUMRetentionQuotaWindowType> t) {
      super(t);
    }

    public RUMRetentionQuotaWindowTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMRetentionQuotaWindowType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMRetentionQuotaWindowType fromValue(String value) {
    return new RUMRetentionQuotaWindowType(value);
  }
}
