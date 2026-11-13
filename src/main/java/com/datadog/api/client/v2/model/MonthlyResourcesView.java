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

/** Whether to return billable resources or the full monthly resource breakdown. */
@JsonSerialize(using = MonthlyResourcesView.MonthlyResourcesViewSerializer.class)
public class MonthlyResourcesView extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("billable", "all"));

  public static final MonthlyResourcesView BILLABLE = new MonthlyResourcesView("billable");
  public static final MonthlyResourcesView ALL = new MonthlyResourcesView("all");

  MonthlyResourcesView(String value) {
    super(value, allowedValues);
  }

  public static class MonthlyResourcesViewSerializer extends StdSerializer<MonthlyResourcesView> {
    public MonthlyResourcesViewSerializer(Class<MonthlyResourcesView> t) {
      super(t);
    }

    public MonthlyResourcesViewSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonthlyResourcesView value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonthlyResourcesView fromValue(String value) {
    return new MonthlyResourcesView(value);
  }
}
