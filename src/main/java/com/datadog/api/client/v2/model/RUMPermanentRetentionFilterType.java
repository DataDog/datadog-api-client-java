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
 * The type of the resource. The value should always be <code>permanent_retention_filters</code>.
 */
@JsonSerialize(
    using = RUMPermanentRetentionFilterType.RUMPermanentRetentionFilterTypeSerializer.class)
public class RUMPermanentRetentionFilterType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("permanent_retention_filters"));

  public static final RUMPermanentRetentionFilterType PERMANENT_RETENTION_FILTERS =
      new RUMPermanentRetentionFilterType("permanent_retention_filters");

  RUMPermanentRetentionFilterType(String value) {
    super(value, allowedValues);
  }

  public static class RUMPermanentRetentionFilterTypeSerializer
      extends StdSerializer<RUMPermanentRetentionFilterType> {
    public RUMPermanentRetentionFilterTypeSerializer(Class<RUMPermanentRetentionFilterType> t) {
      super(t);
    }

    public RUMPermanentRetentionFilterTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMPermanentRetentionFilterType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMPermanentRetentionFilterType fromValue(String value) {
    return new RUMPermanentRetentionFilterType(value);
  }
}
