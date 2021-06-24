
package cr.ac.ucr.basicpokedex.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PokeInfoV2 {

    @SerializedName("form_name")
    @Expose
    private String formName;
    @SerializedName("form_names")
    @Expose
    private List<Object> formNames = null;
    @SerializedName("form_order")
    @Expose
    private Integer formOrder;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_battle_only")
    @Expose
    private Boolean isBattleOnly;
    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("is_mega")
    @Expose
    private Boolean isMega;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("names")
    @Expose
    private List<Object> names = null;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("pokemon")
    @Expose
    private Pokemon pokemon;
    @SerializedName("sprites")
    @Expose
    private Sprites sprites;
    @SerializedName("types")
    @Expose
    private List<Type> types = null;
    @SerializedName("version_group")
    @Expose
    private VersionGroup versionGroup;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PokeInfoV2() {
    }

    /**
     * 
     * @param formNames
     * @param types
     * @param pokemon
     * @param sprites
     * @param formOrder
     * @param isDefault
     * @param names
     * @param versionGroup
     * @param formName
     * @param name
     * @param isMega
     * @param id
     * @param isBattleOnly
     * @param order
     */
    public PokeInfoV2(String formName, List<Object> formNames, Integer formOrder, Integer id, Boolean isBattleOnly, Boolean isDefault, Boolean isMega, String name, List<Object> names, Integer order, Pokemon pokemon, Sprites sprites, List<Type> types, VersionGroup versionGroup) {
        super();
        this.formName = formName;
        this.formNames = formNames;
        this.formOrder = formOrder;
        this.id = id;
        this.isBattleOnly = isBattleOnly;
        this.isDefault = isDefault;
        this.isMega = isMega;
        this.name = name;
        this.names = names;
        this.order = order;
        this.pokemon = pokemon;
        this.sprites = sprites;
        this.types = types;
        this.versionGroup = versionGroup;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public List<Object> getFormNames() {
        return formNames;
    }

    public void setFormNames(List<Object> formNames) {
        this.formNames = formNames;
    }

    public Integer getFormOrder() {
        return formOrder;
    }

    public void setFormOrder(Integer formOrder) {
        this.formOrder = formOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsBattleOnly() {
        return isBattleOnly;
    }

    public void setIsBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsMega() {
        return isMega;
    }

    public void setIsMega(Boolean isMega) {
        this.isMega = isMega;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getNames() {
        return names;
    }

    public void setNames(List<Object> names) {
        this.names = names;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PokeInfoV2.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("formName");
        sb.append('=');
        sb.append(((this.formName == null)?"<null>":this.formName));
        sb.append(',');
        sb.append("formNames");
        sb.append('=');
        sb.append(((this.formNames == null)?"<null>":this.formNames));
        sb.append(',');
        sb.append("formOrder");
        sb.append('=');
        sb.append(((this.formOrder == null)?"<null>":this.formOrder));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isBattleOnly");
        sb.append('=');
        sb.append(((this.isBattleOnly == null)?"<null>":this.isBattleOnly));
        sb.append(',');
        sb.append("isDefault");
        sb.append('=');
        sb.append(((this.isDefault == null)?"<null>":this.isDefault));
        sb.append(',');
        sb.append("isMega");
        sb.append('=');
        sb.append(((this.isMega == null)?"<null>":this.isMega));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("pokemon");
        sb.append('=');
        sb.append(((this.pokemon == null)?"<null>":this.pokemon));
        sb.append(',');
        sb.append("sprites");
        sb.append('=');
        sb.append(((this.sprites == null)?"<null>":this.sprites));
        sb.append(',');
        sb.append("types");
        sb.append('=');
        sb.append(((this.types == null)?"<null>":this.types));
        sb.append(',');
        sb.append("versionGroup");
        sb.append('=');
        sb.append(((this.versionGroup == null)?"<null>":this.versionGroup));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
