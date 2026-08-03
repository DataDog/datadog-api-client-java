/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Step type used in your mobile Synthetic test.</p>
 */
@JsonSerialize(using = SyntheticsMobileStepType.SyntheticsMobileStepTypeSerializer.class)
public class SyntheticsMobileStepType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("assertElementContent", "assertScreenContains", "assertScreenLacks", "doubleTap", "extractVariable", "flick", "openDeeplink", "playSubTest", "pressBack", "restartApplication", "rotate", "scroll", "scrollToElement", "tap", "toggleWiFi", "typeText", "wait"));

  public static final SyntheticsMobileStepType ASSERTELEMENTCONTENT = new SyntheticsMobileStepType("assertElementContent");
  public static final SyntheticsMobileStepType ASSERTSCREENCONTAINS = new SyntheticsMobileStepType("assertScreenContains");
  public static final SyntheticsMobileStepType ASSERTSCREENLACKS = new SyntheticsMobileStepType("assertScreenLacks");
  public static final SyntheticsMobileStepType DOUBLETAP = new SyntheticsMobileStepType("doubleTap");
  public static final SyntheticsMobileStepType EXTRACTVARIABLE = new SyntheticsMobileStepType("extractVariable");
  public static final SyntheticsMobileStepType FLICK = new SyntheticsMobileStepType("flick");
  public static final SyntheticsMobileStepType OPENDEEPLINK = new SyntheticsMobileStepType("openDeeplink");
  public static final SyntheticsMobileStepType PLAYSUBTEST = new SyntheticsMobileStepType("playSubTest");
  public static final SyntheticsMobileStepType PRESSBACK = new SyntheticsMobileStepType("pressBack");
  public static final SyntheticsMobileStepType RESTARTAPPLICATION = new SyntheticsMobileStepType("restartApplication");
  public static final SyntheticsMobileStepType ROTATE = new SyntheticsMobileStepType("rotate");
  public static final SyntheticsMobileStepType SCROLL = new SyntheticsMobileStepType("scroll");
  public static final SyntheticsMobileStepType SCROLLTOELEMENT = new SyntheticsMobileStepType("scrollToElement");
  public static final SyntheticsMobileStepType TAP = new SyntheticsMobileStepType("tap");
  public static final SyntheticsMobileStepType TOGGLEWIFI = new SyntheticsMobileStepType("toggleWiFi");
  public static final SyntheticsMobileStepType TYPETEXT = new SyntheticsMobileStepType("typeText");
  public static final SyntheticsMobileStepType WAIT = new SyntheticsMobileStepType("wait");


  SyntheticsMobileStepType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMobileStepTypeSerializer extends StdSerializer<SyntheticsMobileStepType> {
      public SyntheticsMobileStepTypeSerializer(Class<SyntheticsMobileStepType> t) {
          super(t);
      }

      public SyntheticsMobileStepTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsMobileStepType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SyntheticsMobileStepType fromValue(String value) {
    return new SyntheticsMobileStepType(value);
  }
}
