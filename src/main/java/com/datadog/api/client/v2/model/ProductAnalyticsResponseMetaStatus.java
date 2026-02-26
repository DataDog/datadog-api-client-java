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

/** */
@JsonSerialize(
    using = ProductAnalyticsResponseMetaStatus.ProductAnalyticsResponseMetaStatusSerializer.class)
public class ProductAnalyticsResponseMetaStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("done", "running", "timeout"));

  public static final ProductAnalyticsResponseMetaStatus DONE =
      new ProductAnalyticsResponseMetaStatus("done");
  public static final ProductAnalyticsResponseMetaStatus RUNNING =
      new ProductAnalyticsResponseMetaStatus("running");
  public static final ProductAnalyticsResponseMetaStatus TIMEOUT =
      new ProductAnalyticsResponseMetaStatus("timeout");

  ProductAnalyticsResponseMetaStatus(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsResponseMetaStatusSerializer
      extends StdSerializer<ProductAnalyticsResponseMetaStatus> {
    public ProductAnalyticsResponseMetaStatusSerializer(
        Class<ProductAnalyticsResponseMetaStatus> t) {
      super(t);
    }

    public ProductAnalyticsResponseMetaStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsResponseMetaStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsResponseMetaStatus fromValue(String value) {
    return new ProductAnalyticsResponseMetaStatus(value);
  }
}
