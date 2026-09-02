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

/** The category of the link. */
@JsonSerialize(
    using =
        AlertEventAttributesLinksItemCategory.AlertEventAttributesLinksItemCategorySerializer.class)
public class AlertEventAttributesLinksItemCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("runbook", "documentation", "dashboard"));

  public static final AlertEventAttributesLinksItemCategory RUNBOOK =
      new AlertEventAttributesLinksItemCategory("runbook");
  public static final AlertEventAttributesLinksItemCategory DOCUMENTATION =
      new AlertEventAttributesLinksItemCategory("documentation");
  public static final AlertEventAttributesLinksItemCategory DASHBOARD =
      new AlertEventAttributesLinksItemCategory("dashboard");

  AlertEventAttributesLinksItemCategory(String value) {
    super(value, allowedValues);
  }

  public static class AlertEventAttributesLinksItemCategorySerializer
      extends StdSerializer<AlertEventAttributesLinksItemCategory> {
    public AlertEventAttributesLinksItemCategorySerializer(
        Class<AlertEventAttributesLinksItemCategory> t) {
      super(t);
    }

    public AlertEventAttributesLinksItemCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AlertEventAttributesLinksItemCategory value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AlertEventAttributesLinksItemCategory fromValue(String value) {
    return new AlertEventAttributesLinksItemCategory(value);
  }
}
