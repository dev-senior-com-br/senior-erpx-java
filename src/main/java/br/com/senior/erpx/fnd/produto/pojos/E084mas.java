/*
 * Produto
 * Serviço de Produto do ERPX
 *
 * OpenAPI spec version: 1.10.0
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.produto.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.erpx.fnd.produto.pojos.E070emp;
import br.com.senior.erpx.fnd.produto.pojos.E084cma;
import br.com.senior.erpx.fnd.produto.pojos.EnumPrpMas;
import br.com.senior.erpx.fnd.produto.pojos.EnumSitReg;
import br.com.senior.erpx.fnd.produto.pojos.EnumTipMas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E084mas
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T20:54:03.759Z")



public class E084mas {
  @SerializedName("vlrInc")
  private Integer vlrInc = null;

  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("desMas")
  private String desMas = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("prpMas")
  private EnumPrpMas prpMas = null;

  @SerializedName("tipMas")
  private EnumTipMas tipMas = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("abrMas")
  private String abrMas = null;

  @SerializedName("usuger")
  private String usuger = null;

  @SerializedName("ultCod")
  private String ultCod = null;

  @SerializedName("masLiv")
  private Boolean masLiv = null;

  @SerializedName("qtdPos")
  private Integer qtdPos = null;

  @SerializedName("e070emp")
  private E070emp e070emp = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("sitMas")
  private EnumSitReg sitMas = null;

  @SerializedName("e084cma")
  private List<E084cma> e084cma = null;

  @SerializedName("codMas")
  private String codMas = null;

  public E084mas vlrInc(Integer vlrInc) {
    this.vlrInc = vlrInc;
    return this;
  }

   /**
   * Valor incremental
   * @return vlrInc
  **/
  @ApiModelProperty(value = "Valor incremental")
  public Integer getVlrInc() {
    return vlrInc;
  }

  public void setVlrInc(Integer vlrInc) {
    this.vlrInc = vlrInc;
  }

  public E084mas usualt(String usualt) {
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

  public E084mas excluido(Boolean excluido) {
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

  public E084mas desMas(String desMas) {
    this.desMas = desMas;
    return this;
  }

   /**
   * Descrição
   * @return desMas
  **/
  @ApiModelProperty(value = "Descrição")
  public String getDesMas() {
    return desMas;
  }

  public void setDesMas(String desMas) {
    this.desMas = desMas;
  }

  public E084mas dthger(OffsetDateTime dthger) {
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

  public E084mas prpMas(EnumPrpMas prpMas) {
    this.prpMas = prpMas;
    return this;
  }

   /**
   * Get prpMas
   * @return prpMas
  **/
  @ApiModelProperty(value = "")
  public EnumPrpMas getPrpMas() {
    return prpMas;
  }

  public void setPrpMas(EnumPrpMas prpMas) {
    this.prpMas = prpMas;
  }

  public E084mas tipMas(EnumTipMas tipMas) {
    this.tipMas = tipMas;
    return this;
  }

   /**
   * Get tipMas
   * @return tipMas
  **/
  @ApiModelProperty(value = "")
  public EnumTipMas getTipMas() {
    return tipMas;
  }

  public void setTipMas(EnumTipMas tipMas) {
    this.tipMas = tipMas;
  }

  public E084mas dthalt(OffsetDateTime dthalt) {
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

  public E084mas abrMas(String abrMas) {
    this.abrMas = abrMas;
    return this;
  }

   /**
   * Abreviatura
   * @return abrMas
  **/
  @ApiModelProperty(value = "Abreviatura")
  public String getAbrMas() {
    return abrMas;
  }

  public void setAbrMas(String abrMas) {
    this.abrMas = abrMas;
  }

  public E084mas usuger(String usuger) {
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

  public E084mas ultCod(String ultCod) {
    this.ultCod = ultCod;
    return this;
  }

   /**
   * Último código gerado
   * @return ultCod
  **/
  @ApiModelProperty(value = "Último código gerado")
  public String getUltCod() {
    return ultCod;
  }

  public void setUltCod(String ultCod) {
    this.ultCod = ultCod;
  }

  public E084mas masLiv(Boolean masLiv) {
    this.masLiv = masLiv;
    return this;
  }

   /**
   * Máscara livre
   * @return masLiv
  **/
  @ApiModelProperty(value = "Máscara livre")
  public Boolean isMasLiv() {
    return masLiv;
  }

  public void setMasLiv(Boolean masLiv) {
    this.masLiv = masLiv;
  }

  public E084mas qtdPos(Integer qtdPos) {
    this.qtdPos = qtdPos;
    return this;
  }

   /**
   * Quantidade de posições
   * @return qtdPos
  **/
  @ApiModelProperty(value = "Quantidade de posições")
  public Integer getQtdPos() {
    return qtdPos;
  }

  public void setQtdPos(Integer qtdPos) {
    this.qtdPos = qtdPos;
  }

  public E084mas e070emp(E070emp e070emp) {
    this.e070emp = e070emp;
    return this;
  }

   /**
   * Get e070emp
   * @return e070emp
  **/
  @ApiModelProperty(value = "")
  public E070emp getE070emp() {
    return e070emp;
  }

  public void setE070emp(E070emp e070emp) {
    this.e070emp = e070emp;
  }

  public E084mas id(UUID id) {
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

  public E084mas sitMas(EnumSitReg sitMas) {
    this.sitMas = sitMas;
    return this;
  }

   /**
   * Get sitMas
   * @return sitMas
  **/
  @ApiModelProperty(value = "")
  public EnumSitReg getSitMas() {
    return sitMas;
  }

  public void setSitMas(EnumSitReg sitMas) {
    this.sitMas = sitMas;
  }

  public E084mas e084cma(List<E084cma> e084cma) {
    this.e084cma = e084cma;
    return this;
  }

  public E084mas addE084cmaItem(E084cma e084cmaItem) {
    if (this.e084cma == null) {
      this.e084cma = new ArrayList<E084cma>();
    }
    this.e084cma.add(e084cmaItem);
    return this;
  }

   /**
   * Cadastros - componentes de máscaras
   * @return e084cma
  **/
  @ApiModelProperty(value = "Cadastros - componentes de máscaras")
  public List<E084cma> getE084cma() {
    return e084cma;
  }

  public void setE084cma(List<E084cma> e084cma) {
    this.e084cma = e084cma;
  }

  public E084mas codMas(String codMas) {
    this.codMas = codMas;
    return this;
  }

   /**
   * Código da máscara
   * @return codMas
  **/
  @ApiModelProperty(value = "Código da máscara")
  public String getCodMas() {
    return codMas;
  }

  public void setCodMas(String codMas) {
    this.codMas = codMas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E084mas e084mas = (E084mas) o;
    return Objects.equals(this.vlrInc, e084mas.vlrInc) &&
        Objects.equals(this.usualt, e084mas.usualt) &&
        Objects.equals(this.excluido, e084mas.excluido) &&
        Objects.equals(this.desMas, e084mas.desMas) &&
        Objects.equals(this.dthger, e084mas.dthger) &&
        Objects.equals(this.prpMas, e084mas.prpMas) &&
        Objects.equals(this.tipMas, e084mas.tipMas) &&
        Objects.equals(this.dthalt, e084mas.dthalt) &&
        Objects.equals(this.abrMas, e084mas.abrMas) &&
        Objects.equals(this.usuger, e084mas.usuger) &&
        Objects.equals(this.ultCod, e084mas.ultCod) &&
        Objects.equals(this.masLiv, e084mas.masLiv) &&
        Objects.equals(this.qtdPos, e084mas.qtdPos) &&
        Objects.equals(this.e070emp, e084mas.e070emp) &&
        Objects.equals(this.id, e084mas.id) &&
        Objects.equals(this.sitMas, e084mas.sitMas) &&
        Objects.equals(this.e084cma, e084mas.e084cma) &&
        Objects.equals(this.codMas, e084mas.codMas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlrInc, usualt, excluido, desMas, dthger, prpMas, tipMas, dthalt, abrMas, usuger, ultCod, masLiv, qtdPos, e070emp, id, sitMas, e084cma, codMas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E084mas {\n");
    
    sb.append("    vlrInc: ").append(toIndentedString(vlrInc)).append("\n");
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    desMas: ").append(toIndentedString(desMas)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    prpMas: ").append(toIndentedString(prpMas)).append("\n");
    sb.append("    tipMas: ").append(toIndentedString(tipMas)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    abrMas: ").append(toIndentedString(abrMas)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("    ultCod: ").append(toIndentedString(ultCod)).append("\n");
    sb.append("    masLiv: ").append(toIndentedString(masLiv)).append("\n");
    sb.append("    qtdPos: ").append(toIndentedString(qtdPos)).append("\n");
    sb.append("    e070emp: ").append(toIndentedString(e070emp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sitMas: ").append(toIndentedString(sitMas)).append("\n");
    sb.append("    e084cma: ").append(toIndentedString(e084cma)).append("\n");
    sb.append("    codMas: ").append(toIndentedString(codMas)).append("\n");
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

