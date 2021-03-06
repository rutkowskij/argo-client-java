/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.HDFSConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HDFSArtifact
 */

public class HDFSArtifact {
  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force;

  public static final String SERIALIZED_NAME_H_D_F_S_CONFIG = "hDFSConfig";
  @SerializedName(SERIALIZED_NAME_H_D_F_S_CONFIG)
  private HDFSConfig hDFSConfig;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public HDFSArtifact force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * Get force
   * @return force
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  public HDFSArtifact hDFSConfig(HDFSConfig hDFSConfig) {
    
    this.hDFSConfig = hDFSConfig;
    return this;
  }

   /**
   * Get hDFSConfig
   * @return hDFSConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HDFSConfig gethDFSConfig() {
    return hDFSConfig;
  }


  public void sethDFSConfig(HDFSConfig hDFSConfig) {
    this.hDFSConfig = hDFSConfig;
  }


  public HDFSArtifact path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HDFSArtifact hdFSArtifact = (HDFSArtifact) o;
    return Objects.equals(this.force, hdFSArtifact.force) &&
        Objects.equals(this.hDFSConfig, hdFSArtifact.hDFSConfig) &&
        Objects.equals(this.path, hdFSArtifact.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, hDFSConfig, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HDFSArtifact {\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    hDFSConfig: ").append(toIndentedString(hDFSConfig)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

