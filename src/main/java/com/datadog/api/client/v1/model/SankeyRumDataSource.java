/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Sankey widget with RUM data source. */
@JsonSerialize(using = SankeyRumDataSource.SankeyRumDataSourceSerializer.class)
public class SankeyRumDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum", "product_analytics"));

  public static final SankeyRumDataSource RUM = new SankeyRumDataSource("rum");
  public static final SankeyRumDataSource PRODUCT_ANALYTICS =
      new SankeyRumDataSource("product_analytics");

  SankeyRumDataSource(String value) {
    super(value, allowedValues);
  }

  public static class SankeyRumDataSourceSerializer extends StdSerializer<SankeyRumDataSource> {
    public SankeyRumDataSourceSerializer(Class<SankeyRumDataSource> t) {
      super(t);
    }

    public SankeyRumDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SankeyRumDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SankeyRumDataSource fromValue(String value) {
    return new SankeyRumDataSource(value);
  }
}
