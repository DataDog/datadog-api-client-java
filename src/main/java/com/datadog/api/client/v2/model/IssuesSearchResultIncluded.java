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
@JsonDeserialize(using = IssuesSearchResultIncluded.IssuesSearchResultIncludedDeserializer.class)
@JsonSerialize(using = IssuesSearchResultIncluded.IssuesSearchResultIncludedSerializer.class)
public class IssuesSearchResultIncluded extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(IssuesSearchResultIncluded.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class IssuesSearchResultIncludedSerializer
      extends StdSerializer<IssuesSearchResultIncluded> {
    public IssuesSearchResultIncludedSerializer(Class<IssuesSearchResultIncluded> t) {
      super(t);
    }

    public IssuesSearchResultIncludedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssuesSearchResultIncluded value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class IssuesSearchResultIncludedDeserializer
      extends StdDeserializer<IssuesSearchResultIncluded> {
    public IssuesSearchResultIncludedDeserializer() {
      this(IssuesSearchResultIncluded.class);
    }

    public IssuesSearchResultIncludedDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IssuesSearchResultIncluded deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize Issue
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Issue.class.equals(Integer.class)
            || Issue.class.equals(Long.class)
            || Issue.class.equals(Float.class)
            || Issue.class.equals(Double.class)
            || Issue.class.equals(Boolean.class)
            || Issue.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Issue.class.equals(Integer.class) || Issue.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Issue.class.equals(Float.class) || Issue.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Issue.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (Issue.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Issue.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((Issue) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'Issue'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Issue'", e);
      }

      // deserialize Case
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Case.class.equals(Integer.class)
            || Case.class.equals(Long.class)
            || Case.class.equals(Float.class)
            || Case.class.equals(Double.class)
            || Case.class.equals(Boolean.class)
            || Case.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Case.class.equals(Integer.class) || Case.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Case.class.equals(Float.class) || Case.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Case.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (Case.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Case.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((Case) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'Case'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Case'", e);
      }

      // deserialize IssueUser
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IssueUser.class.equals(Integer.class)
            || IssueUser.class.equals(Long.class)
            || IssueUser.class.equals(Float.class)
            || IssueUser.class.equals(Double.class)
            || IssueUser.class.equals(Boolean.class)
            || IssueUser.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IssueUser.class.equals(Integer.class) || IssueUser.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IssueUser.class.equals(Float.class) || IssueUser.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IssueUser.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IssueUser.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IssueUser.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IssueUser) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IssueUser'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IssueUser'", e);
      }

      // deserialize IssueTeam
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IssueTeam.class.equals(Integer.class)
            || IssueTeam.class.equals(Long.class)
            || IssueTeam.class.equals(Float.class)
            || IssueTeam.class.equals(Double.class)
            || IssueTeam.class.equals(Boolean.class)
            || IssueTeam.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IssueTeam.class.equals(Integer.class) || IssueTeam.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IssueTeam.class.equals(Float.class) || IssueTeam.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IssueTeam.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IssueTeam.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IssueTeam.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IssueTeam) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IssueTeam'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IssueTeam'", e);
      }

      IssuesSearchResultIncluded ret = new IssuesSearchResultIncluded();
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
    public IssuesSearchResultIncluded getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "IssuesSearchResultIncluded cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public IssuesSearchResultIncluded() {
    super("oneOf", Boolean.FALSE);
  }

  public IssuesSearchResultIncluded(Issue o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IssuesSearchResultIncluded(Case o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IssuesSearchResultIncluded(IssueUser o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IssuesSearchResultIncluded(IssueTeam o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("Issue", new GenericType<Issue>() {});
    schemas.put("Case", new GenericType<Case>() {});
    schemas.put("IssueUser", new GenericType<IssueUser>() {});
    schemas.put("IssueTeam", new GenericType<IssueTeam>() {});
    JSON.registerDescendants(
        IssuesSearchResultIncluded.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IssuesSearchResultIncluded.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: Issue, Case, IssueUser, IssueTeam
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(Issue.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Case.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IssueUser.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IssueTeam.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be Issue, Case, IssueUser, IssueTeam");
  }

  /**
   * Get the actual instance, which can be the following: Issue, Case, IssueUser, IssueTeam
   *
   * @return The actual instance (Issue, Case, IssueUser, IssueTeam)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `Issue`. If the actual instance is not `Issue`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `Issue`
   * @throws ClassCastException if the instance is not `Issue`
   */
  public Issue getIssue() throws ClassCastException {
    return (Issue) super.getActualInstance();
  }

  /**
   * Get the actual instance of `Case`. If the actual instance is not `Case`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `Case`
   * @throws ClassCastException if the instance is not `Case`
   */
  public Case getCase() throws ClassCastException {
    return (Case) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IssueUser`. If the actual instance is not `IssueUser`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `IssueUser`
   * @throws ClassCastException if the instance is not `IssueUser`
   */
  public IssueUser getIssueUser() throws ClassCastException {
    return (IssueUser) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IssueTeam`. If the actual instance is not `IssueTeam`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `IssueTeam`
   * @throws ClassCastException if the instance is not `IssueTeam`
   */
  public IssueTeam getIssueTeam() throws ClassCastException {
    return (IssueTeam) super.getActualInstance();
  }
}
