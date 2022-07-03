/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** The device ID. */
@JsonSerialize(using = SyntheticsDeviceID.SyntheticsDeviceIDSerializer.class)
public class SyntheticsDeviceID {

  public static final SyntheticsDeviceID LAPTOP_LARGE = new SyntheticsDeviceID("laptop_large");
  public static final SyntheticsDeviceID TABLET = new SyntheticsDeviceID("tablet");
  public static final SyntheticsDeviceID MOBILE_SMALL = new SyntheticsDeviceID("mobile_small");
  public static final SyntheticsDeviceID CHROME_LAPTOP_LARGE =
      new SyntheticsDeviceID("chrome.laptop_large");
  public static final SyntheticsDeviceID CHROME_TABLET = new SyntheticsDeviceID("chrome.tablet");
  public static final SyntheticsDeviceID CHROME_MOBILE_SMALL =
      new SyntheticsDeviceID("chrome.mobile_small");
  public static final SyntheticsDeviceID FIREFOX_LAPTOP_LARGE =
      new SyntheticsDeviceID("firefox.laptop_large");
  public static final SyntheticsDeviceID FIREFOX_TABLET = new SyntheticsDeviceID("firefox.tablet");
  public static final SyntheticsDeviceID FIREFOX_MOBILE_SMALL =
      new SyntheticsDeviceID("firefox.mobile_small");
  public static final SyntheticsDeviceID EDGE_LAPTOP_LARGE =
      new SyntheticsDeviceID("edge.laptop_large");
  public static final SyntheticsDeviceID EDGE_TABLET = new SyntheticsDeviceID("edge.tablet");
  public static final SyntheticsDeviceID EDGE_MOBILE_SMALL =
      new SyntheticsDeviceID("edge.mobile_small");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "laptop_large",
              "tablet",
              "mobile_small",
              "chrome.laptop_large",
              "chrome.tablet",
              "chrome.mobile_small",
              "firefox.laptop_large",
              "firefox.tablet",
              "firefox.mobile_small",
              "edge.laptop_large",
              "edge.tablet",
              "edge.mobile_small"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsDeviceID(String value) {
    this.value = value;
  }

  public static class SyntheticsDeviceIDSerializer extends StdSerializer<SyntheticsDeviceID> {
    public SyntheticsDeviceIDSerializer(Class<SyntheticsDeviceID> t) {
      super(t);
    }

    public SyntheticsDeviceIDSerializer() {
      this(null);
    }

    @Override
    public void serialize(SyntheticsDeviceID value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SyntheticsDeviceID object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsDeviceID) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsDeviceID fromValue(String value) {
    return new SyntheticsDeviceID(value);
  }
}
