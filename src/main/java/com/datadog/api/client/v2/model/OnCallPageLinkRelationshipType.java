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

/** How the parent resource relates to the child resource. */
@JsonSerialize(
    using = OnCallPageLinkRelationshipType.OnCallPageLinkRelationshipTypeSerializer.class)
public class OnCallPageLinkRelationshipType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "relates_to",
              "causes",
              "blocks",
              "duplicates",
              "parent_of",
              "successor_of",
              "escalates_to",
              "pages"));

  public static final OnCallPageLinkRelationshipType RELATES_TO =
      new OnCallPageLinkRelationshipType("relates_to");
  public static final OnCallPageLinkRelationshipType CAUSES =
      new OnCallPageLinkRelationshipType("causes");
  public static final OnCallPageLinkRelationshipType BLOCKS =
      new OnCallPageLinkRelationshipType("blocks");
  public static final OnCallPageLinkRelationshipType DUPLICATES =
      new OnCallPageLinkRelationshipType("duplicates");
  public static final OnCallPageLinkRelationshipType PARENT_OF =
      new OnCallPageLinkRelationshipType("parent_of");
  public static final OnCallPageLinkRelationshipType SUCCESSOR_OF =
      new OnCallPageLinkRelationshipType("successor_of");
  public static final OnCallPageLinkRelationshipType ESCALATES_TO =
      new OnCallPageLinkRelationshipType("escalates_to");
  public static final OnCallPageLinkRelationshipType PAGES =
      new OnCallPageLinkRelationshipType("pages");

  OnCallPageLinkRelationshipType(String value) {
    super(value, allowedValues);
  }

  public static class OnCallPageLinkRelationshipTypeSerializer
      extends StdSerializer<OnCallPageLinkRelationshipType> {
    public OnCallPageLinkRelationshipTypeSerializer(Class<OnCallPageLinkRelationshipType> t) {
      super(t);
    }

    public OnCallPageLinkRelationshipTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnCallPageLinkRelationshipType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnCallPageLinkRelationshipType fromValue(String value) {
    return new OnCallPageLinkRelationshipType(value);
  }
}
