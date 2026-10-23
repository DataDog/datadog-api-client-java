/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = TeamHierarchyMembersPage.TeamHierarchyMembersPageDeserializer.class)
@JsonSerialize(using = TeamHierarchyMembersPage.TeamHierarchyMembersPageSerializer.class)
public class TeamHierarchyMembersPage extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TeamHierarchyMembersPage.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TeamHierarchyMembersPageSerializer
      extends StdSerializer<TeamHierarchyMembersPage> {
    public TeamHierarchyMembersPageSerializer(Class<TeamHierarchyMembersPage> t) {
      super(t);
    }

    public TeamHierarchyMembersPageSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamHierarchyMembersPage value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TeamHierarchyMembersPageDeserializer
      extends StdDeserializer<TeamHierarchyMembersPage> {
    public TeamHierarchyMembersPageDeserializer() {
      this(TeamHierarchyMembersPage.class);
    }

    public TeamHierarchyMembersPageDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TeamHierarchyMembersPage deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TeamHierarchyMembersOffsetPage
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TeamHierarchyMembersOffsetPage.class.equals(Integer.class)
            || TeamHierarchyMembersOffsetPage.class.equals(Long.class)
            || TeamHierarchyMembersOffsetPage.class.equals(Float.class)
            || TeamHierarchyMembersOffsetPage.class.equals(Double.class)
            || TeamHierarchyMembersOffsetPage.class.equals(Boolean.class)
            || TeamHierarchyMembersOffsetPage.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TeamHierarchyMembersOffsetPage.class.equals(Integer.class)
                        || TeamHierarchyMembersOffsetPage.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TeamHierarchyMembersOffsetPage.class.equals(Float.class)
                        || TeamHierarchyMembersOffsetPage.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TeamHierarchyMembersOffsetPage.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TeamHierarchyMembersOffsetPage.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TeamHierarchyMembersOffsetPage.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TeamHierarchyMembersOffsetPage) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TeamHierarchyMembersOffsetPage'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TeamHierarchyMembersOffsetPage'", e);
      }

      // deserialize TeamHierarchyMembersNumberPage
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TeamHierarchyMembersNumberPage.class.equals(Integer.class)
            || TeamHierarchyMembersNumberPage.class.equals(Long.class)
            || TeamHierarchyMembersNumberPage.class.equals(Float.class)
            || TeamHierarchyMembersNumberPage.class.equals(Double.class)
            || TeamHierarchyMembersNumberPage.class.equals(Boolean.class)
            || TeamHierarchyMembersNumberPage.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TeamHierarchyMembersNumberPage.class.equals(Integer.class)
                        || TeamHierarchyMembersNumberPage.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TeamHierarchyMembersNumberPage.class.equals(Float.class)
                        || TeamHierarchyMembersNumberPage.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TeamHierarchyMembersNumberPage.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TeamHierarchyMembersNumberPage.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TeamHierarchyMembersNumberPage.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TeamHierarchyMembersNumberPage) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TeamHierarchyMembersNumberPage'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TeamHierarchyMembersNumberPage'", e);
      }

      TeamHierarchyMembersPage ret = new TeamHierarchyMembersPage();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public TeamHierarchyMembersPage getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TeamHierarchyMembersPage cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TeamHierarchyMembersPage() {
    super("oneOf", Boolean.FALSE);
  }

  public TeamHierarchyMembersPage(TeamHierarchyMembersOffsetPage o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TeamHierarchyMembersPage(TeamHierarchyMembersNumberPage o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TeamHierarchyMembersOffsetPage", new GenericType<TeamHierarchyMembersOffsetPage>() {});
    schemas.put(
        "TeamHierarchyMembersNumberPage", new GenericType<TeamHierarchyMembersNumberPage>() {});
    JSON.registerDescendants(TeamHierarchyMembersPage.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TeamHierarchyMembersPage.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TeamHierarchyMembersOffsetPage, TeamHierarchyMembersNumberPage
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TeamHierarchyMembersOffsetPage.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TeamHierarchyMembersNumberPage.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TeamHierarchyMembersOffsetPage,"
            + " TeamHierarchyMembersNumberPage");
  }

  /**
   * Get the actual instance, which can be the following: TeamHierarchyMembersOffsetPage,
   * TeamHierarchyMembersNumberPage
   *
   * @return The actual instance (TeamHierarchyMembersOffsetPage, TeamHierarchyMembersNumberPage)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TeamHierarchyMembersOffsetPage`. If the actual instance is not
   * `TeamHierarchyMembersOffsetPage`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TeamHierarchyMembersOffsetPage`
   * @throws ClassCastException if the instance is not `TeamHierarchyMembersOffsetPage`
   */
  public TeamHierarchyMembersOffsetPage getTeamHierarchyMembersOffsetPage()
      throws ClassCastException {
    return (TeamHierarchyMembersOffsetPage) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TeamHierarchyMembersNumberPage`. If the actual instance is not
   * `TeamHierarchyMembersNumberPage`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TeamHierarchyMembersNumberPage`
   * @throws ClassCastException if the instance is not `TeamHierarchyMembersNumberPage`
   */
  public TeamHierarchyMembersNumberPage getTeamHierarchyMembersNumberPage()
      throws ClassCastException {
    return (TeamHierarchyMembersNumberPage) super.getActualInstance();
  }
}
