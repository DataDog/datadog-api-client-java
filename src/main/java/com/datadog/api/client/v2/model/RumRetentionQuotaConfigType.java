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

/** The type of the resource, always <code>rum_quota_config</code>. */
@JsonSerialize(using = RumRetentionQuotaConfigType.RumRetentionQuotaConfigTypeSerializer.class)
public class RumRetentionQuotaConfigType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_quota_config"));

  public static final RumRetentionQuotaConfigType RUM_QUOTA_CONFIG =
      new RumRetentionQuotaConfigType("rum_quota_config");

  RumRetentionQuotaConfigType(String value) {
    super(value, allowedValues);
  }

  public static class RumRetentionQuotaConfigTypeSerializer
      extends StdSerializer<RumRetentionQuotaConfigType> {
    public RumRetentionQuotaConfigTypeSerializer(Class<RumRetentionQuotaConfigType> t) {
      super(t);
    }

    public RumRetentionQuotaConfigTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRetentionQuotaConfigType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRetentionQuotaConfigType fromValue(String value) {
    return new RumRetentionQuotaConfigType(value);
  }
}
