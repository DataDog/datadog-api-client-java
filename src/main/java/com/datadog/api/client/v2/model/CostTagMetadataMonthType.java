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

/** Type of the Cloud Cost Management tag metadata month resource. */
@JsonSerialize(using = CostTagMetadataMonthType.CostTagMetadataMonthTypeSerializer.class)
public class CostTagMetadataMonthType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cost_tag_metadata_month"));

  public static final CostTagMetadataMonthType COST_TAG_METADATA_MONTH =
      new CostTagMetadataMonthType("cost_tag_metadata_month");

  CostTagMetadataMonthType(String value) {
    super(value, allowedValues);
  }

  public static class CostTagMetadataMonthTypeSerializer
      extends StdSerializer<CostTagMetadataMonthType> {
    public CostTagMetadataMonthTypeSerializer(Class<CostTagMetadataMonthType> t) {
      super(t);
    }

    public CostTagMetadataMonthTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostTagMetadataMonthType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostTagMetadataMonthType fromValue(String value) {
    return new CostTagMetadataMonthType(value);
  }
}
