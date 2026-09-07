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

/** Indicates the type of asset this entity represents on a monitor. */
@JsonSerialize(using = MonitorAssetCategory.MonitorAssetCategorySerializer.class)
public class MonitorAssetCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("runbook"));

  public static final MonitorAssetCategory RUNBOOK = new MonitorAssetCategory("runbook");

  MonitorAssetCategory(String value) {
    super(value, allowedValues);
  }

  public static class MonitorAssetCategorySerializer extends StdSerializer<MonitorAssetCategory> {
    public MonitorAssetCategorySerializer(Class<MonitorAssetCategory> t) {
      super(t);
    }

    public MonitorAssetCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorAssetCategory value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorAssetCategory fromValue(String value) {
    return new MonitorAssetCategory(value);
  }
}
