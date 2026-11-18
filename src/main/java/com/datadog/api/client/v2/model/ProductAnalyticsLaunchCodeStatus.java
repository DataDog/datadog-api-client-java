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

/** Whether the inspected code sends the event, or attaches the property to the event. */
@JsonSerialize(
    using = ProductAnalyticsLaunchCodeStatus.ProductAnalyticsLaunchCodeStatusSerializer.class)
public class ProductAnalyticsLaunchCodeStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("found", "not_found"));

  public static final ProductAnalyticsLaunchCodeStatus FOUND =
      new ProductAnalyticsLaunchCodeStatus("found");
  public static final ProductAnalyticsLaunchCodeStatus NOT_FOUND =
      new ProductAnalyticsLaunchCodeStatus("not_found");

  ProductAnalyticsLaunchCodeStatus(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsLaunchCodeStatusSerializer
      extends StdSerializer<ProductAnalyticsLaunchCodeStatus> {
    public ProductAnalyticsLaunchCodeStatusSerializer(Class<ProductAnalyticsLaunchCodeStatus> t) {
      super(t);
    }

    public ProductAnalyticsLaunchCodeStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsLaunchCodeStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsLaunchCodeStatus fromValue(String value) {
    return new ProductAnalyticsLaunchCodeStatus(value);
  }
}
