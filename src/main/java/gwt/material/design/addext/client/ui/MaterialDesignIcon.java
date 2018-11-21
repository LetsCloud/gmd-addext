/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/**
 * 
 */
package gwt.material.design.addext.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style;

import gwt.material.design.addext.client.base.HasMdi;
import gwt.material.design.addext.client.ui.constants.MdiType;
import gwt.material.design.client.base.AbstractButton;
import gwt.material.design.client.base.HasSeparator;
import gwt.material.design.client.base.mixin.ColorsMixin;
import gwt.material.design.client.base.mixin.CssNameMixin;
import gwt.material.design.client.base.mixin.StyleMixin;
import gwt.material.design.client.base.mixin.ToggleStyleMixin;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.CssName;
import gwt.material.design.client.constants.IconPosition;
import gwt.material.design.client.constants.IconSize;

/**
 * @author robi
 *
 */
public class MaterialDesignIcon extends AbstractButton implements HasSeparator, HasMdi {

	private static final String INIT_CLASS = "mdi";
	
	private CssNameMixin<MaterialDesignIcon, IconPosition> positionMixin;
	private CssNameMixin<MaterialDesignIcon, IconSize> sizeMixin;
	private ToggleStyleMixin<MaterialDesignIcon> prefixMixin;
	private ToggleStyleMixin<MaterialDesignIcon> materialIconToggleStyleMixin;
	private ColorsMixin<MaterialDesignIcon> iconColorMixin;
	private StyleMixin<MaterialDesignIcon> customIconMixin;

	/**
	 * Creates an empty icon.
	 */
	public MaterialDesignIcon() {
		super();
	}

	/**
	 * Sets a simple icon with a given type.
	 */
	public MaterialDesignIcon(MdiType iconType) {
		this();
		setIconType(iconType);
	}

	/**
	 * Sets an icon with backgroundColor.
	 */
	public MaterialDesignIcon(MdiType iconType, Color bgColor) {
		this();
		setIconType(iconType);
		setBackgroundColor(bgColor);
	}

	/**
	 * Sets an icon with textColor and backgroundColor.
	 */
	public MaterialDesignIcon(MdiType iconType, Color textColor, Color bgColor) {
		this();
		setIconType(iconType);
		setTextColor(textColor);
		setBackgroundColor(bgColor);
	}

	public void setInnerText(String innerText) {
		getElement().setInnerText(innerText);
	}

	@Override
	protected Element createElement() {
		return Document.get().createElement("span");
	}

	@Override
	public MaterialDesignIcon getIcon() {
		return this;
	}

	public MdiType getIconType() {
		return MdiType.fromStyleName(getElement().getInnerText());
	}

	@Override
	public void setIconType(MdiType icon) {
		getMaterialIconToggleStyleMixin().setOn(true);
//		getElement().setInnerText(icon.getCssName());
		this.addStyleName(icon.getCssName());
	}

	@Override
	public void setIconPosition(IconPosition position) {
		getPositionMixin().setCssName(position);
	}

	@Override
	public void setIconSize(IconSize size) {
		getSizeMixin().setCssName(size);
	}

	public IconSize getIconSize() {
		return getSizeMixin().getCssName();
	}

	@Override
	public void setIconColor(Color iconColor) {
		getIconColorMixin().setTextColor(iconColor);
	}

	@Override
	public Color getIconColor() {
		return getIconColorMixin().getTextColor();
	}

	@Override
	public void setIconFontSize(double size, Style.Unit unit) {
		getElement().getStyle().setFontSize(size, unit);
	}

	@Override
	public void setIconPrefix(boolean prefix) {
		getPrefixMixin().setOn(prefix);
	}

	@Override
	public boolean isIconPrefix() {
		return getPrefixMixin().isOn();
	}

	protected CssNameMixin<MaterialDesignIcon, IconPosition> getPositionMixin() {
		if (positionMixin == null) {
			positionMixin = new CssNameMixin<>(this);
		}
		return positionMixin;
	}

	protected CssNameMixin<MaterialDesignIcon, IconSize> getSizeMixin() {
		if (sizeMixin == null) {
			sizeMixin = new CssNameMixin<>(this);
		}
		return sizeMixin;
	}

	protected ToggleStyleMixin<MaterialDesignIcon> getPrefixMixin() {
		if (prefixMixin == null) {
			prefixMixin = new ToggleStyleMixin<>(this, CssName.PREFIX);
		}
		return prefixMixin;
	}

	protected ColorsMixin<MaterialDesignIcon> getIconColorMixin() {
		if (iconColorMixin == null) {
			iconColorMixin = new ColorsMixin<>(this);
		}
		return iconColorMixin;
	}

	protected StyleMixin<MaterialDesignIcon> getCustomIconMixin() {
		if (customIconMixin == null) {
			customIconMixin = new CssNameMixin<>(this);
		}
		return customIconMixin;
	}

	protected ToggleStyleMixin<MaterialDesignIcon> getMaterialIconToggleStyleMixin() {
		if (materialIconToggleStyleMixin == null) {
			materialIconToggleStyleMixin = new ToggleStyleMixin<>(this, INIT_CLASS);
		}
		return materialIconToggleStyleMixin;
	}
}