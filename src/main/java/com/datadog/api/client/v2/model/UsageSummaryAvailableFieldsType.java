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

/** Type of available-fields data. */
@JsonSerialize(
    using = UsageSummaryAvailableFieldsType.UsageSummaryAvailableFieldsTypeSerializer.class)
public class UsageSummaryAvailableFieldsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("usage_summary_available_fields"));

  public static final UsageSummaryAvailableFieldsType USAGE_SUMMARY_AVAILABLE_FIELDS =
      new UsageSummaryAvailableFieldsType("usage_summary_available_fields");

  UsageSummaryAvailableFieldsType(String value) {
    super(value, allowedValues);
  }

  public static class UsageSummaryAvailableFieldsTypeSerializer
      extends StdSerializer<UsageSummaryAvailableFieldsType> {
    public UsageSummaryAvailableFieldsTypeSerializer(Class<UsageSummaryAvailableFieldsType> t) {
      super(t);
    }

    public UsageSummaryAvailableFieldsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UsageSummaryAvailableFieldsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UsageSummaryAvailableFieldsType fromValue(String value) {
    return new UsageSummaryAvailableFieldsType(value);
  }
}
