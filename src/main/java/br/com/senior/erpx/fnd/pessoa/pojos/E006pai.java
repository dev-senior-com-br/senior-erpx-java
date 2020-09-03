/*
 * Pessoa
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.11.0
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.pessoa.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E006pai
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-03T13:41:01.573Z")



public class E006pai {
  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("visEnt")
  private Boolean visEnt = null;

  @SerializedName("paiDir")
  private Integer paiDir = null;

  @SerializedName("paiSis")
  private Integer paiSis = null;

  @SerializedName("merSul")
  private Boolean merSul = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("nomPai")
  private String nomPai = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("codPai")
  private String codPai = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("usuger")
  private String usuger = null;

  public E006pai usualt(String usualt) {
    this.usualt = usualt;
    return this;
  }

   /**
   * 
   * @return usualt
  **/
  @ApiModelProperty(value = "")
  public String getUsualt() {
    return usualt;
  }

  public void setUsualt(String usualt) {
    this.usualt = usualt;
  }

  public E006pai excluido(Boolean excluido) {
    this.excluido = excluido;
    return this;
  }

   /**
   * Indica se o registro foi excluído
   * @return excluido
  **/
  @ApiModelProperty(value = "Indica se o registro foi excluído")
  public Boolean isExcluido() {
    return excluido;
  }

  public void setExcluido(Boolean excluido) {
    this.excluido = excluido;
  }

  public E006pai visEnt(Boolean visEnt) {
    this.visEnt = visEnt;
    return this;
  }

   /**
   * Visto entrada
   * @return visEnt
  **/
  @ApiModelProperty(value = "Visto entrada")
  public Boolean isVisEnt() {
    return visEnt;
  }

  public void setVisEnt(Boolean visEnt) {
    this.visEnt = visEnt;
  }

  public E006pai paiDir(Integer paiDir) {
    this.paiDir = paiDir;
    return this;
  }

   /**
   * Código do país na DIRF
   * @return paiDir
  **/
  @ApiModelProperty(value = "Código do país na DIRF")
  public Integer getPaiDir() {
    return paiDir;
  }

  public void setPaiDir(Integer paiDir) {
    this.paiDir = paiDir;
  }

  public E006pai paiSis(Integer paiSis) {
    this.paiSis = paiSis;
    return this;
  }

   /**
   * País Siscomex/Siscoserv
   * @return paiSis
  **/
  @ApiModelProperty(value = "País Siscomex/Siscoserv")
  public Integer getPaiSis() {
    return paiSis;
  }

  public void setPaiSis(Integer paiSis) {
    this.paiSis = paiSis;
  }

  public E006pai merSul(Boolean merSul) {
    this.merSul = merSul;
    return this;
  }

   /**
   * Mercosul
   * @return merSul
  **/
  @ApiModelProperty(value = "Mercosul")
  public Boolean isMerSul() {
    return merSul;
  }

  public void setMerSul(Boolean merSul) {
    this.merSul = merSul;
  }

  public E006pai dthger(OffsetDateTime dthger) {
    this.dthger = dthger;
    return this;
  }

   /**
   * 
   * @return dthger
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthger() {
    return dthger;
  }

  public void setDthger(OffsetDateTime dthger) {
    this.dthger = dthger;
  }

  public E006pai nomPai(String nomPai) {
    this.nomPai = nomPai;
    return this;
  }

   /**
   * Nome
   * @return nomPai
  **/
  @ApiModelProperty(value = "Nome")
  public String getNomPai() {
    return nomPai;
  }

  public void setNomPai(String nomPai) {
    this.nomPai = nomPai;
  }

  public E006pai dthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
    return this;
  }

   /**
   * 
   * @return dthalt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthalt() {
    return dthalt;
  }

  public void setDthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
  }

  public E006pai codPai(String codPai) {
    this.codPai = codPai;
    return this;
  }

   /**
   * Código
   * @return codPai
  **/
  @ApiModelProperty(value = "Código")
  public String getCodPai() {
    return codPai;
  }

  public void setCodPai(String codPai) {
    this.codPai = codPai;
  }

  public E006pai id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public E006pai usuger(String usuger) {
    this.usuger = usuger;
    return this;
  }

   /**
   * 
   * @return usuger
  **/
  @ApiModelProperty(value = "")
  public String getUsuger() {
    return usuger;
  }

  public void setUsuger(String usuger) {
    this.usuger = usuger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E006pai e006pai = (E006pai) o;
    return Objects.equals(this.usualt, e006pai.usualt) &&
        Objects.equals(this.excluido, e006pai.excluido) &&
        Objects.equals(this.visEnt, e006pai.visEnt) &&
        Objects.equals(this.paiDir, e006pai.paiDir) &&
        Objects.equals(this.paiSis, e006pai.paiSis) &&
        Objects.equals(this.merSul, e006pai.merSul) &&
        Objects.equals(this.dthger, e006pai.dthger) &&
        Objects.equals(this.nomPai, e006pai.nomPai) &&
        Objects.equals(this.dthalt, e006pai.dthalt) &&
        Objects.equals(this.codPai, e006pai.codPai) &&
        Objects.equals(this.id, e006pai.id) &&
        Objects.equals(this.usuger, e006pai.usuger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usualt, excluido, visEnt, paiDir, paiSis, merSul, dthger, nomPai, dthalt, codPai, id, usuger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E006pai {\n");
    
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    visEnt: ").append(toIndentedString(visEnt)).append("\n");
    sb.append("    paiDir: ").append(toIndentedString(paiDir)).append("\n");
    sb.append("    paiSis: ").append(toIndentedString(paiSis)).append("\n");
    sb.append("    merSul: ").append(toIndentedString(merSul)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    nomPai: ").append(toIndentedString(nomPai)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    codPai: ").append(toIndentedString(codPai)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
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

