/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The category of the link.</p>
 */
@JsonSerialize(using = AlertEventCustomAttributesLinksItemsCategory.AlertEventCustomAttributesLinksItemsCategorySerializer.class)
public class AlertEventCustomAttributesLinksItemsCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("runbook", "documentation", "dashboard", "resource"));

  public static final AlertEventCustomAttributesLinksItemsCategory RUNBOOK = new AlertEventCustomAttributesLinksItemsCategory("runbook");
  public static final AlertEventCustomAttributesLinksItemsCategory DOCUMENTATION = new AlertEventCustomAttributesLinksItemsCategory("documentation");
  public static final AlertEventCustomAttributesLinksItemsCategory DASHBOARD = new AlertEventCustomAttributesLinksItemsCategory("dashboard");
  public static final AlertEventCustomAttributesLinksItemsCategory RESOURCE = new AlertEventCustomAttributesLinksItemsCategory("resource");


  AlertEventCustomAttributesLinksItemsCategory(String value) {
    super(value, allowedValues);
  }

  public static class AlertEventCustomAttributesLinksItemsCategorySerializer extends StdSerializer<AlertEventCustomAttributesLinksItemsCategory> {
      public AlertEventCustomAttributesLinksItemsCategorySerializer(Class<AlertEventCustomAttributesLinksItemsCategory> t) {
          super(t);
      }

      public AlertEventCustomAttributesLinksItemsCategorySerializer() {
          this(null);
      }

      @Override
      public void serialize(AlertEventCustomAttributesLinksItemsCategory value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static AlertEventCustomAttributesLinksItemsCategory fromValue(String value) {
    return new AlertEventCustomAttributesLinksItemsCategory(value);
  }
}
