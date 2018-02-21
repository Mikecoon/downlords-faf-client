package com.faforever.client.mod;

import com.faforever.client.api.dto.ModType;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.apache.maven.artifact.versioning.ComparableVersion;

import java.net.URL;
import java.time.OffsetDateTime;

public class ModVersion {
  private final StringProperty id;
  private final StringProperty uid;
  private final ObjectProperty<ModType> type;
  private final StringProperty description;
  private final ObjectProperty<ComparableVersion> version;
  private final StringProperty filename;
  private final StringProperty icon;
  private final BooleanProperty ranked;
  private final BooleanProperty hidden;
  private final ObjectProperty<OffsetDateTime> createTime;
  private final ObjectProperty<OffsetDateTime> updateTime;
  private final ObjectProperty<URL> thumbnailUrl;
  private final ObjectProperty<URL> downloadUrl;
  private final ObjectProperty<Mod> mod;

  public ModVersion() {
    version = new SimpleObjectProperty<>();
    id = new SimpleStringProperty();
    uid = new SimpleStringProperty();
    type = new SimpleObjectProperty<>();
    description = new SimpleStringProperty();
    filename = new SimpleStringProperty();
    icon = new SimpleStringProperty();
    ranked = new SimpleBooleanProperty();
    hidden = new SimpleBooleanProperty();
    createTime = new SimpleObjectProperty<>();
    updateTime = new SimpleObjectProperty<>();
    thumbnailUrl = new SimpleObjectProperty<>();
    downloadUrl = new SimpleObjectProperty<>();
    mod = new SimpleObjectProperty<>();
  }

  public static ModVersion fromDto(com.faforever.client.api.dto.ModVersion dto) {
    ModVersion modVersion = new ModVersion();
    modVersion.setVersion(dto.getVersion());
    modVersion.setId(dto.getId());
    modVersion.setUid(dto.getUid());
    modVersion.setType(dto.getType());
    modVersion.setDescription(dto.getDescription());
    modVersion.setFilename(dto.getFilename());
    modVersion.setIcon(dto.getIcon());
    modVersion.setRanked(dto.isRanked());
    modVersion.setHidden(dto.isHidden());
    modVersion.setCreateTime(dto.getCreateTime());
    modVersion.setUpdateTime(dto.getUpdateTime());
    modVersion.setThumbnailUrl(dto.getThumbnailUrl());
    modVersion.setDownloadUrl(dto.getDownloadUrl());
    modVersion.setMod(Mod.fromModDto(dto.getMod()));
    return modVersion;
  }

  public String getId() {
    return id.get();
  }

  public void setId(String id) {
    this.id.set(id);
  }

  public StringProperty idProperty() {
    return id;
  }

  public String getUid() {
    return uid.get();
  }

  public void setUid(String uid) {
    this.uid.set(uid);
  }

  public StringProperty uidProperty() {
    return uid;
  }

  public ModType getType() {
    return type.get();
  }

  public void setType(ModType type) {
    this.type.set(type);
  }

  public ObjectProperty<ModType> typeProperty() {
    return type;
  }

  public String getDescription() {
    return description.get();
  }

  public void setDescription(String description) {
    this.description.set(description);
  }

  public StringProperty descriptionProperty() {
    return description;
  }

  public ComparableVersion getVersion() {
    return version.get();
  }

  public void setVersion(ComparableVersion version) {
    this.version.set(version);
  }

  public ObjectProperty<ComparableVersion> versionProperty() {
    return version;
  }

  public String getFilename() {
    return filename.get();
  }

  public void setFilename(String filename) {
    this.filename.set(filename);
  }

  public StringProperty filenameProperty() {
    return filename;
  }

  public String getIcon() {
    return icon.get();
  }

  public void setIcon(String icon) {
    this.icon.set(icon);
  }

  public StringProperty iconProperty() {
    return icon;
  }

  public boolean isRanked() {
    return ranked.get();
  }

  public void setRanked(boolean ranked) {
    this.ranked.set(ranked);
  }

  public BooleanProperty rankedProperty() {
    return ranked;
  }

  public boolean isHidden() {
    return hidden.get();
  }

  public void setHidden(boolean hidden) {
    this.hidden.set(hidden);
  }

  public BooleanProperty hiddenProperty() {
    return hidden;
  }

  public OffsetDateTime getCreateTime() {
    return createTime.get();
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime.set(createTime);
  }

  public ObjectProperty<OffsetDateTime> createTimeProperty() {
    return createTime;
  }

  public OffsetDateTime getUpdateTime() {
    return updateTime.get();
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime.set(updateTime);
  }

  public ObjectProperty<OffsetDateTime> updateTimeProperty() {
    return updateTime;
  }

  public URL getThumbnailUrl() {
    return thumbnailUrl.get();
  }

  public void setThumbnailUrl(URL thumbnailUrl) {
    this.thumbnailUrl.set(thumbnailUrl);
  }

  public ObjectProperty<URL> thumbnailUrlProperty() {
    return thumbnailUrl;
  }

  public URL getDownloadUrl() {
    return downloadUrl.get();
  }

  public void setDownloadUrl(URL downloadUrl) {
    this.downloadUrl.set(downloadUrl);
  }

  public ObjectProperty<URL> downloadUrlProperty() {
    return downloadUrl;
  }

  public Mod getMod() {
    return mod.get();
  }

  public void setMod(Mod mod) {
    this.mod.set(mod);
  }

  public ObjectProperty<Mod> modProperty() {
    return mod;
  }
}
