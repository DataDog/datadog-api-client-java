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

/** The type of a resource linked to a page. */
@JsonSerialize(using = OnCallPageLinkEntityType.OnCallPageLinkEntityTypeSerializer.class)
public class OnCallPageLinkEntityType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("case", "incident", "page", "agent_conversation"));

  public static final OnCallPageLinkEntityType CASE = new OnCallPageLinkEntityType("case");
  public static final OnCallPageLinkEntityType INCIDENT = new OnCallPageLinkEntityType("incident");
  public static final OnCallPageLinkEntityType PAGE = new OnCallPageLinkEntityType("page");
  public static final OnCallPageLinkEntityType AGENT_CONVERSATION =
      new OnCallPageLinkEntityType("agent_conversation");

  OnCallPageLinkEntityType(String value) {
    super(value, allowedValues);
  }

  public static class OnCallPageLinkEntityTypeSerializer
      extends StdSerializer<OnCallPageLinkEntityType> {
    public OnCallPageLinkEntityTypeSerializer(Class<OnCallPageLinkEntityType> t) {
      super(t);
    }

    public OnCallPageLinkEntityTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnCallPageLinkEntityType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnCallPageLinkEntityType fromValue(String value) {
    return new OnCallPageLinkEntityType(value);
  }
}
