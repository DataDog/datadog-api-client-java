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

/** Source of the data backing this metric. */
@JsonSerialize(
    using =
        ExperimentsCreateMetricV2RequestDataAttributesDataSourceType
            .ExperimentsCreateMetricV2RequestDataAttributesDataSourceTypeSerializer.class)
public class ExperimentsCreateMetricV2RequestDataAttributesDataSourceType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("DATADOG", "DATADOG_REFERENCE_TABLE", "CUSTOMER_WAREHOUSE"));

  public static final ExperimentsCreateMetricV2RequestDataAttributesDataSourceType DATADOG =
      new ExperimentsCreateMetricV2RequestDataAttributesDataSourceType("DATADOG");
  public static final ExperimentsCreateMetricV2RequestDataAttributesDataSourceType
      DATADOG_REFERENCE_TABLE =
          new ExperimentsCreateMetricV2RequestDataAttributesDataSourceType(
              "DATADOG_REFERENCE_TABLE");
  public static final ExperimentsCreateMetricV2RequestDataAttributesDataSourceType
      CUSTOMER_WAREHOUSE =
          new ExperimentsCreateMetricV2RequestDataAttributesDataSourceType("CUSTOMER_WAREHOUSE");

  ExperimentsCreateMetricV2RequestDataAttributesDataSourceType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsCreateMetricV2RequestDataAttributesDataSourceTypeSerializer
      extends StdSerializer<ExperimentsCreateMetricV2RequestDataAttributesDataSourceType> {
    public ExperimentsCreateMetricV2RequestDataAttributesDataSourceTypeSerializer(
        Class<ExperimentsCreateMetricV2RequestDataAttributesDataSourceType> t) {
      super(t);
    }

    public ExperimentsCreateMetricV2RequestDataAttributesDataSourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsCreateMetricV2RequestDataAttributesDataSourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsCreateMetricV2RequestDataAttributesDataSourceType fromValue(
      String value) {
    return new ExperimentsCreateMetricV2RequestDataAttributesDataSourceType(value);
  }
}
